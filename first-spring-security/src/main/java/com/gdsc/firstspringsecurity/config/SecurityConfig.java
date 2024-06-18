package com.gdsc.firstspringsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Excaption {
        http
                .csrf((auth)->auth.disable());
        return http.build();
    }
}// SecurityConfig, Jwt Filter, token 처리과정 설명하기, excaption handler, 추가 : 깃허브에 내가 쓴거 올리기
