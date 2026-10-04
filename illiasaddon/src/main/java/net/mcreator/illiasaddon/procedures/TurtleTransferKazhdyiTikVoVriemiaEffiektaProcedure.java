package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.entity.Entity;

public class TurtleTransferKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("turtle_power", true);
	}
}
