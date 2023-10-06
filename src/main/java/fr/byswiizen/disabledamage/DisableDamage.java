package fr.byswiizen.disabledamage;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DisableDamage extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);

    }
    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
        event.setCancelled(true);

    }

}
