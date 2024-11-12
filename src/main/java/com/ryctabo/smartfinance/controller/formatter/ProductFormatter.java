package com.ryctabo.smartfinance.controller.formatter;

import com.ryctabo.smartfinance.controller.utils.Delimiter;
import com.ryctabo.smartfinance.model.product.Product;

public class ProductFormatter implements Formatter<Product> {
    @Override
    public String format(Product object) {
        return object.getSku() +
                Delimiter.VALUE +
                object.getName() +
                Delimiter.VALUE +
                object.getCategory() +
                Delimiter.VALUE +
                object.getCost() +
                Delimiter.VALUE +
                object.getPrice();
    }
}
