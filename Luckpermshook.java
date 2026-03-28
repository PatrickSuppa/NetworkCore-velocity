package com.network.core.integration;

import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;

public class LuckPermsHook {

    private LuckPerms api;

    public void init() {
        api = LuckPermsProvider.get();
    }

    public String getPrimaryGroup(java.util.UUID uuid) {
        return api.getUserManager().getUser(uuid).getPrimaryGroup();
    }
}
