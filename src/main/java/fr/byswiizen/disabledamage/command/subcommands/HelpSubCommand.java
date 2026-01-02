package fr.byswiizen.disabledamage.command.subcommands;

import fr.byswiizen.disabledamage.DisableDamage;
import fr.byswiizen.disabledamage.util.ColorUtil;
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
            sender.reply(ColorUtil.translate(DisableDamage.messagesfile.getString("prefix") + " " + line));
        }
	}
}