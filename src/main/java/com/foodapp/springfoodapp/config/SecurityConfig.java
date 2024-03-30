//package com.foodapp.springfoodapp.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity  security) throws Exception {
//         security.csrf(AbstractHttpConfigurer::disable)
//                .authorizeHttpRequests(auth->{
//                   auth.requestMatchers("/wellCome/**").permitAll();
//                   auth.requestMatchers("/api/**").permitAll();
//                   auth.requestMatchers("").permitAll();
//                           auth.anyRequest().authenticated();
//
//                });
//
//         return security.build();
////                .oauth2Login(Customizer.withDefaults())
////                .formLogin(Customizer.withDefaults()).build();
//    }
//}
