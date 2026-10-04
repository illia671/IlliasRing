package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.illiasaddon.network.IlliasringaddonModVariables;

public class TransmissionAllianceKazhdyiTikVRukieProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (IlliasringaddonModVariables.MapVariables.get(world).transmissionweapon == 1) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"give @a[distance=..2] nastyas_miracle_stones_mod:butterfly_cane_hawkmoth");
		} else if (IlliasringaddonModVariables.MapVariables.get(world).transmissionweapon == 3) {
			HjkhjkhjkhjkhjkhjkProcedure.execute(world, x, y, z);
		}
	}
}
