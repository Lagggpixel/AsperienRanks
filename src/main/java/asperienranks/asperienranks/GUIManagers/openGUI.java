package asperienranks.asperienranks.GUIManagers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class openGUI implements Listener {
    public static void SetupGUI(Player player) {
        Inventory gui = Bukkit.createInventory(player, 36, ChatColor.YELLOW + "Rank");

        ItemStack placeholder = ItemStackManager.PlaceHolder();
        ItemStack currentRank = ItemStackManager.CurrentRank(player);

        ItemStack MerchantRank = ItemStackManager.RankPaper(player, "merchant", "member", "25k");
        ItemStack SoldierRank = ItemStackManager.RankPaper(player, "soldier", "merchant", "75k");
        ItemStack EliteRank = ItemStackManager.RankPaper(player,"elite", "soldier", "250k");
        ItemStack LiegeRank = ItemStackManager.RankPaper(player, "liege", "elite", "750k");
        ItemStack RoninRank = ItemStackManager.RankPaper(player, "ronin", "liege", "1.5m");
        ItemStack SamuraiRank = ItemStackManager.RankPaper(player, "samurai", "ronin", "3m");
        ItemStack DaimyoRank = ItemStackManager.RankPaper(player, "daimyo", "samurai", "10m");
        ItemStack ShogunRank = ItemStackManager.RankPaper(player, "shogun", "daimyo", "25m");
        ItemStack EmperorRank = ItemStackManager.RankPaper(player, "emperor", "shogun", "40m");

        ItemStack Air = ItemStackManager.Air();

        ItemStack[] menu_items = {
                placeholder, placeholder, placeholder, placeholder, currentRank, placeholder, placeholder, placeholder, placeholder,
                placeholder, MerchantRank, SoldierRank, EliteRank, LiegeRank, RoninRank, SamuraiRank, DaimyoRank, placeholder,
                placeholder, ShogunRank, EmperorRank, Air, Air, Air, Air, Air, placeholder,
                placeholder, placeholder, placeholder, placeholder, placeholder, placeholder, placeholder, placeholder, placeholder
        };

        gui.setContents(menu_items);

        player.openInventory(gui);
    }
}
