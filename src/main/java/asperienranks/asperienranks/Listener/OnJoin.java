package asperienranks.asperienranks.Listener;

import asperienranks.asperienranks.AsperienRanks;
import asperienranks.asperienranks.Manager.RankManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoin implements Listener {
    // Creates the plugin & constructor to be called in main class
    AsperienRanks plugin;

    public OnJoin(AsperienRanks plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void PlayerJoinEvent(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        // Player's rank in luckperm's database
        String playerPerms = RankManager.PlayerRank(player);
        // Player's rank in the PlayerConfig
        String playerRank = "";

        if (!playerPerms.equalsIgnoreCase(playerRank)) {
            // Updates player's permissions
        }
    }
}
