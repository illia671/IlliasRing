package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class SpeedProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Speed(walk):" + (entity instanceof Player _plr ? _plr.getAbilities().getWalkingSpeed() : 0) + " " + "(Fly):" + (entity instanceof Player _plr ? _plr.getAbilities().getFlyingSpeed() : 0);
	}
}
