package com.gdsc.jwtpractice.global;

public record JwtDto (
        //토큰읈 생성해서 값을 가지고 있을 Dto 클래스
    String aceessToken,
    String refreshToken){

}
