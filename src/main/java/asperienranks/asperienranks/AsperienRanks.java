package asperienranks.asperienranks;

import asperienranks.asperienranks.Commands.*;
import asperienranks.asperienranks.Listener.GUIMoveItem;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class AsperienRanks extends JavaPlugin {
    private static final Logger log = Logger.getLogger("Minecraft");
    private static Economy economy = null;
    public static Economy getEcon() {
        return economy;
    }


    @Override
    public void onEnable() {
        System.out.println("AsperienRanks has been enabled.");

        RegisterCommands();
        RegisterEvents();

        setupEconomy();
    }

    @Override
    public void onDisable() {
    }

    private void setupEconomy() {
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        economy = rsp.getProvider();
    }

    public void RegisterCommands() {
        this.getCommand("rank").setExecutor(new Rank());
        this.getCommand("forcerankup").setExecutor(new ForceRankUp());
        this.getCommand("info").setExecutor(new Info());
        this.getCommand("rankup").setExecutor(new RankUp());
    }

    public void RegisterEvents() {
        this.getServer().getPluginManager().registerEvents(new GUIMoveItem(this), this);
    }
}