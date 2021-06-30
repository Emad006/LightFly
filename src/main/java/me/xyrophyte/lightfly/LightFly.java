package me.xyrophyte.lightfly;

import me.xyrophyte.lightfly.commands.Fly;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class LightFly extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(ChatColor.AQUA + "Plugin is starting up.");
        getCommand("fly").setExecutor(new Fly(this));
        getLogger().info(ChatColor.AQUA + "Plugin started successfully!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info(ChatColor.AQUA + "Plugin is shutting down.");
    }
}
