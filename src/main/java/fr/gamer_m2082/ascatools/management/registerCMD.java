package fr.gamer_m2082.ascatools.management;

import fr.gamer_m2082.ascatools.Ascatools;
import fr.gamer_m2082.ascatools.command.*;

public class registerCMD {
    static Ascatools ins = Ascatools.instance;
     public static void Load(){
         ins.getCommand("sur").setExecutor(new surExecutor());
         ins.getCommand("che").setExecutor(new cheExecutor());
         ins.getCommand("sei").setExecutor(new seiExecutor());
         ins.getCommand("dieu").setExecutor(new dieuExecutor());
         ins.getCommand("debug").setExecutor(new debugExecutor());
     }
}
