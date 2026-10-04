
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.illiasaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.illiasaddon.block.WayzzCageBlock;
import net.mcreator.illiasaddon.block.TrixxcageBlock;
import net.mcreator.illiasaddon.block.PollenCageBlock;
import net.mcreator.illiasaddon.block.PlaggcageBlock;
import net.mcreator.illiasaddon.block.NooroocageBlock;
import net.mcreator.illiasaddon.block.MeyShiCageBlock;
import net.mcreator.illiasaddon.block.LunnaCageBlock;
import net.mcreator.illiasaddon.block.CreationcageBlock;
import net.mcreator.illiasaddon.block.BlockAlliance2Block;
import net.mcreator.illiasaddon.block.BlockAlliance1Block;
import net.mcreator.illiasaddon.block.AllianceBlock3Block;
import net.mcreator.illiasaddon.IlliasringaddonMod;

public class IlliasringaddonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IlliasringaddonMod.MODID);
	public static final RegistryObject<Block> CREATIONCAGE = REGISTRY.register("creationcage", () -> new CreationcageBlock());
	public static final RegistryObject<Block> TRIXX_CAGE = REGISTRY.register("trixx_cage", () -> new TrixxcageBlock());
	public static final RegistryObject<Block> PLAGG_CAGE = REGISTRY.register("plagg_cage", () -> new PlaggcageBlock());
	public static final RegistryObject<Block> NOOROO_CAGE = REGISTRY.register("nooroo_cage", () -> new NooroocageBlock());
	public static final RegistryObject<Block> BLOCK_ALLIANCE_1 = REGISTRY.register("block_alliance_1", () -> new BlockAlliance1Block());
	public static final RegistryObject<Block> BLOCK_ALLIANCE_2 = REGISTRY.register("block_alliance_2", () -> new BlockAlliance2Block());
	public static final RegistryObject<Block> ALLIANCE_BLOCK_3 = REGISTRY.register("alliance_block_3", () -> new AllianceBlock3Block());
	public static final RegistryObject<Block> POLLEN_CAGE = REGISTRY.register("pollen_cage", () -> new PollenCageBlock());
	public static final RegistryObject<Block> LUUNA_CAGE = REGISTRY.register("luuna_cage", () -> new LunnaCageBlock());
	public static final RegistryObject<Block> MEI_SHI_CAGE = REGISTRY.register("mei_shi_cage", () -> new MeyShiCageBlock());
	public static final RegistryObject<Block> WAYZZ_CAGE = REGISTRY.register("wayzz_cage", () -> new WayzzCageBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
