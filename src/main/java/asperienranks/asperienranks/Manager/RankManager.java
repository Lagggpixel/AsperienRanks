package asperienranks.asperienranks.Manager;

import asperienranks.asperienranks.Manager.GUIManagers.GUIManager;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class RankManager implements Listener {

    public static void CheckRank(Player player) {
        GUIManager.RankUpGUI(player);
    }

    public static boolean hasRank(Player player, String rank) {
        String perm = "asperienranks." + rank;
        return player.hasPermission(perm);
    }

    public static String PlayerRank(Player player) {
        String RankString = null;
        if (player.hasPermission("asperienranks.emperor")) {
            RankString = "Emperor";
        } else if (player.hasPermission("asperienranks.shogun")) {
            RankString = "Shogun";
        } else if (player.hasPermission("asperienranks.daimyo")) {
            RankString = "Daimyo";
        } else if (player.hasPermission("asperienranks.samurai")) {
            RankString = "Samurai";
        } else if (player.hasPermission("asperienranks.ronin")) {
            RankString = "Ronin";
        } else if (player.hasPermission("asperienranks.liege")) {
            RankString = "Liege";
        } else if (player.hasPermission("asperienranks.elite")) {
            RankString = "Elite";
        } else if (player.hasPermission("asperienranks.soldier")) {
            RankString = "Soldier";
        } else if (player.hasPermission("asperienranks.merchant")) {
            RankString = "Merchant";
        } else if (player.hasPermission("asperienranks.member")) {
            RankString = "Member";
        } else {
            RankString = "Default";
        }
        return RankString;
    }

    public static String RankName(String rank) {
        String RankString = null;
        switch (rank) {
            case "emperor":
                RankString = "Emperor";
                break;
            case "shogun":
                RankString = "Shogun";
                break;
            case "daimyo":
                RankString = "Daimyo";
                break;
            case "samurai":
                RankString = "Samurai";
                break;
            case "ronin":
                RankString = "Ronin";
                break;
            case "liege":
                RankString = "Liege";
                break;
            case "elite":
                RankString = "Elite";
                break;
            case "soldier":
                RankString = "Soldier";
                break;
            case "merchant":
                RankString = "Merchant";
                break;
            case "member":
                RankString = "Member";
                break;
        }
        return RankString;
    }
}
