package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.world.inventory.Alliance4Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance3Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance2Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance1Menu;
import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class AlliancZnachieniieSvoistva1Procedure {
	public static double execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return 0;
		if (!(entity instanceof Player _plr0 && _plr0.containerMenu instanceof Alliance1Menu)) {
			if (IlliasringaddonModVariables.MapVariables.get(world).Akuma == true) {
				return 1;
			}
		}
		if (!(entity instanceof Player _plr1 && _plr1.containerMenu instanceof Alliance2Menu)) {
			if (IlliasringaddonModVariables.MapVariables.get(world).Akuma == true) {
				return 1;
			}
		}
		if (!(entity instanceof Player _plr2 && _plr2.containerMenu instanceof Alliance3Menu)) {
			if (IlliasringaddonModVariables.MapVariables.get(world).Akuma == true) {
				return 1;
			}
		}
		if (!(entity instanceof Player _plr3 && _plr3.containerMenu instanceof Alliance4Menu)) {
			if (IlliasringaddonModVariables.MapVariables.get(world).Akuma == true) {
				return 1;
			}
		}
		return 0;
	}
}
