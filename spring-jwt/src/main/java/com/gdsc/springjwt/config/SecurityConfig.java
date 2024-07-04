package com.gdsc.springjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // 이 클래스가 스프링의 설정 클래스임을 나타낸다.
@EnableWebSecurity // Spring Security를 활성화 한다
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        // 이 메서드는 해당 객체를 빈으로 등록하고 암호화하는데 사용된다.
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        // 이 메소드는 'HttpSecurity' 객체를 사용하여 보안 설정을 구성하고,
        // 'SecurityFilterChain'을 빈으로 등록한다.

        //csrf 보호를 비활성화 한다. 주로 REST API와 같은 stateless 애플리케이션에서 사용된다.
        http
                .csrf((auth)->auth.disable());

        //기본 폼 로그인 방식을 비활성화 한다.
        http
                .formLogin((auth)->auth.disable());

        //요청에 대한 관한을 설정한다.
        http
                .authorizeHttpRequests((auth)->auth
                        .requestMatchers("/login","/","join").permitAll()
                        // 해당 경로에 대한 모든 접근을 허용한다.
                        .requestMatchers("/admin").hasRole("ADMIN")
                        // "/admin"이라는 경로는 역할이 "ADMIN"인 사람만 접근할 수 있다.
                        .anyRequest().authenticated());
                        // 다른 모든 요청은 인증된 사용자만 접근할 수 있다.

        //세션 설정
        http
                .sessionManagement((session)->session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
                        // 세션 : STATELESS, 비활성화 시킴

        return http.build();
        // 필터체인에 결과를 반환
    }
}

