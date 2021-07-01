package me.xyrophyte.lightfly.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoin implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.getPlayer().setAllowFlight(false);
        System.out.println("Disabled flight for " + event.getPlayer().getDisplayName());
    }
}
