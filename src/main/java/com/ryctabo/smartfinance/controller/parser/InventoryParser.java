package com.ryctabo.smartfinance.controller.parser;

import com.ryctabo.smartfinance.controller.utils.Delimiter;
import com.ryctabo.smartfinance.model.inventory.InventoryItem;

public class InventoryParser implements Parser<InventoryItem>  {
    @Override
    public InventoryItem parse(String text) {
        var arr = text.split(Delimiter.VALUE);
        var productParser = new ProductParser();
        var product = productParser.parse(text);
        return new InventoryItem(product, Integer.parseInt(arr[arr.length - 1]));
    }
}
