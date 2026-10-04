package net.mcreator.illiasaddon.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.illiasaddon.block.entity.NooroocageTileEntity;

public class NooroocageBlockModel extends GeoModel<NooroocageTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NooroocageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "animations/nooroocage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NooroocageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "geo/nooroocage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NooroocageTileEntity animatable) {
		return new ResourceLocation("illiasringaddon", "textures/block/nooroocage.png");
	}
}
