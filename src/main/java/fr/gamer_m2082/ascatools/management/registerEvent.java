package fr.gamer_m2082.ascatools.management;

import fr.gamer_m2082.ascatools.Ascatools;
import fr.gamer_m2082.ascatools.listener.*;
import org.bukkit.plugin.PluginManager;

public class registerEvent {
    PluginManager pm = Ascatools.instance.getServer().getPluginManager();
    Ascatools main = Ascatools.instance;

    public void register(){
        pm.registerEvents(new survivantToolsListener(),main);
        pm.registerEvents(new chevalierToolsListener(),main);
        pm.registerEvents(new seigneurToolsListener(),main);
        pm.registerEvents(new dieuToolsListener(),main);
        pm.registerEvents(new DebugerToolsListener(), main);

    }
}
