package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class SetHeadAlliance5Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 5;
			entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.HeadAavatarPage = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
