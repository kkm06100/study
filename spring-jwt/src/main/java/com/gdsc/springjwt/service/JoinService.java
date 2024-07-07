package com.gdsc.springjwt.service;

import com.gdsc.springjwt.dto.JoinDto;
import com.gdsc.springjwt.entity.User;
import com.gdsc.springjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JoinService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public JoinService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder){
        // userRepository, BCryptPasswordEncoder를 생성자 주입
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
    public void joinProcess(JoinDto joinDto){
        String username = joinDto.getUsername();
        String password = joinDto.getPassword();

        Boolean isExist = userRepository.existsByUsername(username);
        // username이 존재하는지 확인(true, false 형태로 저장)

        if(isExist){ // 존재한다면 메소드 종료

            return;
        }

        User data = new User(); // 없는 경우 새로운 객체 생성 + 저장

        data.setUsername(username);
        data.setPassword(bCryptPasswordEncoder.encode(password));
        data.setRole("ROLE_ADMIN");

        userRepository.save(data);
    }
}
