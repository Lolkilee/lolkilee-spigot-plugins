package Lolkilee.plugins.antidespawn;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.Arrays;

import org.bukkit.entity.EntityType;

public class EventListener implements Listener {
    
    private EntityType[] keepEntities = {
        EntityType.BEE,
        EntityType.BOAT,
        EntityType.CAT,
        EntityType.CHICKEN,
        EntityType.COD,
        EntityType.COW,
        EntityType.DOLPHIN,
        EntityType.DONKEY,
        EntityType.ELDER_GUARDIAN,
        EntityType.ENDER_DRAGON,
        EntityType.FOX,
        EntityType.HORSE,
        EntityType.IRON_GOLEM,
        EntityType.ITEM_FRAME,
        EntityType.LLAMA,
        EntityType.MINECART,
        EntityType.MINECART_CHEST,
        EntityType.MINECART_COMMAND,
        EntityType.MINECART_FURNACE,
        EntityType.MINECART_HOPPER,
        EntityType.MINECART_TNT,
        EntityType.MULE,
        EntityType.MUSHROOM_COW,
        EntityType.OCELOT,
        EntityType.PAINTING,
        EntityType.PANDA,
        EntityType.PARROT,
        EntityType.PIG,
        EntityType.POLAR_BEAR,
        EntityType.PUFFERFISH,
        EntityType.RABBIT,
        EntityType.SALMON,
        EntityType.SHEEP,
        EntityType.STRIDER,
        EntityType.TRADER_LLAMA,
        EntityType.TROPICAL_FISH,
        EntityType.TURTLE,
        EntityType.VILLAGER,
        EntityType.WANDERING_TRADER,
        EntityType.WITHER,
        EntityType.WOLF
    };

    @EventHandler
    public void onSpawnEvent(CreatureSpawnEvent event){
        boolean containsKey = Arrays.stream(keepEntities).anyMatch(event.getEntityType()::equals);
        if(containsKey)
            event.getEntity().setRemoveWhenFarAway(false);
    }
}
