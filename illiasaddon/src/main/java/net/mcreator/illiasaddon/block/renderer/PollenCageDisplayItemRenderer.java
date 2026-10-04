package net.mcreator.illiasaddon.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.block.model.PollenCageDisplayModel;
import net.mcreator.illiasaddon.block.display.PollenCageDisplayItem;

public class PollenCageDisplayItemRenderer extends GeoItemRenderer<PollenCageDisplayItem> {
	public PollenCageDisplayItemRenderer() {
		super(new PollenCageDisplayModel());
	}

	@Override
	public RenderType getRenderType(PollenCageDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
