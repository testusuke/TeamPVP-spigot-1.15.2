package net.testusuke.teampvp.Util;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class StageUtil {

    /*
    public static boolean isPlayerInArea(Location loc1, Location loc2, Player player){
        Location playerLocation = player.getLocation();
        //  World(ワールドの確認)
        if(loc1.getWorld() != player.getWorld())return false;
        if(loc1.getWorld() != loc2.getWorld())return false;
        //  X座標
        double Xloc1 = loc1.getX();
        double Xloc2 = loc2.getX();
        double Xplayer = playerLocation.getX();
        if(Xloc1 < Xloc2){
            if(Xloc1 > Xplayer || Xloc2 < Xplayer)return false;
        }else {
            if(Xloc1 < Xplayer || Xloc2 > Xplayer)return false;
        }
        //  Y座標
        double Yloc1 = loc1.getY();
        double Yloc2 = loc2.getY();
        double Yplayer = playerLocation.getY();
        if(Yloc1 < Yloc2){
            if(Yloc1 > Yplayer || Yloc2 < Yplayer)return false;
        }else {
            if(Yloc1 < Yplayer || Yloc2 > Yplayer)return false;
        }
        //  Z座標
        double Zloc1 = loc1.getZ();
        double Zloc2 = loc2.getZ();
        double Zplayer = playerLocation.getZ();
        if(Yloc1 < Yloc2){
            if(Zloc1 > Zplayer || Zloc2 < Zplayer)return false;
        }else {
            if(Zloc1 < Zplayer || Zloc2 > Zplayer)return false;
        }
        return true;
    }
    */

    private static boolean isInRange(double begin, double end, double value){
        double min, max;
        if(begin < end){
            min = begin;
            max = end;
        } else {
            min = end;
            max = begin;
        }
        return (min <= value && value <= max);
    }

    public static boolean isPlayerInArea(Location location1, Location location2, Player player){
        Location playerLocation = player.getLocation();
        //  World(ワールドの確認)
        if(location1.getWorld() != location2.getWorld() || location1.getWorld() != player.getWorld()) return false;

        return  isInRange(location1.getX(), location2.getX(), playerLocation.getX()) &&
                isInRange(location1.getY(), location2.getY(), playerLocation.getY()) &&
                isInRange(location1.getZ(), location2.getZ(), playerLocation.getZ());
    }
}
