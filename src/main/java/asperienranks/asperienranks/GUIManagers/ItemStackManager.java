package asperienranks.asperienranks.GUIManagers;

import asperienranks.asperienranks.Manager.RankManager;
import net.milkbowl.vault.chat.Chat;
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

    public static ItemStack RankPaper(Player player, String RankString) {
        ItemStack CurrentRank = new ItemStack(Material.PAPER);
        ItemMeta CurrentRankMeta = CurrentRank.getItemMeta();

        assert CurrentRankMeta != null;

        CurrentRankMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        CurrentRankMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        ArrayList<String> CurrentRankLore = new ArrayList<>();
        if (RankManager.hasRank(player, RankString)) {
            CurrentRankMeta.setDisplayName(ChatColor.GREEN + RankManager.RankName(RankString));
        } else {
            CurrentRankMeta.setDisplayName(ChatColor.AQUA + RankManager.RankName(RankString));
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

    public static ItemStack UpgradeRank(Player player) {
        ItemStack UpgradeRank = new ItemStack(Material.DIAMOND);
        ItemMeta UpgradeRankMeta = UpgradeRank.getItemMeta();

        ArrayList<String> UpgradeRankLore = new ArrayList<String>();



        if (player.hasPermission("asperienranks.emperor")) {
            assert UpgradeRankMeta != null;
            UpgradeRankMeta.setDisplayName("You can't upgrade your rank.");
        }
        else if (player.hasPermission("asperienranks.shogun")) {
            assert UpgradeRankMeta != null;
            UpgradeRankMeta.setDisplayName("Upgrade to " + ChatColor.BLUE + "Emperor" + ChatColor.RESET + " Rank");
            UpgradeRankLore.add(ChatColor.AQUA + "Cost: " + ChatColor.LIGHT_PURPLE + "40000000");
        }
        else if (player.hasPermission("asperienranks.daimyo")) {
            assert UpgradeRankMeta != null;
            UpgradeRankMeta.setDisplayName("Upgrade to " + ChatColor.BLUE + "Shogun" + ChatColor.RESET + " Rank");
            UpgradeRankLore.add(ChatColor.AQUA + "Cost: " + ChatColor.LIGHT_PURPLE + "25000000");
        }
        else if (player.hasPermission("asperienranks.samurai")) {
            assert UpgradeRankMeta != null;
            UpgradeRankMeta.setDisplayName("Upgrade to " + ChatColor.BLUE + "Daimyo" + ChatColor.RESET + " Rank");
            UpgradeRankLore.add(ChatColor.AQUA + "Cost: " + ChatColor.LIGHT_PURPLE + "10000000");
        }
        else if (player.hasPermission("asperienranks.ronin")) {
            assert UpgradeRankMeta != null;
            UpgradeRankMeta.setDisplayName("Upgrade to " + ChatColor.BLUE + "Samurai" + ChatColor.RESET + " Rank");
            UpgradeRankLore.add(ChatColor.AQUA + "Cost: " + ChatColor.LIGHT_PURPLE + "3000000");
        }
        else if (player.hasPermission("asperienranks.liege")) {
            assert UpgradeRankMeta != null;
            UpgradeRankMeta.setDisplayName("Upgrade to " + ChatColor.BLUE + "Ronin" + ChatColor.RESET + " Rank");
            UpgradeRankLore.add(ChatColor.AQUA + "Cost: " + ChatColor.LIGHT_PURPLE + "1500000");
        }
        else if (player.hasPermission("asperienranks.elite")) {
            assert UpgradeRankMeta != null;
            UpgradeRankMeta.setDisplayName("Upgrade to " + ChatColor.BLUE + "Liege" + ChatColor.RESET + " Rank");
            UpgradeRankLore.add(ChatColor.AQUA + "Cost: " + ChatColor.LIGHT_PURPLE + "750000");
        }
        else if (player.hasPermission("asperienranks.soldier")) {
            assert UpgradeRankMeta != null;
            UpgradeRankMeta.setDisplayName("Upgrade to " + ChatColor.BLUE + "Elite" + ChatColor.RESET + " Rank");
            UpgradeRankLore.add(ChatColor.AQUA + "Cost: " + ChatColor.LIGHT_PURPLE + "250000");
        }
        else if (player.hasPermission("asperienranks.merchant")) {
            assert UpgradeRankMeta != null;
            UpgradeRankMeta.setDisplayName("Upgrade to " + ChatColor.BLUE + "Soldier" + ChatColor.RESET + " Rank");
            UpgradeRankLore.add(ChatColor.AQUA + "Cost: " + ChatColor.LIGHT_PURPLE + "75000");
        }
        else if (player.hasPermission("asperienranks.member")) {
            assert UpgradeRankMeta != null;
            UpgradeRankMeta.setDisplayName("Upgrade to " + ChatColor.BLUE + "Merchant" + ChatColor.RESET + " Rank");
            UpgradeRankLore.add(ChatColor.AQUA + "Cost: " + ChatColor.LIGHT_PURPLE + "25000");
        }
        else if (player.hasPermission("asperienranks.default")) {
            assert UpgradeRankMeta != null;
            UpgradeRankMeta.setDisplayName("Upgrade to " + ChatColor.BLUE + "Member" + ChatColor.RESET + " Rank");
            UpgradeRankLore.add(ChatColor.AQUA + "Cost: " + ChatColor.LIGHT_PURPLE + "5000");
        }

        assert UpgradeRankMeta != null;
        UpgradeRankMeta.setLore(UpgradeRankLore);
        UpgradeRank.setItemMeta(UpgradeRankMeta);

        return UpgradeRank;
    }
}
