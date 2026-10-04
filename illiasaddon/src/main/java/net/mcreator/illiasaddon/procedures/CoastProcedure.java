package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class CoastProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).Chouse).equals("Black")) {
			return "Cost: " + "10 " + "diamonds";
		}
		if (((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).Chouse).equals("Orrange")) {
			return "Cost: " + "38" + "diamonds";
		}
		if (((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).Chouse).equals("Green")) {
			return "Cost: " + "17" + "diamonds";
		}
		if (((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).Chouse).equals("Pink")) {
			return "Cost: " + "24" + "diamonds";
		}
		if (((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).Chouse).equals("Cap1")) {
			return "Cost: " + "8" + "diamonds";
		}
		if (((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).Chouse).equals("Cap2")) {
			return "Cost: " + "3" + "diamonds";
		}
		return "Cost: ";
	}
}
