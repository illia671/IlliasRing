package net.mcreator.illiasaddon.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.block.model.MeyShiCageBlockModel;
import net.mcreator.illiasaddon.block.entity.MeyShiCageTileEntity;

public class MeyShiCageTileRenderer extends GeoBlockRenderer<MeyShiCageTileEntity> {
	public MeyShiCageTileRenderer() {
		super(new MeyShiCageBlockModel());
	}

	@Override
	public RenderType getRenderType(MeyShiCageTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
