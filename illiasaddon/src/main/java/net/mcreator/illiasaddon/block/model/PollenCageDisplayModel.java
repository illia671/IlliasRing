package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.display.PollenCageDisplayItem;

public class PollenCageDisplayModel extends GeoModel<PollenCageDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PollenCageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "animations/pollencage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PollenCageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "geo/pollencage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PollenCageDisplayItem entity) {
		return new ResourceLocation("illiasringaddon", "textures/block/pollencage.png");
	}
}
