package net.testusuke.teampvp.Util;

import net.testusuke.teampvp.Main;

import java.util.regex.Pattern;

public class GeneralUtil {
    public final Main plugin;
    public GeneralUtil(Main main){
        this.plugin = main;
    }

    public boolean checkEnglish(String str){
        return Pattern.matches("^[0-9a-zA-Z]+$", str);
    }

}
