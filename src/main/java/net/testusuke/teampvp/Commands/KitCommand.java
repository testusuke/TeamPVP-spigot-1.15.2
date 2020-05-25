package net.testusuke.teampvp.Commands;

import net.testusuke.teampvp.Game.Kit.KitData;
import net.testusuke.teampvp.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KitCommand implements CommandExecutor{
    private final Main plugin;
    public KitCommand(Main main) {
        this.plugin = main;
    }

    //  permission
    private String create = "teampvp.kit.create";


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(args.length == 2){
            Player player = (Player)sender;
            if(args[0].equalsIgnoreCase("create")){
                if(!player.hasPermission(create)){
                    player.sendMessage(plugin.prefix + "§c権限がありません。You don't have permission.");
                }
                String name = args[1];
                //  name has only English.
                if(!plugin.generalUtil.checkEnglish(name)){
                    player.sendMessage(plugin.prefix + "§c英数字のみ使用できます。");
                    return false;
                }


                return true;
            }
        }
        return false;
    }
}

