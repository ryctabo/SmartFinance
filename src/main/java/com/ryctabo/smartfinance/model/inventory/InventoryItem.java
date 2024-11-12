package com.ryctabo.smartfinance.model.inventory;

import com.ryctabo.smartfinance.model.product.Product;

public class InventoryItem {
    private Product product;
    private int stock;

    public InventoryItem(Product product, int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock must be a positive number");
        }
        this.product = product;
        this.stock = stock;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative");
        }
        this.stock = stock;
    }
}
