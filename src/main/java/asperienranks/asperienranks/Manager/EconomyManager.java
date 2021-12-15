package asperienranks.asperienranks.Manager;

import asperienranks.asperienranks.AsperienRanks;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class EconomyManager implements Listener {
    static net.milkbowl.vault.economy.Economy economy = AsperienRanks.getEcon();

    public static int GetBalance(Player player) {
        int balance = (int) economy.getBalance(player);
        return balance;
    }

    public static boolean Withdraw(Player player, int amount) {
        EconomyResponse economyResponse = economy.withdrawPlayer(player, amount);

        return economyResponse.transactionSuccess();
    }

    public static boolean Deposit(Player player, String amount) {
        EconomyResponse economyResponse = economy.depositPlayer(player, Double.parseDouble(amount));
        return economyResponse.transactionSuccess();
    }
}
