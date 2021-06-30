package me.xyrophyte.lightfly.commands;

import me.xyrophyte.lightfly.LightFly;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Fly implements CommandExecutor {

    private final LightFly instance;

    public Fly(LightFly instance) {
        this.instance = instance;
    }

    private final ArrayList flyingPlayers = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            if(sender.hasPermission("lightfly.fly")) {
                Player player = (Player) sender;
                if(flyingPlayers.contains(player)) {
                    flyingPlayers.remove(player);
                    player.setAllowFlight(false);
                    player.sendMessage(ChatColor.AQUA + "Disabled flight.");
                } else if(!flyingPlayers.contains(player)) {
                    flyingPlayers.add(player);
                    player.setAllowFlight(true);
                    player.sendMessage(ChatColor.AQUA + "Enabled flight.");
                }
            } else {
                sender.sendMessage(ChatColor.DARK_RED + "Failed to run command. REASON: Not enough Permissions.");
            }
        } else {
            instance.getLogger().info(ChatColor.YELLOW + "Failed to run command. REASON: Not a Player.");
        }
        return true;
    }
}
