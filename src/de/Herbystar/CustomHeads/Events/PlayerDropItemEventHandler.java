package de.Herbystar.CustomHeads.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

import de.Herbystar.CustomHeads.Main;
import de.Herbystar.CustomHeads.Utilities.XMaterial;

public class PlayerDropItemEventHandler implements Listener {
	
	Main plugin;
	public PlayerDropItemEventHandler(Main main) {
		plugin = main;
	}
	
	@EventHandler
	public void onPlayerDropItemEvent(PlayerDropItemEvent e) {
		if(plugin.getConfig().getBoolean("CustomHeads.JoinItem.AntiDrop") == true) {
			if(e.getItemDrop().getItemStack().getType().equals(XMaterial.PLAYER_HEAD.parseMaterial())) {
				if(e.getItemDrop() != null) {
					if(e.getItemDrop().getItemStack().hasItemMeta() && e.getItemDrop().getItemStack().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.JoinItem.Name").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"))) {
						e.setCancelled(true);
					}
				}				
			}
		}				 				
	}

}
