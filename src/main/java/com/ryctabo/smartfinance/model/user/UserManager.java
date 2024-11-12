package com.ryctabo.smartfinance.model.user;

import java.util.List;

public interface UserManager {
    void create(String username, String password, Role role);
    User update(String username, String password, Role role);
    User delete(String username);
    User findByUsername(String username);
    List<User> findAll();
}
