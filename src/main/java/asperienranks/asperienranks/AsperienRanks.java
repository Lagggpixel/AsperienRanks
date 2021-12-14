package asperienranks.asperienranks;

import asperienranks.asperienranks.Commands.Rank;
import asperienranks.asperienranks.Listener.GUIMoveItem;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class AsperienRanks extends JavaPlugin {

    @Override
    public void onEnable() {
        RegisterCommands();
    }

    @Override
    public void onDisable() {
    }

    public void RegisterCommands() {
        this.getCommand("rank").setExecutor(new Rank());
    }

    public void RegisterEvents() {
        this.getServer().getPluginManager().registerEvents(new GUIMoveItem(this), this);
    }
}
