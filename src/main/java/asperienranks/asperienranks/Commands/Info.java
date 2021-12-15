package asperienranks.asperienranks.Commands;

import asperienranks.asperienranks.Manager.EconomyManager;
import asperienranks.asperienranks.Manager.RankManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Info implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender CMDSender, Command command, String s, String[] strings) {

        String rank;
        int bal;

        if (CMDSender instanceof Player) {
            Player sender = (Player) CMDSender;

            if (strings.length == 0) {
                rank = RankManager.PlayerRank(sender);
                bal = EconomyManager.GetBalance(sender);
                sender.sendMessage(ChatColor.YELLOW + "You have " + rank + " rank");
                sender.sendMessage(ChatColor.YELLOW + "You have " + bal + " in your balance");
            } else if (strings.length == 1) {
                Player player = Bukkit.getPlayerExact(strings[0]);
                if (player == null) {
                    sender.sendMessage(ChatColor.RED + "I can't find " + strings[0]);
                } else {
                    rank = RankManager.PlayerRank(player);
                    bal = EconomyManager.GetBalance(player);
                    sender.sendMessage(ChatColor.YELLOW + player.getName() + " has " + rank + " rank");
                    sender.sendMessage(ChatColor.YELLOW + player.getName() + " has " + bal + " in their balance");
                }
            } else {
                sender.sendMessage(ChatColor.RED + "Invalid usage. ");
            }

        } else {
            if (strings.length == 1) {
                Player player = Bukkit.getPlayerExact(strings[0]);
                if (player == null) {
                    System.out.println("I can't find " + strings[0]);
                } else {
                    rank = RankManager.PlayerRank(player);
                    bal = EconomyManager.GetBalance(player);
                    System.out.println(player.getName() + " has " + rank + " rank");
                    System.out.println(player.getName() + " has " + bal + " in their balance");
                }
            } else {
                System.out.println( "Invalid usage. ");
            }
        }

        return true;
    }
}
