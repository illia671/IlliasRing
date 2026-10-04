
package net.mcreator.illiasaddon.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.entity.model.TikkiEffectModel;
import net.mcreator.illiasaddon.entity.layer.TikkiEffectLayer;
import net.mcreator.illiasaddon.entity.TikkiEffectEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TikkiEffectRenderer extends GeoEntityRenderer<TikkiEffectEntity> {
	public TikkiEffectRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TikkiEffectModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new TikkiEffectLayer(this));
	}

	@Override
	public RenderType getRenderType(TikkiEffectEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.eyes(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, TikkiEffectEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
