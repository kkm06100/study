package com.gdsc.practiceocp.order;

public class OrderServiceImpl implements OrderService{

    OrderRepository orderRepository = new MemoryOrderRepository();
    @Override
    public void orderItem(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Order findById(Long memberId) {
        return orderRepository.findById(memberId);
    }

}
