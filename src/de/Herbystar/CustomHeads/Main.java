package de.Herbystar.CustomHeads;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

import de.Herbystar.CustomHeads.Events.InventoryClickEventHandler;
import de.Herbystar.CustomHeads.Events.InventoryInteractEvents;
import de.Herbystar.CustomHeads.Events.PlayerDropItemEventHandler;
import de.Herbystar.CustomHeads.Events.PlayerInteractEventHandler;
import de.Herbystar.CustomHeads.Events.PlayerJoinEventHandler;
import de.Herbystar.CustomHeads.Events.PlayerQuitEventHandler;
import de.Herbystar.CustomHeads.Utilities.ItemHandler;


public class Main extends JavaPlugin implements Listener {
	
	public String prefix = this.getConfig().getString("CustomHeads.CustomPrefix").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä");
	public Inventory inv = null;
	public Inventory inv2 = null;
	
	public static Main instance;
	
	public ArrayList<Player> H1 = new ArrayList<Player>();
	public ArrayList<Player> H2 = new ArrayList<Player>();
	public ArrayList<Player> H3 = new ArrayList<Player>();
	public ArrayList<Player> H4 = new ArrayList<Player>();
	public ArrayList<Player> H5 = new ArrayList<Player>();
	public ArrayList<Player> H6 = new ArrayList<Player>();
	public ArrayList<Player> H7 = new ArrayList<Player>();
	public ArrayList<Player> H8 = new ArrayList<Player>();
	public ArrayList<Player> H9 = new ArrayList<Player>();
	public ArrayList<Player> H10 = new ArrayList<Player>();
	public ArrayList<Player> H11 = new ArrayList<Player>();
	public ArrayList<Player> H12 = new ArrayList<Player>();
	public ArrayList<Player> H13 = new ArrayList<Player>();
	public ArrayList<Player> H14 = new ArrayList<Player>();
	
	List<ArrayList<Player>> pageOnePool = Arrays.asList(
			H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14);
	
	public ArrayList<Player> HP1 = new ArrayList<Player>();
	public ArrayList<Player> HP2 = new ArrayList<Player>();
	public ArrayList<Player> HP3 = new ArrayList<Player>();
	public ArrayList<Player> HP4 = new ArrayList<Player>();
	public ArrayList<Player> HP5 = new ArrayList<Player>();
	public ArrayList<Player> HP6 = new ArrayList<Player>();
	public ArrayList<Player> HP7 = new ArrayList<Player>();
	public ArrayList<Player> HP8 = new ArrayList<Player>();
	public ArrayList<Player> HP9 = new ArrayList<Player>();
	public ArrayList<Player> HP10 = new ArrayList<Player>();
	public ArrayList<Player> HP11 = new ArrayList<Player>();
	public ArrayList<Player> HP12 = new ArrayList<Player>();
	public ArrayList<Player> HP13 = new ArrayList<Player>();
	public ArrayList<Player> HP14 = new ArrayList<Player>();
	
	List<ArrayList<Player>> pageTwoPool = Arrays.asList(
			HP1, HP2, HP3, HP4, HP5, HP6, HP7, HP8, HP9, HP10, HP11, HP12, HP13, HP14);
	
	public boolean UpdateAviable;
				
	public void onEnable() {
		instance = this;
		getCommands();
		loadConfig();
		registerEvents();
		
		Server server = Bukkit.getServer();
	    ConsoleCommandSender console = server.getConsoleSender();
	    console.sendMessage("§4[§aCustomHeads§4] §eCreating Inventories...");
	    Instant beforeInventoryCreation = Instant.now();
	    createInventories();
	    Instant afterInventoryCreation = Instant.now();
	    Duration timeElapsed = Duration.between(beforeInventoryCreation, afterInventoryCreation);
	    console.sendMessage("§4[§aCustomHeads§4] §eInventories created (took " + timeElapsed.toString().replace("PT", "").replace("S", "s") + ").");
	    console.sendMessage("§4[§aCustomHeads§4] " + ChatColor.AQUA + "Version: " + getDescription().getVersion() + " §aby " + "§c" + getDescription().getAuthors() + ChatColor.GREEN + " enabled!");
	}
	
