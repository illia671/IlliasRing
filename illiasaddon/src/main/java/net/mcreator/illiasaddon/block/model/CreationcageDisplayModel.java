package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.display.CreationcageDisplayItem;

public class CreationcageDisplayModel extends GeoModel<CreationcageDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CreationcageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "animations/tikkicage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CreationcageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "geo/tikkicage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CreationcageDisplayItem entity) {
		return new ResourceLocation("illiasringaddon", "textures/block/tikkialliance.png");
	}
}
