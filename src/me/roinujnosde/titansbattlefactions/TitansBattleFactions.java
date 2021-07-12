package me.roinujnosde.titansbattlefactions;

import me.roinujnosde.titansbattle.TitansBattle;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class TitansBattleFactions extends JavaPlugin {

    @Override
    public void onEnable() {
        TitansBattle tb = TitansBattle.getInstance();
        tb.setGroupManager(new FactionsGroupManager(tb));
    }
}
