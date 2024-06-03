package com.gdsc.practiceocp.discount;

import com.gdsc.practiceocp.member.Grade;
import com.gdsc.practiceocp.member.Member;
import com.gdsc.practiceocp.member.MemberService;
import com.gdsc.practiceocp.member.MemberServiceImpl;
import com.gdsc.practiceocp.order.Order;

public class DiscountServiceImpl implements DiscountService{
    private int discountprice= 1000;
    MemberService memberService = new MemberServiceImpl();
    @Override
    public Order DiscountPrice(Order order) {
        Member member=memberService.search(order.getUserId());
        Order discountedPrice = new Order(
                order.getUserId(),
                order.getItemName(),
                order.getPrice()
        );
        if(member.getGrade() == Grade.VIP){
            order.setPrice(order.getPrice()-discountprice);
        }

        return discountedPrice;
    }
}
