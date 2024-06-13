package com.gdsc.oopprogramming;

import com.gdsc.oopprogramming.member.Grade;
import com.gdsc.oopprogramming.member.Member;
import com.gdsc.oopprogramming.member.MemberService;
import com.gdsc.oopprogramming.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        System.out.println("findMember = "+findMember.getName());
        System.out.println("member = " + member.getName());
    }
}
