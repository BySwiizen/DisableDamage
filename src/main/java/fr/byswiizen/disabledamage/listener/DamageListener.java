package fr.byswiizen.disabledamage.listener;

import fr.byswiizen.disabledamage.DisableDamage;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;


public class DamageListener implements Listener {

	public DisableDamage plugin;
    public DamageListener(DisableDamage instance) {
        this.plugin = instance;
    }


    @EventHandler
    public void onDamage(EntityDamageEvent event) {
		if (DisableDamage.configfile.getBoolean("disable-damage")) {
			event.setCancelled(true);
		}
    }
}