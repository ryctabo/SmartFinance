package com.ryctabo.smartfinance.model.inventory;

import com.ryctabo.smartfinance.model.product.ProductCategory;

import java.util.List;

public interface InventoryManager {
    InventoryItem add(String sku, String name, ProductCategory category, int cost, int price, int stock);
    InventoryItem update(String sku, String name, ProductCategory category, int cost, int price, int stock);
    InventoryItem remove(String sku);
    InventoryItem findBySku(String sku);
    List<InventoryItem> findAll();
}
