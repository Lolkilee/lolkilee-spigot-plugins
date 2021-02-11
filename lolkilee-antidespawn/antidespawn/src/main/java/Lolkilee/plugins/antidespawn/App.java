package Lolkilee.plugins.antidespawn;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {
    
    @Override
    public void onEnable() {
        getLogger().info("fixing mobs!");
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("disabling plugin");
    }
}
