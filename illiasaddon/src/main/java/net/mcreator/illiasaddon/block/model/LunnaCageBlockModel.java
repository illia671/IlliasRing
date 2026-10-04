package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.entity.LunnaCageTileEntity;

public class LunnaCageBlockModel extends GeoModel<LunnaCageTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LunnaCageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "animations/lunnacage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LunnaCageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "geo/lunnacage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LunnaCageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "textures/block/lunnacage.png");
	}
}
