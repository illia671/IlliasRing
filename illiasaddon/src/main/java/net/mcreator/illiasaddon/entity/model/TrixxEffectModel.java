package net.mcreator.illiasaddon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.entity.TrixxEffectEntity;

public class TrixxEffectModel extends GeoModel<TrixxEffectEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrixxEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "animations/newanimationtikki.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrixxEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "geo/newanimationtikki.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrixxEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
