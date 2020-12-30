package Lolkilee.plugins.randomdamage;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    DamageListener damageListener = new DamageListener(this, 2);

    @Override
    public void onEnable()
    {
        getLogger().info("Starting the random damage plugin");
        getCommand("mult").setExecutor(new Commander(damageListener));
        getServer().getPluginManager().registerEvents(damageListener, this);
    }

    @Override
    public void onDisable()
    {
        getLogger().info("Disabling the random damage plugin");
    }
}