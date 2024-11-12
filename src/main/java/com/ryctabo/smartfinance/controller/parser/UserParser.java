package com.ryctabo.smartfinance.controller.parser;

import com.ryctabo.smartfinance.controller.utils.Delimiter;
import com.ryctabo.smartfinance.model.user.Role;
import com.ryctabo.smartfinance.model.user.User;

public class UserParser implements Parser<User> {
    @Override
    public User parse(String text) {
        String[] arr = text.split(Delimiter.VALUE);
        return new User(arr[0], arr[1], Role.valueOf(arr[2]));
    }
}
