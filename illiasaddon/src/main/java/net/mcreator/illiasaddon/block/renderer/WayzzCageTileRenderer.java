package net.mcreator.illiasaddon.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.block.model.WayzzCageBlockModel;
import net.mcreator.illiasaddon.block.entity.WayzzCageTileEntity;

public class WayzzCageTileRenderer extends GeoBlockRenderer<WayzzCageTileEntity> {
	public WayzzCageTileRenderer() {
		super(new WayzzCageBlockModel());
	}

	@Override
	public RenderType getRenderType(WayzzCageTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
