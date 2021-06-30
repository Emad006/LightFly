package me.xyrophyte.lightfly;

import me.xyrophyte.lightfly.commands.Fly;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class LightFly extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(ChatColor.AQUA + "Plugin starting up");
        getLogger().info(ChatColor.AQUA + "For Support, join: " + ChatColor.BLUE + "https://discord.gg/MmqXcebnxC");
        Objects.requireNonNull(getCommand("fly")).setExecutor(new Fly(this));
        getLogger().info(ChatColor.AQUA + "Plugin started successfully!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info(ChatColor.AQUA + "Plugin is shutting down.");
    }
}
