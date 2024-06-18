package com.gdsc.oopprogramming.order;

import com.gdsc.oopprogramming.discount.DiscountPolicy;
import com.gdsc.oopprogramming.discount.FixDiscountPolicy;
import com.gdsc.oopprogramming.discount.RateDiscountPolicy;
import com.gdsc.oopprogramming.member.*;

public class OrderServiceImpl implements OrderService {
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    private final MemberRepository memberRepository;

    private final DiscountPolicy discountPolicy;

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId,itemName, itemPrice,discountPrice);
    }
}
