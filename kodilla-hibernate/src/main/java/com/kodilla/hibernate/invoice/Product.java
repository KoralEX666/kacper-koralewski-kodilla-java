package com.kodilla.hibernate.invoice;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "PRODUCT")
public class Product implements java.io.Serializable{

    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();

    public Product(){

    }

    public Product(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    @Column(name = "PRODUCT_NAME")
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
