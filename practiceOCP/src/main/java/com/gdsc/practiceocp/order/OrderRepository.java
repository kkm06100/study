package com.gdsc.practiceocp.order;

public interface OrderRepository {
    public void save(Order order);
    public Order findById(Long memberId);
}
