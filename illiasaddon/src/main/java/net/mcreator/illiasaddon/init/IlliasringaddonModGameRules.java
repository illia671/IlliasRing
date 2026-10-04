
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.illiasaddon.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IlliasringaddonModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> NEW_KWAMY_SYSTEM = GameRules.register("newKwamySystem", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}
