package fr.Ascaria.ascatools;

import fr.Ascaria.ascatools.command.cheExecutor;
import fr.Ascaria.ascatools.command.dieuExecutor;
import fr.Ascaria.ascatools.command.seiExecutor;
import fr.Ascaria.ascatools.command.surExecutor;
import fr.Ascaria.ascatools.management.management;
import fr.Ascaria.ascatools.management.registerEvent;
import org.bukkit.plugin.java.JavaPlugin;


public final class Ascatools extends JavaPlugin {
    public static Ascatools instance;


    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        new registerEvent().register();

        //command
        getCommand("sur").setExecutor(new surExecutor());
        getCommand("che").setExecutor(new cheExecutor());
        getCommand("sei").setExecutor(new seiExecutor());
        getCommand("dieu").setExecutor(new dieuExecutor());


        //managment
        management.load();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic





        management.unLoad();
    }


}