	/*
	private void StartMetrics() {
		try {
			Metrics m = new Metrics(this);
			m.start();
			Bukkit.getConsoleSender().sendMessage("§4[§aCustomHeads§4] §aStarted §eMetrics §asuccessful!");
		} catch (IOException e) {
			e.printStackTrace();
			Bukkit.getConsoleSender().sendMessage("§4[§aCustomHeads§4] §cFailed to start the §eMetrics§c!");
		}
	}
	*/
	
	private void createInventories() {
		ItemHandler.getInventoryPageOne();
		ItemHandler.getInventoryPageTwo();
	}
	
	public void addToHeadList(Player player, ArrayList<Player> toAddTo, int poolId) {
		List<ArrayList<Player>> l = null;
		if(poolId == 1) {
			l = pageOnePool;
		} else if(poolId == 2) {
			l = pageTwoPool;		
		}
		for(ArrayList<Player> lPlayer : l) {
			if(lPlayer == toAddTo) {
				lPlayer.add(player);
			} else {
				lPlayer.remove(player);
			}
		}
	}
	
	public String replaceString(String string) {
		string = string.replace("&", "§");
		string = string.replace("#", "'");
		string = string.replace("Oe", "Ö");
		string = string.replace("oe", "ö");
		string = string.replace("Ue", "Ü");
		string = string.replace("Ae", "Ä");
		string = string.replace("ae", "ä");
		return string;
		
	}
	
