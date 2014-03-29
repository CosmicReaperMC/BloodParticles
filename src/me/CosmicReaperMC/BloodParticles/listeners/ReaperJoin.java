package me.CosmicReaperMC.BloodParticles.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ReaperJoin implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		if (e.getPlayer().getName().equalsIgnoreCase("CosmicReaperMC"))
		e.setJoinMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "[" + ChatColor.RED + "" + ChatColor.BOLD + "Blood" + ChatColor.DARK_RED + "" + ChatColor.BOLD + "] " +
		ChatColor.YELLOW + "CosmicReaperMC, Creator of " + ChatColor.DARK_RED + "" + ChatColor.BOLD + ChatColor.UNDERLINE + "BloodParticles" + ChatColor.YELLOW + ", has joined the Server!");
	}
}
