package com.productmanagementthymeleaf.model;

public class Product {
    private int id;
    private String name;
    private int price;
    private String description;
    private boolean status;

    public Product() {
    }

    public Product(int id, String name, int price, String description, boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
