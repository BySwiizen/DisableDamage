package fr.byswiizen.disabledamage.command.subcommands;

import fr.byswiizen.disabledamage.DisableDamage;
import net.kyori.adventure.text.minimessage.MiniMessage;
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
            sender.reply(MiniMessage.miniMessage().deserialize(DisableDamage.messagesfile.getString("prefix") + " " + DisableDamage.messagesfile.getString("reload-success")));
        } catch (Exception error) {
            sender.reply(MiniMessage.miniMessage().deserialize("<red>Error loading files."));
            error.printStackTrace();
        }
    }
}