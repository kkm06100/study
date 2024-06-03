package com.gdsc.core1.discount;

import com.gdsc.core1.member.Grade;
import com.gdsc.core1.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용된다.")
    void vip_o(){
        //given
        Member memberVIP = new Member(1L, "memberVIP", Grade.VIP);
        //when
        int discount = discountPolicy.discount(memberVIP, 10000);
        //then
        Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아닌 회원은 할인이 적용되지 않는다.")
    void vip_x(){
        //given
        Member memberNormal = new Member(2L,"memberVIP",Grade.BASIC);
        //when
        int discount = discountPolicy.discount(memberNormal,20000);
        //then
        Assertions.assertThat(discount).isEqualTo(0);
    }

}