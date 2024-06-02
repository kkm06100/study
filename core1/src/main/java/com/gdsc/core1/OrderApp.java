package com.gdsc.core1;

import com.gdsc.core1.member.Grade;
import com.gdsc.core1.member.Member;
import com.gdsc.core1.member.MemberService;
import com.gdsc.core1.member.MemberServiceImpl;
import com.gdsc.core1.order.Order;
import com.gdsc.core1.order.OrderService;
import com.gdsc.core1.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order/*.toString()*/); // 객체 형태로 반환 .toString 생략 가능
        System.out.println("order.calculatePrice = " + order.calculatePrice()); // VIP 프리미엄
    }
}
