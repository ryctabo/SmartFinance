package com.ryctabo.smartfinance.model.sale;

import com.ryctabo.smartfinance.model.product.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Sale {
    private final String id;
    private final List<SaleItem> items;
    private Discount discount;

    public Sale(Discount discount) {
        this.id = UUID.randomUUID().toString();
        this.items = new ArrayList<>();
        this.discount = discount;
    }

    public Sale(List<SaleItem> items, Discount discount) {
        this.id = UUID.randomUUID().toString();
        this.items = items;
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public void addItem(SaleItem newItem) {
        for (SaleItem item : items) {
            if (item.getProduct().getSku().equals(newItem.getProduct().getSku())) {
                var beforeQuantity = item.getQuantity();
                item.setQuantity(beforeQuantity + newItem.getQuantity());
                return;
            }
        }
        this.items.add(newItem);
    }

    public List<SaleItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public float totalPrice() {
        var total = 0f;
        for (SaleItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }

    public float totalToPay() {
        return this.totalPrice() * (1f - this.discount.getPercentage());
    }

    public float getEarnings() {
        var totalCost = 0f;
        for (SaleItem item : items) {
            totalCost += item.getProduct().getCost();
        }
        return this.totalToPay() - totalCost;
    }
}
