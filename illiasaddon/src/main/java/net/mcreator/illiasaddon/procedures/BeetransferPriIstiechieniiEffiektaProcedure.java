package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class BeetransferPriIstiechieniiEffiektaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		IlliasringaddonModVariables.MapVariables.get(world).alliance = 0;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
		ActionClearWeaponProcedure.execute(world, x, y, z);
		entity.getPersistentData().putBoolean("bee_power", false);
		IlliasringaddonModVariables.MapVariables.get(world).ActionWeapon = 0;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
	}
}
