package net.mcreator.illiasaddon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.entity.TikkiEffectEntity;

public class TikkiEffectModel extends GeoModel<TikkiEffectEntity> {
	@Override
	public ResourceLocation getAnimationResource(TikkiEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "animations/newanimationtikki.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TikkiEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "geo/newanimationtikki.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TikkiEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
