package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.entity.Entity;

public class CreationtransferKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("ladybug_power", true);
	}
}
