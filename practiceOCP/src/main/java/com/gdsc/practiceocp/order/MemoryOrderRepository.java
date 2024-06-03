package com.gdsc.practiceocp.order;


import java.util.HashMap;
import java.util.Map;

public class MemoryOrderRepository implements OrderRepository{

    private static Map<Long,Order> store = new HashMap<>();

    @Override
    public void save(Order order) {
        store.put(order.getUserId(),order);
    }

    @Override
    public Order findById(Long memberId) {
        return store.get(memberId);
    }
}
