package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SaleRequest {


    private User user;
    private LocalDateTime date;
    private String product;
    private int  quantity;

    public SaleRequest(User user, LocalDateTime date, String product, int quantity) {
        this.user = user;
        this.date = date;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}