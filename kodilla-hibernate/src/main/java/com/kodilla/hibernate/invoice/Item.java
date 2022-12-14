package com.kodilla.hibernate.invoice;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEM")
public class Item implements java.io.Serializable{


    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;

    private Invoice invoice;

    public Item (){

    }

    public Item(Product product, BigDecimal price, int quantity, BigDecimal value) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }
    @Column(name = "ITEM_PRICE")
    public BigDecimal getPrice() {
        return price;
    }
    @Column(name = "ITEM_QUANTITY")
    public int getQuantity() {
        return quantity;
    }
    @Column(name = "ITEM_VALUE")
    public BigDecimal getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @ManyToOne
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
