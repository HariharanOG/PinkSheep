package me.hariharanog.pinkSheep;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class PinkSheep extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("PinkSheep Plugin Enabled");
        registerEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("PinkSheep Plugin Disabled");
    }

    public void registerEvents(){

        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new JoinEvent(),  this);
        pm.registerEvents(new SheepEvent(), this);
    }
}
