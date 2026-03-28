package com.network.core.listeners;

import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.connection.PostLoginEvent;
import com.velocitypowered.api.proxy.ProxyServer;

public class PlayerJoinListener {

    private final ProxyServer server;

    public PlayerJoinListener(ProxyServer server) {
        this.server = server;
    }

    @Subscribe
    public void onJoin(PostLoginEvent event) {
        server.getConsoleCommandSource().sendMessage(
            net.kyori.adventure.text.Component.text(
                event.getPlayer().getUsername() + " connected"
            )
        );
    }
}
