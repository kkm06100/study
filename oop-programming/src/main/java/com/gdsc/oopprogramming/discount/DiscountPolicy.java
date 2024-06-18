package com.gdsc.oopprogramming.discount;

import com.gdsc.oopprogramming.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
