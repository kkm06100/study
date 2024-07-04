package com.gdsc.springjwt.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JoinDto  {
    private String username;
    private String password;
}
