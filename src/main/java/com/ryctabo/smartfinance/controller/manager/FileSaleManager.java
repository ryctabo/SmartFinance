package com.ryctabo.smartfinance.controller.manager;

import com.ryctabo.smartfinance.model.sale.Sale;
import com.ryctabo.smartfinance.model.sale.SaleManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileSaleManager implements SaleManager {
    private final List<Sale> sales;
    public FileSaleManager() {
        this.sales = new ArrayList<>();
        this.load();
    }

    private static FileSaleManager instance;
    public static FileSaleManager getInstance() {
        if (instance == null) {
            instance = new FileSaleManager();
        }
        return instance;
    }

    @Override
    public void register(Sale sale) {
        this.sales.add(sale);
        this.save();
    }

    @Override
    public float getTotalEarnings() {
        var total = 0f;
        for (var sale : this.sales) {
            total += sale.getEarnings();
        }
        return total;
    }

    @Override
    public float getMaxEarnings() {
        var max = 0f;
        for (var sale : this.sales) {
            if (sale.getEarnings() > max) {
                max = sale.getEarnings();
            }
        }
        return max;
    }

    @Override
    public float getMinEarnings() {
        var min = Float.MAX_VALUE;
        for (var sale : this.sales) {
            if (sale.getEarnings() < min) {
                min = sale.getEarnings();
            }
        }
        return min;
    }

    @Override
    public List<Sale> findAll() {
        return Collections.unmodifiableList(this.sales);
    }

    private void load() {
        // TODO: pending to implement
    }

    private void save() {
        // TODO: pending to implement
    }
}
