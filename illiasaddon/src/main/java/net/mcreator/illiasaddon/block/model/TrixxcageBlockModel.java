package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.entity.TrixxcageTileEntity;

public class TrixxcageBlockModel extends GeoModel<TrixxcageTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrixxcageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "animations/trixxcage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrixxcageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "geo/trixxcage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrixxcageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "textures/block/1trixxcage.png");
	}
}
