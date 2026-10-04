package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;
import net.mcreator.illiasaddon.init.IlliasringaddonModItems;

public class NextPageRingPriNazhatiiKlavishiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.CREATION_ALLIANCE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ILLUSION_ALLIANCE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.DESTRUCTION_ALLIANCE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.TRANSMISSION_ALLIANCE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ACTION_ALLIANCE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.WOLF_ALLIANCE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.SPIRIT_ALLIANCE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.PROTECTION_ALLIANCE.get())) : false)) {
			if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 0) {
				{
					double _setval = 1;
					entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.powerpage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 1) {
				{
					double _setval = 2;
					entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.powerpage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 2) {
				{
					double _setval = 3;
					entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.powerpage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 3) {
				{
					double _setval = 4;
					entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.powerpage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 4) {
				{
					double _setval = 5;
					entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.powerpage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 5) {
				{
					double _setval = 6;
					entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.powerpage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 6) {
				{
					double _setval = 7;
					entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.powerpage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 7) {
				{
					double _setval = 8;
					entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.powerpage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 8) {
				{
					double _setval = 1;
					entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.powerpage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
