package net.mcreator.illiasaddon.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.block.model.LunnaCageDisplayModel;
import net.mcreator.illiasaddon.block.display.LunnaCageDisplayItem;

public class LunnaCageDisplayItemRenderer extends GeoItemRenderer<LunnaCageDisplayItem> {
	public LunnaCageDisplayItemRenderer() {
		super(new LunnaCageDisplayModel());
	}

	@Override
	public RenderType getRenderType(LunnaCageDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
