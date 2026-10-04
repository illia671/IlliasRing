
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.illiasaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.illiasaddon.potion.WolftransferMobEffect;
import net.mcreator.illiasaddon.potion.TurtleTransferMobEffect;
import net.mcreator.illiasaddon.potion.SpiritTransferMobEffect;
import net.mcreator.illiasaddon.potion.RingHolderMobEffect;
import net.mcreator.illiasaddon.potion.IllusiontransferMobEffect;
import net.mcreator.illiasaddon.potion.HypnosisMobEffect;
import net.mcreator.illiasaddon.potion.DestructiontransferMobEffect;
import net.mcreator.illiasaddon.potion.CreationtransferMobEffect;
import net.mcreator.illiasaddon.potion.BeetransferMobEffect;
import net.mcreator.illiasaddon.IlliasringaddonMod;

public class IlliasringaddonModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, IlliasringaddonMod.MODID);
	public static final RegistryObject<MobEffect> CREATIONTRANSFER = REGISTRY.register("creationtransfer", () -> new CreationtransferMobEffect());
	public static final RegistryObject<MobEffect> DESTRUCTIONTRANSFER = REGISTRY.register("destructiontransfer", () -> new DestructiontransferMobEffect());
	public static final RegistryObject<MobEffect> ILLUSIONTRANSFER = REGISTRY.register("illusiontransfer", () -> new IllusiontransferMobEffect());
	public static final RegistryObject<MobEffect> WOLFTRANSFER = REGISTRY.register("wolftransfer", () -> new WolftransferMobEffect());
	public static final RegistryObject<MobEffect> SPIRIT_TRANSFER = REGISTRY.register("spirit_transfer", () -> new SpiritTransferMobEffect());
	public static final RegistryObject<MobEffect> BEETRANSFER = REGISTRY.register("beetransfer", () -> new BeetransferMobEffect());
	public static final RegistryObject<MobEffect> TURTLETRANSFER = REGISTRY.register("turtletransfer", () -> new TurtleTransferMobEffect());
	public static final RegistryObject<MobEffect> RING_HOLDER = REGISTRY.register("ring_holder", () -> new RingHolderMobEffect());
	public static final RegistryObject<MobEffect> HYPNOSIS = REGISTRY.register("hypnosis", () -> new HypnosisMobEffect());
}
