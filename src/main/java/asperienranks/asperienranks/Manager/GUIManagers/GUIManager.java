package asperienranks.asperienranks.Manager.GUIManagers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GUIManager implements Listener {

    public static void RankUpGUI(Player player) {
        Inventory gui = Bukkit.createInventory(player, 36, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Asperien Ranks");

        ItemStack placeholder = ItemStackManager.PlaceHolder();
        ItemStack currentRank = ItemStackManager.CurrentRank(player);

        ItemStack MemberRank = ItemStackManager.RankPaper(player, "member");
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
                placeholder, Air, MemberRank, MerchantRank, SoldierRank, EliteRank, LiegeRank, Air, placeholder,
                placeholder, Air, RoninRank, SamuraiRank, DaimyoRank, ShogunRank, EmperorRank, Air, placeholder,
                placeholder, placeholder, placeholder, placeholder, UpgradeRank, placeholder, placeholder, placeholder, placeholder
        };

        gui.setContents(menu_items);

        player.openInventory(gui);
    }

    public static void ConfirmGUI(Player player) {
        Inventory gui = Bukkit.createInventory(player, 9, ChatColor.RED + "Confirm rankup");

        ItemStack Green = ItemStackManager.GreenWool();
        ItemStack Red = ItemStackManager.RedWool();
        ItemStack Middle = ItemStackManager.WhiteConfirmationWool();

        ItemStack[] menu_items = {
                Green, Green, Green, Green, Middle, Red, Red, Red, Red
        };

        gui.setContents(menu_items);
        player.openInventory(gui);
    }
}
