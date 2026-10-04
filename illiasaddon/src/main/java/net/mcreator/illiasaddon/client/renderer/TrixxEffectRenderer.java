
package net.mcreator.illiasaddon.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.entity.model.TrixxEffectModel;
import net.mcreator.illiasaddon.entity.layer.TrixxEffectLayer;
import net.mcreator.illiasaddon.entity.TrixxEffectEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TrixxEffectRenderer extends GeoEntityRenderer<TrixxEffectEntity> {
	public TrixxEffectRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TrixxEffectModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new TrixxEffectLayer(this));
	}

	@Override
	public RenderType getRenderType(TrixxEffectEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.eyes(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, TrixxEffectEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
