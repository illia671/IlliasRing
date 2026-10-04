package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class IfAllianceAvatarHead6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).HeadAavatarPage == 5) {
			return true;
		}
		return false;
	}
}
