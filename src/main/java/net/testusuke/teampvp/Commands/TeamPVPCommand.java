package net.testusuke.teampvp.Commands;

import net.testusuke.teampvp.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TeamPVPCommand implements CommandExecutor {
    private final Main plugin;
    public TeamPVPCommand(Main main) {
        this.plugin = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        return false;
    }
}
