package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.entity.CreationcageTileEntity;

public class CreationcageBlockModel extends GeoModel<CreationcageTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CreationcageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "animations/tikkicage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CreationcageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "geo/tikkicage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CreationcageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "textures/block/tikkialliance.png");
	}
}
