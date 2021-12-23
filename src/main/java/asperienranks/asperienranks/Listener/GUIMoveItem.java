package asperienranks.asperienranks.Listener;

import asperienranks.asperienranks.AsperienRanks;
import asperienranks.asperienranks.Commands.RankUp;
import asperienranks.asperienranks.Manager.GUIManagers.GUIManager;
import asperienranks.asperienranks.Manager.RankupManager;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class GUIMoveItem implements Listener {
    AsperienRanks plugin;

    public GUIMoveItem(AsperienRanks plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void clickEvent(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if(event.getView().getTitle().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Asperien Ranks")){
            event.setCancelled(true);
            if (event.getCurrentItem().getType().equals(Material.NETHER_STAR)) {
                player.closeInventory();
                GUIManager.ConfirmGUI(player);
            }
        } else if (event.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Confirm rankup")) {
            if (event.getCurrentItem().getType().equals(Material.GREEN_WOOL)) {
                player.closeInventory();
                RankupManager.RankUp(player);
            } else if (event.getCurrentItem().getType().equals(Material.RED_WOOL)) {
                player.closeInventory();
            }
        }
    }
}
