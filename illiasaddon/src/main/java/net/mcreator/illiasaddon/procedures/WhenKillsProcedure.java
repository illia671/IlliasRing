package net.mcreator.illiasaddon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.CriticalHitEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WhenKillsProcedure {
	@SubscribeEvent
	public static void onPlayerCriticalHit(CriticalHitEvent event) {
		execute(event, event.getTarget());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).AllianceKills + 1;
			entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.AllianceKills = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
