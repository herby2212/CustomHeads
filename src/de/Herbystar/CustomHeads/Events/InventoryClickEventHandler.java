package de.Herbystar.CustomHeads.Events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.Herbystar.CustomHeads.Main;

public class InventoryClickEventHandler implements Listener {

	Main plugin;
	public InventoryClickEventHandler(Main main) {
		plugin = main;
	}
	
	@EventHandler
	public void onAntiJoinItemMoveEvent(InventoryClickEvent e) {
		if(plugin.getConfig().getBoolean("CustomHeads.JoinItem.AntiMove") == true) {
			if(e.getCurrentItem() != null) {
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM)) {
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.JoinItem.Name").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"))) {
						e.setCancelled(true);
					}
					//Side 1 Heads
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.1").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.2").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.3").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.4").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.5").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.6").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.7").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.8").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.9").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.10").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.11").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.12").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.13").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.14").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					//Side 2 Heads
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.15").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.16").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.17").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.18").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.19").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.20").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.21").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.22").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.23").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.24").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.25").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.26").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.27").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
					if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.28").replace("&", "§").replace("#", "'"))) {
						e.setCancelled(true);
					}
				}
			}
		}
	}	
}
