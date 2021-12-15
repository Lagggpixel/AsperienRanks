package asperienranks.asperienranks.Commands;

import asperienranks.asperienranks.Manager.RankupManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ForceRankUp implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender CMDSender, Command command, String s, String[] strings) {
        if (CMDSender instanceof Player) {
            Player sender = (Player) CMDSender;

            if (strings.length == 0) {
                RankupManager.RankUp(sender);
            } else if (strings.length == 1){
                Player player = Bukkit.getPlayerExact(strings[0]);
                if (player == null) {
                    sender.sendMessage(ChatColor.RED + "Invalid player");
                } else {
                    RankupManager.RankUp(player);
                    sender.sendMessage(ChatColor.RED + "Force rankup success");
                }
            } else {
                sender.sendMessage(ChatColor.RED + "Invalid usage");
            }



        } else {
            if (strings.length == 0) {
                System.out.println("Please give the player's name that you want to force rankup");
            } else if (strings.length == 1) {
                Player player = Bukkit.getPlayerExact(strings[0]);
                if (player == null) {
                    System.out.println("Invalid player");
                } else {
                    RankupManager.RankUp(player);
                    System.out.println("Force rankup success");
                }
            } else {
                System.out.println("Invalid usage");
            }
        }

        return true;
    }

}
