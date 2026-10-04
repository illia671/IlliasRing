
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.illiasaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.illiasaddon.block.entity.WayzzCageTileEntity;
import net.mcreator.illiasaddon.block.entity.TrixxcageTileEntity;
import net.mcreator.illiasaddon.block.entity.PollenCageTileEntity;
import net.mcreator.illiasaddon.block.entity.PlaggcageTileEntity;
import net.mcreator.illiasaddon.block.entity.NooroocageTileEntity;
import net.mcreator.illiasaddon.block.entity.MeyShiCageTileEntity;
import net.mcreator.illiasaddon.block.entity.LunnaCageTileEntity;
import net.mcreator.illiasaddon.block.entity.CreationcageTileEntity;
import net.mcreator.illiasaddon.IlliasringaddonMod;

public class IlliasringaddonModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, IlliasringaddonMod.MODID);
	public static final RegistryObject<BlockEntityType<CreationcageTileEntity>> CREATIONCAGE = REGISTRY.register("creationcage", () -> BlockEntityType.Builder.of(CreationcageTileEntity::new, IlliasringaddonModBlocks.CREATIONCAGE.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrixxcageTileEntity>> TRIXX_CAGE = REGISTRY.register("trixx_cage", () -> BlockEntityType.Builder.of(TrixxcageTileEntity::new, IlliasringaddonModBlocks.TRIXX_CAGE.get()).build(null));
	public static final RegistryObject<BlockEntityType<PlaggcageTileEntity>> PLAGG_CAGE = REGISTRY.register("plagg_cage", () -> BlockEntityType.Builder.of(PlaggcageTileEntity::new, IlliasringaddonModBlocks.PLAGG_CAGE.get()).build(null));
	public static final RegistryObject<BlockEntityType<NooroocageTileEntity>> NOOROO_CAGE = REGISTRY.register("nooroo_cage", () -> BlockEntityType.Builder.of(NooroocageTileEntity::new, IlliasringaddonModBlocks.NOOROO_CAGE.get()).build(null));
	public static final RegistryObject<BlockEntityType<PollenCageTileEntity>> POLLEN_CAGE = REGISTRY.register("pollen_cage", () -> BlockEntityType.Builder.of(PollenCageTileEntity::new, IlliasringaddonModBlocks.POLLEN_CAGE.get()).build(null));
	public static final RegistryObject<BlockEntityType<LunnaCageTileEntity>> LUUNA_CAGE = REGISTRY.register("luuna_cage", () -> BlockEntityType.Builder.of(LunnaCageTileEntity::new, IlliasringaddonModBlocks.LUUNA_CAGE.get()).build(null));
	public static final RegistryObject<BlockEntityType<MeyShiCageTileEntity>> MEI_SHI_CAGE = REGISTRY.register("mei_shi_cage", () -> BlockEntityType.Builder.of(MeyShiCageTileEntity::new, IlliasringaddonModBlocks.MEI_SHI_CAGE.get()).build(null));
	public static final RegistryObject<BlockEntityType<WayzzCageTileEntity>> WAYZZ_CAGE = REGISTRY.register("wayzz_cage", () -> BlockEntityType.Builder.of(WayzzCageTileEntity::new, IlliasringaddonModBlocks.WAYZZ_CAGE.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
