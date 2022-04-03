package de.Herbystar.CustomHeads.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import de.Herbystar.CustomHeads.Main;
import de.Herbystar.CustomHeads.Utilities.ItemHandler;
import de.Herbystar.CustomHeads.Utilities.XMaterial;

public class InventoryInteractEvents implements Listener {
	
	Main plugin;
	public InventoryInteractEvents(Main main) {
		plugin = main;
	}
	
	private String getInventoryName(InventoryClickEvent e) {
		try {
			return e.getView().getTitle();
		} catch(Exception ex) {
			return e.getInventory().getName();
		}
	}
	
	@EventHandler
	public void onInv1ClickEvent(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		
		if(getInventoryName(e).equals(plugin.getConfig().getString("CustomHeads.HeadsInventory.Side1Title").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"))) {
			e.setCancelled(true);
			if(e.getCurrentItem().hasItemMeta()) {
				if(e.getCurrentItem().getType().equals(XMaterial.PLAYER_HEAD.parseMaterial())) {
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.1").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.1") | p.isOp()) {
							if(!plugin.H1.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("H1").item);
								Main.instance.addToHeadList(p, plugin.H1, 1);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}						
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.2").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.2") | p.isOp()) {
							if(!plugin.H2.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("H2").item);
								Main.instance.addToHeadList(p, plugin.H2, 1);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}				
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.3").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.3") | p.isOp()) {
							if(!plugin.H3.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("H3").item);
								Main.instance.addToHeadList(p, plugin.H3, 1);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}						
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.4").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.4") | p.isOp()) {
							if(!plugin.H4.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("H4").item);
								Main.instance.addToHeadList(p, plugin.H4, 1);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}								
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.5").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.5") | p.isOp()) {
							if(!plugin.H5.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("H5").item);
								Main.instance.addToHeadList(p, plugin.H5, 1);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}							
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.6").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.6") | p.isOp()) {
							if(!plugin.H6.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("H6").item);
								Main.instance.addToHeadList(p, plugin.H6, 1);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}						
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.7").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.7") | p.isOp()) {
							if(!plugin.H7.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("H7").item);
								Main.instance.addToHeadList(p, plugin.H7, 1);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}						
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.8").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.8") | p.isOp()) {
							if(!plugin.H8.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("H8").item);
								Main.instance.addToHeadList(p, plugin.H8, 1);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}							
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.9").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.9") | p.isOp()) {
							if(!plugin.H9.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("H9").item);
								Main.instance.addToHeadList(p, plugin.H9, 1);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}				
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.10").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.10") | p.isOp()) {
							if(!plugin.H10.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("H10").item);
								Main.instance.addToHeadList(p, plugin.H10, 1);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}				
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.11").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.11") | p.isOp()) {
							if(!plugin.H11.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("H11").item);
								Main.instance.addToHeadList(p, plugin.H11, 1);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}				
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.12").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.12") | p.isOp()) {
							if(!plugin.H12.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("H12").item);
								Main.instance.addToHeadList(p, plugin.H12, 1);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}				
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.13").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.13") | p.isOp()) {
							if(!plugin.H13.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("H13").item);
								Main.instance.addToHeadList(p, plugin.H13, 1);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}				
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.14").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.14") | p.isOp()) {
							if(!plugin.H14.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("H14").item);
								Main.instance.addToHeadList(p, plugin.H14, 1);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}					
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
					p.openInventory(ItemHandler.getInventoryPageTwo());
				}
			}
		}
					
		if(getInventoryName(e).equals(plugin.getConfig().getString("CustomHeads.HeadsInventory.Side2Title").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"))) {
			e.setCancelled(true);
			if(e.getCurrentItem().hasItemMeta()) {
				if(e.getCurrentItem().getType().equals(XMaterial.PLAYER_HEAD.parseMaterial())) {
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.15").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.15") | p.isOp()) {
							if(!plugin.HP1.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("HP1").item);
								Main.instance.addToHeadList(p, plugin.HP1, 2);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}						
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.16").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.16") | p.isOp()) {
							if(!plugin.HP2.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("HP2").item);
								Main.instance.addToHeadList(p, plugin.HP2, 2);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}				
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.17").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.17") | p.isOp()) {
							if(!plugin.HP3.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("HP3").item);
								Main.instance.addToHeadList(p, plugin.HP3, 2);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}						
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.18").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.18") | p.isOp()) {
							if(!plugin.HP4.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("HP4").item);
								Main.instance.addToHeadList(p, plugin.HP4, 2);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}								
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.19").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.19") | p.isOp()) {
							if(!plugin.HP5.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("HP5").item);
								Main.instance.addToHeadList(p, plugin.HP5, 2);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}							
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.20").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.20") | p.isOp()) {
							if(!plugin.HP6.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("HP6").item);
								Main.instance.addToHeadList(p, plugin.HP6, 2);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}						
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.21").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.21") | p.isOp()) {
							if(!plugin.HP7.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("HP7").item);
								Main.instance.addToHeadList(p, plugin.HP7, 2);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}						
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.22").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.22") | p.isOp()) {
							if(!plugin.HP8.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("HP8").item);
								Main.instance.addToHeadList(p, plugin.HP8, 2);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}							
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.23").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.23") | p.isOp()) {
							if(!plugin.HP9.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("HP9").item);
								Main.instance.addToHeadList(p, plugin.HP9, 2);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}				
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.24").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.24") | p.isOp()) {
							if(!plugin.HP10.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("HP10").item);
								Main.instance.addToHeadList(p, plugin.HP10, 2);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}				
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.25").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.25") | p.isOp()) {
							if(!plugin.HP11.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("HP11").item);
								Main.instance.addToHeadList(p, plugin.HP11, 2);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}				
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.26").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.26") | p.isOp()) {
							if(!plugin.HP12.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("HP12").item);
								Main.instance.addToHeadList(p, plugin.HP12, 2);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}				
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.27").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.27") | p.isOp()) {
							if(!plugin.HP13.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("HP13").item);
								Main.instance.addToHeadList(p, plugin.HP13, 2);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}				
					}
					if((e.getCurrentItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.28").replace("&", "§").replace("#", "'")))) {
						if(p.hasPermission("CustomHeads.Head.28") | p.isOp()) {
							if(!plugin.HP14.contains(p)) {
								p.getInventory().setHelmet(ItemHandler.Head.getHeadById("HP14").item);
								Main.instance.addToHeadList(p, plugin.HP14, 2);
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageNewHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							} else {
								p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadSelectMessage.MessageTheSameHead").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
							}
						} else {
							p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä"));
						}					
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
