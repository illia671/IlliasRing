package net.mcreator.illiasaddon.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.block.model.WayzzCageDisplayModel;
import net.mcreator.illiasaddon.block.display.WayzzCageDisplayItem;

public class WayzzCageDisplayItemRenderer extends GeoItemRenderer<WayzzCageDisplayItem> {
	public WayzzCageDisplayItemRenderer() {
		super(new WayzzCageDisplayModel());
	}

	@Override
	public RenderType getRenderType(WayzzCageDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
