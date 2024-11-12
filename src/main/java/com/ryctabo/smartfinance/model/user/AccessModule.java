package com.ryctabo.smartfinance.model.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum AccessModule {
    USER(Role.ADMIN),
    INVENTORY(Role.ADMIN),
    SALES(Role.CASHIER, Role.ADMIN),
    PROFITS(Role.ADMIN);

    private final List<Role> roles;

    AccessModule(Role... roles) {
        this.roles = new ArrayList<>(roles.length);
        Collections.addAll(this.roles, roles);
    }

    public List<Role> getRoles() {
        return Collections.unmodifiableList(this.roles);
    }
}
