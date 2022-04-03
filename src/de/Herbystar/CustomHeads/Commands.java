package de.Herbystar.CustomHeads;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import de.Herbystar.CustomHeads.Utilities.ItemHandler;

public class Commands implements CommandExecutor {
	
	Main plugin;
	public Commands(Main main) {
		plugin = main;
	}

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
				if(args[0].equalsIgnoreCase("HeadItem")) {
					if(p.hasPermission("CustomHeads.Item.Cmd") | p.isOp()) {
						ItemHandler.createJoinItem(p, true);
						return true;
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
						return true;
					}
				}
				if(args[0].equalsIgnoreCase("HeadMenu")) {
					if(p.hasPermission("CustomHeads.Item.Open")) {
						p.openInventory(ItemHandler.getInventoryPageOne());
						return true;
					} else {
						p.sendMessage(plugin.prefix + plugin.getConfig().getString("CustomHeads.Messages.NoPermMessage").replace("&", "§").replace("Oe", "Ö").replace("oe", "ö").replace("Ue", "Ü").replace("Ae", "Ä").replace("ae", "ä"));
						return true;
					}
				}
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
					ItemStack HI = new ItemHandler.Head(null, "§f§o" + args[1], null, args[1]).item;
					p.getInventory().setHelmet(HI);
					p.sendMessage(plugin.prefix + "§aYou set the Skull from §4" + args[1] + "§a on your head!");
					return true;
				}
				if(args[0].equalsIgnoreCase("get")) {
					ItemStack HI = new ItemHandler.Head(null, "§f§o" + args[1], null, args[1]).item;
					p.getInventory().addItem(HI);
					p.sendMessage(plugin.prefix + "§aYou add the Skull from §4" + args[1] + "§a to your Inventory!");
					return true;
				}
			}

		}
		
		return false;
	}
}
