package fr.byswiizen.disabledamage.command;

import fr.byswiizen.disabledamage.DisableDamage;
import fr.byswiizen.disabledamage.command.subcommands.HelpSubCommand;
import org.bukkit.command.CommandSender;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.annotation.CommandPlaceholder;


@Command("disabledamage")
public class MainCommand {

	public DisableDamage plugin;
    public HelpSubCommand helpcommand;
    public MainCommand(DisableDamage instance) {
        this.plugin = instance;
        this.helpcommand = new HelpSubCommand(instance);
    }


    @CommandPlaceholder
    public void help(CommandSender sender) {
        helpcommand.help(sender);
    }
}