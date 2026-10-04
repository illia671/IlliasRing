package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class LunnaCagePriRazrushieniiBlokaIghrokomProcedure {
	public static void execute(LevelAccessor world) {
		IlliasringaddonModVariables.MapVariables.get(world).LunnaCage = 0;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
		IlliasringaddonModVariables.MapVariables.get(world).LunnaHungre = 1;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
	}
}
