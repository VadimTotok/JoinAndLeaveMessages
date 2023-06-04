package spigot.joinandleavemessages.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinAndLeave implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        String name = event.getPlayer().getName();
        event.setJoinMessage(name + " joined the game");
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        String name = event.getPlayer().getName();
        event.setQuitMessage(name + " left the game");
    }
}