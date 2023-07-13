package fr.Ascaria.ascatools.management;

import fr.Ascaria.ascatools.Ascatools;
import fr.Ascaria.ascatools.listener.chevalierToolsListener;
import fr.Ascaria.ascatools.listener.dieuToolsListener;
import fr.Ascaria.ascatools.listener.seigneurToolsListener;
import fr.Ascaria.ascatools.listener.survivantToolsListener;
import org.bukkit.plugin.PluginManager;

public class registerEvent {
    PluginManager pm = Ascatools.instance.getServer().getPluginManager();
    Ascatools main = Ascatools.instance;

    public void register(){
        pm.registerEvents(new survivantToolsListener(),main);
        pm.registerEvents(new chevalierToolsListener(),main);
        pm.registerEvents(new seigneurToolsListener(),main);
        pm.registerEvents(new dieuToolsListener(),main);

    }
}
