
package com.foodapp.springfoodapp.outh;//package com.foodapp.foodapp.oath;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Ouath {


    DefaultSecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {
        return security
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/home/**").permitAll();
                    auth.requestMatchers("/api/**").authenticated();
                })
                .oauth2Login(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults())
                .build();


    }
}
