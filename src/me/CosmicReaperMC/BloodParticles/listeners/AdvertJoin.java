package me.CosmicReaperMC.BloodParticles.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class AdvertJoin implements Listener {
	
	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
            Player p = e.getPlayer();
            p.sendMessage(
ChatColor.DARK_RED + "" + ChatColor.BOLD + "[" + ChatColor.RED + "" + ChatColor.BOLD + "Blood" + ChatColor.DARK_RED + "" + ChatColor.BOLD + "] " + 
ChatColor.YELLOW + "This Server uses " + ChatColor.DARK_RED + "" + ChatColor.BOLD + ChatColor.UNDERLINE + "BloodParticles" + ChatColor.YELLOW + ", Developed by CosmicReaperMC!");
	}
}