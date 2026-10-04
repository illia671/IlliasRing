package net.mcreator.illiasaddon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.entity.SassEffectEntity;

public class SassEffectModel extends GeoModel<SassEffectEntity> {
	@Override
	public ResourceLocation getAnimationResource(SassEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "animations/newanimationtikki.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SassEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "geo/newanimationtikki.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SassEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
