package me.xyrophyte.lightfly;

import me.xyrophyte.lightfly.commands.Fly;
import me.xyrophyte.lightfly.events.OnDamage;
import me.xyrophyte.lightfly.events.OnJoin;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class LightFly extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(ChatColor.AQUA + "Plugin starting up");
        getLogger().info(ChatColor.AQUA + "For Support, join:");
        getLogger().info(ChatColor.LIGHT_PURPLE + "https://discord.gg/MmqXcebnxC");
        Objects.requireNonNull(getCommand("fly")).setExecutor(new Fly(this));
        getServer().getPluginManager().registerEvents(new OnDamage(), this);
        getServer().getPluginManager().registerEvents(new OnJoin(), this);
        getLogger().info(ChatColor.AQUA + "Plugin started successfully!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info(ChatColor.AQUA + "Plugin is shutting down.");
    }
}
