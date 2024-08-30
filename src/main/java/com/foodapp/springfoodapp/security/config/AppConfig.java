package com.foodapp.springfoodapp.security.config;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import java.util.Arrays;
import java.util.Collections;

@Configuration
@EnableWebSecurity
@Slf4j
public class AppConfig {

    @Bean
    @Order(1)
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(Authorize -> Authorize
                                //todo /api/admin/**" -> this api only access  -> "RESTAURANT_OWNER", "ADMIN"
//                        .requestMatchers("/api/admin/**").hasAnyRole("RESTAURANT_OWNER", "ADMIN")
//                        //todo if any request start with API authenticated
//                        .requestMatchers("/api/**").authenticated()

                                .anyRequest().permitAll()
                )
                .addFilterBefore(new JwtTokenValidator(), BasicAuthenticationFilter.class)
                .csrf(csrf -> csrf.disable())
                //todo to connect FRENTEND APPLICATION
                .cors(cors -> cors.configurationSource(corsConfigurationSource()));


        return http.build();

    }

    @Bean
    @Order(2)
    SecurityFilterChain securityFilterChainSecound(HttpSecurity http) throws Exception {

        http.sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(Authorize -> Authorize
                                //todo /api/admin/**" -> this api only access  -> "RESTAURANT_OWNER", "ADMIN"
                                .requestMatchers("/api/**").hasAnyRole("RESTAURANT_OWNER", "ADMIN")
//                        //todo if any request start with API authentcated
                                .requestMatchers("/home/**").permitAll()

                )
                .addFilterBefore(new JwtTokenValidator(), BasicAuthenticationFilter.class)
                .csrf(csrf -> csrf.disable())
                //todo to connect FRENTEND APPLICATION
                .cors(cors -> cors.configurationSource(corsConfigurationSource()));


        return http.build();

    }

    // CORS Configuration
    private CorsConfigurationSource corsConfigurationSource() {
        return new CorsConfigurationSource() {
            @Override
            public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
                CorsConfiguration cfg = new CorsConfiguration();
                //todo to access frontEnd apis
                cfg.setAllowedOrigins(Arrays.asList(
                        "http://localhost:3000",
                        "https://zosh-food.vercel.app",
                        "http://localhost:4200"
                ));
                cfg.setAllowedMethods(Collections.singletonList("*"));
                cfg.setAllowCredentials(true);
                cfg.setAllowedHeaders(Collections.singletonList("*"));
                cfg.setExposedHeaders(Arrays.asList("Authorization"));
                cfg.setMaxAge(3600L);
                return cfg;
            }
        };
    }

    //TODO ENCODE THE PASSWORD
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(20);
    }

}