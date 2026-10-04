package net.mcreator.illiasaddon.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.block.model.PlaggcageDisplayModel;
import net.mcreator.illiasaddon.block.display.PlaggcageDisplayItem;

public class PlaggcageDisplayItemRenderer extends GeoItemRenderer<PlaggcageDisplayItem> {
	public PlaggcageDisplayItemRenderer() {
		super(new PlaggcageDisplayModel());
	}

	@Override
	public RenderType getRenderType(PlaggcageDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
