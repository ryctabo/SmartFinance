package com.ryctabo.smartfinance.controller.formatter;

import com.ryctabo.smartfinance.controller.utils.Delimiter;
import com.ryctabo.smartfinance.model.inventory.InventoryItem;

public class InventoryFormatter implements Formatter<InventoryItem> {
    @Override
    public String format(InventoryItem object) {
        var productFormatter = new ProductFormatter();
        return productFormatter.format(object.getProduct()) + Delimiter.VALUE + object.getStock();
    }
}
