package com.gdsc.practiceocp.discount;

import com.gdsc.practiceocp.order.Order;

import java.lang.reflect.Member;

public interface DiscountService {
    public Order DiscountPrice(Order member);
}
