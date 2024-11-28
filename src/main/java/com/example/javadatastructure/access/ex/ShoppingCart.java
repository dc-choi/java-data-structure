package com.example.javadatastructure.access.ex;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public int getCartTotalPrice() {
        int totalPrice = 0;

        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }

        return totalPrice;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니에 담긴 상품들");
        for (Item item : items) {
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice() + "원");
        }
        System.out.println("전체 가격 합: " + this.getCartTotalPrice() + "원");
    }
}