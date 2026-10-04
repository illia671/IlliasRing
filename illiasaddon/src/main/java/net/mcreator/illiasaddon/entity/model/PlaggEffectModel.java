package net.mcreator.illiasaddon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.entity.PlaggEffectEntity;

public class PlaggEffectModel extends GeoModel<PlaggEffectEntity> {
	@Override
	public ResourceLocation getAnimationResource(PlaggEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "animations/newanimationtikki.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlaggEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "geo/newanimationtikki.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlaggEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
