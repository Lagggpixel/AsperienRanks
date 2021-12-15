package asperienranks.asperienranks.Commands;

import asperienranks.asperienranks.Manager.GUIManagers.GUIManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RankUp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender CMDSender, Command command, String s, String[] strings) {

        if (CMDSender instanceof Player) {
            Player player = (Player) CMDSender;
            GUIManager.ConfirmGUI(player);
        } else {
            System.out.println("Only players can use this command.");
        }

        return true;
    }
}
