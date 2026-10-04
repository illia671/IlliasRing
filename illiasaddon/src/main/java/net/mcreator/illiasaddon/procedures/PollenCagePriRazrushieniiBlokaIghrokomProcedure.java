package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class PollenCagePriRazrushieniiBlokaIghrokomProcedure {
	public static void execute(LevelAccessor world) {
		IlliasringaddonModVariables.MapVariables.get(world).PollenCage = 0;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
		IlliasringaddonModVariables.MapVariables.get(world).PollenHungre = 1;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
	}
}
