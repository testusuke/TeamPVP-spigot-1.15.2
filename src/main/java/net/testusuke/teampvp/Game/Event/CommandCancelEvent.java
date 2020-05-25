package net.testusuke.teampvp.Game.Event;

import net.testusuke.teampvp.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.ArrayList;

public class CommandCancelEvent implements Listener {
    private final Main plugin;

    private ArrayList<String> allowCommandList = new ArrayList<>();
    public CommandCancelEvent(Main main){
        this.plugin = main;
        //  load allow command list
        loadAllowCommand();
    }

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event){
        Player player = event.getPlayer();
        String command = event.getMessage();

    }

    private void loadAllowCommand(){

    }
}
