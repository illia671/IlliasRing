package net.mcreator.illiasaddon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;
import net.mcreator.illiasaddon.init.IlliasringaddonModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SdfsdProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.CREATION_ALLIANCE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ILLUSION_ALLIANCE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.DESTRUCTION_ALLIANCE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.TRANSMISSION_ALLIANCE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ACTION_ALLIANCE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.WOLF_ALLIANCE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.SPIRIT_ALLIANCE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.PROTECTION_ALLIANCE.get())) : false)) == false) {
			{
				double _setval = 0;
				entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.powerpage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
