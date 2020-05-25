package net.testusuke.teampvp.CustomEvents;

import net.testusuke.teampvp.Game.Game;
import net.testusuke.teampvp.Game.Team.Team;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GameFinishEvent extends Event implements Cancellable {
    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean isCancelled;

    private Team winTeam;
    private Team loseTeam;
    private Game game;

    public GameFinishEvent(){

        this.isCancelled = false;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.isCancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public Team getWinTeam() {
        return winTeam;
    }

    public Team getLoseTeam() {
        return loseTeam;
    }

    public Game getGame(){
        return game;
    }


}
