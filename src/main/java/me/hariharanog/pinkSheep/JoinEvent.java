package me.hariharanog.pinkSheep;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class JoinEvent implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(ChatColor.LIGHT_PURPLE.toString() + ChatColor.BOLD + event.getPlayer().getName() + " " + "Thanks For Joining The Alchemist Kava Minecraft Server");
    }

}
