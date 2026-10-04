package net.mcreator.illiasaddon.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;
import net.mcreator.illiasaddon.init.IlliasringaddonModMobEffects;
import net.mcreator.illiasaddon.init.IlliasringaddonModItems;

import java.util.HashMap;
import java.util.ArrayList;

public class TransferPowerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((guistate.containsKey("text:power") ? ((EditBox) guistate.get("text:power")).getValue() : "").equals("creation")) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.CREATION_ALLIANCE.get()) {
				if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
					if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("Akumatized")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:villains_masks")))) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.CREATIONTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
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
						}
					} else if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("All")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.CREATIONTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
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
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "")) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("effect give " + (guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "") + " illiasringaddon:creationtransfer infinite 111 false"));
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
						}
					}
				}
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.CREATION_ALLIANCE.get(), lv).isPresent() : false) {
				if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
					if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("Akumatized")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:villains_masks")))) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.CREATIONTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.CREATION_ALLIANCENOTACTIVE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"curios replace alliance_creation_slot 0 @p with air");
									if (entity instanceof Player _player)
										_player.closeContainer();
									IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
									IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					} else if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("All")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(IlliasringaddonModItems.CREATION_ALLIANCENOTACTIVE.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"curios replace alliance_creation_slot 0 @p with air");
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.CREATIONTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
								if (entity instanceof Player _player)
									_player.closeContainer();
								IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
								IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
							}
						}
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "")) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.CREATION_ALLIANCENOTACTIVE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("effect give " + (guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "") + " illiasringaddon:creationtransfer infinite 111 false"));
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"curios replace alliance_creation_slot 0 @p with air");
									if (entity instanceof Player _player)
										_player.closeContainer();
									IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
									IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					}
				}
			}
		}
		if ((guistate.containsKey("text:power") ? ((EditBox) guistate.get("text:power")).getValue() : "").equals("destruction")) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.DESTRUCTION_ALLIANCE.get()) {
				if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
					if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("Akumatized")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:villains_masks")))) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.DESTRUCTIONTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
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
						}
					} else if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("All")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.DESTRUCTIONTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
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
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "")) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("effect give " + (guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "") + " illiasringaddon:destructiontransfer infinite 111 false"));
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
						}
					}
				}
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.DESTRUCTION_ALLIANCE.get(), lv).isPresent() : false) {
				if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
					if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("Akumatized")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:villains_masks")))) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.DESTRUCTIONTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.DESTRUCTION_ALLIANCE_NOT_ACTIVE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"curios replace alliance_destruction_slot 0 @p with air");
									if (entity instanceof Player _player)
										_player.closeContainer();
									IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
									IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					} else if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("All")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(IlliasringaddonModItems.DESTRUCTION_ALLIANCE_NOT_ACTIVE.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"curios replace alliance_destruction_slot 0 @p with air");
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.DESTRUCTIONTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
								if (entity instanceof Player _player)
									_player.closeContainer();
								IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
								IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
							}
						}
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "")) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.DESTRUCTION_ALLIANCE_NOT_ACTIVE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("effect give " + (guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "") + " illiasringaddon:destructiontransfer infinite 111 false"));
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"curios replace alliance_destruction_slot 0 @p with air");
									if (entity instanceof Player _player)
										_player.closeContainer();
									IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
									IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					}
				}
			}
		}
		if ((guistate.containsKey("text:power") ? ((EditBox) guistate.get("text:power")).getValue() : "").equals("illusion")) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.ILLUSION_ALLIANCE.get()) {
				if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
					if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("Akumatized")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:villains_masks")))) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.ILLUSIONTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
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
						}
					} else if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("All")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.ILLUSIONTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
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
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "")) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("effect give " + (guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "") + " illiasringaddon:illusiontransfer infinite 111 false"));
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
						}
					}
				}
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.ILLUSION_ALLIANCE.get(), lv).isPresent() : false) {
				if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
					if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("Akumatized")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:villains_masks")))) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.ILLUSIONTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.ILLUSION_ALLIANCE_NOT_ACTIVE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"curios replace alliance_illusion_slot 0 @p with air");
									if (entity instanceof Player _player)
										_player.closeContainer();
									IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
									IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					} else if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("All")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(IlliasringaddonModItems.ILLUSION_ALLIANCE_NOT_ACTIVE.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"curios replace alliance_illusion_slot 0 @p with air");
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.ILLUSIONTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
								if (entity instanceof Player _player)
									_player.closeContainer();
								IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
								IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
							}
						}
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "")) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.ILLUSION_ALLIANCE_NOT_ACTIVE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("effect give " + (guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "") + " illiasringaddon:illusiontransfer infinite 111 false"));
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"curios replace alliance_illusion_slot 0 @p with air");
									if (entity instanceof Player _player)
										_player.closeContainer();
									IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
									IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					}
				}
			}
		}
		if ((guistate.containsKey("text:power") ? ((EditBox) guistate.get("text:power")).getValue() : "").equals("action")) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.ACTION_ALLIANCE.get()) {
				if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
					if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("Akumatized")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:villains_masks")))) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.BEETRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
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
						}
					} else if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("All")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.BEETRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
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
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "")) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("effect give " + (guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "") + " illiasringaddon:beetransfer infinite 111 false"));
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
						}
					}
				}
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.ACTION_ALLIANCE.get(), lv).isPresent() : false) {
				if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
					if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("Akumatized")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:villains_masks")))) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.BEETRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.ACTION_ALLIACNE_NOT_ACTIVE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"curios replace alliance_action_slot 0 @p with air");
									if (entity instanceof Player _player)
										_player.closeContainer();
									IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
									IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					} else if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("All")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(IlliasringaddonModItems.ACTION_ALLIACNE_NOT_ACTIVE.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"curios replace alliance_action_slot 0 @p with air");
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.BEETRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
								if (entity instanceof Player _player)
									_player.closeContainer();
								IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
								IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
							}
						}
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "")) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.ACTION_ALLIACNE_NOT_ACTIVE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("effect give " + (guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "") + " illiasringaddon:beetransfer infinite 111 false"));
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"curios replace alliance_action_slot 0 @p with air");
									if (entity instanceof Player _player)
										_player.closeContainer();
									IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
									IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					}
				}
			}
		}
		if ((guistate.containsKey("text:power") ? ((EditBox) guistate.get("text:power")).getValue() : "").equals("protection")) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.PROTECTION_ALLIANCE.get()) {
				if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
					if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("Akumatized")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:villains_masks")))) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.TURTLETRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
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
					} else if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("All")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.TURTLETRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
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
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "")) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("effect give " + (guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "") + " illiasringaddon:turtle_transfer infinite 111 false"));
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
				}
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.PROTECTION_ALLIANCE.get(), lv).isPresent() : false) {
				if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
					if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("Akumatized")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:villains_masks")))) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.TURTLETRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.PROTECTION_ALLIANCE_NOT_ACTIVE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"curios replace alliance_protaction_slot 0 @p with air");
									if (entity instanceof Player _player)
										_player.closeContainer();
									IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
									IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					} else if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("All")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(IlliasringaddonModItems.PROTECTION_ALLIANCE_NOT_ACTIVE.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"curios replace alliance_protaction_slot 0 @p with air");
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.TURTLETRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
								if (entity instanceof Player _player)
									_player.closeContainer();
								IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
								IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
							}
						}
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "")) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.PROTECTION_ALLIANCE_NOT_ACTIVE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("effect give " + (guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "") + " illiasringaddon:turtle_transfer infinite 111 false"));
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"curios replace alliance_protaction_slot 0 @p with air");
									if (entity instanceof Player _player)
										_player.closeContainer();
									IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
									IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					}
				}
			}
		}
		if ((guistate.containsKey("text:power") ? ((EditBox) guistate.get("text:power")).getValue() : "").equals("climatization")) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.WOLF_ALLIANCE.get()) {
				if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
					if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("Akumatized")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:villains_masks")))) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.WOLFTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
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
						}
					} else if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("All")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.WOLFTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
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
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "")) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("effect give " + (guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "") + " illiasringaddon:wolftransfer infinite 111 false"));
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
						}
					}
				}
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.WOLF_ALLIANCE.get(), lv).isPresent() : false) {
				if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
					if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("Akumatized")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:villains_masks")))) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.WOLFTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.WOLF_ALLIANCE_NOT_ACTIVE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"curios replace alliance_woolf_slot 0 @p with air");
									if (entity instanceof Player _player)
										_player.closeContainer();
									IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
									IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					} else if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("All")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(IlliasringaddonModItems.WOLF_ALLIANCE_NOT_ACTIVE.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"curios replace alliance_woolf_slot 0 @p with air");
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.WOLFTRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
								if (entity instanceof Player _player)
									_player.closeContainer();
								IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
								IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
							}
						}
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "")) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.WOLF_ALLIANCE_NOT_ACTIVE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("effect give " + (guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "") + " illiasringaddon:wolftransfer infinite 111 false"));
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"curios replace alliance_woolf_slot 0 @p with air");
									if (entity instanceof Player _player)
										_player.closeContainer();
									IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
									IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					}
				}
			}
		}
		if ((guistate.containsKey("text:power") ? ((EditBox) guistate.get("text:power")).getValue() : "").equals("spirit")) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.SPIRIT_ALLIANCE.get()) {
				if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
					if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("Akumatized")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:villains_masks")))) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.SPIRIT_TRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
									if (entity instanceof LivingEntity _entity) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.SPIRIT_ALLIANCE_NOT_ACTIVE.get()).copy();
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
					} else if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("All")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.SPIRIT_TRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(IlliasringaddonModItems.SPIRIT_ALLIANCE_NOT_ACTIVE.get()).copy();
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
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "")) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("effect give " + (guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "") + " illiasringaddon:spirit_transfer infinite 111 false"));
									if (entity instanceof LivingEntity _entity) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.SPIRIT_ALLIANCE_NOT_ACTIVE.get()).copy();
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
				}
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.SPIRIT_ALLIANCE.get(), lv).isPresent() : false) {
				if (IlliasringaddonModVariables.MapVariables.get(world).alliance == 0) {
					if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("Akumatized")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:villains_masks")))) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.SPIRIT_TRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.SPIRIT_ALLIANCE_NOT_ACTIVE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"curios replace alliance_spirit_slot 0 @p with air");
									if (entity instanceof Player _player)
										_player.closeContainer();
									IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
									IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					} else if ((guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "").equals("All")) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(IlliasringaddonModItems.SPIRIT_ALLIANCE_NOT_ACTIVE.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"curios replace alliance_spirit_slot 0 @p with air");
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(IlliasringaddonModMobEffects.SPIRIT_TRANSFER.get(), (int) 1.1111111111111112e+36, 1, false, false));
								if (entity instanceof Player _player)
									_player.closeContainer();
								IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
								IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
							}
						}
					} else {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "")) {
								if (entityiterator instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ALLIANC.get())) : false) {
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(IlliasringaddonModItems.SPIRIT_ALLIANCE_NOT_ACTIVE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("effect give " + (guistate.containsKey("text:player_name") ? ((EditBox) guistate.get("text:player_name")).getValue() : "") + " illiasringaddon:spirit_transfer infinite 111 false"));
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"curios replace alliance_spirit_slot 0 @p with air");
									if (entity instanceof Player _player)
										_player.closeContainer();
									IlliasringaddonModVariables.MapVariables.get(world).alliance = 1;
									IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
								}
							}
						}
					}
				}
			}
		}
	}
}
