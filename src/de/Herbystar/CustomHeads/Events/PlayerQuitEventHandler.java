package de.Herbystar.CustomHeads.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import de.Herbystar.CustomHeads.Main;
import de.Herbystar.CustomHeads.Utilities.XMaterial;

public class PlayerQuitEventHandler implements Listener {
	
	Main plugin;
	public PlayerQuitEventHandler(Main main) {
		plugin = main;
	}
	
	@EventHandler
	public void onPlayerQuitEvent(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		if(p.getInventory().getHelmet() != null) {
			if(p.getInventory().getHelmet().getType().equals(XMaterial.PLAYER_HEAD.parseMaterial())) {
				if(p.getInventory().getHelmet().hasItemMeta()) {
					if(plugin.getConfig().getBoolean("CustomHeads.ClearBannerOnLeave") == true) {
						p.getInventory().setHelmet(null);
					}
				}
			}
		}			
	}		
}
