package net.mcreator.illiasaddon.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.illiasaddon.world.inventory.TransferMenu;
import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;
import net.mcreator.illiasaddon.init.IlliasringaddonModItems;

import io.netty.buffer.Unpooled;

public class OpenGuiPriNazhatiiKlavishiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:active_alliance")))) {
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Transfer");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new TransferMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:notactive_alliance"))))) {
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.CREATION_ALLIANCE.get(), lv).isPresent() : false) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Transfer");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new TransferMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.PROTECTION_ALLIANCE.get(), lv).isPresent() : false) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Transfer");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new TransferMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.ACTION_ALLIANCE.get(), lv).isPresent() : false) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Transfer");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new TransferMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.ILLUSION_ALLIANCE.get(), lv).isPresent() : false) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Transfer");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new TransferMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.WOLF_ALLIANCE.get(), lv).isPresent() : false) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Transfer");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new TransferMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.SPIRIT_ALLIANCE.get(), lv).isPresent() : false) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Transfer");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new TransferMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.DESTRUCTION_ALLIANCE.get(), lv).isPresent() : false) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Transfer");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new TransferMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.CREATION_ALLIANCENOTACTIVE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).cage == 0) {
				IlliasringaddonModVariables.MapVariables.get(world).alliance = 0;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.CREATION_ALLIANCE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect clear @e illiasringaddon:creationtransfer");
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.DESTRUCTION_ALLIANCE_NOT_ACTIVE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).CgaeDestruction == 0) {
				IlliasringaddonModVariables.MapVariables.get(world).alliance = 0;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.DESTRUCTION_ALLIANCE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect clear @e illiasringaddon:destructiontransfer");
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.ILLUSION_ALLIANCE_NOT_ACTIVE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).CageIllusion == 0) {
				IlliasringaddonModVariables.MapVariables.get(world).alliance = 0;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.ILLUSION_ALLIANCE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect clear @e illiasringaddon:illusiontransfer");
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.ACTION_ALLIACNE_NOT_ACTIVE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).PollenCage == 0) {
				IlliasringaddonModVariables.MapVariables.get(world).alliance = 0;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.ACTION_ALLIANCE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect clear @e illiasringaddon:beetransfer");
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.WOLF_ALLIANCE_NOT_ACTIVE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).LunnaCage == 0) {
				IlliasringaddonModVariables.MapVariables.get(world).alliance = 0;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.WOLF_ALLIANCE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect clear @e illiasringaddon:wolftransfer");
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.SPIRIT_ALLIANCE_NOT_ACTIVE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).SpiritCage == 0) {
				IlliasringaddonModVariables.MapVariables.get(world).alliance = 0;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.SPIRIT_ALLIANCE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect clear @e illiasringaddon:spirit_transfer");
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.PROTECTION_ALLIANCE_NOT_ACTIVE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).WayzzCage == 0) {
				IlliasringaddonModVariables.MapVariables.get(world).alliance = 0;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.PROTECTION_ALLIANCE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect clear @e illiasringaddon:turtle_transfer");
			}
		}
	}
}
