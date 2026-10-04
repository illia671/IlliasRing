package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.world.inventory.Alliance9Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance8Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance7Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance6Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance5Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance4Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance3Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance2Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance1Menu;

public class AlliancZnachieniieSvoistvaProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof Alliance1Menu) {
			return 1;
		}
		if (entity instanceof Player _plr1 && _plr1.containerMenu instanceof Alliance2Menu) {
			return 1;
		}
		if (entity instanceof Player _plr2 && _plr2.containerMenu instanceof Alliance3Menu) {
			return 1;
		}
		if (entity instanceof Player _plr3 && _plr3.containerMenu instanceof Alliance4Menu) {
			return 1;
		}
		if (entity instanceof Player _plr4 && _plr4.containerMenu instanceof Alliance5Menu) {
			return 1;
		}
		if (entity instanceof Player _plr5 && _plr5.containerMenu instanceof Alliance6Menu) {
			return 1;
		}
		if (entity instanceof Player _plr6 && _plr6.containerMenu instanceof Alliance7Menu) {
			return 1;
		}
		if (entity instanceof Player _plr7 && _plr7.containerMenu instanceof Alliance8Menu) {
			return 1;
		}
		if (entity instanceof Player _plr8 && _plr8.containerMenu instanceof Alliance9Menu) {
			return 1;
		}
		return 0;
	}
}
