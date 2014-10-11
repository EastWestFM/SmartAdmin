package com.gmail.kukubaczek.SmartAdmin.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.gmail.kukubaczek.SmartAdmin.MenuCreator;

public class OnRightClick implements Listener{
	@EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
		Player player = (Player) event.getPlayer();
		if("§bSmartAdmin".equalsIgnoreCase(event.getItem().getItemMeta().getDisplayName())){
			if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK ){
				if(player.hasPermission("admintools.open") || player.isOp()){
					MenuCreator.openInv(player);
            	}
			}
		}
	}
}
