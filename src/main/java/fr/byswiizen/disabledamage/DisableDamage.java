package fr.byswiizen.disabledamage;

import fr.byswiizen.disabledamage.event.damageListener;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class DisableDamage extends JavaPlugin {


    @Override
    public void onEnable() {
        Metrics metrics = new Metrics(this, 20809);
        registerEvent();
        getLogger().info("-----------------------");
        getLogger().info(this.getName() + " v" + this.getDescription().getVersion());
        getLogger().info("The plugin is enabled.");
        getLogger().info("-----------------------");

    }

    @Override
    public void onDisable() {
        getLogger().info("------------------------");
        getLogger().info(this.getName() + " v" + this.getDescription().getVersion());
        getLogger().info("The plugin is disabled.");
        getLogger().info("------------------------");
    }

    private void registerEvent() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new damageListener(), this);
    }
}