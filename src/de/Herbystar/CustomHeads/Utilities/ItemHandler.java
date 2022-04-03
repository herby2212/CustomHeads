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
		ItemStack H2 = new Head("H1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.2")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.2"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.2")).item;
		ItemStack H3 = new Head("H1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.3")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.3"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.3")).item;
		ItemStack H4 = new Head("H1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.4")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.4"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.4")).item;
		ItemStack H5 = new Head("H1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.5")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.5"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.5")).item;
		ItemStack H6 = new Head("H1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.6")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.6"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.6")).item;
		ItemStack H7 = new Head("H1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.7")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.7"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.7")).item;
		ItemStack H8 = new Head("H1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.8")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.8"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.8")).item;
		ItemStack H9 = new Head("H1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.9")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.9"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.9")).item;
		ItemStack H10 = new Head("H1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.10")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.10"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.10")).item;
		ItemStack H11 = new Head("H1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.11")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.11"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.11")).item;
		ItemStack H12 = new Head("H1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.12")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.12"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.12")).item;
		ItemStack H13 = new Head("H1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.13")),
				Main.instance.getConfig().getString("CustomHeads.HeadLores.13"),
				Main.instance.getConfig().getString("CustomHeads.HeadOwners.13")).item;
		ItemStack H14 = new Head("H1", Main.instance.replaceString(Main.instance.getConfig().getString("CustomHeads.HeadDisplayNames.14")),
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
		
		return i;

	}
	
	/*
	public static Inventory getInventoryPageOne() {
		if(Main.instance.inv != null) {
			return Main.instance.inv;
		}
		Inventory i = Bukkit.getServer().createInventory(null, Main.instance.getConfig().getInt("HeadBanner.InventorySize.1"), 
				Main.instance.replaceString(Main.instance.getConfig().getString("HeadBanner.BannerInventory.Side1Title")));
		
		ItemStack B1 = new Banner("B1", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.1"), XMaterial.BLACK_BANNER, DyeColor.BLACK).item;	
		ItemStack B2 = new Banner("B2", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.2"), XMaterial.WHITE_BANNER, DyeColor.WHITE).item;
		ItemStack B3 = new Banner("B3", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.3"), XMaterial.GRAY_BANNER, DyeColor.GRAY).item;
		ItemStack B4 = new Banner("B4", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.4"), XMaterial.BLUE_BANNER, DyeColor.BLUE).item;
		ItemStack B5 = new Banner("B5", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.5"), XMaterial.GREEN_BANNER, DyeColor.GREEN).item;
		ItemStack B6 = new Banner("B6", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.6"), XMaterial.CYAN_BANNER, DyeColor.CYAN).item;
		ItemStack B7 = new Banner("B7", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.7"), XMaterial.YELLOW_BANNER, DyeColor.YELLOW).item;
		ItemStack B8 = new Banner("B8", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.8"), XMaterial.LIGHT_BLUE_BANNER, DyeColor.LIGHT_BLUE).item;
		ItemStack B9 = new Banner("B9", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.9"), XMaterial.RED_BANNER, DyeColor.RED).item;
		ItemStack B10 = new Banner("B10", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.10"), XMaterial.LIME_BANNER, DyeColor.LIME).item;
		ItemStack B11 = new Banner("B11", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.11"), XMaterial.ORANGE_BANNER, DyeColor.ORANGE).item;
		ItemStack B12 = new Banner("B12", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.12"), XMaterial.PINK_BANNER, DyeColor.PINK).item;
		ItemStack B13 = new Banner("B13", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.13"), XMaterial.MAGENTA_BANNER, DyeColor.MAGENTA).item;
		DyeColor d;
		if(XMaterial.isNewVersion()) {
			d = DyeColor.valueOf("LIGHT_GRAY");
		} else {
			d = DyeColor.valueOf("SILVER");
		}
		ItemStack B14 = new Banner("B14", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.14"), XMaterial.LIGHT_GRAY_BANNER, d).item;
			
		
		ItemStack E = new ItemStack(Material.BARRIER);
		ItemMeta EM = E.getItemMeta();
		EM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("HeadBanner.GUI.ClearHeadItemName")));
		E.setItemMeta(EM);
		
		ItemStack C = new ItemStack(Material.SLIME_BALL);
		ItemMeta CM = C.getItemMeta();
		CM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("HeadBanner.GUI.CloseItemName")));
		C.setItemMeta(CM);
		
		ItemStack N = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta NM = N.getItemMeta();
		NM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("HeadBanner.GUI.NextSide")));
		N.setItemMeta(NM);
		
		ItemStack R = new ItemStack(Material.ARMOR_STAND);
		ItemMeta RM = R.getItemMeta();
		RM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("HeadBanner.GUI.RotateItemName")));
		R.setItemMeta(RM);
		
		//1 Reihe
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.1") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.1"), B1);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.2") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.2"), B2);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.3") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.3"), B3);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.4") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.4"), B4);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.5") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.5"), B5);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.6") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.6"), B6);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.7") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.7"), B7);
		}
		
		//2 Reihe
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.8") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.8"), B8);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.9") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.9"), B9);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.10") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.10"), B10);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.11") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.11"), B11);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.12") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.12"), B12);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.13") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.13"), B13);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.14") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.14"), B14);
		}
		
		
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.RotateItem") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.RotateItem1"), R);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.ClearHeadItem") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.ClearHeadItem1"), E);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.CloseItem") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.CloseItem1"), C);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.NextSide") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.NextSide1"), N);
		}
		Main.instance.inv = i;
		return i;

	}
	
	public static Inventory getInventoryPageTwo() {
		if(Main.instance.inv2 != null) {
			return Main.instance.inv2;
		}
		Inventory i = Bukkit.getServer().createInventory(null, Main.instance.getConfig().getInt("HeadBanner.InventorySize.2"), 
				Main.instance.replaceString(Main.instance.getConfig().getString("HeadBanner.BannerInventory.Side2Title")));
		
		ItemStack BP1 = new Banner("BP1", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.15"), XMaterial.WHITE_BANNER, DyeColor.WHITE, 
				Arrays.asList(new Pattern(DyeColor.BLACK, PatternType.BORDER), new Pattern(DyeColor.BLACK, PatternType.SKULL))).item;	
		ItemStack BP2 = new Banner("BP2", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.16"), XMaterial.BLACK_BANNER, DyeColor.BLACK,
				Arrays.asList(
						new Pattern(DyeColor.BLACK, PatternType.HALF_HORIZONTAL),
						new Pattern(DyeColor.GREEN, PatternType.TRIANGLE_TOP),
						new Pattern(DyeColor.RED, PatternType.STRIPE_SMALL),
						new Pattern(DyeColor.GREEN, PatternType.SKULL),
						new Pattern(DyeColor.GREEN, PatternType.TRIANGLES_TOP),
						new Pattern(DyeColor.GREEN, PatternType.CURLY_BORDER))).item;
		ItemStack BP3 = new Banner("BP3", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.17"), XMaterial.LIME_BANNER, DyeColor.LIME,
				Arrays.asList(
						new Pattern(DyeColor.YELLOW, PatternType.RHOMBUS_MIDDLE),
						new Pattern(DyeColor.RED, PatternType.BORDER),
						new Pattern(DyeColor.YELLOW, PatternType.FLOWER),
						new Pattern(DyeColor.RED, PatternType.CIRCLE_MIDDLE))).item;
		ItemStack BP4 = new Banner("BP4", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.18"), XMaterial.BROWN_BANNER, DyeColor.BROWN,
				Arrays.asList(
						new Pattern(DyeColor.YELLOW, PatternType.MOJANG))).item;
		ItemStack BP5 = new Banner("BP5", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.19"), XMaterial.BLUE_BANNER, DyeColor.BLUE,
				Arrays.asList(
						new Pattern(DyeColor.LIGHT_BLUE, PatternType.CURLY_BORDER),
						new Pattern(DyeColor.LIGHT_BLUE, PatternType.FLOWER),
						new Pattern(DyeColor.LIGHT_BLUE, PatternType.TRIANGLES_TOP),
						new Pattern(DyeColor.LIGHT_BLUE, PatternType.TRIANGLES_BOTTOM),
						new Pattern(DyeColor.BLUE, PatternType.CIRCLE_MIDDLE))).item;
		ItemStack BP6 = new Banner("BP6", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.20"), XMaterial.BLACK_BANNER, DyeColor.BLACK,
				Arrays.asList(
						new Pattern(DyeColor.ORANGE, PatternType.TRIANGLE_BOTTOM),
						new Pattern(DyeColor.YELLOW, PatternType.RHOMBUS_MIDDLE),
						new Pattern(DyeColor.RED, PatternType.BORDER),
						new Pattern(DyeColor.RED, PatternType.TRIANGLES_TOP))).item;
		ItemStack BP7 = new Banner("BP7", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.21"), XMaterial.BLACK_BANNER, DyeColor.BLACK,
				Arrays.asList(
						new Pattern(DyeColor.GRAY, PatternType.BORDER),
						new Pattern(DyeColor.GRAY, PatternType.STRIPE_CENTER),
						new Pattern(DyeColor.RED, PatternType.SKULL))).item;
		ItemStack BP8 = new Banner("BP8", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.22"), XMaterial.LIME_BANNER, DyeColor.LIME,
				Arrays.asList(
						new Pattern(DyeColor.RED, PatternType.BRICKS),
						new Pattern(DyeColor.YELLOW, PatternType.FLOWER),
						new Pattern(DyeColor.YELLOW, PatternType.FLOWER),
						new Pattern(DyeColor.LIME, PatternType.CIRCLE_MIDDLE),
						new Pattern(DyeColor.RED, PatternType.BORDER))).item;
		ItemStack BP9 = new Banner("BP9", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.23"), XMaterial.BLACK_BANNER, DyeColor.BLACK,
				Arrays.asList(
						new Pattern(DyeColor.YELLOW, PatternType.CROSS),
						new Pattern(DyeColor.YELLOW, PatternType.STRAIGHT_CROSS),
						new Pattern(DyeColor.RED, PatternType.CURLY_BORDER))).item;
		ItemStack BP10 = new Banner("BP10", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.24"), XMaterial.BLACK_BANNER, DyeColor.BLACK,
				Arrays.asList(
						new Pattern(DyeColor.RED, PatternType.CROSS),
						new Pattern(DyeColor.RED, PatternType.BORDER))).item;
		ItemStack BP11 = new Banner("BP11", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.25"), XMaterial.BLACK_BANNER, DyeColor.BLACK,
				Arrays.asList(
						new Pattern(DyeColor.YELLOW, PatternType.CREEPER),
						new Pattern(DyeColor.LIME, PatternType.GRADIENT_UP))).item;
		ItemStack BP12 = new Banner("BP12", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.26"), XMaterial.YELLOW_BANNER, DyeColor.YELLOW,
				Arrays.asList(
						new Pattern(DyeColor.YELLOW, PatternType.BORDER),
						new Pattern(DyeColor.LIME, PatternType.CREEPER),
						new Pattern(DyeColor.LIME, PatternType.CREEPER))).item;
		ItemStack BP13 = new Banner("BP13", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.27"), XMaterial.BLACK_BANNER, DyeColor.BLACK,
				Arrays.asList(
						new Pattern(DyeColor.RED, PatternType.BRICKS),
						new Pattern(DyeColor.CYAN, PatternType.GRADIENT_UP),
						new Pattern(DyeColor.ORANGE, PatternType.GRADIENT),
						new Pattern(DyeColor.WHITE, PatternType.BORDER))).item;
		ItemStack BP14 = new Banner("BP14", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.28"), XMaterial.WHITE_BANNER, DyeColor.WHITE,
				Arrays.asList(
						new Pattern(DyeColor.BLACK, PatternType.GRADIENT),
						new Pattern(DyeColor.BLACK, PatternType.CROSS),
						new Pattern(DyeColor.BLACK, PatternType.CURLY_BORDER))).item;

		ItemStack B = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta BM = B.getItemMeta();
		BM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("HeadBanner.GUI.BackSide")));
		B.setItemMeta(BM);
		
		ItemStack R = new ItemStack(Material.ARMOR_STAND);
		ItemMeta RM = R.getItemMeta();
		RM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("HeadBanner.GUI.RotateItemName")));
		R.setItemMeta(RM);
		
		ItemStack N = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta NM = N.getItemMeta();
		NM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("HeadBanner.GUI.NextSide")));
		N.setItemMeta(NM);
		
		//1 Reihe
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.15") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.15"), BP1);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.16") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.16"), BP2);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.17") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.17"), BP3);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.18") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.18"), BP4);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.19") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.19"), BP5);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.20") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.20"), BP6);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.21") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.21"), BP7);
		}
		
		//2 Reihe
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.22") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.22"), BP8);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.23") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.23"), BP9);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.24") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.24"), BP10);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.25") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.25"), BP11);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.26") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.26"), BP12);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.27") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.27"), BP13);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.28") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.28"), BP14);
		}
		
		
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.RotateItem") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.RotateItem2"), R);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.BackSide") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.BackSide2"), B);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.NextSide") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.NextSide2"), N);
		}
		
		Main.instance.inv2 = i;
		return i;

	}
	
	public static Inventory getInventoryPageThree() {
		if(Main.instance.inv3 != null) {
			return Main.instance.inv3;
		}
		Inventory i = Bukkit.getServer().createInventory(null, Main.instance.getConfig().getInt("HeadBanner.InventorySize.3"), 
				Main.instance.replaceString(Main.instance.getConfig().getString("HeadBanner.BannerInventory.Side3Title")));
		
		ItemStack BA1 = new Banner("BA1", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.29"), XMaterial.RED_BANNER, DyeColor.RED, 
				Arrays.asList(
						new Pattern(DyeColor.WHITE, PatternType.HALF_HORIZONTAL_MIRROR),
						new Pattern(DyeColor.BLACK, PatternType.RHOMBUS_MIDDLE),
						new Pattern(DyeColor.BLACK, PatternType.STRIPE_MIDDLE),
						new Pattern(DyeColor.WHITE, PatternType.CIRCLE_MIDDLE),
						new Pattern(DyeColor.RED, PatternType.STRIPE_TOP),
						new Pattern(DyeColor.WHITE, PatternType.STRIPE_BOTTOM))).item;	
		ItemStack BA2 = new Banner("BA2", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.30"), XMaterial.WHITE_BANNER, DyeColor.WHITE,
				Arrays.asList(
						new Pattern(DyeColor.BLACK, PatternType.FLOWER),
						new Pattern(DyeColor.WHITE, PatternType.HALF_HORIZONTAL_MIRROR),
						new Pattern(DyeColor.BLACK, PatternType.TRIANGLES_TOP),
						new Pattern(DyeColor.WHITE, PatternType.STRIPE_CENTER),
						new Pattern(DyeColor.BLACK, PatternType.CREEPER),
						new Pattern(DyeColor.WHITE, PatternType.STRIPE_BOTTOM))).item;
		ItemStack BA3 = new Banner("BA3", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.31"), XMaterial.PURPLE_BANNER, DyeColor.PURPLE,
				Arrays.asList(
						new Pattern(DyeColor.PURPLE, PatternType.STRIPE_MIDDLE),
						new Pattern(DyeColor.BLACK, PatternType.CREEPER),
						new Pattern(DyeColor.BLACK, PatternType.CURLY_BORDER),
						new Pattern(DyeColor.BLACK, PatternType.STRIPE_CENTER),
						new Pattern(DyeColor.BLACK, PatternType.TRIANGLE_TOP))).item;
		ItemStack BA4 = new Banner("BA4", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.32"), XMaterial.ORANGE_BANNER, DyeColor.ORANGE,
				Arrays.asList(
						new Pattern(DyeColor.YELLOW, PatternType.BRICKS),
						new Pattern(DyeColor.CYAN, PatternType.HALF_HORIZONTAL),
						new Pattern(DyeColor.LIME, PatternType.FLOWER),
						new Pattern(DyeColor.CYAN, PatternType.BORDER),
						new Pattern(DyeColor.LIME, PatternType.CIRCLE_MIDDLE),
						new Pattern(DyeColor.CYAN, PatternType.CURLY_BORDER))).item;
		ItemStack BA5 = new Banner("BA5", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.33"), XMaterial.WHITE_BANNER, DyeColor.WHITE,
				Arrays.asList(
						new Pattern(DyeColor.GREEN, PatternType.RHOMBUS_MIDDLE),
						new Pattern(DyeColor.BROWN, PatternType.STRIPE_BOTTOM),
						new Pattern(DyeColor.ORANGE, PatternType.STRIPE_CENTER),
						new Pattern(DyeColor.BROWN, PatternType.BORDER),
						new Pattern(DyeColor.BLACK, PatternType.STRIPE_MIDDLE),
						new Pattern(DyeColor.BLACK, PatternType.HALF_HORIZONTAL))).item;
		ItemStack BA6 = new Banner("BA6", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.34"), XMaterial.WHITE_BANNER, DyeColor.WHITE,
				Arrays.asList(
						new Pattern(DyeColor.LIGHT_BLUE, PatternType.STRIPE_BOTTOM),
						new Pattern(DyeColor.BROWN, PatternType.STRAIGHT_CROSS),
						new Pattern(DyeColor.WHITE, PatternType.HALF_VERTICAL),
						new Pattern(DyeColor.BROWN, PatternType.TRIANGLES_TOP),
						new Pattern(DyeColor.BROWN, PatternType.HALF_HORIZONTAL_MIRROR),
						new Pattern(DyeColor.LIGHT_BLUE, PatternType.CURLY_BORDER),
						new Pattern(DyeColor.BLUE, PatternType.STRIPE_BOTTOM))).item;
		ItemStack BA7 = new Banner("BA7", Main.instance.getConfig().getString("HeadBanner.BannerDisplayNames.35"), XMaterial.RED_BANNER, DyeColor.RED,
				Arrays.asList(
						new Pattern(DyeColor.BLUE, PatternType.TRIANGLE_BOTTOM),
						new Pattern(DyeColor.RED, PatternType.STRIPE_SMALL),
						new Pattern(DyeColor.WHITE, PatternType.STRIPE_MIDDLE),
						new Pattern(DyeColor.BLUE, PatternType.CURLY_BORDER),
						new Pattern(DyeColor.RED, PatternType.CIRCLE_MIDDLE),
						new Pattern(DyeColor.BLUE, PatternType.BORDER))).item;

		ItemStack C = new ItemStack(Material.SLIME_BALL);
		ItemMeta CM = C.getItemMeta();
		CM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("HeadBanner.GUI.CloseItemName")));
		C.setItemMeta(CM);
		
		ItemStack B = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta BM = B.getItemMeta();
		BM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("HeadBanner.GUI.BackSide")));
		B.setItemMeta(BM);
		
		ItemStack R = new ItemStack(Material.ARMOR_STAND);
		ItemMeta RM = R.getItemMeta();
		RM.setDisplayName(Main.instance.replaceString(Main.instance.getConfig().getString("HeadBanner.GUI.RotateItemName")));
		R.setItemMeta(RM);
		
		//1 Reihe
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.29") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.29"), BA1);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.30") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.30"), BA2);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.31") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.31"), BA3);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.32") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.32"), BA4);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.33") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.33"), BA5);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.34") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.34"), BA6);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.35") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.35"), BA7);
		}
		
		//2 Reihe
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.36") == false) {
//			i.setItem(plugin.getConfig().getInt("HeadBanner.ItemSlot.36"), BA8);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.37") == false) {
//			i.setItem(plugin.getConfig().getInt("HeadBanner.ItemSlot.37"), BA9);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.38") == false) {
//			i.setItem(plugin.getConfig().getInt("HeadBanner.ItemSlot.38"), BA10);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.39") == false) {
//			i.setItem(plugin.getConfig().getInt("HeadBanner.ItemSlot.39"), BA11);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.40") == false) {
//			i.setItem(plugin.getConfig().getInt("HeadBanner.ItemSlot.40"), BA12);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.41") == false) {
//			i.setItem(plugin.getConfig().getInt("HeadBanner.ItemSlot.41"), BA13);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.42") == false) {
//			i.setItem(plugin.getConfig().getInt("HeadBanner.ItemSlot.42"), BA14);				
		}
		
		
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.RotateItem") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.RotateItem3"), R);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.BackSide") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.BackSide3"), B);
		}
		if(Main.instance.getConfig().getBoolean("HeadBanner.FreeSlot.CloseItem") == false) {
			i.setItem(Main.instance.getConfig().getInt("HeadBanner.ItemSlot.CloseItem3"), C);
		}
		
		Main.instance.inv3 = i;
		return i;

	}

	*/
}

