package com.gdsc.oopprogramming.discount;


import com.gdsc.oopprogramming.member.Grade;
import com.gdsc.oopprogramming.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price*discountPercent/100;
        }else{
            return 0;
        }
    }
}
