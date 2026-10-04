
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.illiasaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.illiasaddon.enchantment.MonarchWeaponEnchantment;
import net.mcreator.illiasaddon.IlliasringaddonMod;

public class IlliasringaddonModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, IlliasringaddonMod.MODID);
	public static final RegistryObject<Enchantment> MONARCH_WEAPON = REGISTRY.register("monarch_weapon", () -> new MonarchWeaponEnchantment());
}
