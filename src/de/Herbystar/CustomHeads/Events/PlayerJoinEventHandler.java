package de.Herbystar.CustomHeads.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import de.Herbystar.CustomHeads.Main;
import de.Herbystar.CustomHeads.Utilities.ItemHandler;

public class PlayerJoinEventHandler implements Listener {
	
	Main plugin;
	public PlayerJoinEventHandler(Main main) {
		plugin = main;
	}
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if(p.isOp()) {
			if(plugin.UpdateAviable == true) {
				if(plugin.getConfig().getBoolean("CustomHeads.AutoUpdater") == true) {
//					p.sendMessage("§4[§aCustomHeads§4] §a-=> Update is available! <=-");
				}
			}
		}
		if(plugin.getConfig().getBoolean("CustomHeads.JoinItem.GiveOnJoin") == true) {
			if(p.hasPermission("CustomHeads.Item.Join") | p.isOp()) {
				ItemHandler.createJoinItem(p, true);
			}
		} else {
			ItemHandler.createJoinItem(p, false); 
		}
	}

}
