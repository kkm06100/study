package com.gdsc.core1;

import com.gdsc.core1.member.Grade;
import com.gdsc.core1.member.Member;
import com.gdsc.core1.member.MemberService;
import com.gdsc.core1.member.MemberServiceImpl;
import com.gdsc.core1.order.OrderService;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Member member = new Member(1L, "MemberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        System.out.println("new Member " + member.getName());
        System.out.println("find Member " + findMember.getName());

    }
}
