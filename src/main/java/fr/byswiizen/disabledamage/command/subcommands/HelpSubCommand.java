package fr.byswiizen.disabledamage.command.subcommands;

import fr.byswiizen.disabledamage.DisableDamage;
import fr.byswiizen.disabledamage.util.ColorUtil;
import org.bukkit.command.CommandSender;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.annotation.Subcommand;


@Command("disabledamage")
public class HelpSubCommand {

	public DisableDamage plugin;
    public HelpSubCommand(DisableDamage instance) {
        this.plugin = instance;
    }


    @Subcommand("help")
    public void help(CommandSender sender) {
		for (String line : DisableDamage.messagesfile.getStringList("help")) {
            sender.sendMessage(ColorUtil.translate(DisableDamage.messagesfile.getString("prefix") + " " + line));
        }
	}
}