package asperienranks.asperienranks.Listener;

import asperienranks.asperienranks.AsperienRanks;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnQuit implements Listener {
    // Creates the plugin & constructor to be called in main class
    AsperienRanks plugin;

    public OnQuit(AsperienRanks plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void PlayerQuitEvent(PlayerQuitEvent event) {
        Player player = event.getPlayer();
    }
}
