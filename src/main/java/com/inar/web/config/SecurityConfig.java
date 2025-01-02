package com.inar.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.csrf(AbstractHttpConfigurer::disable) // Disable CSRF
        .authorizeHttpRequests(
            auth ->
                auth.requestMatchers("/api/**")
                    .authenticated() // Secure API endpoints
                    .anyRequest()
                    .permitAll() // Allow all other requests
            )
        .httpBasic(AbstractHttpConfigurer::disable); // Enable HTTP Basic authentication
    return http.build();
  }
}
