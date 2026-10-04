package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class NooroocagePriRazrushieniiBlokaIghrokomProcedure {
	public static void execute(LevelAccessor world) {
		IlliasringaddonModVariables.MapVariables.get(world).nooroocage = 0;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
		IlliasringaddonModVariables.MapVariables.get(world).nooroohunge = 1;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
	}
}
