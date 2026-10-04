package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class SetClothesAvatar11Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).GreenGirlSuit == true) {
			{
				double _setval = 11;
				entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ClothesAavatarPage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
