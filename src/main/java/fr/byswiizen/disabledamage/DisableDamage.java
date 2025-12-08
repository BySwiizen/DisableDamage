package fr.byswiizen.disabledamage;

import dev.dejvokep.boostedyaml.YamlDocument;
import fr.byswiizen.disabledamage.command.MainCommand;
import fr.byswiizen.disabledamage.command.subcommands.HelpSubCommand;
import fr.byswiizen.disabledamage.command.subcommands.ReloadSubCommand;
import fr.byswiizen.disabledamage.listener.DamageListener;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import revxrsal.commands.bukkit.BukkitCommandHandler;
import java.io.File;
import java.io.IOException;


public class DisableDamage extends JavaPlugin {

	public static YamlDocument configfile, messagesfile;


    @Override
    public void onEnable() {
		registerMetrics();
		registerFiles();
        registerListener();
		registerSubCommands();
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
		new Metrics(this, 20809);
	}

	private void registerFiles() {
		configfile = loadFile("config.yml");
		messagesfile = loadFile("messages.yml");
	}

	private YamlDocument loadFile(String fileName) {
		try {
			return YamlDocument.create(new File(getDataFolder(), fileName), getResource(fileName));
		} catch (IOException error) {
			throw new RuntimeException(error);
		}
	}

    private void registerListener() {
        PluginManager pluginmanager = getServer().getPluginManager();
        pluginmanager.registerEvents(new DamageListener(this), this);
    }

	private void registerSubCommands() {
		BukkitCommandHandler handler = BukkitCommandHandler.create(this);
		handler.enableAdventure();
		handler.register(new MainCommand(this));
		handler.register(new HelpSubCommand(this));
		handler.register(new ReloadSubCommand(this));
	}
}