package net.mcreator.illiasaddon.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.block.model.CreationcageBlockModel;
import net.mcreator.illiasaddon.block.entity.CreationcageTileEntity;

public class CreationcageTileRenderer extends GeoBlockRenderer<CreationcageTileEntity> {
	public CreationcageTileRenderer() {
		super(new CreationcageBlockModel());
	}

	@Override
	public RenderType getRenderType(CreationcageTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
