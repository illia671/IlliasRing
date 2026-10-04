package net.mcreator.illiasaddon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.HashMap;
import java.util.ArrayList;

public class SENDProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("textin:name") ? (String) guistate.get("textin:name") : "")) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								("/tellraw @e[type=player] [\"\",{\"text\":\"[ \"},{\"text\":\"From \",\"color\":\"white\"},{\"text\":\" Alliance: " + "" + entity.getDisplayName().getString() + " \",\"color\":\"white\"},{\"text\":\" ] "
										+ (guistate.containsKey("textin:message") ? (String) guistate.get("textin:message") : "") + "\"}]"));
					}
				}
			}
		}
	}
}
