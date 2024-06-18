package com.gdsc.jwtpractice.global.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id @GeneratedValue
    private Long id;

    @Column(columnDefinition = "varchar(25)")
    private String email;

    @Column(columnDefinition = "varchar(20)",nullable = false)
    private String password;

    @Column(length = 20, nullable = false)
    private String nickname;
}
