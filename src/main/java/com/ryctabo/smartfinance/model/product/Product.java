package com.ryctabo.smartfinance.model.product;

public class Product {
    private String sku;
    private String name;
    private ProductCategory category;
    private float cost;
    private float price;

    public Product(String sku, String name, ProductCategory category, float cost, float price) {
        if (cost < 0 || price <= 0) {
            throw new IllegalArgumentException("Cost and price cannot be less than zero");
        }
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.cost = cost;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be less than zero");
        }
        this.cost = cost;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price cannot be less than zero");
        }
        this.price = price;
    }

    public float getEarnings() {
        return this.price - this.cost;
    }
}
