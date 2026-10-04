package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class ChousingCap2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Cap2";
			entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Chouse = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
