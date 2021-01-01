package Lolkilee.plugins.damageteleport;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getLogger().info("enabling random teleportation...");
        getServer().getPluginManager().registerEvents(new DamageListener(), this);
    }

    @Override
    public void onDisable()
    {
        getLogger().info("disabling plugin");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("changedistance"))
        {
            if(args.length > 0)
            {
                DamageListener.maxDistance = Integer.parseInt(args[0]);
                getLogger().info(sender.getName() + " changed the max distance to: " + DamageListener.maxDistance);
                return true;
            }
            return false;
        }
        return false;
    }
}
