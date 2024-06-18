package com.gdsc.core1;

import com.gdsc.core1.discount.DiscountPolicy;
import com.gdsc.core1.discount.FixDiscountPolicy;
import com.gdsc.core1.member.*;
import com.gdsc.core1.order.OrderService;
import com.gdsc.core1.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService(){// 참조한 객체에 생성자를 사용하여 주입
        return new MemberServiceImpl(new MemoryMemberRepository());// 생성자를 통해서 인터페이스를 상속받는 클래스를 주입받음(생성자 주입)
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }


}
