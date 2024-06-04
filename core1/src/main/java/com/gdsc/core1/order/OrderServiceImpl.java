package com.gdsc.core1.order;

import com.gdsc.core1.discount.DiscountPolicy;
import com.gdsc.core1.discount.FixDiscountPolicy;
import com.gdsc.core1.discount.RateDiscountPolicy;
import com.gdsc.core1.member.Member;
import com.gdsc.core1.member.MemberRepository;
import com.gdsc.core1.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy){
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    private final MemberRepository memberRepository;// 메모리에 저장하는 레포지토리
    private final DiscountPolicy discountPolicy;



    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
