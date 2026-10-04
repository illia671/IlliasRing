package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.display.MeyShiCageDisplayItem;

public class MeyShiCageDisplayModel extends GeoModel<MeyShiCageDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MeyShiCageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "animations/spiritcage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MeyShiCageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "geo/spiritcage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MeyShiCageDisplayItem entity) {
		return new ResourceLocation("illiasringaddon", "textures/block/spiritcage.png");
	}
}
