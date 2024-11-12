package com.ryctabo.smartfinance.model.login;

import com.ryctabo.smartfinance.model.user.ImmutableUser;
import com.ryctabo.smartfinance.model.user.User;

public interface SessionManager {
    ImmutableUser login(String username, String password);
    void logout();
    ImmutableUser getUser();
    boolean isLoggedIn();
}
