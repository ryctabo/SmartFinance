package com.ryctabo.smartfinance.controller.parser;

import com.ryctabo.smartfinance.controller.utils.Delimiter;
import com.ryctabo.smartfinance.model.product.Product;
import com.ryctabo.smartfinance.model.product.ProductCategory;

public class ProductParser implements Parser<Product> {
    @Override
    public Product parse(String text) {
        var arr = text.split(Delimiter.VALUE);
        return new Product(arr[0], arr[1], ProductCategory.valueOf(arr[2]), Float.parseFloat(arr[3]), Float.parseFloat(arr[4]));
    }
}
