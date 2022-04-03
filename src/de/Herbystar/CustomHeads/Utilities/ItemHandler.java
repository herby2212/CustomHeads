package de.Herbystar.CustomHeads.Utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import de.Herbystar.CustomHeads.Main;

public class ItemHandler {
	
	public static class Head {
		public ItemStack item;
		public String displayName;
		public String id;
		
		public Head(String id, String displayName, String lore, String ownerName) {
			this.id = id;
			this.item = createHead(displayName, lore, ownerName);
			this.displayName = this.item.getItemMeta().getDisplayName();
			
			headCollection.add(this);
		}
		
		public static Head getHeadById(String id) {
			for(Head h : headCollection) {
				if(h.id.equals(id)) {
					return h;
				}
			}
			return null;
		}
	}
	
	public static List<Head> headCollection = new ArrayList<Head>();
	
	@SuppressWarnings("deprecation")
	public static void createJoinItem(Player player, boolean setItem) {
		if(player == null) {
			return;
		}
		
		ItemStack HB = XMaterial.PLAYER_HEAD.parseItem();
	    SkullMeta HBM = (SkullMeta)Bukkit.getItemFactory().getItemMeta(XMaterial.PLAYER_HEAD.parseMaterial());
	    try {
		    HBM.setOwningPlayer(player);
	    } catch(NoSuchMethodError ex) {
	    	HBM.setOwner(player.getDisplayName());
	    }
	    HBM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.JoinItem.Name")));
	    HBM.setLore(Arrays.asList(Main.instance.replaceString(Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.JoinItem.Lore")))));
	    HB.setItemMeta(HBM);
		
	    if(setItem == true) {
		    //Check if Slot is already taken
		    if(player.getInventory().getItem(Main.instance.getConfig().getInt("CustomHeads.JoinItem.Slot(0-8)")) == null) {
		    	player.getInventory().setItem(Main.instance.getConfig().getInt("CustomHeads.JoinItem.Slot(0-8)"), HB);
		    } else {
		    	player.getInventory().addItem(HB);
		    }
	    } else {
	    	if(player.getInventory().contains(HB.getType())) {
	    		player.getInventory().remove(HB.getType());
	    		player.updateInventory();
		    }
	    }
	}
	
	@SuppressWarnings({ "deprecation" })
	private static ItemStack createHead(String displayName, String lore, String ownerName) {
		ItemStack h = XMaterial.PLAYER_HEAD.parseItem();
	    SkullMeta hm = (SkullMeta)Bukkit.getItemFactory().getItemMeta(XMaterial.PLAYER_HEAD.parseMaterial());
	    ownerName = Main.instance.replaceString(ownerName);
	    try {
		    hm.setOwningPlayer(Bukkit.getOfflinePlayer(ownerName));
	    } catch(NoSuchMethodError ex) {
	    	hm.setOwner(ownerName);
	    }
	    hm.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.JoinItem.Name")));
	    hm.setLore(Arrays.asList(Main.instance.replaceString(Main.instance.getConfig().getString(lore))));
	    h.setItemMeta(hm);
	    
	    return h;
	}
	
	public static Inventory getInventoryPageOne() {
		if(Main.instance.inv != null) {
			return Main.instance.inv;
		}
		Inventory i = Bukkit.getServer().createInventory(null, Main.instance.getConfig().getInt("CustomHeads.Inv1Size"),
				Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadsInventory.Side1Title")));
		
		
		ItemStack H1 = new Head("H1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.1")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.1"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.1")).item;
		ItemStack H2 = new Head("H2", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.2")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.2"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.2")).item;
		ItemStack H3 = new Head("H3", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.3")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.3"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.3")).item;
		ItemStack H4 = new Head("H4", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.4")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.4"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.4")).item;
		ItemStack H5 = new Head("H5", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.5")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.5"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.5")).item;
		ItemStack H6 = new Head("H6", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.6")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.6"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.6")).item;
		ItemStack H7 = new Head("H7", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.7")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.7"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.7")).item;
		ItemStack H8 = new Head("H8", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.8")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.8"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.8")).item;
		ItemStack H9 = new Head("H9", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.9")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.9"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.9")).item;
		ItemStack H10 = new Head("H10", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.10")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.10"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.10")).item;
		ItemStack H11 = new Head("H11", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.11")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.11"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.11")).item;
		ItemStack H12 = new Head("H12", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.12")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.12"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.12")).item;
		ItemStack H13 = new Head("H13", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.13")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.13"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.13")).item;
		ItemStack H14 = new Head("H14", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.14")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.14"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.14")).item;	
		
		ItemStack E = new ItemStack(Material.BARRIER);
		ItemMeta EM = E.getItemMeta();
		EM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.GUI.ClearHeadItemName")));
		E.setItemMeta(EM);
		
		ItemStack C = new ItemStack(Material.SLIME_BALL);
		ItemMeta CM = C.getItemMeta();
		CM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.GUI.CloseItemName")));
		C.setItemMeta(CM);
		
		ItemStack N = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta NM = N.getItemMeta();
		NM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.GUI.NextSide")));
		N.setItemMeta(NM);
		
		
		//1 Reihe
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.1") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.1"), H1);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.2") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.2"), H2);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.3") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.3"), H3);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.4") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.4"), H4);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.5") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.5"), H5);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.6") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.6"), H6);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.7") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.7"), H7);
		}
		
		//2 Reihe
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.8") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.8"), H8);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.9") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.9"), H9);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.10") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.10"), H10);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.11") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.11"), H11);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.12") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.12"), H12);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.13") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.13"), H13);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.14") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.14"), H14);
		}
		
		//Special Items
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.CloseItem") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.Inventory1.CloseItem"), C);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.ClearHeadItem") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.Inventory1.ClearHeadItem"), E);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.NextSide") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.Inventory1.NextSide"), N);
		}
		
		Main.instance.inv = i;
		return i;
	}
	
	public static Inventory getInventoryPageTwo() {
		if(Main.instance.inv2 != null) {
			return Main.instance.inv2;
		}
		Inventory i = Bukkit.getServer().createInventory(null, Main.instance.getConfig().getInt("CustomHeads.Inv2Size"),
				Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadsInventory.Side2Title")));
		
		
		ItemStack HP1 = new Head("HP1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.15")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.15"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.15")).item;
		ItemStack HP2 = new Head("HP2", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.16")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.15"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.16")).item;
		ItemStack HP3 = new Head("HP3", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.17")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.17"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.17")).item;
		ItemStack HP4 = new Head("HP4", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.18")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.18"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.18")).item;
		ItemStack HP5 = new Head("HP5", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.19")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.19"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.19")).item;
		ItemStack HP6 = new Head("HP6", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.20")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.20"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.20")).item;
		ItemStack HP7 = new Head("HP7", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.21")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.21"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.21")).item;
		ItemStack HP8 = new Head("HP8", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.22")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.22"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.22")).item;
		ItemStack HP9 = new Head("HP9", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.23")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.23"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.23")).item;
		ItemStack HP10 = new Head("HP10", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.24")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.24"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.24")).item;
		ItemStack HP11 = new Head("HP11", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.25")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.25"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.25")).item;
		ItemStack HP12 = new Head("HP12", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.26")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.26"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.26")).item;
		ItemStack HP13 = new Head("HP13", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.27")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.27"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.27")).item;
		ItemStack HP14 = new Head("HP14", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.28")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.28"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.28")).item;		
	    	
		ItemStack b = new ItemStack(Material.ARROW);
		ItemMeta bm = b.getItemMeta();
		bm.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.GUI.BackSide")));
		b.setItemMeta(bm);
		
		ItemStack E = new ItemStack(Material.BARRIER);
		ItemMeta EM = E.getItemMeta();
		EM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.GUI.ClearHeadItemName")));
		E.setItemMeta(EM);
		
		ItemStack C = new ItemStack(Material.SLIME_BALL);
		ItemMeta CM = C.getItemMeta();
		CM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.GUI.CloseItemName")));
		C.setItemMeta(CM);
												
		//1 Reihe
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.15") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.15"), HP1);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.16") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.16"), HP2);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.17") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.17"), HP3);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.18") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.18"), HP4);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.19") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.19"), HP5);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.20") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.20"), HP6);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.21") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.21"), HP7);
		}
		
		//2 Reihe
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.22") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.22"), HP8);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.23") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.23"), HP9);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.24") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.24"), HP10);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.25") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.25"), HP11);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.26") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.26"), HP12);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.27") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.27"), HP13);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.28") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.28"), HP14);
		}
		
		//Special Items
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.CloseItem") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.Inventory2.CloseItem"), C);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.ClearHeadItem") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.Inventory2.ClearHeadItem"), E);
		}
		if(Main.instance.getConfig().getBoolean("CustomHeads.FreeSlot.NextSide") == false) {
			i.setItem(Main.instance.getConfig().getInt("CustomHeads.Slot.Inventory2.BackSide"), b);
		}
		
		Main.instance.inv2 = i;
		return i;
	}
	
}

