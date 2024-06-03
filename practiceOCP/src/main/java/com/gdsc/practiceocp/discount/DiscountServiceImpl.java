package com.gdsc.practiceocp.discount;

import com.gdsc.practiceocp.member.MemberService;
import com.gdsc.practiceocp.member.MemberServiceImpl;
import com.gdsc.practiceocp.order.Order;

public class DiscountServiceImpl implements DiscountService{
    MemberService memberService = new MemberServiceImpl();
    @Override
    public Order discountPrice(Order order) {
        order.setPrice(order.getPrice()-1000);

        return order;
    }
}
