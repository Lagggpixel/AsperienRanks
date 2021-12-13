package asperienranks.asperienranks.Commands;

import asperienranks.asperienranks.Manager.RankManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Rank implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender CMDSender, Command command, String s, String[] strings) {

        if (CMDSender instanceof Player) {
            //Casts the command sender into player
            Player player = (Player) CMDSender;

            if (strings.length != 0) {
                player.sendMessage(ChatColor.RED + "You gave too many arguments, do " + ChatColor.WHITE + "/rank");
            } else {
                RankManager.CheckRank(player);
            }


        } else {
            //Sends a message in console
            System.out.println("You can not use this command, this command is only used by players.");
        }

        return true;
    }
}
