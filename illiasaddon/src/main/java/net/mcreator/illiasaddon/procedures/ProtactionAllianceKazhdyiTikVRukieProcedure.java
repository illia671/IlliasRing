package net.mcreator.illiasaddon.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class ProtactionAllianceKazhdyiTikVRukieProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack weapon = ItemStack.EMPTY;
		if (IlliasringaddonModVariables.MapVariables.get(world).WayzzWeapon == 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("nastyas_miracle_stones_mod:turtle_shield_1"))).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (IlliasringaddonModVariables.MapVariables.get(world).WayzzWeapon == 3) {
			VdgfdProcedure.execute(world, x, y, z, entity);
		}
	}
}
