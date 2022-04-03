package de.Herbystar.CustomHeads.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import de.Herbystar.CustomHeads.Main;
import de.Herbystar.CustomHeads.Utilities.ItemHandler;
import de.Herbystar.CustomHeads.Utilities.XMaterial;

public class PlayerInteractEventHandler implements Listener {
	
	Main plugin;
	public PlayerInteractEventHandler(Main main) {
		plugin = main;
	}
	
	@EventHandler
	public void onPlayerInteractEvent(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if((((e.getAction() == Action.RIGHT_CLICK_AIR ? 1 : 0) | (e.getAction() == Action.RIGHT_CLICK_BLOCK ? 1 : 0)) != 0)) {
			if(e.getItem() != null) {
				if(e.getMaterial().equals(XMaterial.PLAYER_HEAD.parseMaterial())) {
					if(e.getItem().hasItemMeta() && e.getItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.JoinItem.Name").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"))) {
						e.setCancelled(true);
						if(p.hasPermission("CustomHeads.Item.Open") | p.isOp()) {
							p.openInventory(ItemHandler.getInventoryPageOne());
						}
					}
				}
			}			
		}	
	}

}
