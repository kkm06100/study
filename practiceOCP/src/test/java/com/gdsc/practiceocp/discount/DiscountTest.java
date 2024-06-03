package com.gdsc.practiceocp.discount;

import com.gdsc.practiceocp.member.*;
import com.gdsc.practiceocp.order.Order;
import com.gdsc.practiceocp.order.OrderService;
import com.gdsc.practiceocp.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiscountTest {

    OrderService orderService = new OrderServiceImpl();
    MemberService memberService = new MemberServiceImpl();
    DiscountService discountService = new DiscountServiceImpl1();

    @Test
    public void discount(){
        Order order = new Order(1L,"itemA",10000);

        Order discountedOrder = discountService.discountPrice(order);
        Assertions.assertThat(discountedOrder.getPrice()).isEqualTo(9000);
    }
}
