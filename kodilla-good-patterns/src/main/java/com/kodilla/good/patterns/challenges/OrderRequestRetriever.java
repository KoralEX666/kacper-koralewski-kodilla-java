package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequestRetriever {

    private User user;
    private LocalDate date;
    private String product;
    private int quantity;


    public SaleRequest retrieve() {
        User user = new User("Jonathan", "Wick");

        LocalDateTime date = LocalDateTime.of(2017, 8, 1, 12, 0);

        String product = "BullShit";

        int quantity = 5;


        return new SaleRequest(user, date, product, quantity);
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
