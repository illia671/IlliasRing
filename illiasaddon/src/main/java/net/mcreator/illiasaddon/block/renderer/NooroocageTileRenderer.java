package net.mcreator.illiasaddon.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.block.model.NooroocageBlockModel;
import net.mcreator.illiasaddon.block.entity.NooroocageTileEntity;

public class NooroocageTileRenderer extends GeoBlockRenderer<NooroocageTileEntity> {
	public NooroocageTileRenderer() {
		super(new NooroocageBlockModel());
	}

	@Override
	public RenderType getRenderType(NooroocageTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
