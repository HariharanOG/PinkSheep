package me.hariharanog.pinkSheep;

import org.bukkit.*;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
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
            Sheep sheep = (Sheep) event.getPlayer().getWorld().spawnEntity(location, EntityType.SHEEP);
            Firework firework = location.getWorld().spawn(location, Firework.class);
            sheep.setVelocity(event.getPlayer().getLocation().getDirection().multiply(2));
            firework.teleport(sheep.getLocation());
            sheep.setColor(DyeColor.PINK);
            sheep.setCustomName(ChatColor.LIGHT_PURPLE.toString() + ChatColor.BOLD + "Benny Beliaggio");
            sheep.setCustomNameVisible(true);
        }
        event.getItem().setType(Material.WOODEN_HOE);
    }

}
