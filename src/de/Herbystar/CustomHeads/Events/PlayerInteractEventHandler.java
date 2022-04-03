package de.Herbystar.CustomHeads.Events;

import java.util.Arrays;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import de.Herbystar.CustomHeads.Main;

public class PlayerInteractEventHandler implements Listener {
	
	Main plugin;
	public PlayerInteractEventHandler(Main main) {
		plugin = main;
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteractEvent(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if((((e.getAction() == Action.RIGHT_CLICK_AIR ? 1 : 0) | (e.getAction() == Action.RIGHT_CLICK_BLOCK ? 1 : 0)) != 0)) {
			if(e.getItem() != null) {
				if(e.getMaterial().equals(Material.SKULL_ITEM)) {
					if(e.getItem().hasItemMeta() && e.getItem().getItemMeta().getDisplayName().equals(plugin.getConfig().getString("CustomHeads.JoinItem.Name").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"))) {
						e.setCancelled(true);
						if(p.hasPermission("CustomHeads.Item.Open") | p.isOp()) {
							plugin.inv = p.getPlayer().getServer().createInventory(null, plugin.getConfig().getInt("CustomHeads.Inv1Size"), plugin.getConfig().getString("CustomHeads.HeadsInventory.Side1Title").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
							
							ItemStack H1 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H1M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    try {
							    H1M.setOwningPlayer(Bukkit.getOfflinePlayer(plugin.getConfig().getString("CustomHeads.HeadOwners.1").replace("&", "§").replace("#", "'")));
						    } catch(NoSuchMethodError ex) {
							    H1M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.1").replace("&", "§").replace("#", "'"));
						    }					    
						    H1M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.1").replace("&", "§").replace("#", "'"));
						    H1M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.1").replace("&", "§").replace("#", "'")));
						    H1.setItemMeta(H1M);				
							
						    ItemStack H2 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H2M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    try {
							    H2M.setOwningPlayer(Bukkit.getOfflinePlayer(plugin.getConfig().getString("CustomHeads.HeadOwners.2").replace("&", "§").replace("#", "'")));
						    } catch(NoSuchMethodError ex) {
							    H2M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.2").replace("&", "§").replace("#", "'"));
						    }					    
						    H2M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.2").replace("&", "§").replace("#", "'"));
						    H2M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.2").replace("&", "§").replace("#", "'")));
						    H2.setItemMeta(H2M);	
							
						    ItemStack H3 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H3M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    try {
							    H3M.setOwningPlayer(Bukkit.getOfflinePlayer(plugin.getConfig().getString("CustomHeads.HeadOwners.3").replace("&", "§").replace("#", "'")));
						    } catch(NoSuchMethodError ex) {
							    H3M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.3").replace("&", "§").replace("#", "'"));
						    }					    
						    H3M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.3").replace("&", "§").replace("#", "'"));
						    H3M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.3").replace("&", "§").replace("#", "'")));
						    H3.setItemMeta(H3M);
						    
						    ItemStack H4 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H4M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    try {
							    H4M.setOwningPlayer(Bukkit.getOfflinePlayer(plugin.getConfig().getString("CustomHeads.HeadOwners.4").replace("&", "§").replace("#", "'")));
						    } catch(NoSuchMethodError ex) {
							    H4M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.4").replace("&", "§").replace("#", "'"));
						    }					    
						    H4M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.4").replace("&", "§").replace("#", "'"));
						    H4M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.4").replace("&", "§").replace("#", "'")));
						    H4.setItemMeta(H4M);	
							
						    ItemStack H5 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H5M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    try {
							    H5M.setOwningPlayer(Bukkit.getOfflinePlayer(plugin.getConfig().getString("CustomHeads.HeadOwners.5").replace("&", "§").replace("#", "'")));
						    } catch(NoSuchMethodError ex) {
							    H5M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.5").replace("&", "§").replace("#", "'"));
						    }					    
						    H5M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.5").replace("&", "§").replace("#", "'"));
						    H5M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.5").replace("&", "§").replace("#", "'")));
						    H5.setItemMeta(H5M);	
							
						    ItemStack H6 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H6M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    try {
							    H6M.setOwningPlayer(Bukkit.getOfflinePlayer(plugin.getConfig().getString("CustomHeads.HeadOwners.6").replace("&", "§").replace("#", "'")));
						    } catch(NoSuchMethodError ex) {
							    H6M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.6").replace("&", "§").replace("#", "'"));
						    }					    
						    H6M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.6").replace("&", "§").replace("#", "'"));
						    H6M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.6").replace("&", "§").replace("#", "'")));
						    H6.setItemMeta(H6M);
							
						    ItemStack H7 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H7M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    try {
							    H7M.setOwningPlayer(Bukkit.getOfflinePlayer(plugin.getConfig().getString("CustomHeads.HeadOwners.7").replace("&", "§").replace("#", "'")));
						    } catch(NoSuchMethodError ex) {
							    H7M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.7").replace("&", "§").replace("#", "'"));
						    }					    
						    H7M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.7").replace("&", "§").replace("#", "'"));
						    H7M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.7").replace("&", "§").replace("#", "'")));
						    H7.setItemMeta(H7M);
							
						    ItemStack H8 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H8M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    try {
							    H8M.setOwningPlayer(Bukkit.getOfflinePlayer(plugin.getConfig().getString("CustomHeads.HeadOwners.8").replace("&", "§").replace("#", "'")));
						    } catch(NoSuchMethodError ex) {
							    H8M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.8").replace("&", "§").replace("#", "'"));
						    }					    
						    H8M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.8").replace("&", "§").replace("#", "'"));
						    H8M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.8").replace("&", "§").replace("#", "'")));
						    H8.setItemMeta(H8M);	
							
						    ItemStack H9 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H9M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    try {
							    H9M.setOwningPlayer(Bukkit.getOfflinePlayer(plugin.getConfig().getString("CustomHeads.HeadOwners.9").replace("&", "§").replace("#", "'")));
						    } catch(NoSuchMethodError ex) {
							    H9M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.9").replace("&", "§").replace("#", "'"));
						    }					    
						    H9M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.9").replace("&", "§").replace("#", "'"));
						    H9M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.9").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("ue", "ü").replace("Ae", "Ä").replace("ae", "ä").replace("#", "'")));
						    H9.setItemMeta(H9M);	
							
						    ItemStack H10 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H10M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    try {
							    H10M.setOwningPlayer(Bukkit.getOfflinePlayer(plugin.getConfig().getString("CustomHeads.HeadOwners.10").replace("&", "§").replace("#", "'")));
						    } catch(NoSuchMethodError ex) {
							    H10M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.10").replace("&", "§").replace("#", "'"));
						    }					    
						    H10M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.10").replace("&", "§").replace("#", "'"));
						    H10M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.10").replace("&", "§").replace("#", "'")));
						    H10.setItemMeta(H10M);
							
						    ItemStack H11 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H11M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    try {
							    H11M.setOwningPlayer(Bukkit.getOfflinePlayer(plugin.getConfig().getString("CustomHeads.HeadOwners.11").replace("&", "§").replace("#", "'")));
						    } catch(NoSuchMethodError ex) {
							    H11M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.11").replace("&", "§").replace("#", "'"));
						    }					    
						    H11M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.11").replace("&", "§").replace("#", "'"));
						    H11M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.11").replace("&", "§").replace("#", "'")));
						    H11.setItemMeta(H11M);	
							
						    ItemStack H12 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H12M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    try {
							    H12M.setOwningPlayer(Bukkit.getOfflinePlayer(plugin.getConfig().getString("CustomHeads.HeadOwners.12").replace("&", "§").replace("#", "'")));
						    } catch(NoSuchMethodError ex) {
							    H12M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.12").replace("&", "§").replace("#", "'"));
						    }					    
						    H12M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.12").replace("&", "§").replace("#", "'"));
						    H12M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.12").replace("&", "§").replace("#", "'")));
						    H12.setItemMeta(H12M);
							
						    ItemStack H13 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H13M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    try {
							    H13M.setOwningPlayer(Bukkit.getOfflinePlayer(plugin.getConfig().getString("CustomHeads.HeadOwners.13").replace("&", "§").replace("#", "'")));
						    } catch(NoSuchMethodError ex) {
							    H13M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.13").replace("&", "§").replace("#", "'"));
						    }					    
						    H13M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.13").replace("&", "§").replace("#", "'"));
						    H13M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.13").replace("&", "§").replace("#", "'")));
						    H13.setItemMeta(H13M);	
							
						    ItemStack H14 = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
						    SkullMeta H14M = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
						    try {
							    H14M.setOwningPlayer(Bukkit.getOfflinePlayer(plugin.getConfig().getString("CustomHeads.HeadOwners.14").replace("&", "§").replace("#", "'")));
						    } catch(NoSuchMethodError ex) {
							    H14M.setOwner(plugin.getConfig().getString("CustomHeads.HeadOwners.14").replace("&", "§").replace("#", "'"));
						    }					    
						    H14M.setDisplayName(plugin.getConfig().getString("CustomHeads.HeadDisplayNames.14").replace("&", "§").replace("#", "'"));
						    H14M.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.HeadLores.14").replace("&", "§").replace("#", "'")));
						    H14.setItemMeta(H14M);		
							
							
							ItemStack E = new ItemStack(Material.BARRIER);
							ItemMeta EM = E.getItemMeta();
							EM.setDisplayName(plugin.getConfig().getString("CustomHeads.GUI.ClearHeadItemName").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
							E.setItemMeta(EM);
							
							ItemStack C = new ItemStack(Material.SLIME_BALL);
							ItemMeta CM = C.getItemMeta();
							CM.setDisplayName(plugin.getConfig().getString("CustomHeads.GUI.CloseItemName").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
							C.setItemMeta(CM);
							
							ItemStack N = new ItemStack(Material.MAGMA_CREAM);
							ItemMeta NM = N.getItemMeta();
							NM.setDisplayName(plugin.getConfig().getString("CustomHeads.GUI.NextSide").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
							N.setItemMeta(NM);
							
							
							//1 Reihe
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.1") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.1"), H1);
							}
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.2") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.2"), H2);
							}
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.3") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.3"), H3);
							}
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.4") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.4"), H4);
							}
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.5") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.5"), H5);
							}
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.6") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.6"), H6);
							}
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.7") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.7"), H7);
							}
							
							//2 Reihe
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.8") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.8"), H8);
							}
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.9") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.9"), H9);
							}
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.10") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.10"), H10);
							}
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.11") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.11"), H11);
							}
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.12") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.12"), H12);
							}
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.13") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.13"), H13);
							}
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.14") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.14"), H14);
							}
							
							//Special Items
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.CloseItem") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.Inventory1.CloseItem"), C);
							}
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.ClearHeadItem") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.Inventory1.ClearHeadItem"), E);
							}
							if(plugin.getConfig().getBoolean("CustomHeads.FreeSlot.NextSide") == false) {
								plugin.inv.setItem(plugin.getConfig().getInt("CustomHeads.Slot.Inventory1.NextSide"), N);
							}				
							p.openInventory(plugin.inv);
						}
					}
				}
			}			
		}	
	}

}
