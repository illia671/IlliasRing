package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.level.LevelAccessor;

public class TimeProcedure {
	public static String execute(LevelAccessor world) {
		return "Time:" + world.dayTime();
	}
}
