package com.gdsc.oopprogramming;

import com.gdsc.oopprogramming.member.Grade;
import com.gdsc.oopprogramming.member.Member;
import com.gdsc.oopprogramming.member.MemberService;
import com.gdsc.oopprogramming.member.MemberServiceImpl;
import com.gdsc.oopprogramming.order.Order;
import com.gdsc.oopprogramming.order.OrderService;
import com.gdsc.oopprogramming.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order.toString());
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
    }
}
