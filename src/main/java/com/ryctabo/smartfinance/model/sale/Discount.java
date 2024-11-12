package com.ryctabo.smartfinance.model.sale;

public enum Discount {
    NONE(0f, "None"),
    P10(0.1f, "10% Off"),
    P20(0.2f, "20% Off"),
    ;

    private final float percentage;
    private final String description;

    Discount(float percentage, String description) {
        this.percentage = percentage;
        this.description = description;
    }

    public float getPercentage() {
        return percentage;
    }

    public String getDescription() {
        return description;
    }
}
