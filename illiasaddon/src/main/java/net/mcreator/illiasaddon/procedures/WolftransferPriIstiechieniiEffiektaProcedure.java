package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class WolftransferPriIstiechieniiEffiektaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		IlliasringaddonModVariables.MapVariables.get(world).alliance = 0;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
		WolfWeaponClearProcedure.execute(world, x, y, z);
		entity.getPersistentData().putBoolean("wolf_power", false);
		IlliasringaddonModVariables.MapVariables.get(world).LunnaWeapon = 0;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
	}
}
