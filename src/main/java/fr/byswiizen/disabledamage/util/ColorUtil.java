package fr.byswiizen.disabledamage.util;

import org.bukkit.ChatColor;


public class ColorUtil {


	public static String translate(String message) {
		if (message == null) {
			return null;
		}
		return ChatColor.translateAlternateColorCodes('&', message);
	}
}