package de.Herbystar.CustomHeads;

import java.util.Arrays;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class Commands implements CommandExecutor {
	
	Main plugin;
	public Commands(Main main) {
		plugin = main;
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("CH")) {
			if(args.length == 0) {
				p.sendMessage("§a[]===============[§4§lCustomHeads§a]===============[]");
				p.sendMessage("§4 /CH HeadItem §8-> §aGives you the Head Selector Item!");
				p.sendMessage("§4 /CH HeadMenu §8-> §aOpen the head menu!");
				p.sendMessage("§4 /CH reload §8-> §aReload the config!");
				p.sendMessage("§4 /CH set §a<SkullOwner> §8-> §aSet the Skull from the Player on your Head!");
				p.sendMessage("§4 /CH get §a<SkullOwner> §8-> §aGet the Skull from the Player in your Inventory!");
				p.sendMessage("§4 /CH remove §8-> §aClear your head!");
				p.sendMessage("§a[]===============[§4§lCustomHeads§a]===============[]");
				return true;
			}
			if(args.length == 1) {
				if(args[0].equalsIgnoreCase("remove")) {
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
						return true;
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.HeadClearMessage.NoHeadMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
						return true;
					}
				}
			}
			if(args.length == 1) {
				if(args[0].equalsIgnoreCase("HeadItem")) {
					if(p.hasPermission("CustomHeads.Item.Cmd") | p.isOp()) {
						ItemStack HI = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
					    SkullMeta HIM = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
					    try {
					    	HIM.setOwningPlayer(p);
					    } catch(NoSuchMethodError ex) {
					    	HIM.setOwner(p.getDisplayName());
					    }
					    HIM.setDisplayName(plugin.getConfig().getString("CustomHeads.JoinItem.Name").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
					    HIM.setLore(Arrays.asList(plugin.getConfig().getString("CustomHeads.JoinItem.Lore").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")));
						HI.setItemMeta(HIM);
						
						p.getInventory().setItem(plugin.getConfig().getInt("CustomHeads.JoinItem.Slot(0-8)"), HI);
						return true;
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
						return true;
					}
				}
			}
			if(args.length == 1) {
				if(args[0].equalsIgnoreCase("HeadMenu")) {
					if(p.hasPermission("CustomHeads.Item.Open")) {
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
						return true;
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
						return true;
					}
				}
			}
			if(args.length == 1) {
				if(args[0].equalsIgnoreCase("reload")) {
					if(p.hasPermission("CustomHeads.Reload") | p.isOp()) {
						plugin.reloadConfig();
						p.sendMessage(plugin.prefix + "§aConfiguration reloaded!");
						return true;				
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
						return true;
					}
				}
			}
			if(args.length == 2) {
				if(args[0].equalsIgnoreCase("set")) {
					ItemStack HI = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HIM = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HIM.setOwner(args[1]);
				    HIM.setDisplayName("§f§o" + args[1]);
					HI.setItemMeta(HIM);
					p.getInventory().setHelmet(HI);
					p.sendMessage(plugin.prefix + "§aYou set the Skull from §4" + args[1] + "§a on your head!");
					return true;
				}
				if(args[0].equalsIgnoreCase("get")) {
					ItemStack HI = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
				    SkullMeta HIM = (SkullMeta)Bukkit.getItemFactory().getItemMeta(Material.SKULL_ITEM);
				    HIM.setOwner(args[1]);
				    HIM.setDisplayName("§f§o" + args[1]);
					HI.setItemMeta(HIM);
					p.getInventory().addItem(HI);
					p.sendMessage(plugin.prefix + "§aYou add the Skull from §4" + args[1] + "§a to your Inventory!");
					return true;
				}
			}

		}
		
		return false;
	}
}
