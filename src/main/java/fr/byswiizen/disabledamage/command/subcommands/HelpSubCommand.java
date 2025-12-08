package fr.byswiizen.disabledamage.command.subcommands;

import fr.byswiizen.disabledamage.DisableDamage;
import net.kyori.adventure.text.minimessage.MiniMessage;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.annotation.Subcommand;
import revxrsal.commands.bukkit.BukkitCommandActor;


@Command("disabledamage")
public class HelpSubCommand {

	public DisableDamage plugin;
    public HelpSubCommand(DisableDamage instance) {
        this.plugin = instance;
    }


    @Subcommand("help")
    public void help(BukkitCommandActor sender) {
		for (String line : DisableDamage.messagesfile.getStringList("help")) {
            sender.reply(MiniMessage.miniMessage().deserialize(DisableDamage.messagesfile.getString("prefix") + " " + line));
        }
	}
}