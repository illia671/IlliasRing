package net.mcreator.illiasaddon.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.block.model.MeyShiCageDisplayModel;
import net.mcreator.illiasaddon.block.display.MeyShiCageDisplayItem;

public class MeyShiCageDisplayItemRenderer extends GeoItemRenderer<MeyShiCageDisplayItem> {
	public MeyShiCageDisplayItemRenderer() {
		super(new MeyShiCageDisplayModel());
	}

	@Override
	public RenderType getRenderType(MeyShiCageDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
