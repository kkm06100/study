package com.gdsc.practiceocp.order;

public class Order {
    public Order(Long userId, String itemName, int price) {
        this.memberId = userId;
        this.ItemName = itemName;
        this.price = price;
    }

    public Long getUserId() {
        return memberId;
    }

    public void setUserId(Long userId) {
        this.memberId = userId;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Long memberId;
    private String ItemName;
    private int price;

}
