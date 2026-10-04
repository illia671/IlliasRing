package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class TurtleTransferPriIstiechieniiEffiektaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		IlliasringaddonModVariables.MapVariables.get(world).alliance = 0;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
		VdgfdProcedure.execute(world, x, y, z, entity);
		entity.getPersistentData().putBoolean("turtle_power", false);
		IlliasringaddonModVariables.MapVariables.get(world).WayzzWeapon = 0;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
	}
}
