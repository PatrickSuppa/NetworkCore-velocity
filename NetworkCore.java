package com.network.core;

import com.google.inject.Inject;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import com.network.core.listeners.PlayerJoinListener;

@Plugin(
    id = "networkcore",
    name = "NetworkCore",
    version = "1.0"
)
public class NetworkCore {

    private final ProxyServer server;

    @Inject
    public NetworkCore(ProxyServer server) {
        this.server = server;
    }

    @Inject
    public void onProxyInitialization() {
        server.getEventManager().register(this, new PlayerJoinListener(server));
    }
}
