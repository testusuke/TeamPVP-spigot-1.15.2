package net.testusuke.teampvp.Events;

import net.testusuke.teampvp.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerGeneralEvent implements Listener {
    private final Main plugin;
    public PlayerGeneralEvent(Main plugin) {
        this.plugin = plugin;
    }

    //  PlayerJoinEvent
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

    }

    //  PlayerQuitEvent
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();


    }
}
