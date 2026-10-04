package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class CreationcagePriRazrushieniiBlokaIghrokomProcedure {
	public static void execute(LevelAccessor world) {
		IlliasringaddonModVariables.MapVariables.get(world).cage = 0;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
		IlliasringaddonModVariables.MapVariables.get(world).tikkihungre = 1;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
	}
}
