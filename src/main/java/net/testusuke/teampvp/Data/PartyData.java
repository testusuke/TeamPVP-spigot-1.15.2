package net.testusuke.teampvp.Data;

import net.testusuke.teampvp.Main;
import net.testusuke.teampvp.Party.Party;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;

public class PartyData {
    private Main plugin;

    //  変数
    private ArrayList<Player> partyMemberList = new ArrayList<>();
    private HashMap<Integer, Party> partyMap = new HashMap<>();
    private HashMap<Player,Party> playerPartyMap = new HashMap<>();

    public PartyData(Main main){
        this.plugin = main;
    }

    public void putPartyMap(int id,Party party){
        partyMap.put(id,party);
    }

    public HashMap<Integer,Party> getPartyMap(){
        return this.partyMap;
    }

    public Party getParty(int id){
        if(!partyMap.containsKey(id))return null;
        return partyMap.get(id);
    }

    public void removeParty(int id){
        partyMap.remove(id);
    }

    public Boolean containsParty(Party party){
        if(partyMap.containsValue(party)){
            return true;
        }else{
            return false;
        }
    }

    //  PartyMembers
    public void addPartyMember(Player player){
        partyMemberList.add(player);
    }

    public ArrayList<Player> getPartyMemberList(){
        return this.partyMemberList;
    }

    public void removePartyMember(Player player){
        partyMemberList.remove(player);
    }

    public Boolean containsMember(Player player){
        if(partyMemberList.contains(player)){
            return true;
        }else {
            return false;
        }
    }

    //  PlayerPartyMap
    public void putPlayerParty(Player player,Party party){
        playerPartyMap.put(player,party);
    }

    public HashMap<Player, Party> getPlayerPartyMap() {
        return playerPartyMap;
    }
    public void removePlayerParty(Player player){
        playerPartyMap.remove(player);
    }
    public Boolean containsPlayerParty(Player player){
        if(playerPartyMap.containsKey(player)){
            return true;
        }else {
            return false;
        }
    }

}
