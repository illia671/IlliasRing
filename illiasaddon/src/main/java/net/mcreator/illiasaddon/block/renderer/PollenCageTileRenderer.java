package net.mcreator.illiasaddon.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.block.model.PollenCageBlockModel;
import net.mcreator.illiasaddon.block.entity.PollenCageTileEntity;

public class PollenCageTileRenderer extends GeoBlockRenderer<PollenCageTileEntity> {
	public PollenCageTileRenderer() {
		super(new PollenCageBlockModel());
	}

	@Override
	public RenderType getRenderType(PollenCageTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
