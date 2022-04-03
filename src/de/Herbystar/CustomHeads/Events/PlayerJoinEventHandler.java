package de.Herbystar.CustomHeads.Events;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import de.Herbystar.CustomHeads.Main;
import de.Herbystar.CustomHeads.XMaterial;

public class PlayerJoinEventHandler implements Listener {
	
	Main plugin;
	public PlayerJoinEventHandler(Main main) {
		plugin = main;
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if(p.isOp()) {
			if(plugin.UpdateAviable == true) {
				if(plugin.getConfig().getBoolean("CustomHeads.AutoUpdater") == true) {
					p.sendMessage("§4[§aCustomHeads§4] §a-=> Update is available! <=-");
					p.sendMessage("§aDownload: §ehttp://herbystar.eu/resources/customheads-1-8-1-12-with-gui.18/");
				}
			}
		}
		if(plugin.getConfig().getBoolean("CustomHeads.JoinItem.GiveOnJoin") == true) {
			if(p.hasPermission("CustomHeads.Item.Join") | p.isOp()) {
				p.sendMessage("TEST1");
				ItemStack HB = XMaterial.PLAYER_HEAD.parseItem();
				SkullMeta HBM = (SkullMeta) HB.getItemMeta();
				
//				ItemStack HB = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
//			    SkullMeta HBM = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
//			    HBM.setOwner(p.getDisplayName());
				HBM.setOwningPlayer(Bukkit.getOfflinePlayer(p.getUniqueId()));
//			    try {
//				    HBM.setOwningPlayer(p);
//			    } catch(NoSuchMethodError ex) {
//			    	HBM.setOwner(p.getDisplayName());
//			    }
			    HBM.setDisplayName(plugin.getConfig().getString("CustomHeads.JoinItem.Name").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
			    HBM.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.JoinItem.Lore").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")));
			    HB.setItemMeta(HBM);
				
			    
			    //Guckt ob der Slot bereits besetzt ist
			    if(p.getInventory().getItem(plugin.getConfig().getInt("CustomHeads.JoinItem.Slot(0-8)")) == null) {
					p.getInventory().setItem(plugin.getConfig().getInt("CustomHeads.JoinItem.Slot(0-8)"), HB);
			    }
			}
		} else {
			
			ItemStack HB = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
		    SkullMeta HBM = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
//		    try {
//			    HBM.setOwningPlayer(p);
//		    } catch(NoSuchMethodError ex) {
//		    	HBM.setOwner(p.getDisplayName());
//		    }
		    HBM.setOwner(p.getDisplayName());
		    HBM.setDisplayName(plugin.getConfig().getString("CustomHeads.JoinItem.Name").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
		    HBM.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.JoinItem.Lore").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")));
		    HB.setItemMeta(HBM);
		    if(p.getInventory().contains(HB.getType())) {
		    	p.getInventory().remove(HB.getType());
		    	p.updateInventory();
		    }   
		}
	}

}
