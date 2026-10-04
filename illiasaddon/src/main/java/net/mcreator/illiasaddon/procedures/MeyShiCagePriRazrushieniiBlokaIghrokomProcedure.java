package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class MeyShiCagePriRazrushieniiBlokaIghrokomProcedure {
	public static void execute(LevelAccessor world) {
		IlliasringaddonModVariables.MapVariables.get(world).SpiritCage = 0;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
		IlliasringaddonModVariables.MapVariables.get(world).SpiritHungre = 1;
		IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
	}
}
