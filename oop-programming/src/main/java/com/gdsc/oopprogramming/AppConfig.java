package com.gdsc.oopprogramming;

import com.gdsc.oopprogramming.discount.FixDiscountPolicy;
import com.gdsc.oopprogramming.discount.RateDiscountPolicy;
import com.gdsc.oopprogramming.member.MemberService;
import com.gdsc.oopprogramming.member.MemberServiceImpl;
import com.gdsc.oopprogramming.member.MemoryMemberRepository;
import com.gdsc.oopprogramming.order.OrderService;
import com.gdsc.oopprogramming.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(getMemberRepository());
    }

    private static MemoryMemberRepository getMemberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(getMemberRepository(), getDiscountPolicy());
    }

    private static FixDiscountPolicy getDiscountPolicy() {
        return new FixDiscountPolicy();
    }
}
