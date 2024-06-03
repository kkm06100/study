package com.gdsc.practiceocp.order;

import java.lang.reflect.Member;

public interface OrderService {
    public void orderItem(Order order);
    public Order findById(Long memberId);
}
