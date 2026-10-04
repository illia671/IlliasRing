package net.mcreator.illiasaddon.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;
import net.mcreator.illiasaddon.init.IlliasringaddonModEnchantments;

public class ProtactionAlliancePriShchielchkiePKMProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack weapon = ItemStack.EMPTY;
		weapon = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("nastyas_miracle_stones_mod:turtle_shield_1")));
		weapon.enchant(IlliasringaddonModEnchantments.MONARCH_WEAPON.get(), 10);
		if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).weapon == false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = weapon;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("nastyas_miracle_stones_mod:" + "turtle_phone")).toLowerCase(java.util.Locale.ENGLISH))));
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("nastyas_miracle_stones_mod:" + "turtle_shield_2")).toLowerCase(java.util.Locale.ENGLISH))));
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("nastyas_miracle_stones_mod:" + "turtle_shield_3")).toLowerCase(java.util.Locale.ENGLISH))));
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("nastyas_miracle_stones_mod:" + "turtle_shield_4")).toLowerCase(java.util.Locale.ENGLISH))));
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("nastyas_miracle_stones_mod:" + "turtle_shield_acces")).toLowerCase(java.util.Locale.ENGLISH))));
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation((("nastyas_miracle_stones_mod:" + "turtle_shield_box_acces")).toLowerCase(java.util.Locale.ENGLISH))));
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 500);
			{
				boolean _setval = true;
				entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.weapon = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).weapon == true) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = weapon.copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			{
				boolean _setval = false;
				entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.weapon = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
