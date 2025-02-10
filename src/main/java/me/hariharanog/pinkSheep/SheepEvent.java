package me.hariharanog.pinkSheep;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class SheepEvent implements Listener {
    @EventHandler
    public void onPlayerRightClick(PlayerInteractEvent event) {
        Action action = event.getAction();
        ItemStack item = event.getItem();
        Location location = event.getPlayer().getLocation();
        Player player = event.getPlayer();
        event.getItem().setType(Material.WOODEN_HOE);

        if ((action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) && Objects.requireNonNull(item).getType() == Material.WOODEN_HOE) {
            event.getPlayer().getWorld().spawnEntity(location, EntityType.SHEEP);
        }
        else {
            return;
        }
    }
}
