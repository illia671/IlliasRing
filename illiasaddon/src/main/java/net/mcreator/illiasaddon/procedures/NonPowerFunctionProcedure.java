package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;
import net.mcreator.illiasaddon.init.IlliasringaddonModItems;

public class NonPowerFunctionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 0) {
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.CREATION_ALLIANCE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.PROTECTION_ALLIANCE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ACTION_ALLIANCE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ILLUSION_ALLIANCE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.WOLF_ALLIANCE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.SPIRIT_ALLIANCE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.DESTRUCTION_ALLIANCE.get())) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.TRANSMISSION_ALLIANCE.get())) : false)) {
				return true;
			}
		}
		return false;
	}
}
