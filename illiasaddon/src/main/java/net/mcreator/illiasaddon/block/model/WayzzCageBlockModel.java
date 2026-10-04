package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.entity.WayzzCageTileEntity;

public class WayzzCageBlockModel extends GeoModel<WayzzCageTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WayzzCageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "animations/wayzzcage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WayzzCageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "geo/wayzzcage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WayzzCageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "textures/block/wayzzcage.png");
	}
}
