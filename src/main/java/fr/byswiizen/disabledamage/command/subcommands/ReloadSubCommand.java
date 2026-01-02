package fr.byswiizen.disabledamage.command.subcommands;

import fr.byswiizen.disabledamage.DisableDamage;
import fr.byswiizen.disabledamage.util.ColorUtil;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.annotation.Subcommand;
import revxrsal.commands.bukkit.annotation.CommandPermission;
import revxrsal.commands.bukkit.BukkitCommandActor;


@Command("disabledamage")
public class ReloadSubCommand {

	public DisableDamage plugin;
    public ReloadSubCommand(DisableDamage instance) {
        this.plugin = instance;
    }


    @Subcommand("reload")
    @CommandPermission("disabledamage.reload")
    public void reload(BukkitCommandActor sender) {
        try {
            DisableDamage.configfile.reload();
            DisableDamage.messagesfile.reload();
            sender.reply(ColorUtil.translate(DisableDamage.messagesfile.getString("prefix") + " " + DisableDamage.messagesfile.getString("reload-success")));
        } catch (Exception error) {
            sender.reply(ColorUtil.translate("&4Error loading files."));
            error.printStackTrace();
        }
    }
}