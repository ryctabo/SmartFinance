package com.ryctabo.smartfinance.model.sale;

import java.util.List;

public interface SaleManager {
    void register(Sale sale);
    float getTotalEarnings();
    float getMaxEarnings();
    float getMinEarnings();
    List<Sale> findAll();
}
