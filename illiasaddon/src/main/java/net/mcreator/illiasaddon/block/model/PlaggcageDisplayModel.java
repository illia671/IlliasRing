package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.display.PlaggcageDisplayItem;

public class PlaggcageDisplayModel extends GeoModel<PlaggcageDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PlaggcageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "animations/plaggcage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlaggcageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "geo/plaggcage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlaggcageDisplayItem entity) {
		return new ResourceLocation("illiasringaddon", "textures/block/plaggcage.png");
	}
}
