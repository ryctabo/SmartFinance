package com.ryctabo.smartfinance.controller.formatter;

import com.ryctabo.smartfinance.controller.utils.Delimiter;
import com.ryctabo.smartfinance.model.user.User;

public class UserFormatter implements Formatter<User> {
    @Override
    public String format(User user) {
        return user.getUsername() + Delimiter.VALUE + user.getPassword() + Delimiter.VALUE + user.getRole();
    }
}
