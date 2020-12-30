package Lolkilee.plugins.randomdamage;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;

public class DamageListener implements Listener
{
    double randomMultiplier = 2;
    Random r = new Random();
    JavaPlugin plugin;

    public DamageListener(JavaPlugin plugin, double randomMultiplier)
    {
        this.plugin = plugin;
        this.randomMultiplier = randomMultiplier;
    }

    @EventHandler
    public void onDamageEvent(EntityDamageEvent e)
    {
        double ogDamage = e.getDamage();
        double damage = e.getDamage() * (r.nextDouble() * randomMultiplier);
        //plugin.getLogger().info("Changed damage from " + ogDamage + " to: " + damage);
        e.setDamage(damage);
    }
}
