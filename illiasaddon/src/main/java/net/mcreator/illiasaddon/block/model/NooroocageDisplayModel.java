package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.display.NooroocageDisplayItem;

public class NooroocageDisplayModel extends GeoModel<NooroocageDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NooroocageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "animations/nooroocage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NooroocageDisplayItem animatable) {
		return new ResourceLocation("illiasringaddon", "geo/nooroocage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NooroocageDisplayItem entity) {
		return new ResourceLocation("illiasringaddon", "textures/block/nooroocage.png");
	}
}
