package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class SpiritTransferPriIstiechieniiEffiektaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		SpiritBallClearProcedure.execute(world, x, y, z);
		IlliasringaddonModVariables.MapVariables.get(world).alliance = 0;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
		entity.getPersistentData().putBoolean("meishi_power", false);
		IlliasringaddonModVariables.MapVariables.get(world).SpiritWeapon = 0;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
	}
}
