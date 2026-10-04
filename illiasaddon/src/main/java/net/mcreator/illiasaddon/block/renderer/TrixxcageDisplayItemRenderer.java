package net.mcreator.illiasaddon.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.block.model.TrixxcageDisplayModel;
import net.mcreator.illiasaddon.block.display.TrixxcageDisplayItem;

public class TrixxcageDisplayItemRenderer extends GeoItemRenderer<TrixxcageDisplayItem> {
	public TrixxcageDisplayItemRenderer() {
		super(new TrixxcageDisplayModel());
	}

	@Override
	public RenderType getRenderType(TrixxcageDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
