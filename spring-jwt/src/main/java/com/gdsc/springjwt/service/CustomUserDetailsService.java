package com.gdsc.springjwt.service;

import com.gdsc.springjwt.dto.CustomUserDetails;
import com.gdsc.springjwt.entity.User;
import com.gdsc.springjwt.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService { // UserDeatilsService에 정의된 기능을 사용

    private final UserRepository userRepository;
    // UserRepository 사용
    public CustomUserDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userData = userRepository.findByUsername(username); // username을 바탕으로 객체 생성

        if(userData != null){
            return new CustomUserDetails(userData); // null이 아니라면 반환
        }
        return null;
    }
}
