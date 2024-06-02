package com.gdsc.core1.order;

import com.gdsc.core1.discount.DiscountPolicy;
import com.gdsc.core1.discount.FixDiscountPolicy;
import com.gdsc.core1.member.Member;
import com.gdsc.core1.member.MemberRepository;
import com.gdsc.core1.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository(); // 메모리에 저장하는 레포지토리
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); // 고정 할인 정책
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
