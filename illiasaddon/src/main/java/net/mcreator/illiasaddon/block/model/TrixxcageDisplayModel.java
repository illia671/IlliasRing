package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.display.TrixxcageDisplayItem;

public class TrixxcageDisplayModel extends GeoModel<TrixxcageDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TrixxcageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "animations/trixxcage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrixxcageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "geo/trixxcage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrixxcageDisplayItem entity) {
		return new ResourceLocation("illiasringaddon", "textures/block/1trixxcage.png");
	}
}
