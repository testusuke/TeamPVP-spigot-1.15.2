package net.testusuke.teampvp.Party;

import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Party {
    private Player leaderPlayer;
    private ArrayList<Player> playerList;


    public Party(Player player){
        this.leaderPlayer = player;
        //  Leader add playerList
        addPlayerList(player);

    }

    public void addPlayerList(Player player){
        if(playerList.size() > 5){
            return;
        }
        playerList.add(player);
    }

    public void removePlayerList(Player player){
        if(!playerList.contains(player))return;
        playerList.remove(player);
    }

    public void setLeaderPlayer(Player player){
        leaderPlayer = player;
    }

    public Player getLeaderPlayer(){
        return leaderPlayer;
    }

    public void removeLeaderPlayer(){
        leaderPlayer = null;
    }

    public ArrayList<Player> getPlayerList(){
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> list){
        this.playerList = list;
    }

    public int getSize(){
        return playerList.size();
    }





}
