package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;
import net.mcreator.illiasaddon.init.IlliasringaddonModMobEffects;
import net.mcreator.illiasaddon.init.IlliasringaddonModItems;

public class CreatonOwerlayPowerProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(IlliasringaddonModMobEffects.CREATIONTRANSFER.get())) {
			return true;
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.CREATION_ALLIANCE.get())) : false) {
			if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 1) {
				return true;
			}
		}
		return false;
	}
}