	private void registerEvents() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		Bukkit.getServer().getPluginManager().registerEvents(new InventoryClickEventHandler(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new InventoryInteractEvents(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerInteractEventHandler(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerDropItemEventHandler(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerJoinEventHandler(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerQuitEventHandler(this), this);
		
	}

	private void getCommands() {
		getCommand("CH").setExecutor(new Commands(this));
	}
	
	private void loadConfig() {
		this.getConfig().options().copyDefaults(true);
		saveConfig();		
	}
	
	public void onDisable() {
		Server server = Bukkit.getServer();
	    ConsoleCommandSender console = server.getConsoleSender();
	    console.sendMessage("§4[§aCustomHeads§4] " + ChatColor.AQUA + "Version: " + getDescription().getVersion() + " §aby " + "§c" + getDescription().getAuthors() + ChatColor.GREEN + ChatColor.RED + " disabled!");
	}
	
//	@EventHandler
//	public void OnBannerMenuInv2Interact(InventoryClickEvent e) {
//		final Player p = (Player) e.getWhoClicked();
//		if(e.getInventory().getName() != null) {
//			if(e.getInventory().getName().equals(this.getConfig().getString("HeadBanner.BannerInventory.Side2Title").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"))) {
//				e.setCancelled(true);
//				if(e.getCurrentItem().getType().equals(Material.BANNER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.BannerDisplayNames.15").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					if(!this.BP1.contains(p)) {
//						ItemStack BP1 = new ItemStack(Material.BANNER);
//						BannerMeta BP1M = (BannerMeta) BP1.getItemMeta();
//						BP1M.setBaseColor(DyeColor.WHITE);
//						BP1M.setDisplayName(this.getConfig().getString("HeadBanner.BannerDisplayNames.15").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
//						BP1M.addPattern(new Pattern(DyeColor.BLACK, PatternType.BORDER));
//						BP1M.addPattern(new Pattern(DyeColor.BLACK, PatternType.SKULL));
//						BP1.setItemMeta(BP1M);
//						p.getInventory().setHelmet(BP1);
//						this.BP1.add(p);
//						this.BP2.remove(p);
//						this.BP3.remove(p);
//						this.BP4.remove(p);
//						this.BP5.remove(p);
//						this.BP6.remove(p);
//						this.BP7.remove(p);
//						this.BP8.remove(p);
//						this.BP9.remove(p);
//						this.BP10.remove(p);
//						this.BP11.remove(p);
//						this.BP12.remove(p);
//						this.BP13.remove(p);
//						this.BP14.remove(p);
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageNewBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					} else {
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageTheSameBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					}		
//				}
//				if(e.getCurrentItem().getType().equals(Material.BANNER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.BannerDisplayNames.16").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					if(!this.BP2.contains(p)) {
//						ItemStack BP2 = new ItemStack(Material.BANNER);
//						BannerMeta BP2M = (BannerMeta) BP2.getItemMeta();
//						BP2M.setBaseColor(DyeColor.BLACK);
//						BP2M.setDisplayName(this.getConfig().getString("HeadBanner.BannerDisplayNames.16").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
//						BP2M.addPattern(new Pattern(DyeColor.BLACK, PatternType.HALF_HORIZONTAL));
//						BP2M.addPattern(new Pattern(DyeColor.GREEN, PatternType.TRIANGLE_TOP));
//						BP2M.addPattern(new Pattern(DyeColor.RED, PatternType.STRIPE_SMALL));
//						BP2M.addPattern(new Pattern(DyeColor.GREEN, PatternType.SKULL));
//						BP2M.addPattern(new Pattern(DyeColor.GREEN, PatternType.TRIANGLES_TOP));
//						BP2M.addPattern(new Pattern(DyeColor.GREEN, PatternType.CURLY_BORDER));
//						BP2.setItemMeta(BP2M);
//						p.getInventory().setHelmet(BP2);
//						this.BP2.add(p);
//						this.BP1.remove(p);
//						this.BP3.remove(p);
//						this.BP4.remove(p);
//						this.BP5.remove(p);
//						this.BP6.remove(p);
//						this.BP7.remove(p);
//						this.BP8.remove(p);
//						this.BP9.remove(p);
//						this.BP10.remove(p);
//						this.BP11.remove(p);
//						this.BP12.remove(p);
//						this.BP13.remove(p);
//						this.BP14.remove(p);
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageNewBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					} else {
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageTheSameBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					}		
//				}
//				if(e.getCurrentItem().getType().equals(Material.BANNER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.BannerDisplayNames.17").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					if(!this.BP3.contains(p)) {
//						ItemStack BP3 = new ItemStack(Material.BANNER);
//						BannerMeta BP3M = (BannerMeta) BP3.getItemMeta();
//						BP3M.setBaseColor(DyeColor.LIME);
//						BP3M.setDisplayName(this.getConfig().getString("HeadBanner.BannerDisplayNames.17").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
//						BP3M.addPattern(new Pattern(DyeColor.YELLOW, PatternType.RHOMBUS_MIDDLE));
//						BP3M.addPattern(new Pattern(DyeColor.RED, PatternType.BORDER));
//						BP3M.addPattern(new Pattern(DyeColor.YELLOW, PatternType.FLOWER));
//						BP3M.addPattern(new Pattern(DyeColor.RED, PatternType.CIRCLE_MIDDLE));
//						BP3.setItemMeta(BP3M);
//						p.getInventory().setHelmet(BP3);
//						this.BP3.add(p);
//						this.BP2.remove(p);
//						this.BP1.remove(p);
//						this.BP4.remove(p);
//						this.BP5.remove(p);
//						this.BP6.remove(p);
//						this.BP7.remove(p);
//						this.BP8.remove(p);
//						this.BP9.remove(p);
//						this.BP10.remove(p);
//						this.BP11.remove(p);
//						this.BP12.remove(p);
//						this.BP13.remove(p);
//						this.BP14.remove(p);
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageNewBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					} else {
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageTheSameBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					}		
//				}
//				if(e.getCurrentItem().getType().equals(Material.BANNER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.BannerDisplayNames.18").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					if(!this.BP4.contains(p)) {
//						ItemStack BP4 = new ItemStack(Material.BANNER);
//						BannerMeta BP4M = (BannerMeta) BP4.getItemMeta();
//						BP4M.setBaseColor(DyeColor.BROWN);
//						BP4M.setDisplayName(this.getConfig().getString("HeadBanner.BannerDisplayNames.18").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
//						BP4M.addPattern(new Pattern(DyeColor.YELLOW, PatternType.MOJANG));
//						BP4.setItemMeta(BP4M);
//						p.getInventory().setHelmet(BP4);
//						this.BP4.add(p);
//						this.BP2.remove(p);
//						this.BP3.remove(p);
//						this.BP1.remove(p);
//						this.BP5.remove(p);
//						this.BP6.remove(p);
//						this.BP7.remove(p);
//						this.BP8.remove(p);
//						this.BP9.remove(p);
//						this.BP10.remove(p);
//						this.BP11.remove(p);
//						this.BP12.remove(p);
//						this.BP13.remove(p);
//						this.BP14.remove(p);
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageNewBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					} else {
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageTheSameBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					}		
//				}
//				if(e.getCurrentItem().getType().equals(Material.BANNER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.BannerDisplayNames.19").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					if(!this.BP5.contains(p)) {
//						ItemStack BP5 = new ItemStack(Material.BANNER);
//						BannerMeta BP5M = (BannerMeta) BP5.getItemMeta();
//						BP5M.setBaseColor(DyeColor.BLUE);
//						BP5M.setDisplayName(this.getConfig().getString("HeadBanner.BannerDisplayNames.19").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
//						BP5M.addPattern(new Pattern(DyeColor.LIGHT_BLUE, PatternType.CURLY_BORDER));
//						BP5M.addPattern(new Pattern(DyeColor.LIGHT_BLUE, PatternType.FLOWER));
//						BP5M.addPattern(new Pattern(DyeColor.LIGHT_BLUE, PatternType.TRIANGLES_TOP));
//						BP5M.addPattern(new Pattern(DyeColor.LIGHT_BLUE, PatternType.TRIANGLES_BOTTOM));
//						BP5M.addPattern(new Pattern(DyeColor.BLUE, PatternType.CIRCLE_MIDDLE));
//						BP5.setItemMeta(BP5M);
//						p.getInventory().setHelmet(BP5);
//						this.BP5.add(p);
//						this.BP2.remove(p);
//						this.BP3.remove(p);
//						this.BP4.remove(p);
//						this.BP1.remove(p);
//						this.BP6.remove(p);
//						this.BP7.remove(p);
//						this.BP8.remove(p);
//						this.BP9.remove(p);
//						this.BP10.remove(p);
//						this.BP11.remove(p);
//						this.BP12.remove(p);
//						this.BP13.remove(p);
//						this.BP14.remove(p);
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageNewBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					} else {
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageTheSameBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					}		
//				}
//				if(e.getCurrentItem().getType().equals(Material.BANNER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.BannerDisplayNames.20").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					if(!this.BP6.contains(p)) {
//						ItemStack BP6 = new ItemStack(Material.BANNER);
//						BannerMeta BP6M = (BannerMeta) BP6.getItemMeta();
//						BP6M.setBaseColor(DyeColor.BLACK);
//						BP6M.setDisplayName(this.getConfig().getString("HeadBanner.BannerDisplayNames.20").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
//						BP6M.addPattern(new Pattern(DyeColor.ORANGE, PatternType.TRIANGLE_BOTTOM));
//						BP6M.addPattern(new Pattern(DyeColor.YELLOW, PatternType.RHOMBUS_MIDDLE));
//						BP6M.addPattern(new Pattern(DyeColor.RED, PatternType.BORDER));
//						BP6M.addPattern(new Pattern(DyeColor.RED, PatternType.TRIANGLES_TOP));
//						BP6.setItemMeta(BP6M);
//						p.getInventory().setHelmet(BP6);
//						this.BP6.add(p);
//						this.BP2.remove(p);
//						this.BP3.remove(p);
//						this.BP4.remove(p);
//						this.BP5.remove(p);
//						this.BP1.remove(p);
//						this.BP7.remove(p);
//						this.BP8.remove(p);
//						this.BP9.remove(p);
//						this.BP10.remove(p);
//						this.BP11.remove(p);
//						this.BP12.remove(p);
//						this.BP13.remove(p);
//						this.BP14.remove(p);
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageNewBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					} else {
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageTheSameBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					}		
//				}
//				if(e.getCurrentItem().getType().equals(Material.BANNER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.BannerDisplayNames.21").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					if(!this.BP7.contains(p)) {
//						ItemStack BP7 = new ItemStack(Material.BANNER);
//						BannerMeta BP7M = (BannerMeta) BP7.getItemMeta();
//						BP7M.setBaseColor(DyeColor.BLACK);
//						BP7M.setDisplayName(this.getConfig().getString("HeadBanner.BannerDisplayNames.21").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
//						BP7M.addPattern(new Pattern(DyeColor.GRAY, PatternType.BORDER));
//						BP7M.addPattern(new Pattern(DyeColor.GRAY, PatternType.STRIPE_CENTER));
//						BP7M.addPattern(new Pattern(DyeColor.RED, PatternType.SKULL));
//						BP7.setItemMeta(BP7M);
//						p.getInventory().setHelmet(BP7);
//						this.BP7.add(p);
//						this.BP2.remove(p);
//						this.BP3.remove(p);
//						this.BP4.remove(p);
//						this.BP5.remove(p);
//						this.BP6.remove(p);
//						this.BP1.remove(p);
//						this.BP8.remove(p);
//						this.BP9.remove(p);
//						this.BP10.remove(p);
//						this.BP11.remove(p);
//						this.BP12.remove(p);
//						this.BP13.remove(p);
//						this.BP14.remove(p);
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageNewBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					} else {
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageTheSameBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					}		
//				}
//				if(e.getCurrentItem().getType().equals(Material.BANNER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.BannerDisplayNames.22").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					if(!this.BP8.contains(p)) {
//						ItemStack BP8 = new ItemStack(Material.BANNER);
//						BannerMeta BP8M = (BannerMeta) BP8.getItemMeta();
//						BP8M.setBaseColor(DyeColor.LIME);
//						BP8M.setDisplayName(this.getConfig().getString("HeadBanner.BannerDisplayNames.22").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
//						BP8M.addPattern(new Pattern(DyeColor.RED, PatternType.BRICKS));
//						BP8M.addPattern(new Pattern(DyeColor.YELLOW, PatternType.FLOWER));
//						BP8M.addPattern(new Pattern(DyeColor.YELLOW, PatternType.FLOWER));
//						BP8M.addPattern(new Pattern(DyeColor.LIME, PatternType.CIRCLE_MIDDLE));
//						BP8M.addPattern(new Pattern(DyeColor.RED, PatternType.BORDER));
//						BP8.setItemMeta(BP8M);
//						p.getInventory().setHelmet(BP8);
//						this.BP8.add(p);
//						this.BP2.remove(p);
//						this.BP3.remove(p);
//						this.BP4.remove(p);
//						this.BP5.remove(p);
//						this.BP6.remove(p);
//						this.BP7.remove(p);
//						this.BP1.remove(p);
//						this.BP9.remove(p);
//						this.BP10.remove(p);
//						this.BP11.remove(p);
//						this.BP12.remove(p);
//						this.BP13.remove(p);
//						this.BP14.remove(p);
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageNewBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					} else {
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageTheSameBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					}		
//				}
//				if(e.getCurrentItem().getType().equals(Material.BANNER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.BannerDisplayNames.23").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					if(!this.BP9.contains(p)) {
//						ItemStack BP9 = new ItemStack(Material.BANNER);
//						BannerMeta BP9M = (BannerMeta) BP9.getItemMeta();
//						BP9M.setBaseColor(DyeColor.BLACK);
//						BP9M.setDisplayName(this.getConfig().getString("HeadBanner.BannerDisplayNames.23").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
//						BP9M.addPattern(new Pattern(DyeColor.YELLOW, PatternType.CROSS));
//						BP9M.addPattern(new Pattern(DyeColor.YELLOW, PatternType.STRAIGHT_CROSS));
//						BP9M.addPattern(new Pattern(DyeColor.RED, PatternType.CURLY_BORDER));
//						BP9.setItemMeta(BP9M);
//						p.getInventory().setHelmet(BP9);
//						this.BP9.add(p);
//						this.BP2.remove(p);
//						this.BP3.remove(p);
//						this.BP4.remove(p);
//						this.BP5.remove(p);
//						this.BP6.remove(p);
//						this.BP7.remove(p);
//						this.BP8.remove(p);
//						this.BP1.remove(p);
//						this.BP10.remove(p);
//						this.BP11.remove(p);
//						this.BP12.remove(p);
//						this.BP13.remove(p);
//						this.BP14.remove(p);
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageNewBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					} else {
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageTheSameBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					}		
//				}
//				if(e.getCurrentItem().getType().equals(Material.BANNER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.BannerDisplayNames.24").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					if(!this.BP10.contains(p)) {
//						ItemStack BP10 = new ItemStack(Material.BANNER);
//						BannerMeta BP10M = (BannerMeta) BP10.getItemMeta();
//						BP10M.setBaseColor(DyeColor.BLACK);
//						BP10M.setDisplayName(this.getConfig().getString("HeadBanner.BannerDisplayNames.24").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
//						BP10M.addPattern(new Pattern(DyeColor.RED, PatternType.CROSS));
//						BP10M.addPattern(new Pattern(DyeColor.RED, PatternType.BORDER));
//						BP10.setItemMeta(BP10M);
//						p.getInventory().setHelmet(BP10);
//						this.BP10.add(p);
//						this.BP2.remove(p);
//						this.BP3.remove(p);
//						this.BP4.remove(p);
//						this.BP5.remove(p);
//						this.BP6.remove(p);
//						this.BP7.remove(p);
//						this.BP8.remove(p);
//						this.BP9.remove(p);
//						this.BP1.remove(p);
//						this.BP11.remove(p);
//						this.BP12.remove(p);
//						this.BP13.remove(p);
//						this.BP14.remove(p);
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageNewBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					} else {
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageTheSameBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					}		
//				}
//				if(e.getCurrentItem().getType().equals(Material.BANNER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.BannerDisplayNames.25").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					if(!this.BP11.contains(p)) {
//						ItemStack BP11 = new ItemStack(Material.BANNER);
//						BannerMeta BP11M = (BannerMeta) BP11.getItemMeta();
//						BP11M.setBaseColor(DyeColor.BLACK);
//						BP11M.setDisplayName(this.getConfig().getString("HeadBanner.BannerDisplayNames.25").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
//						BP11M.addPattern(new Pattern(DyeColor.YELLOW, PatternType.CREEPER));
//						BP11M.addPattern(new Pattern(DyeColor.LIME, PatternType.GRADIENT_UP));
//						BP11.setItemMeta(BP11M);
//						p.getInventory().setHelmet(BP11);
//						this.BP11.add(p);
//						this.BP2.remove(p);
//						this.BP3.remove(p);
//						this.BP4.remove(p);
//						this.BP5.remove(p);
//						this.BP6.remove(p);
//						this.BP7.remove(p);
//						this.BP8.remove(p);
//						this.BP9.remove(p);
//						this.BP10.remove(p);
//						this.BP1.remove(p);
//						this.BP12.remove(p);
//						this.BP13.remove(p);
//						this.BP14.remove(p);
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageNewBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					} else {
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageTheSameBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					}		
//				}
//				if(e.getCurrentItem().getType().equals(Material.BANNER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.BannerDisplayNames.26").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					if(!this.BP12.contains(p)) {
//						ItemStack BP12 = new ItemStack(Material.BANNER);
//						BannerMeta BP12M = (BannerMeta) BP12.getItemMeta();
//						BP12M.setBaseColor(DyeColor.YELLOW);
//						BP12M.setDisplayName(this.getConfig().getString("HeadBanner.BannerDisplayNames.26").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
//						BP12M.addPattern(new Pattern(DyeColor.YELLOW, PatternType.BORDER));
//						BP12M.addPattern(new Pattern(DyeColor.LIME, PatternType.CREEPER));
//						BP12M.addPattern(new Pattern(DyeColor.LIME, PatternType.CREEPER));
//						BP12.setItemMeta(BP12M);
//						p.getInventory().setHelmet(BP12);
//						this.BP12.add(p);
//						this.BP2.remove(p);
//						this.BP3.remove(p);
//						this.BP4.remove(p);
//						this.BP5.remove(p);
//						this.BP6.remove(p);
//						this.BP7.remove(p);
//						this.BP8.remove(p);
//						this.BP9.remove(p);
//						this.BP10.remove(p);
//						this.BP11.remove(p);
//						this.BP1.remove(p);
//						this.BP13.remove(p);
//						this.BP14.remove(p);
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageNewBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					} else {
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageTheSameBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					}		
//				}
//				if(e.getCurrentItem().getType().equals(Material.BANNER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.BannerDisplayNames.27").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					if(!this.BP13.contains(p)) {
//						ItemStack BP13 = new ItemStack(Material.BANNER);
//						BannerMeta BP13M = (BannerMeta) BP13.getItemMeta();
//						BP13M.setBaseColor(DyeColor.BLACK);
//						BP13M.setDisplayName(this.getConfig().getString("HeadBanner.BannerDisplayNames.27").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
//						BP13M.addPattern(new Pattern(DyeColor.RED, PatternType.BRICKS));
//						BP13M.addPattern(new Pattern(DyeColor.CYAN, PatternType.GRADIENT_UP));
//						BP13M.addPattern(new Pattern(DyeColor.ORANGE, PatternType.GRADIENT));
//						BP13M.addPattern(new Pattern(DyeColor.WHITE, PatternType.BORDER));
//						BP13.setItemMeta(BP13M);
//						p.getInventory().setHelmet(BP13);
//						this.BP13.add(p);
//						this.BP2.remove(p);
//						this.BP3.remove(p);
//						this.BP4.remove(p);
//						this.BP5.remove(p);
//						this.BP6.remove(p);
//						this.BP7.remove(p);
//						this.BP8.remove(p);
//						this.BP9.remove(p);
//						this.BP10.remove(p);
//						this.BP11.remove(p);
//						this.BP12.remove(p);
//						this.BP1.remove(p);
//						this.BP14.remove(p);
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageNewBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					} else {
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageTheSameBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					}		
//				}
//				if(e.getCurrentItem().getType().equals(Material.BANNER) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.BannerDisplayNames.28").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					if(!this.BP14.contains(p)) {
//						ItemStack BP14 = new ItemStack(Material.BANNER);
//						BannerMeta BP14M = (BannerMeta) BP14.getItemMeta();
//						BP14M.setBaseColor(DyeColor.WHITE);
//						BP14M.setDisplayName(this.getConfig().getString("HeadBanner.BannerDisplayNames.28").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
//						BP14M.addPattern(new Pattern(DyeColor.BLACK, PatternType.GRADIENT));
//						BP14M.addPattern(new Pattern(DyeColor.BLACK, PatternType.CROSS));
//						BP14M.addPattern(new Pattern(DyeColor.BLACK, PatternType.CURLY_BORDER));
//						BP14.setItemMeta(BP14M);
//						p.getInventory().setHelmet(BP14);
//						this.BP14.add(p);
//						this.BP2.remove(p);
//						this.BP3.remove(p);
//						this.BP4.remove(p);
//						this.BP5.remove(p);
//						this.BP6.remove(p);
//						this.BP7.remove(p);
//						this.BP8.remove(p);
//						this.BP9.remove(p);
//						this.BP10.remove(p);
//						this.BP11.remove(p);
//						this.BP12.remove(p);
//						this.BP13.remove(p);
//						this.BP1.remove(p);
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageNewBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					} else {
//						p.sendMessage(this.prefix + this.getConfig().getString("HeadBanner.HeadBannerSelectMessage.MessageTheSameBanner").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä").replace("[ITEM]", e.getCurrentItem().getItemMeta().getDisplayName()));
//					}		
//				}
//				if(e.getCurrentItem().getType().equals(Material.SLIME_BALL) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.GUI.CloseItemName").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					p.closeInventory();
//				}
//				if(e.getCurrentItem().getType().equals(Material.MAGMA_CREAM) && (e.getCurrentItem().getItemMeta().getDisplayName().equals(this.getConfig().getString("HeadBanner.GUI.BackSide").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä")))) {
//					p.openInventory(inv);
//				}
//			}
//		} else {
//			e.setCancelled(false);
//		}
//	}
}
