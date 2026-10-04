package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.entity.PollenCageTileEntity;

public class PollenCageBlockModel extends GeoModel<PollenCageTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PollenCageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "animations/pollencage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PollenCageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "geo/pollencage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PollenCageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "textures/block/pollencage.png");
	}
}
