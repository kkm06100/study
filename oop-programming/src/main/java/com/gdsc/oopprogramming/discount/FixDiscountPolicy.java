package com.gdsc.oopprogramming.discount;

import com.gdsc.oopprogramming.member.Grade;
import com.gdsc.oopprogramming.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }else{
            return 0;
        }

    }
}
