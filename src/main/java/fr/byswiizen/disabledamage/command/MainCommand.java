package fr.byswiizen.disabledamage.command;

import fr.byswiizen.disabledamage.DisableDamage;
import fr.byswiizen.disabledamage.command.subcommands.HelpSubCommand;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.annotation.DefaultFor;
import revxrsal.commands.bukkit.BukkitCommandActor;


@Command("disabledamage")
public class MainCommand {

	public DisableDamage plugin;
    public HelpSubCommand helpcommand;
    public MainCommand(DisableDamage instance) {
        this.plugin = instance;
        this.helpcommand = new HelpSubCommand(instance);
    }


    @DefaultFor("disabledamage")
    public void help(BukkitCommandActor sender) {
        helpcommand.help(sender);
    }
}