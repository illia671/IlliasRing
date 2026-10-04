package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.entity.Entity;

public class IllusiontransferKazhdyiTikVoVriemiaEffiektaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("fox_power", true);
	}
}
