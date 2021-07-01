package me.xyrophyte.lightfly.commands;

import me.xyrophyte.lightfly.LightFly;
import org.bukkit.Bukkit;
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

    private final ArrayList<Player> flyingPlayers = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                if (player.hasPermission("lightfly.flight")) {
                    if (!flyingPlayers.contains(player)) {
                        flyingPlayers.add(player);
                        player.setAllowFlight(true);
                        player.sendMessage(ChatColor.AQUA + "Enabled Flight.");
                    } else if (flyingPlayers.contains(player)) {
                        flyingPlayers.remove(player);
                        player.setAllowFlight(false);
                        player.sendMessage(ChatColor.AQUA + "Disabled Flight.");
                    } else {
                        unhandledException(player);
                    }
                } else {
                    noPermission(player);
                }
            } else if (args.length == 1) {
                Player target = Bukkit.getPlayer(args[0]);
                if(player.hasPermission("lightfly.others")) {
                    if (!flyingPlayers.contains(target)) {
                        flyingPlayers.add(target);
                        assert target != null;
                        target.setAllowFlight(true);
                        target.sendMessage(ChatColor.AQUA + "Enabled Flight");
                        player.sendMessage(ChatColor.AQUA + "Enabled flight for " + ChatColor.LIGHT_PURPLE + target.getDisplayName());
                    } else if(flyingPlayers.contains(target)) {
                        flyingPlayers.remove(target);
                        assert target != null;
                        target.setAllowFlight(false);
                        target.sendMessage(ChatColor.AQUA + "Disabled Flight.");
                        player.sendMessage(ChatColor.AQUA + "Disabled flight for " + ChatColor.LIGHT_PURPLE + target.getDisplayName());
                    }
                } else {
                    noPermission(player);
                }
            } else {
                player.sendMessage(ChatColor.RED + "Too little or too many arguments.");
            }
        } else {
            instance.getLogger().info(ChatColor.GOLD + "Failed to run command. REASON: Not a Player.");
        }
        return true;
    }

    private void noPermission(Player player) {
        player.sendMessage(ChatColor.RED + "Failed to run command. REASON: Not enough Permissions. " +
                ChatColor.AQUA + "Contact an administrator if you believe this is an error.");
    }
    private void unhandledException(Player player) {
        player.sendMessage(ChatColor.DARK_RED + "Unhandled Exception. Please contact a Server Administrator." +
                "Tell them to read the Server Logs for hint.");
        instance.getLogger().severe(ChatColor.DARK_RED + "Unhandle Exception. Please report this to the plugin developers by joining" +
                ChatColor.DARK_PURPLE + "https://discord.gg/dpYrXXWWrM " + ChatColor.DARK_RED + "Please include how to reproduce the error.");
    }
}
