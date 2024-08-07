package com.gdsc.springjwt.controller;

import com.gdsc.springjwt.dto.JoinDto;
import com.gdsc.springjwt.service.JoinService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class JoinController {
    private final JoinService joinService;
    public JoinController(JoinService joinService){
        this.joinService = joinService;
    }
    @PostMapping("/join")
    public String joinProcess(JoinDto joinDto){
        joinService.joinProcess(joinDto);

        return "ok";
    }
}
