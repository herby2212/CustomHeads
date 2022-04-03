package de.Herbystar.CustomHeads.Events;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import de.Herbystar.CustomHeads.Main;

public class InventoryInteractEvents implements Listener {
	
	Main plugin;
	public InventoryInteractEvents(Main main) {
		plugin = main;
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onInv1ClickEvent(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		
		if(e.getInventory().getName().equals(plugin.getConfig().getString("CustomHeads.HeadsInventory.Side1Title").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"))) {
			e.setCancelled(true);
			if(e.getCurrentItem().hasItemMeta()) {
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.1").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.1") | p.isOp()) {
						if(!plugin.H1.contains(p)) {
							ItemStack H1 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H1M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H1M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.1").replace("&", "§").replace("#", "'"));
						    H1M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.1").replace("&", "§").replace("#", "'"));
						    H1M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.1").replace("&", "§").replace("#", "'")));
						    H1.setItemMeta(H1M);	
							p.getInventory().setHelmet(H1);
							plugin.H1.add(p);
							plugin.H14.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}						
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.2").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.2") | p.isOp()) {
						if(!plugin.H2.contains(p)) {
						    ItemStack H2 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H2M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H2M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.2").replace("&", "§").replace("#", "'"));
						    H2M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.2").replace("&", "§").replace("#", "'"));
						    H2M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.2").replace("&", "§").replace("#", "'")));
						    H2.setItemMeta(H2M);	
							p.getInventory().setHelmet(H2);
							plugin.H2.add(p);
							plugin.H1.remove(p);
							plugin.H14.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}				
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.3").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.3") | p.isOp()) {
						if(!plugin.H3.contains(p)) {
						    ItemStack H3 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H3M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H3M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.3").replace("&", "§").replace("#", "'"));
						    H3M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.3").replace("&", "§").replace("#", "'"));
						    H3M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.3").replace("&", "§").replace("#", "'")));
						    H3.setItemMeta(H3M);	
							p.getInventory().setHelmet(H3);
							plugin.H3.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H14.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}						
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.4").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.4") | p.isOp()) {
						if(!plugin.H4.contains(p)) {
						    ItemStack H4 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H4M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H4M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.4").replace("&", "§").replace("#", "'"));
						    H4M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.4").replace("&", "§").replace("#", "'"));
						    H4M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.4").replace("&", "§").replace("#", "'")));
						    H4.setItemMeta(H4M);		
							p.getInventory().setHelmet(H4);
							plugin.H4.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H14.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}								
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.5").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.5") | p.isOp()) {
						if(!plugin.H5.contains(p)) {
						    ItemStack H5 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H5M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H5M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.5").replace("&", "§").replace("#", "'"));
						    H5M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.5").replace("&", "§").replace("#", "'"));
						    H5M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.5").replace("&", "§").replace("#", "'")));
						    H5.setItemMeta(H5M);	
							p.getInventory().setHelmet(H5);
							plugin.H5.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H14.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}							
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.6").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.6") | p.isOp()) {
						if(!plugin.H6.contains(p)) {
						    ItemStack H6 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H6M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H6M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.6").replace("&", "§").replace("#", "'"));
						    H6M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.6").replace("&", "§").replace("#", "'"));
						    H6M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.6").replace("&", "§").replace("#", "'")));
						    H6.setItemMeta(H6M);	
							p.getInventory().setHelmet(H6);
							plugin.H6.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H14.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}						
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.7").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.7") | p.isOp()) {
						if(!plugin.H7.contains(p)) {
						    ItemStack H7 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H7M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H7M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.7").replace("&", "§").replace("#", "'"));
						    H7M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.7").replace("&", "§").replace("#", "'"));
						    H7M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.7").replace("&", "§").replace("#", "'")));
						    H7.setItemMeta(H7M);	
							p.getInventory().setHelmet(H7);
							plugin.H7.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H14.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}						
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.8").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.8") | p.isOp()) {
						if(!plugin.H8.contains(p)) {
						    ItemStack H8 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H8M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H8M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.8").replace("&", "§").replace("#", "'"));
						    H8M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.8").replace("&", "§").replace("#", "'"));
						    H8M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.8").replace("&", "§").replace("#", "'")));
						    H8.setItemMeta(H8M);	
							p.getInventory().setHelmet(H8);
							plugin.H8.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H14.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}							
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.9").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.9") | p.isOp()) {
						if(!plugin.H9.contains(p)) {
						    ItemStack H9 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H9M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H9M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.9").replace("&", "§").replace("#", "'"));
						    H9M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.9").replace("&", "§").replace("#", "'"));
						    H9M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.9").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä").replace("#", "'")));
						    H9.setItemMeta(H9M);	
							p.getInventory().setHelmet(H9);
							plugin.H9.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H14.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}				
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.10").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.10") | p.isOp()) {
						if(!plugin.H10.contains(p)) {
						    ItemStack H10 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H10M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H10M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.10").replace("&", "§").replace("#", "'"));
						    H10M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.10").replace("&", "§").replace("#", "'"));
						    H10M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.10").replace("&", "§").replace("#", "'")));
						    H10.setItemMeta(H10M);	
							p.getInventory().setHelmet(H10);
							plugin.H10.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H14.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}				
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.11").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.11") | p.isOp()) {
						if(!plugin.H11.contains(p)) {
						    ItemStack H11 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H11M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H11M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.11").replace("&", "§").replace("#", "'"));
						    H11M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.11").replace("&", "§").replace("#", "'"));
						    H11M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.11").replace("&", "§").replace("#", "'")));
						    H11.setItemMeta(H11M);		
							p.getInventory().setHelmet(H11);
							plugin.H11.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H14.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}				
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.12").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.12") | p.isOp()) {
						if(!plugin.H12.contains(p)) {
						    ItemStack H12 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H12M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H12M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.12").replace("&", "§").replace("#", "'"));
						    H12M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.12").replace("&", "§").replace("#", "'"));
						    H12M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.12").replace("&", "§").replace("#", "'")));
						    H12.setItemMeta(H12M);	
							p.getInventory().setHelmet(H12);
							plugin.H12.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H13.remove(p);
							plugin.H14.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}				
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.13").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.13") | p.isOp()) {
						if(!plugin.H13.contains(p)) {
						    ItemStack H13 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H13M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H13M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.13").replace("&", "§").replace("#", "'"));
						    H13M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.13").replace("&", "§").replace("#", "'"));
						    H13M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.13").replace("&", "§").replace("#", "'")));
						    H13.setItemMeta(H13M);	
							p.getInventory().setHelmet(H13);
							plugin.H13.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H14.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}				
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.14").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.14") | p.isOp()) {
						if(!plugin.H14.contains(p)) {
						    ItemStack H14 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H14M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H14M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.14").replace("&", "§").replace("#", "'"));
						    H14M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.14").replace("&", "§").replace("#", "'"));
						    H14M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.14").replace("&", "§").replace("#", "'")));
						    H14.setItemMeta(H14M);
							p.getInventory().setHelmet(H14);
							plugin.H14.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}					
				}
				if(e.getCurrentItem().getType().equals(Material.BARRIER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.GUI.ClearHeadItemName").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä")))) {
					if(p.getInventory().getHelmet() != null) {
						p.getInventory().setHelmet(null);
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadClearMessage.Message").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
						plugin.H1.remove(p);
						plugin.H2.remove(p);
						plugin.H3.remove(p);
						plugin.H4.remove(p);
						plugin.H5.remove(p);
						plugin.H6.remove(p);
						plugin.H7.remove(p);
						plugin.H8.remove(p);
						plugin.H9.remove(p);
						plugin.H10.remove(p);
						plugin.H11.remove(p);
						plugin.H12.remove(p);
						plugin.H13.remove(p);
						plugin.H14.remove(p);
						
						plugin.HP1.remove(p);
						plugin.HP2.remove(p);
						plugin.HP3.remove(p);
						plugin.HP4.remove(p);
						plugin.HP5.remove(p);
						plugin.HP6.remove(p);
						plugin.HP7.remove(p);
						plugin.HP8.remove(p);
						plugin.HP9.remove(p);
						plugin.HP10.remove(p);
						plugin.HP11.remove(p);
						plugin.HP12.remove(p);
						plugin.HP13.remove(p);
						plugin.HP14.remove(p);
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadClearMessage.NoHeadMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
					}
				}
				if(e.getCurrentItem().getType().equals(Material.SLIME_BALL) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.GUI.CloseItemName").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
					p.closeInventory();
				}
				//Next Side
				if(e.getCurrentItem().getType().equals(Material.MAGMA_CREAM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.GUI.NextSide").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
					plugin.inv2 = p.getPlayer().getServer().createInventory(null, plugin.getConfig().getInt("CustomHeads.Inv2Size"), plugin.getConfig().getString("CustomHeads.HeadsInventory.Side2Title").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
					
					ItemStack HP1 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HP1M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HP1M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.15").replace("&", "§").replace("#", "'"));
				    HP1M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.15").replace("&", "§").replace("#", "'"));
				    HP1M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.15").replace("&", "§").replace("#", "'")));
				    HP1.setItemMeta(HP1M);				
					
				    ItemStack HP2 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HP2M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HP2M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.16").replace("&", "§").replace("#", "'"));
				    HP2M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.16").replace("&", "§").replace("#", "'"));
				    HP2M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.16").replace("&", "§").replace("#", "'")));
				    HP2.setItemMeta(HP2M);	
					
				    ItemStack HP3 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HP3M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HP3M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.17").replace("&", "§").replace("#", "'"));
				    HP3M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.17").replace("&", "§").replace("#", "'"));
				    HP3M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.17").replace("&", "§").replace("#", "'")));
				    HP3.setItemMeta(HP3M);
				    
				    ItemStack HP4 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HP4M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HP4M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.18").replace("&", "§").replace("#", "'"));
				    HP4M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.18").replace("&", "§").replace("#", "'"));
				    HP4M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.18").replace("&", "§").replace("#", "'")));
				    HP4.setItemMeta(HP4M);	
					
				    ItemStack HP5 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HP5M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HP5M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.19").replace("&", "§").replace("#", "'"));
				    HP5M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.19").replace("&", "§").replace("#", "'"));
				    HP5M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.19").replace("&", "§").replace("#", "'")));
				    HP5.setItemMeta(HP5M);	
					
				    ItemStack HP6 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HP6M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HP6M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.20").replace("&", "§").replace("#", "'"));
				    HP6M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.20").replace("&", "§").replace("#", "'"));
				    HP6M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.20").replace("&", "§").replace("#", "'")));
				    HP6.setItemMeta(HP6M);
					
				    ItemStack HP7 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HP7M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HP7M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.21").replace("&", "§").replace("#", "'"));
				    HP7M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.21").replace("&", "§").replace("#", "'"));
				    HP7M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.21").replace("&", "§").replace("#", "'")));
				    HP7.setItemMeta(HP7M);
					
				    ItemStack HP8 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HP8M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HP8M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.22").replace("&", "§").replace("#", "'"));
				    HP8M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.22").replace("&", "§").replace("#", "'"));
				    HP8M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.22").replace("&", "§").replace("#", "'")));
				    HP8.setItemMeta(HP8M);	
					
				    ItemStack HP9 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HP9M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HP9M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.23").replace("&", "§").replace("#", "'"));
				    HP9M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.23").replace("&", "§").replace("#", "'"));
				    HP9M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.23").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä").replace("#", "'")));
				    HP9.setItemMeta(HP9M);	
					
				    ItemStack HP10 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HP10M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HP10M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.24").replace("&", "§").replace("#", "'"));
				    HP10M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.24").replace("&", "§").replace("#", "'"));
				    HP10M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.24").replace("&", "§").replace("#", "'")));
				    HP10.setItemMeta(HP10M);
					
				    ItemStack HP11 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HP11M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HP11M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.25").replace("&", "§").replace("#", "'"));
				    HP11M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.25").replace("&", "§").replace("#", "'"));
				    HP11M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.25").replace("&", "§").replace("#", "'")));
				    HP11.setItemMeta(HP11M);	
					
				    ItemStack HP12 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HP12M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HP12M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.26").replace("&", "§").replace("#", "'"));
				    HP12M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.26").replace("&", "§").replace("#", "'"));
				    HP12M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.26").replace("&", "§").replace("#", "'")));
				    HP12.setItemMeta(HP12M);
					
				    ItemStack HP13 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HP13M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HP13M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.27").replace("&", "§").replace("#", "'"));
				    HP13M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.27").replace("&", "§").replace("#", "'"));
				    HP13M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.27").replace("&", "§").replace("#", "'")));
				    HP13.setItemMeta(HP13M);	
					
				    ItemStack HP14 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HP14M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HP14M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.28").replace("&", "§").replace("#", "'"));
				    HP14M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.28").replace("&", "§").replace("#", "'"));
				    HP14M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.28").replace("&", "§").replace("#", "'")));
				    HP14.setItemMeta(HP14M);	
					
				    	
					ItemStack b = new ItemStack(Material.ARROW);
					ItemMeta bm = b.getItemMeta();
					bm.setDisplayName(plugin.getConfig().getString("CustomHeads.GUI.BackSide").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
					b.setItemMeta(bm);
					
					ItemStack E = new ItemStack(Material.BARRIER);
					ItemMeta EM = E.getItemMeta();
					EM.setDisplayName(plugin.getConfig().getString("CustomHeads.GUI.ClearHeadItemName").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
					E.setItemMeta(EM);
					
					ItemStack C = new ItemStack(Material.SLIME_BALL);
					ItemMeta CM = C.getItemMeta();
					CM.setDisplayName(plugin.getConfig().getString("CustomHeads.GUI.CloseItemName").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
					C.setItemMeta(CM);
															
					//1 Reihe
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.15") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.15"), HP1);
					}
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.16") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.16"), HP2);
					}
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.17") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.17"), HP3);
					}
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.18") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.18"), HP4);
					}
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.19") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.19"), HP5);
					}
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.20") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.20"), HP6);
					}
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.21") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.21"), HP7);
					}
					
					//2 Reihe
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.22") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.22"), HP8);
					}
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.23") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.23"), HP9);
					}
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.24") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.24"), HP10);
					}
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.25") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.25"), HP11);
					}
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.26") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.26"), HP12);
					}
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.27") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.27"), HP13);
					}
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.28") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.28"), HP14);
					}
					
					//Special Items
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.CloseItem") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.Inventory2.CloseItem"), C);
					}
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.ClearHeadItem") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.Inventory2.ClearHeadItem"), E);
					}
					if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.NextSide") == false) {
						plugin.inv2.setItem(plugin.getConfig().getInt("CustomHeads.Slot.Inventory2.BackSide"), b);
					}				
					p.openInventory(plugin.inv2);
				}
			}
		}
					
		if(e.getInventory().getName().equals(plugin.getConfig().getString("CustomHeads.HeadsInventory.Side2Title").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"))) {
			e.setCancelled(true);
			if(e.getCurrentItem().hasItemMeta()) {
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.15").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.15") | p.isOp()) {
						if(!plugin.H1.contains(p)) {
							ItemStack H1 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H1M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H1M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.15").replace("&", "§").replace("#", "'"));
						    H1M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.15").replace("&", "§").replace("#", "'"));
						    H1M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.15").replace("&", "§").replace("#", "'")));
						    H1.setItemMeta(H1M);	
							p.getInventory().setHelmet(H1);
							plugin.H1.add(p);
							plugin.H14.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}						
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.16").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.16") | p.isOp()) {
						if(!plugin.H2.contains(p)) {
						    ItemStack H2 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H2M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H2M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.16").replace("&", "§").replace("#", "'"));
						    H2M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.16").replace("&", "§").replace("#", "'"));
						    H2M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.16").replace("&", "§").replace("#", "'")));
						    H2.setItemMeta(H2M);	
							p.getInventory().setHelmet(H2);
							plugin.H2.add(p);
							plugin.H1.remove(p);
							plugin.H14.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}				
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.17").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.17") | p.isOp()) {
						if(!plugin.H3.contains(p)) {
						    ItemStack H3 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H3M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H3M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.17").replace("&", "§").replace("#", "'"));
						    H3M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.17").replace("&", "§").replace("#", "'"));
						    H3M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.17").replace("&", "§").replace("#", "'")));
						    H3.setItemMeta(H3M);	
							p.getInventory().setHelmet(H3);
							plugin.H3.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H14.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}						
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.18").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.18") | p.isOp()) {
						if(!plugin.H4.contains(p)) {
						    ItemStack H4 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H4M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H4M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.18").replace("&", "§").replace("#", "'"));
						    H4M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.18").replace("&", "§").replace("#", "'"));
						    H4M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.18").replace("&", "§").replace("#", "'")));
						    H4.setItemMeta(H4M);		
							p.getInventory().setHelmet(H4);
							plugin.H4.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H14.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}								
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.19").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.19") | p.isOp()) {
						if(!plugin.H5.contains(p)) {
						    ItemStack H5 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H5M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H5M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.19").replace("&", "§").replace("#", "'"));
						    H5M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.19").replace("&", "§").replace("#", "'"));
						    H5M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.19").replace("&", "§").replace("#", "'")));
						    H5.setItemMeta(H5M);	
							p.getInventory().setHelmet(H5);
							plugin.H5.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H14.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}							
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.20").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.20") | p.isOp()) {
						if(!plugin.H6.contains(p)) {
						    ItemStack H6 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H6M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H6M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.20").replace("&", "§").replace("#", "'"));
						    H6M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.20").replace("&", "§").replace("#", "'"));
						    H6M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.20").replace("&", "§").replace("#", "'")));
						    H6.setItemMeta(H6M);	
							p.getInventory().setHelmet(H6);
							plugin.H6.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H14.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}						
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.21").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.21") | p.isOp()) {
						if(!plugin.H7.contains(p)) {
						    ItemStack H7 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H7M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H7M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.21").replace("&", "§").replace("#", "'"));
						    H7M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.21").replace("&", "§").replace("#", "'"));
						    H7M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.21").replace("&", "§").replace("#", "'")));
						    H7.setItemMeta(H7M);	
							p.getInventory().setHelmet(H7);
							plugin.H7.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H14.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}						
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.22").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.22") | p.isOp()) {
						if(!plugin.H8.contains(p)) {
						    ItemStack H8 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H8M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H8M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.22").replace("&", "§").replace("#", "'"));
						    H8M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.22").replace("&", "§").replace("#", "'"));
						    H8M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.22").replace("&", "§").replace("#", "'")));
						    H8.setItemMeta(H8M);	
							p.getInventory().setHelmet(H8);
							plugin.H8.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H14.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}							
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.23").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.23") | p.isOp()) {
						if(!plugin.H9.contains(p)) {
						    ItemStack H9 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H9M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H9M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.23").replace("&", "§").replace("#", "'"));
						    H9M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.23").replace("&", "§").replace("#", "'"));
						    H9M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.23").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä").replace("#", "'")));
						    H9.setItemMeta(H9M);	
							p.getInventory().setHelmet(H9);
							plugin.H9.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H14.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}				
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.24").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.24") | p.isOp()) {
						if(!plugin.H10.contains(p)) {
						    ItemStack H10 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H10M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H10M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.24").replace("&", "§").replace("#", "'"));
						    H10M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.24").replace("&", "§").replace("#", "'"));
						    H10M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.24").replace("&", "§").replace("#", "'")));
						    H10.setItemMeta(H10M);	
							p.getInventory().setHelmet(H10);
							plugin.H10.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H14.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}				
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.25").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.25") | p.isOp()) {
						if(!plugin.H11.contains(p)) {
						    ItemStack H11 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H11M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H11M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.25").replace("&", "§").replace("#", "'"));
						    H11M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.25").replace("&", "§").replace("#", "'"));
						    H11M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.25").replace("&", "§").replace("#", "'")));
						    H11.setItemMeta(H11M);		
							p.getInventory().setHelmet(H11);
							plugin.H11.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H14.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}				
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.26").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.26") | p.isOp()) {
						if(!plugin.H12.contains(p)) {
						    ItemStack H12 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H12M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H12M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.26").replace("&", "§").replace("#", "'"));
						    H12M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.26").replace("&", "§").replace("#", "'"));
						    H12M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.26").replace("&", "§").replace("#", "'")));
						    H12.setItemMeta(H12M);	
							p.getInventory().setHelmet(H12);
							plugin.H12.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H13.remove(p);
							plugin.H14.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}				
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.27").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.27") | p.isOp()) {
						if(!plugin.H13.contains(p)) {
						    ItemStack H13 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H13M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H13M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.27").replace("&", "§").replace("#", "'"));
						    H13M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.27").replace("&", "§").replace("#", "'"));
						    H13M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.27").replace("&", "§").replace("#", "'")));
						    H13.setItemMeta(H13M);	
							p.getInventory().setHelmet(H13);
							plugin.H13.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H14.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}				
				}
				if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.28").replace("&", "§").replace("#", "'")))) {
					if(p.hasPermission("CustomHeads.Head.28") | p.isOp()) {
						if(!plugin.H14.contains(p)) {
						    ItemStack H14 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H14M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    H14M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.28").replace("&", "§").replace("#", "'"));
						    H14M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.28").replace("&", "§").replace("#", "'"));
						    H14M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.28").replace("&", "§").replace("#", "'")));
						    H14.setItemMeta(H14M);
							p.getInventory().setHelmet(H14);
							plugin.H14.add(p);
							plugin.H1.remove(p);
							plugin.H2.remove(p);
							plugin.H3.remove(p);
							plugin.H4.remove(p);
							plugin.H5.remove(p);
							plugin.H6.remove(p);
							plugin.H7.remove(p);
							plugin.H8.remove(p);
							plugin.H9.remove(p);
							plugin.H10.remove(p);
							plugin.H11.remove(p);
							plugin.H12.remove(p);
							plugin.H13.remove(p);
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
						}
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
					}					
				}
				if(e.getCurrentItem().getType().equals(Material.BARRIER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.GUI.ClearHeadItemName").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä")))) {
					if(p.getInventory().getHelmet() != null) {
						p.getInventory().setHelmet(null);
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadClearMessage.Message").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
						plugin.H1.remove(p);
						plugin.H2.remove(p);
						plugin.H3.remove(p);
						plugin.H4.remove(p);
						plugin.H5.remove(p);
						plugin.H6.remove(p);
						plugin.H7.remove(p);
						plugin.H8.remove(p);
						plugin.H9.remove(p);
						plugin.H10.remove(p);
						plugin.H11.remove(p);
						plugin.H12.remove(p);
						plugin.H13.remove(p);
						plugin.H14.remove(p);
						
						plugin.HP1.remove(p);
						plugin.HP2.remove(p);
						plugin.HP3.remove(p);
						plugin.HP4.remove(p);
						plugin.HP5.remove(p);
						plugin.HP6.remove(p);
						plugin.HP7.remove(p);
						plugin.HP8.remove(p);
						plugin.HP9.remove(p);
						plugin.HP10.remove(p);
						plugin.HP11.remove(p);
						plugin.HP12.remove(p);
						plugin.HP13.remove(p);
						plugin.HP14.remove(p);
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadClearMessage.NoHeadMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
					}
				}
				if(e.getCurrentItem().getType().equals(Material.SLIME_BALL) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.GUI.CloseItemName").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
					p.closeInventory();
				}
				if(e.getCurrentItem().getType().equals(Material.ARROW) && e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.GUI.BackSide").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"))) {
					p.openInventory(plugin.inv);
				}
			}
		}
	}
}
