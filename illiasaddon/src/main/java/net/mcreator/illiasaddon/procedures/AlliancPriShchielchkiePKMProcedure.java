package net.mcreator.illiasaddon.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.illiasaddon.world.inventory.Alliance1Menu;
import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;
import net.mcreator.illiasaddon.init.IlliasringaddonModMobEffects;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import io.netty.buffer.Unpooled;

public class AlliancPriShchielchkiePKMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(IlliasringaddonModMobEffects.CREATIONTRANSFER.get())) {
			if (IlliasringaddonModVariables.MapVariables.get(world).allianceweaponcreation == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"give @a[distance=..2] nastyas_miracle_stones_mod:yoyo_classic");
				IlliasringaddonMod.queueServerWork(3, () -> {
					IlliasringaddonModVariables.MapVariables.get(world).allianceweaponcreation = 1;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				});
			}
			if (IlliasringaddonModVariables.MapVariables.get(world).allianceweaponcreation == 1) {
				RsggProcedure.execute(world, x, y, z);
				IlliasringaddonMod.queueServerWork(3, () -> {
					IlliasringaddonModVariables.MapVariables.get(world).allianceweaponcreation = 0;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				});
			}
		} else if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(IlliasringaddonModMobEffects.ILLUSIONTRANSFER.get())) {
			if (IlliasringaddonModVariables.MapVariables.get(world).allianceweaponillusion == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"give @a[distance=..2] nastyas_miracle_stones_mod:flute_rena_rouge");
				IlliasringaddonMod.queueServerWork(3, () -> {
					IlliasringaddonModVariables.MapVariables.get(world).allianceweaponillusion = 1;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				});
			}
			if (IlliasringaddonModVariables.MapVariables.get(world).allianceweaponillusion == 1) {
				GhffhfghfghfgProcedure.execute(world, x, y, z, entity);
				IlliasringaddonMod.queueServerWork(3, () -> {
					IlliasringaddonModVariables.MapVariables.get(world).allianceweaponillusion = 0;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				});
			}
		} else if (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(IlliasringaddonModMobEffects.DESTRUCTIONTRANSFER.get())) {
			if (IlliasringaddonModVariables.MapVariables.get(world).allianceweapondestuction == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"give @a[distance=..2] nastyas_miracle_stones_mod:cat_staff_black");
				IlliasringaddonMod.queueServerWork(3, () -> {
					IlliasringaddonModVariables.MapVariables.get(world).allianceweapondestuction = 1;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				});
			}
			if (IlliasringaddonModVariables.MapVariables.get(world).allianceweapondestuction == 1) {
				HghgtghProcedure.execute(world, x, y, z, entity);
				IlliasringaddonMod.queueServerWork(3, () -> {
					IlliasringaddonModVariables.MapVariables.get(world).allianceweapondestuction = 0;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				});
			}
		} else if (entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(IlliasringaddonModMobEffects.BEETRANSFER.get())) {
			if (IlliasringaddonModVariables.MapVariables.get(world).ActionWeapon == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"give @a[distance=..2] nastyas_miracle_stones_mod:bee_spinning_top_1");
				IlliasringaddonMod.queueServerWork(3, () -> {
					IlliasringaddonModVariables.MapVariables.get(world).ActionWeapon = 1;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				});
			}
			if (IlliasringaddonModVariables.MapVariables.get(world).ActionWeapon == 1) {
				ActionClearWeaponProcedure.execute(world, x, y, z);
				IlliasringaddonMod.queueServerWork(3, () -> {
					IlliasringaddonModVariables.MapVariables.get(world).ActionWeapon = 0;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				});
			}
		} else if (entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(IlliasringaddonModMobEffects.WOLFTRANSFER.get())) {
			if (IlliasringaddonModVariables.MapVariables.get(world).LunnaWeapon == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"give @a[distance=..2] nastyas_miracle_stones_mod:wolf_spear");
				IlliasringaddonMod.queueServerWork(3, () -> {
					IlliasringaddonModVariables.MapVariables.get(world).LunnaWeapon = 1;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				});
			}
			if (IlliasringaddonModVariables.MapVariables.get(world).LunnaWeapon == 1) {
				WolfWeaponClearProcedure.execute(world, x, y, z);
				IlliasringaddonMod.queueServerWork(3, () -> {
					IlliasringaddonModVariables.MapVariables.get(world).LunnaWeapon = 0;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				});
			}
		} else if (entity instanceof LivingEntity _livEnt20 && _livEnt20.hasEffect(IlliasringaddonModMobEffects.SPIRIT_TRANSFER.get())) {
			if (IlliasringaddonModVariables.MapVariables.get(world).SpiritWeapon == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"give @a[distance=..2] nastyas_miracle_stones_mod:spirit_ball");
				IlliasringaddonMod.queueServerWork(3, () -> {
					IlliasringaddonModVariables.MapVariables.get(world).SpiritWeapon = 1;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				});
			}
			if (IlliasringaddonModVariables.MapVariables.get(world).SpiritWeapon == 1) {
				SpiritBallClearProcedure.execute(world, x, y, z);
				IlliasringaddonMod.queueServerWork(3, () -> {
					IlliasringaddonModVariables.MapVariables.get(world).SpiritWeapon = 0;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				});
			}
		} else if (entity instanceof LivingEntity _livEnt24 && _livEnt24.hasEffect(IlliasringaddonModMobEffects.TURTLETRANSFER.get())) {
			if (IlliasringaddonModVariables.MapVariables.get(world).WayzzWeapon == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"summon item ~ ~1 ~ {Item:{id:\"nastyas_miracle_stones_mod:turtle_shield_1\",Count:1b}}");
				IlliasringaddonMod.queueServerWork(3, () -> {
					IlliasringaddonModVariables.MapVariables.get(world).WayzzWeapon = 1;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				});
			}
			if (IlliasringaddonModVariables.MapVariables.get(world).WayzzWeapon == 1) {
				VdgfdProcedure.execute(world, x, y, z, entity);
				IlliasringaddonMod.queueServerWork(3, () -> {
					IlliasringaddonModVariables.MapVariables.get(world).WayzzWeapon = 0;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				});
			}
		} else {
			if (IlliasringaddonModVariables.MapVariables.get(world).Akuma == false) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Alliance1");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new Alliance1Menu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("illiasringaddon:alliance_open")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("illiasringaddon:alliance_open")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
