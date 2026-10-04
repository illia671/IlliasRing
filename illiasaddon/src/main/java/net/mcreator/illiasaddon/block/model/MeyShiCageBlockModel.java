package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.entity.MeyShiCageTileEntity;

public class MeyShiCageBlockModel extends GeoModel<MeyShiCageTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MeyShiCageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "animations/spiritcage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MeyShiCageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "geo/spiritcage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MeyShiCageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "textures/block/spiritcage.png");
	}
}
