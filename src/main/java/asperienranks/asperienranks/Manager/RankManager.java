package asperienranks.asperienranks.Manager;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class RankManager implements Listener {

    public static void CheckRank(Player player) {
        //Checks the current rank of the player

        if (player.hasPermission("asperienranks.emperor")) {
            //Max perms
        } else if (player.hasPermission("asperienranks.shogun")) {

        }

    }

}
