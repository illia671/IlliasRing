package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class DeathProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Death:" + Math.round((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).AllianceDeath);
	}
}
