package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;
import net.mcreator.illiasaddon.init.IlliasringaddonModItems;

public class RefllectaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.CREATION_ALLIANCE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/execute as @a if entity @s[nbt={Inventory:[{Slot:103b,id:\"nastyas_miracle_stones_mod:reflekta_helmet\"}]}] run effect give @s illiasaddon:creationtransfer infinite 111 false");
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.CREATION_ALLIANCENOTACTIVE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.DESTRUCTION_ALLIANCE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/execute as @a if entity @s[nbt={Inventory:[{Slot:103b,id:\"nastyas_miracle_stones_mod:reflekta_helmet\"}]}] run effect give @s illiasaddon:destructiontransfer infinite 111 false");
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.DESTRUCTION_ALLIANCE_NOT_ACTIVE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.ILLUSION_ALLIANCE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/execute as @a if entity @s[nbt={Inventory:[{Slot:103b,id:\"nastyas_miracle_stones_mod:reflekta_helmet\"}]}] run effect give @s illiasaddon:illusiontransfer infinite 111 false");
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.ILLUSION_ALLIANCE_NOT_ACTIVE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.ACTION_ALLIANCE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/execute as @a if entity @s[nbt={Inventory:[{Slot:103b,id:\"nastyas_miracle_stones_mod:reflekta_helmet\"}]}] run effect give @s illiasaddon:beetransfer infinite 111 false");
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.ACTION_ALLIACNE_NOT_ACTIVE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.WOLF_ALLIANCE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/execute as @a if entity @s[nbt={Inventory:[{Slot:103b,id:\"nastyas_miracle_stones_mod:reflekta_helmet\"}]}] run effect give @s illiasaddon:wolftransfer infinite 111 false");
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.WOLF_ALLIANCE_NOT_ACTIVE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.PROTECTION_ALLIANCE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/execute as @a if entity @s[nbt={Inventory:[{Slot:103b,id:\"nastyas_miracle_stones_mod:reflekta_helmet\"}]}] run effect give @s illiasaddon:turtle_transfer infinite 111 false");
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.PROTECTION_ALLIANCE_NOT_ACTIVE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
