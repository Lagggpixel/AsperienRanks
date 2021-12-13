package asperienranks.asperienranks;

import asperienranks.asperienranks.Commands.Rank;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class AsperienRanks extends JavaPlugin {

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    }

    public void RegisterCommands() {
        Objects.requireNonNull(this.getCommand("rank")).setExecutor(new Rank());
    }

    public void RegisterEvents() {

    }
}
