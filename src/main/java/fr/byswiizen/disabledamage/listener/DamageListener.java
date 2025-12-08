package fr.byswiizen.disabledamage.listener;

import fr.byswiizen.disabledamage.DisableDamage;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public class DamageListener implements Listener {

	public DisableDamage plugin;
    public DamageListener(DisableDamage instance) {
        this.plugin = instance;
    }


    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
		if (DisableDamage.configfile.getBoolean("true")) {
			event.setCancelled(true);
		}
    }
}