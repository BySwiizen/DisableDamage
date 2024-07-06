package fr.byswiizen.disabledamage;

import fr.byswiizen.disabledamage.event.damageListener;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class DisableDamage extends JavaPlugin {


    @Override
    public void onEnable() {
		registerMetrics();
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

	private void registerMetrics() {
		Metrics metrics = new Metrics(this, 20809);
	}

    private void registerEvent() {
        PluginManager pluginmanager = getServer().getPluginManager();
        pluginmanager.registerEvents(new damageListener(), this);
    }
}