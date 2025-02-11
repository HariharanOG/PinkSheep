package me.hariharanog.pinkSheep;

import org.bukkit.*;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class SheepEvent implements Listener {
    @EventHandler
    public void onPlayerRightClick(PlayerInteractEvent event) {
        Action action = event.getAction();
        ItemStack item = event.getItem();
        Location location = event.getPlayer().getLocation();

        if ((item != null ? item.getType() : null) != Material.WOODEN_HOE) {
            return;
        }
        else if ((action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) && event.getPlayer().hasPermission("hariharanog.wooden.hoe")) {
            Sheep s = (Sheep) event.getPlayer().getWorld().spawnEntity(location, EntityType.SHEEP);
            s.setColor(DyeColor.PINK);
            s.setCustomName(ChatColor.LIGHT_PURPLE.toString() + ChatColor.BOLD + "Benny Beliaggio");
            s.setCustomNameVisible(true);
        }
        event.getItem().setType(Material.WOODEN_HOE);
    }

}
