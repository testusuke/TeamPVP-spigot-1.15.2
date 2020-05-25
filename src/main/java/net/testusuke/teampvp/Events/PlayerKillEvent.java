package net.testusuke.teampvp.Events;

import net.testusuke.teampvp.CustomEvents.PlayerDeathByPlayerEvent;
import net.testusuke.teampvp.Main;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;

public class PlayerKillEvent implements Listener {
    private final Main plugin;
    public PlayerKillEvent(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event){
        Entity victimEntity = event.getEntity();
        Player victimPlayer = (Player) victimEntity;
        EntityDamageEvent damageEvent = victimPlayer.getLastDamageCause();
        if(!(damageEvent instanceof EntityDamageByEntityEvent))return;
        Player attackerPlayer = (Player) ((EntityDamageByEntityEvent) damageEvent).getDamager();

        plugin.getServer().getPluginManager().callEvent(new PlayerDeathByPlayerEvent(attackerPlayer,victimPlayer));
    }
}
