package com.ryctabo.smartfinance.controller.parser;

public interface Parser<T> {
    T parse(String text);
}
