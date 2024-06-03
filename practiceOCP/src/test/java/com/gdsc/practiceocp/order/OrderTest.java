package com.gdsc.practiceocp.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderTest {
    OrderService orderService = new OrderServiceImpl();
    @Test
    public void Order(){
        Order order = new Order(1L,"itemA",10000);
        orderService.orderItem(order);
        Order findOrder = orderService.findById(1L);
        Assertions.assertThat(order.getItemName()).isEqualTo(findOrder.getItemName());
    }
}
