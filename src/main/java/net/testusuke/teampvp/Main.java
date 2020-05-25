package net.testusuke.teampvp;

import net.testusuke.teampvp.Commands.KitCommand;
import net.testusuke.teampvp.Commands.PartyCommand;
import net.testusuke.teampvp.Commands.TeamCommand;
import net.testusuke.teampvp.Commands.TeamPVPCommand;
import net.testusuke.teampvp.Data.PartyData;
import net.testusuke.teampvp.Events.PlayerGeneralEvent;
import net.testusuke.teampvp.Events.PlayerKillEvent;
import net.testusuke.teampvp.Game.Event.CommandCancelEvent;
import net.testusuke.teampvp.Game.Kit.KitData;
import net.testusuke.teampvp.Util.GeneralUtil;
import net.testusuke.teampvp.Util.InventoryBase64;
import net.testusuke.teampvp.Util.StageUtil;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class Main extends JavaPlugin {

    ///////////
    //  変数  //
    ///////////
    //  Prefix
    public String prefix;

    //  Data
    public PartyData partyData = null;
    public KitData kitData = null;
    // Unity
    public GeneralUtil generalUtil = null;
    //  Configs
    public File kitFIle;
    public FileConfiguration kitConfig;

    @Override
    public void onEnable(){


        //  LoadConfig
        loadConfig();
        //  Command
        getCommand("teampvp").setExecutor(new TeamPVPCommand(this));
        getCommand("team").setExecutor(new TeamCommand(this));
        getCommand("party").setExecutor(new PartyCommand(this));
        getCommand("pvpkit").setExecutor(new KitCommand(this));
        //  Event
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerGeneralEvent(this),this);
        pm.registerEvents(new PlayerKillEvent(this),this);
        pm.registerEvents(new CommandCancelEvent(this),this);

        //  LoadClass
        loadClass();
        //  LoadPrefix

    }

    @Override
    public void onDisable() {

        finishAllGame();
        clearAllParty();
    }


    public void loadConfig(){

    }

    public void loadClass(){
        partyData = new PartyData(this);
        kitData = new KitData(this);
        //  Util
        generalUtil = new GeneralUtil(this);
    }
}
