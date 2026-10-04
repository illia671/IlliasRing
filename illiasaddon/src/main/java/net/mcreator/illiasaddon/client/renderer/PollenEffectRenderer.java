
package net.mcreator.illiasaddon.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.entity.model.PollenEffectModel;
import net.mcreator.illiasaddon.entity.layer.PollenEffectLayer;
import net.mcreator.illiasaddon.entity.PollenEffectEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PollenEffectRenderer extends GeoEntityRenderer<PollenEffectEntity> {
	public PollenEffectRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PollenEffectModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new PollenEffectLayer(this));
	}

	@Override
	public RenderType getRenderType(PollenEffectEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.eyes(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, PollenEffectEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
