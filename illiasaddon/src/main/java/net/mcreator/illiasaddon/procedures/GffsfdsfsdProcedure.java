package net.mcreator.illiasaddon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;
import net.mcreator.illiasaddon.init.IlliasringaddonModMobEffects;
import net.mcreator.illiasaddon.init.IlliasringaddonModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GffsfdsfsdProcedure {
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
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.CREATION_ALLIANCE.get())) : false) {
			if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 1) {
				entity.getPersistentData().putBoolean("ladybug_power", true);
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage != 1) {
				if ((entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(IlliasringaddonModMobEffects.CREATIONTRANSFER.get())) != true) {
					entity.getPersistentData().putBoolean("ladybug_power", false);
				}
			}
		} else {
			if ((entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(IlliasringaddonModMobEffects.CREATIONTRANSFER.get())) != true) {
				entity.getPersistentData().putBoolean("ladybug_power", false);
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ILLUSION_ALLIANCE.get())) : false) {
			if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 4) {
				entity.getPersistentData().putBoolean("fox_power", true);
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage != 4) {
				if ((entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(IlliasringaddonModMobEffects.ILLUSIONTRANSFER.get())) != true) {
					entity.getPersistentData().putBoolean("fox_power", false);
				}
			}
		} else {
			if ((entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(IlliasringaddonModMobEffects.ILLUSIONTRANSFER.get())) != true) {
				entity.getPersistentData().putBoolean("fox_power", false);
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.DESTRUCTION_ALLIANCE.get())) : false) {
			if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 2) {
				entity.getPersistentData().putBoolean("cat_power", true);
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage != 2) {
				if ((entity instanceof LivingEntity _livEnt14 && _livEnt14.hasEffect(IlliasringaddonModMobEffects.DESTRUCTIONTRANSFER.get())) != true) {
					entity.getPersistentData().putBoolean("cat_power", false);
				}
			}
		} else {
			if ((entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(IlliasringaddonModMobEffects.DESTRUCTIONTRANSFER.get())) != true) {
				entity.getPersistentData().putBoolean("cat_power", false);
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.ACTION_ALLIANCE.get())) : false) {
			if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 5) {
				entity.getPersistentData().putBoolean("bee_power", true);
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage != 5) {
				entity.getPersistentData().putBoolean("bee_power", false);
			}
		} else {
			if ((entity instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(IlliasringaddonModMobEffects.BEETRANSFER.get())) != true) {
				entity.getPersistentData().putBoolean("bee_power", false);
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.TRANSMISSION_ALLIANCE.get())) : false) {
			if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 3) {
				entity.getPersistentData().putBoolean("butterfly_power", true);
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage != 3) {
				entity.getPersistentData().putBoolean("butterfly_power", false);
			}
		} else {
			entity.getPersistentData().putBoolean("butterfly_power", false);
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.PROTECTION_ALLIANCE.get())) : false) {
			if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 6) {
				entity.getPersistentData().putBoolean("turtle_power", true);
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage != 6) {
				entity.getPersistentData().putBoolean("turtle_power", false);
			}
		} else {
			if ((entity instanceof LivingEntity _livEnt30 && _livEnt30.hasEffect(IlliasringaddonModMobEffects.TURTLETRANSFER.get())) != true) {
				entity.getPersistentData().putBoolean("turtle_power", false);
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.WOLF_ALLIANCE.get())) : false) {
			if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 7) {
				entity.getPersistentData().putBoolean("wolf_power", true);
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage != 7) {
				entity.getPersistentData().putBoolean("wolf_power", false);
			}
		} else {
			if ((entity instanceof LivingEntity _livEnt35 && _livEnt35.hasEffect(IlliasringaddonModMobEffects.WOLFTRANSFER.get())) != true) {
				entity.getPersistentData().putBoolean("wolf_power", false);
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(IlliasringaddonModItems.SPIRIT_ALLIANCE.get())) : false) {
			if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage == 8) {
				entity.getPersistentData().putBoolean("meishi_power", true);
			} else if ((entity.getCapability(IlliasringaddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new IlliasringaddonModVariables.PlayerVariables())).powerpage != 8) {
				entity.getPersistentData().putBoolean("meishi_power", false);
			}
		} else {
			if ((entity instanceof LivingEntity _livEnt40 && _livEnt40.hasEffect(IlliasringaddonModMobEffects.SPIRIT_TRANSFER.get())) != true) {
				entity.getPersistentData().putBoolean("meishi_power", false);
			}
		}
	}
}
