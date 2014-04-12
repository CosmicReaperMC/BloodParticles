package me.CosmicReaperMC.BloodParticles;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BloodCommand implements CommandExecutor {

	public static BloodBase plugin;

	@Override
	public boolean onCommand(CommandSender sender,  Command command, String alias, String[] args) {
		if (command.getName().equalsIgnoreCase("blood")) {
			if (args.length == 0) {
				sender.sendMessage(
						ChatColor.DARK_RED + "" + ChatColor.BOLD + "[" + ChatColor.RED + "" + ChatColor.BOLD + "Blood" + ChatColor.DARK_RED + "" + ChatColor.BOLD + "] " + 
			            ChatColor.RED + "Usage: " + ChatColor.WHITE + "/<command> <action>");
			} else {
				
				if (args[0].equalsIgnoreCase("Reload")) {
					if (!sender.hasPermission("blood.reload")) {
						sender.sendMessage(
								ChatColor.DARK_RED + "" + ChatColor.BOLD + "[" + ChatColor.RED + "" + ChatColor.BOLD + "Blood" + ChatColor.DARK_RED + "" + ChatColor.BOLD + "] " + 
					            ChatColor.DARK_RED + "You do not have permission to use this command!");
						return true;
					}
					
					if (sender.hasPermission("blood.reload") || sender.isOp()) {
						BloodBase.plugin.reloadConfig();
						sender.sendMessage(
								ChatColor.DARK_RED + "" + ChatColor.BOLD + "[" + ChatColor.RED + "" + ChatColor.BOLD + "Blood" + ChatColor.DARK_RED + "" + ChatColor.BOLD + "] " +
						        ChatColor.GREEN + "Successfully reloaded Blood Particles Config!");
						return true;
					}
				}
			}
		}
		return false;
	}
}
