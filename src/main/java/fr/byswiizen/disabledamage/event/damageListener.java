package fr.byswiizen.disabledamage.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public class damageListener implements Listener {


    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
        event.setCancelled(true);
    }
}