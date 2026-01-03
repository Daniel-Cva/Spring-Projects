package com.springboot.ems.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class EmployeeSecurityConfig {

    @Bean
    UserDetailsManager userDetailsManager(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(
          configurer -> configurer
                  .requestMatchers(HttpMethod.GET,"/api/employees").hasRole("EMPLOYEE")
                  .requestMatchers(HttpMethod.GET,"/api/employees/**").hasRole("EMPLOYEE")
                  .requestMatchers(HttpMethod.POST,"/api/employees").hasRole("MANAGER")
                  .requestMatchers(HttpMethod.PUT,"/api/employees").hasRole("MANAGER")
                  .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN")
                  .requestMatchers(HttpMethod.OPTIONS, "/api/employees/**").hasRole("ADMIN")
                  .anyRequest().authenticated()
        );
        http.httpBasic(Customizer.withDefaults());
        http.csrf(csrf -> csrf.disable());
        return http.build();
    }
}
