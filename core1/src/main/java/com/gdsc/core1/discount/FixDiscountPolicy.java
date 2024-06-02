package com.gdsc.core1.discount;

import com.gdsc.core1.member.Grade;
import com.gdsc.core1.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }else{
            return 0;
        }

    }
}
