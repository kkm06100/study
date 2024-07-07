package com.gdsc.springjwt.jwt;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class LoginFilter extends UsernamePasswordAuthenticationFilter {
    // UsernamePasswordAuthenticationFilter를 상속 받음
    // UsernamePasswordAuthenticationFilter :
    // 1. /login에서 오는 요청을 가로채서 처리함
    // 2. 요청을 바탕으로 UsernamePasswordAuthenticationToken을 생성함
    // 3. AuthenticationManager를 통해서 인증을 진행한다.
    /*
    *  주요 동작 : UsernamePasswordAuthenticationFilter는 Spring Security의 핵심 필터 중 하나로, HTTP 기반의 사용자 이름과 비밀번호 인증을 처리한다.
    *  이를 확장하여 다양한 커스터마이징이 가능하며, 인증 성공 시 JWT 토큰 발급 등의 추가 처리를 쉽게 구현할 수 있다.
     * */

    private final AuthenticationManager authenticationManager;

    public LoginFilter(AuthenticationManager authenticationManager){
        this.authenticationManager = authenticationManager;
    }
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        String username = obtainUsername(request); // username을 request에서 추출한다.
        String password = obtainPassword(request); // password를 request에서 추출한다.

        System.out.println(username);

        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(username, password, null);
        // 추출한 정보를 바탕으로 토큰 객체를 생성 후

        return authenticationManager.authenticate(authToken);
        // authenticationManager에 있는 authenticate를 사용하여 authToken 객체를 변경한 후 반환
    }

    @Override
    protected  void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authentication){
        // 인증이 성공했을 때 "success" 메세지를 출력한다.
        System.out.print("succcess");
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse httpServletResponse, AuthenticationException failed){
        // 인증이 실패했을 때 "fail" 메세지를 출력한다.
        System.out.println("fail");
    }

}
