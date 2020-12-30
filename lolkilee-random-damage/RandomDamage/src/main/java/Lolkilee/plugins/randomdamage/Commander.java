package Lolkilee.plugins.randomdamage;

import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.command.*;

public class Commander implements CommandExecutor
{
    private DamageListener damageListener;

    public Commander(DamageListener damageListener)
    {
        this.damageListener = damageListener;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if(sender instanceof Player)
        {
            if(label.equalsIgnoreCase("mult"))
            {
                damageListener.randomMultiplier = Double.parseDouble(args[0]);
            }
        }
        return false;
    }
}
