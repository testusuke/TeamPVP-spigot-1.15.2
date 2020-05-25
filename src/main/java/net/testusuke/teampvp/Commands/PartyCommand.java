package net.testusuke.teampvp.Commands;

import net.testusuke.teampvp.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PartyCommand implements CommandExecutor {
    private Main plugin;
    public PartyCommand(Main main) {
        this.plugin = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "You can not use console");
            return false;
        }
        if(args.length == 0){
            Player player = (Player)sender;
            sendPartyInformation(player);
            return true;
        }

        if(args.length == 1){
            //  Create
            if(args[0].equalsIgnoreCase("create")){

            }
        }
        return false;
    }
}
