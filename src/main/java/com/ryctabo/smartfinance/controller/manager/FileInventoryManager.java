package com.ryctabo.smartfinance.controller.manager;

import com.ryctabo.smartfinance.controller.formatter.InventoryFormatter;
import com.ryctabo.smartfinance.controller.parser.InventoryParser;
import com.ryctabo.smartfinance.model.inventory.InventoryItem;
import com.ryctabo.smartfinance.model.inventory.InventoryManager;
import com.ryctabo.smartfinance.model.product.Product;
import com.ryctabo.smartfinance.model.product.ProductCategory;

import java.io.*;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileInventoryManager implements InventoryManager {
    private static final String FILE_NAME = "inventory-items.txt";
    private static final String FILE_PATH = System.getProperty("user.dir") + FileSystems.getDefault().getSeparator() + FILE_NAME;

    private final List<InventoryItem> items;

    public FileInventoryManager() {
        this.items = new ArrayList<>();
        this.load();
    }

    private static FileInventoryManager instance;

    public static FileInventoryManager getInstance() {
        if (instance == null) {
            instance = new FileInventoryManager();
        }
        return instance;
    }

    @Override
    public InventoryItem add(String sku, String name, ProductCategory category, int cost, int price, int stock) {
        var existsItem = this.findBySku(sku);
        if (existsItem != null) {
            existsItem.setStock(existsItem.getStock() + stock);
            return existsItem;
        }
        var item = new InventoryItem(new Product(sku, name, category, cost, price), stock);
        this.items.add(item);
        this.save();
        return item;
    }

    @Override
    public InventoryItem update(String sku, String name, ProductCategory category, int cost, int price, int stock) {
        var item = this.findBySku(sku);
        if (item != null) {
            item.setProduct(new Product(sku, name, category, cost, price));
            item.setStock(stock);
        }
        this.save();
        return item;
    }

    @Override
    public InventoryItem remove(String sku) {
        var item = this.findBySku(sku);
        if (item != null) {
            this.items.remove(item);
        }
        this.save();
        return null;
    }

    @Override
    public InventoryItem findBySku(String sku) {
        for (InventoryItem item : this.items) {
            if (item.getProduct().getSku().equals(sku)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<InventoryItem> findAll() {
        return Collections.unmodifiableList(this.items);
    }

    private void save() {
        var file = new File(FILE_PATH);
        try (var bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (InventoryItem item : this.items) {
                var formatter = new InventoryFormatter();
                String line = formatter.format(item);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void load() {
        try {
            var file = new File(FILE_PATH);
            if (!file.exists()) {
                return;
            }
            try (var bufferedReader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    var parser = new InventoryParser();
                    var item = parser.parse(line);
                    this.items.add(item);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
