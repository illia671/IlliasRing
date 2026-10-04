package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.entity.PlaggcageTileEntity;

public class PlaggcageBlockModel extends GeoModel<PlaggcageTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PlaggcageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "animations/plaggcage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlaggcageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "geo/plaggcage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlaggcageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "textures/block/plaggcage.png");
	}
}
