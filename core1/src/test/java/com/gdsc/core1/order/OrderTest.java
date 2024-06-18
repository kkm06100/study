package com.gdsc.core1.order;

import com.gdsc.core1.member.Grade;
import com.gdsc.core1.member.Member;
import com.gdsc.core1.member.MemberService;
import com.gdsc.core1.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderTest {
    MemberService memberService;

    public OrderTest(MemberService memberService) {
        this.memberService = memberService;
    }

    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = new Order(memberId,"itemA",10000, 1000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
