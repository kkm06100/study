package com.gdsc.springjwt.dto;

import com.gdsc.springjwt.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class CustomUserDetails implements UserDetails {
    // Spring Security 전용 Dto + UserDetails 상속

    private final User user; // User사용
    public CustomUserDetails(User user){
        this.user = user;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // <? extends GrantedAuthority>는 와일드카드 제네릭을 사용하여 GrantedAuthority를 상속하거나 구현하는 모든 타입을 허용한다.
        // 와일드 카드 : 타입에 대한 제한 X
        // 즉, GrantedAuthority의 하위 타입들을 포함할 수 있다.

        Collection<GrantedAuthority> collection = new ArrayList<>();
        collection.add(new GrantedAuthority() { // 익명 클래스
            @Override
            public String getAuthority() {
                return user.getRole(); // 권한을 반환
            }
        });
        return collection;
    }

    @Override
    public String getPassword() {
        return user.getPassword(); // 비밀번호를 반환
    }

    @Override
    public String getUsername() {
        return user.getUsername(); // 이름을 반환
    }
}
