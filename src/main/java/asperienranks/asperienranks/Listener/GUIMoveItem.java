package asperienranks.asperienranks.Listener;

import asperienranks.asperienranks.AsperienRanks;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GUIMoveItem implements Listener {
    AsperienRanks plugin;

    public GUIMoveItem(AsperienRanks plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void clickEvent(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.YELLOW + "Rank")){
            event.setCancelled(true);
        }

    }
}
