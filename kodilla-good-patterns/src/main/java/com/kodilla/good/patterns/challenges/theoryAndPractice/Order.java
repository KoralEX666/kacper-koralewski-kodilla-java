package com.kodilla.good.patterns.challenges.theoryAndPractice;
import java.time.LocalDate;

public class Order {
    public String goods;
    public int quantity;
    public LocalDate date;

    public Order(String goods, int quantity, LocalDate date) {
        this.goods = goods;
        this.quantity = quantity;
        this.date = date;
    }

    public String getGoods() {
        return goods;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public static Order createTestOrder() {
        return new Order("Radioactive pendant", 150, LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth()+5));
    }
}
