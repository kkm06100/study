package com.gdsc.practiceocp.discount;

import com.gdsc.practiceocp.member.Member;
import com.gdsc.practiceocp.member.MemberService;
import com.gdsc.practiceocp.member.MemberServiceImpl;
import com.gdsc.practiceocp.member.MemoryMemberRepository;
import com.gdsc.practiceocp.order.Order;
import org.junit.jupiter.api.Test;

public class DiscountTest {
    DiscountService discountService = new DiscountServiceImpl();
    MemberService memberService = new MemberServiceImpl();
    @Test
    public void discount(){

    }
}
