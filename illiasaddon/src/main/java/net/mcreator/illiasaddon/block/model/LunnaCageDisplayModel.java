package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.display.LunnaCageDisplayItem;

public class LunnaCageDisplayModel extends GeoModel<LunnaCageDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LunnaCageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "animations/lunnacage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LunnaCageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "geo/lunnacage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LunnaCageDisplayItem entity) {
		return new ResourceLocation("illiasringaddon", "textures/block/lunnacage.png");
	}
}
