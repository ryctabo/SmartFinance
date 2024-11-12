package com.ryctabo.smartfinance.controller.manager;

import com.ryctabo.smartfinance.model.login.SessionManager;
import com.ryctabo.smartfinance.model.user.ImmutableUser;
import com.ryctabo.smartfinance.model.user.User;
import com.ryctabo.smartfinance.model.user.UserManager;

public class InMemorySessionManager implements SessionManager {
    private User userLogged;
    private final UserManager userManager;

    public InMemorySessionManager(UserManager userManager) {
        this.userManager = FileUserManager.getInstance();
    }

    private static InMemorySessionManager instance;
    public static InMemorySessionManager getInstance() {
        if (instance == null) {
            instance = new InMemorySessionManager(null);
        }
        return instance;
    }

    @Override
    public ImmutableUser login(String username, String password) throws IllegalArgumentException {
        var user = this.userManager.findByUsername(username);
        if (user == null) {
            throw new IllegalArgumentException("User not found");
        }
        if (!user.getPassword().equals(password)) {
            throw new IllegalArgumentException("Wrong password");
        }
        this.userLogged = user;
        return this.userLogged;
    }

    @Override
    public void logout() {
        this.userLogged = null;
    }

    @Override
    public User getUser() {
        return this.userLogged;
    }

    @Override
    public boolean isLoggedIn() {
        return this.userLogged != null;
    }
}
