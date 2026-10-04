package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.display.WayzzCageDisplayItem;

public class WayzzCageDisplayModel extends GeoModel<WayzzCageDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WayzzCageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "animations/wayzzcage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WayzzCageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "geo/wayzzcage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WayzzCageDisplayItem entity) {
		return new ResourceLocation("illiasringaddon", "textures/block/wayzzcage.png");
	}
}
