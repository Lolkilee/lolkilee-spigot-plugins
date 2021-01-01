package Lolkilee.plugins.damageteleport;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import java.util.*;

public class DamageListener implements Listener
{
    //In blocks
    public static int maxDistance = 100;
    public static int minDistance = 10;
    private Random r = new Random();

    @EventHandler
    public void onDamageEvent(EntityDamageEvent e)
    {
        if(e.getEntity() instanceof Player)
        {
            Player p = (Player) e.getEntity();
            int x = (int) p.getLocation().getX();
            int z = (int) p.getLocation().getZ();

            x += r.nextInt((maxDistance - minDistance) + 1) + minDistance;
            z += r.nextInt((maxDistance - minDistance) + 1) + minDistance;

            int y = p.getWorld().getHighestBlockYAt(x, z);
            Location l = new Location(p.getWorld(), x, y, z);
            p.teleport(l);
        }
    }
}
