package com.ryctabo.smartfinance.model.user;

import java.util.Arrays;
import java.util.List;

public class Access {
    private Access() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean hasAccess(AccessModule module, Role role) {
        return module.getRoles().contains(role);
    }

    public static List<AccessModule> getModules(Role role) {
        return Arrays.stream(AccessModule.values())
                .filter((it) -> it.getRoles().contains(role))
                .toList();
    }
}
