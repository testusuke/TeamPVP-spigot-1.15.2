package net.testusuke.teampvp.Game.Team;

import net.testusuke.teampvp.Game.Game;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Team {

    private int maxPlayer;
    private int playerNumber;
    private ArrayList<Player> players = new ArrayList<>();
    private int id;
    private Game game;

    public Team(int maxPlayer,int id){
        this.maxPlayer = maxPlayer;
        this.id = id;
    }

    public Integer getMaxPlayer(){
        return maxPlayer;
    }

    public void setMaxPlayer(int maxPlayer){
        this.maxPlayer = maxPlayer;
    }

    public void addPlayer(Player player){
        players.add(player);
        countPlayerNumber();
    }

    public void removePlayer(Player player){
        players.remove(player);
        countPlayerNumber();
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }

    public void setPlayers(ArrayList<Player> players){
        this.players = players;
        countPlayerNumber();
    }


    public void countPlayerNumber(){
        playerNumber = players.size();
    }

}
