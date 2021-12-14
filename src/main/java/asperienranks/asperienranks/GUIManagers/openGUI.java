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

        ItemStack MerchantRank = ItemStackManager.RankPaper(player, "merchant");
        ItemStack SoldierRank = ItemStackManager.RankPaper(player, "soldier");
        ItemStack EliteRank = ItemStackManager.RankPaper(player,"elite");
        ItemStack LiegeRank = ItemStackManager.RankPaper(player, "liege");
        ItemStack RoninRank = ItemStackManager.RankPaper(player, "ronin");
        ItemStack SamuraiRank = ItemStackManager.RankPaper(player, "samurai");
        ItemStack DaimyoRank = ItemStackManager.RankPaper(player, "daimyo");
        ItemStack ShogunRank = ItemStackManager.RankPaper(player, "shogun");
        ItemStack EmperorRank = ItemStackManager.RankPaper(player, "emperor");

        ItemStack Air = ItemStackManager.Air();
        ItemStack UpgradeRank = ItemStackManager.UpgradeRank(player);

        ItemStack[] menu_items = {
                placeholder, placeholder, placeholder, placeholder, currentRank, placeholder, placeholder, placeholder, placeholder,
                placeholder, MerchantRank, SoldierRank, EliteRank, LiegeRank, RoninRank, SamuraiRank, DaimyoRank, placeholder,
                placeholder, ShogunRank, EmperorRank, Air, Air, Air, Air, Air, placeholder,
                placeholder, placeholder, placeholder, placeholder, UpgradeRank, placeholder, placeholder, placeholder, placeholder
        };

        gui.setContents(menu_items);

        player.openInventory(gui);
    }
}
