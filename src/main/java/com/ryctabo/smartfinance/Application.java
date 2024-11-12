package com.ryctabo.smartfinance;

import com.google.gson.Gson;
import com.ryctabo.smartfinance.controller.manager.InMemorySessionManager;
import com.ryctabo.smartfinance.model.login.SessionManager;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        var price = 1215.3294234345f;
        var currencyFormatter = NumberFormat.getCurrencyInstance(Locale.getDefault());
        System.out.println(currencyFormatter.format(price));

        SessionManager sessionManager = InMemorySessionManager.getInstance();
        sessionManager.login("ryctabo", "123");

        if (sessionManager.isLoggedIn()) {
            System.out.println("Logged in");
            System.out.println(new Gson().toJson(sessionManager.getUser()));
        }

        sessionManager.logout();
        if (!sessionManager.isLoggedIn()) {
            System.out.println("Logged out");
            System.out.println(sessionManager.getUser());
        }

        String text = "Gustavo,Pacheco,31,Ingeniero de Sistemas";
        var arr = text.split(",");
        System.out.println(Arrays.toString(arr));
        System.out.println("Nombre es: " + arr[0]);
        System.out.println("Apellido es: " + arr[1]);

        System.out.println(Float.parseFloat("24"));
        System.out.println(Integer.parseInt("25"));
    }
}
