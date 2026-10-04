
package net.mcreator.illiasaddon.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.illiasaddon.entity.model.NoorooEffectModel;
import net.mcreator.illiasaddon.entity.layer.NoorooEffectLayer;
import net.mcreator.illiasaddon.entity.NoorooEffectEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NoorooEffectRenderer extends GeoEntityRenderer<NoorooEffectEntity> {
	public NoorooEffectRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new NoorooEffectModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new NoorooEffectLayer(this));
	}

	@Override
	public RenderType getRenderType(NoorooEffectEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.eyes(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, NoorooEffectEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
