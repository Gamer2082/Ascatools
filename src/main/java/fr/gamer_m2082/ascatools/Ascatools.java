package fr.gamer_m2082.ascatools;

import fr.gamer_m2082.ascatools.command.cheExecutor;
import fr.gamer_m2082.ascatools.command.dieuExecutor;
import fr.gamer_m2082.ascatools.command.seiExecutor;
import fr.gamer_m2082.ascatools.command.surExecutor;
import fr.gamer_m2082.ascatools.management.management;
import fr.gamer_m2082.ascatools.management.registerCMD;
import fr.gamer_m2082.ascatools.management.registerEvent;
import org.bukkit.plugin.java.JavaPlugin;


public final class Ascatools extends JavaPlugin {
    public static Ascatools instance;


    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        new registerEvent().register();
        registerCMD.Load();
        //managment
        management.load();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic





        management.unLoad();
    }


}
