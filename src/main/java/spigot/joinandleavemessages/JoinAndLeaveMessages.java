package spigot.joinandleavemessages;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import spigot.joinandleavemessages.events.JoinAndLeave;

public final class JoinAndLeaveMessages extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new JoinAndLeave(), this);
    }
}