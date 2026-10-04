package net.mcreator.illiasaddon.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.entity.NoorooEffectEntity;

public class NoorooEffectModel extends GeoModel<NoorooEffectEntity> {
	@Override
	public ResourceLocation getAnimationResource(NoorooEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "animations/newanimationtikki.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NoorooEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "geo/newanimationtikki.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NoorooEffectEntity entity) {
		return new ResourceLocation("illiasringaddon", "textures/entities/" + entity.getTexture() + ".png");
	}

}
