package asperienranks.asperienranks.GUIManagers;

import asperienranks.asperienranks.Manager.RankManager;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemStackManager implements Listener {
    public static ItemStack PlaceHolder() {
        ItemStack Placeholder = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta PlaceholderMeta = Placeholder.getItemMeta();

        assert PlaceholderMeta != null;
        PlaceholderMeta.setDisplayName(" ");
        PlaceholderMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        PlaceholderMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        PlaceholderMeta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
        PlaceholderMeta.addItemFlags(ItemFlag.HIDE_DESTROYS);

        Placeholder.setItemMeta(PlaceholderMeta);

        return Placeholder;
    }

    public static ItemStack CurrentRank(Player player) {
        String CurrentRankString = null;
        ItemStack CurrentRank = new ItemStack(Material.DIAMOND_BLOCK);
        ItemMeta CurrentRankMeta = CurrentRank.getItemMeta();

        assert CurrentRankMeta != null;
        CurrentRankMeta.setDisplayName("Your current rank is: ");
        CurrentRankMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        CurrentRankMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        if (player.hasPermission("asperienranks.emperor")) {
            CurrentRankString = "Emperor";
        } else if (player.hasPermission("asperienranks.shogun")) {
            CurrentRankString = "Shogun";
        } else if (player.hasPermission("asperienranks.daimyo")) {
            CurrentRankString = "Daimyo";
        } else if (player.hasPermission("asperienranks.samurai")) {
            CurrentRankString = "Samurai";
        } else if (player.hasPermission("asperienranks.ronin")) {
            CurrentRankString = "Ronin";
        } else if (player.hasPermission("asperienranks.liege")) {
            CurrentRankString = "Liege";
        } else if (player.hasPermission("asperienranks.elite")) {
            CurrentRankString = "Elite";
        } else if (player.hasPermission("asperienranks.soldier")) {
            CurrentRankString = "Soldier";
        } else if (player.hasPermission("asperienranks.merchant")) {
            CurrentRankString = "Merchant";
        } else if (player.hasPermission("asperienranks.member")) {
            CurrentRankString = "Member";
        } else if (player.hasPermission("asperienranks.default")) {
            CurrentRankString = "Default";
        }

        ArrayList<String> CurrentRankLore = new ArrayList<>();
        CurrentRankLore.add(ChatColor.AQUA + CurrentRankString);
        CurrentRankMeta.setLore(CurrentRankLore);

        CurrentRank.setItemMeta(CurrentRankMeta);

        return CurrentRank;
    }

    public static ItemStack RankPaper(Player player, String RankString, String RankStringBefore, String MoneyNeeded) {
        ItemStack CurrentRank = new ItemStack(Material.PAPER);
        ItemMeta CurrentRankMeta = CurrentRank.getItemMeta();

        assert CurrentRankMeta != null;

        CurrentRankMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        CurrentRankMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ArrayList<String> CurrentRankLore = new ArrayList<>();
        if (RankManager.hasRank(player, RankString)) {
            String RNR = null;
            switch (RankStringBefore) {
                case "emperor":
                    RNR = "Emperor";
                    break;
                case "shogun":
                    RNR = "Shogun";
                    break;
                case "daimyo":
                    RNR = "Daimyo";
                    break;
                case "samurai":
                    RNR = "Samurai";
                    break;
                case "ronin":
                    RNR = "Ronin";
                    break;
                case "liege":
                    RNR = "Liege";
                    break;
                case "elite":
                    RNR = "Elite";
                    break;
                case "soldier":
                    RNR = "Soldier";
                    break;
                case "merchant":
                    RNR = "Merchant";
                    break;
                case "member":
                    RNR = "Member";
                    break;
            }

            CurrentRankMeta.setDisplayName(ChatColor.GREEN + RNR);
        } else {
            String RNR = null;
            switch (RankStringBefore) {
                case "emperor":
                    RNR = "Emperor";
                    break;
                case "shogun":
                    RNR = "Shogun";
                    break;
                case "daimyo":
                    RNR = "Daimyo";
                    break;
                case "samurai":
                    RNR = "Samurai";
                    break;
                case "ronin":
                    RNR = "Ronin";
                    break;
                case "liege":
                    RNR = "Liege";
                    break;
                case "elite":
                    RNR = "Elite";
                    break;
                case "soldier":
                    RNR = "Soldier";
                    break;
                case "merchant":
                    RNR = "Merchant";
                    break;
                case "member":
                    RNR = "Member";
                    break;
            }

            CurrentRankMeta.setDisplayName(ChatColor.AQUA + RNR);
        }

        CurrentRank.setItemMeta(CurrentRankMeta);

        return CurrentRank;
    }

    public static ItemStack Air() {
        ItemStack Air = new ItemStack(Material.AIR);
        ItemMeta AirMeta = Air.getItemMeta();

        Air.setItemMeta(AirMeta);

        return Air;
    }
}
