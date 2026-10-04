package net.mcreator.illiasaddon.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.block.model.CreationcageDisplayModel;
import net.mcreator.illiasaddon.block.display.CreationcageDisplayItem;

public class CreationcageDisplayItemRenderer extends GeoItemRenderer<CreationcageDisplayItem> {
	public CreationcageDisplayItemRenderer() {
		super(new CreationcageDisplayModel());
	}

	@Override
	public RenderType getRenderType(CreationcageDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
