package asperienranks.asperienranks.Manager;

import asperienranks.asperienranks.Commands.Ranks;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.user.User;
import net.luckperms.api.node.Node;
import net.md_5.bungee.api.ChatColor;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.util.UUID;

public class RankupManager implements Listener {
    // Getting an instance of luckperms api
    static LuckPerms LuckPerms = LuckPermsProvider.get();

    public static void RankUp(Player player) {
        int coinsRequired = 0;
        int coinsOwned = EconomyManager.GetBalance(player);
        UUID uuid = player.getUniqueId();
        User user = LuckPerms.getUserManager().getUser(uuid);
        assert user != null;

        String rank = RankManager.PlayerRank(player);

        switch (rank) {
            case "Emperor":
                break;
            case "Shogun":
                coinsRequired = 40000000;
                break;
            case "Daimyo":
                coinsRequired = 25000000;
                break;
            case "Samurai":
                coinsRequired = 10000000;
                break;
            case "Ronin":
                coinsRequired = 3000000;
                break;
            case "Liege":
                coinsRequired = 1500000;
                break;
            case "Elite":
                coinsRequired = 75000;
                break;
            case "Soldier":
                coinsRequired = 250000;
                break;
            case "Merchant":
                coinsRequired = 75000;
                break;
            case "Member":
                coinsRequired = 25000;
                break;
            case "Default":
                coinsRequired = 5000;
                break;
        }

        if (coinsOwned < coinsRequired) {
            player.sendMessage(ChatColor.RED + "You do not have enough money");
        } else {
            EconomyManager.Withdraw(player, coinsRequired);
            switch (rank) {
                case "Emperor":
                    player.sendMessage(ChatColor.DARK_PURPLE + "You are at the max rank, you can't rankup anymore");
                    break;
                case "Shogun":
                    addPermission(user, "asperienranks.emperor");
                    player.sendMessage(ChatColor.DARK_PURPLE + "You are now Emperor rank");
                    break;
                case "Daimyo":
                    addPermission(user, "asperienranks.shogun");
                    player.sendMessage(ChatColor.DARK_PURPLE + "You are now Shogun rank");
                    break;
                case "Samurai":
                    addPermission(user, "asperienranks.daimyo");
                    player.sendMessage(ChatColor.DARK_PURPLE + "You are now Daimyo rank");
                    break;
                case "Ronin":
                    addPermission(user, "asperienranks.samurai");
                    player.sendMessage(ChatColor.DARK_PURPLE + "You are now Samurai rank");
                    break;
                case "Liege":
                    addPermission(user, "asperienranks.ronin");
                    player.sendMessage(ChatColor.DARK_PURPLE + "You are now Ronin rank");
                    break;
                case "Elite":
                    addPermission(user, "asperienranks.liege");
                    player.sendMessage(ChatColor.DARK_PURPLE + "You are now Liege rank");
                    break;
                case "Soldier":
                    addPermission(user, "asperienranks.elite");
                    player.sendMessage(ChatColor.DARK_PURPLE + "You are now Elite rank");
                    break;
                case "Merchant":
                    addPermission(user, "asperienranks.soldier");
                    player.sendMessage(ChatColor.DARK_PURPLE + "You are now Soldier rank");
                    break;
                case "Member":
                    addPermission(user, "asperienranks.merchant");
                    player.sendMessage(ChatColor.DARK_PURPLE + "You are now Merchant rank");
                    break;
                case "Default":
                    addPermission(user, "asperienranks.member");
                    player.sendMessage(ChatColor.DARK_PURPLE + "You are now Member rank");
                    break;
            }
        }
    }

    public static void addPermission(User user, String permission) {
        // Add the permission
        user.data().add(Node.builder(permission).build());

        // Now we need to save changes.
        LuckPerms.getUserManager().saveUser(user);
    }
}
