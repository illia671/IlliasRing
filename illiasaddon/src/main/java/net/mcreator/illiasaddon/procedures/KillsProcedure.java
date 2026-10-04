package net.mcreator.illiasaddon.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.client.Minecraft;

public class KillsProcedure {
	public static String execute(LevelAccessor world) {
		return "OnlinPlayers:" + Math.round(world.isClientSide() ? Minecraft.getInstance().getConnection().getOnlinePlayers().size() : ServerLifecycleHooks.getCurrentServer().getPlayerCount());
	}
}
