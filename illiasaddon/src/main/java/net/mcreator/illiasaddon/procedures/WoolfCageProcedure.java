package net.mcreator.illiasaddon.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;
import net.mcreator.illiasaddon.init.IlliasringaddonModItems;

public class WoolfCageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.WOLF_ALLIANCE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).LunnaCage == 0) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.WOLF_ALLIANCE_NOT_ACTIVE.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				{
					int _value = 1;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 1 1 1 1 ~0.5 ~0.5 ~0.5 0.5 0.5 0.5 0 30");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:electric_spark ~0.25 ~0.5 ~0.5 0.5 0.5 0.5 0 30");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:end_rod ~0.25 ~0.5 ~0.5 0.5 0.5 0.5 0 30");
				WolfWeaponClearProcedure.execute(world, x, y, z);
				IlliasringaddonModVariables.MapVariables.get(world).LunnaCage = 1;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				IlliasringaddonModVariables.MapVariables.get(world).LunnaHungre = 0;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				{
					double _setval = (entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).ring_power - 1;
					entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ring_power = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == IlliasringaddonModItems.WOLF_ALLIANCE_NOT_ACTIVE.get()) {
			if (IlliasringaddonModVariables.MapVariables.get(world).LunnaHungre == 1) {
				if (IlliasringaddonModVariables.MapVariables.get(world).LunnaCage == 1) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(IlliasringaddonModItems.WOLF_ALLIANCE.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle dust 1 1 1 1 ~0.5 ~0.5 ~0.5 0.5 0.5 0.5 0 30");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:electric_spark ~0.25 ~0.5 ~0.5 0.5 0.5 0.5 0 30");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:end_rod ~0.25 ~0.5 ~0.5 0.5 0.5 0.5 0 30");
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("illiasringaddon:poof_kwami")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("illiasringaddon:poof_kwami")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					{
						int _value = 0;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					IlliasringaddonModVariables.MapVariables.get(world).LunnaHungre = 0;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
					IlliasringaddonModVariables.MapVariables.get(world).LunnaCage = 0;
					IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Lunna, your power is now mine!"), false);
					{
						double _setval = (entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).ring_power + 1;
						entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ring_power = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.APPLE) {
			if (IlliasringaddonModVariables.MapVariables.get(world).LunnaHungre == 0) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.APPLE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				IlliasringaddonModVariables.MapVariables.get(world).LunnaHungre = 1;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"title @a[distance=..7] actionbar [\"\",{\"text\":\"Kwami was fed\",\"color\":\"yellow\"}]");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle item minecraft:apple ~0.5 ~0.5 ~0.5 0.5 0.5 0.5 0 10");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle item minecraft:apple ~0.5 ~0.5 ~0.5 0.5 0.5 0.5 0 10");
			}
		}
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.WOLF_ALLIANCE.get(), lv).isPresent() : false) {
			if (IlliasringaddonModVariables.MapVariables.get(world).LunnaCage == 0) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(IlliasringaddonModItems.WOLF_ALLIANCE_NOT_ACTIVE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				{
					int _value = 1;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"curios replace alliance_woolf_slot 0 @p with air");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle dust 1 1 1 1 ~0.5 ~0.5 ~0.5 0.5 0.5 0.5 0 30");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:electric_spark ~0.25 ~0.5 ~0.5 0.5 0.5 0.5 0 30");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:end_rod ~0.25 ~0.5 ~0.5 0.5 0.5 0.5 0 30");
				WolfWeaponClearProcedure.execute(world, x, y, z);
				IlliasringaddonModVariables.MapVariables.get(world).LunnaCage = 1;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				IlliasringaddonModVariables.MapVariables.get(world).LunnaHungre = 0;
				IlliasringaddonModVariables.MapVariables.get(world).syncData(world);
				{
					double _setval = (entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).ring_power - 1;
					entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ring_power = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
