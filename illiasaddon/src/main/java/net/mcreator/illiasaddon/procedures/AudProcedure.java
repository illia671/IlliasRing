package net.mcreator.illiasaddon.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.illiasaddon.init.IlliasringaddonModMobEffects;
import net.mcreator.illiasaddon.client.model.Modelbase;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class AudProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(RenderLivingEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		RenderLivingEvent _evt = (RenderLivingEvent) event;
		Minecraft mc = Minecraft.getInstance();
		EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
		EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
		Entity _evtEntity = _evt.getEntity();
		PlayerRenderer _pr = null;
		PoseStack poseStack = _evt.getPoseStack();
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/empty.png");
			com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer emptyRenderer = new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context,
					(_evtEntity instanceof AbstractClientPlayer ? ((AbstractClientPlayer) _evtEntity).getModelName().equals("slim") : false), _texture);
			_pr = emptyRenderer;
			emptyRenderer.clearLayers();
			emptyRenderer.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
		}
		float partialTicks = (float) _evt.getPartialTick();
		float ageInTicks = _evt.getEntity().tickCount + partialTicks;
		boolean glow = false;
		int packedLight = glow ? LightTexture.FULL_BRIGHT : _evt.getPackedLight();
		MultiBufferSource renderType = rt -> _evt.getMultiBufferSource().getBuffer(RenderType.entitySolid(new ResourceLocation("kleiders_custom_renderer:textures/entities/empty.png")));
		MultiBufferSource swirl = st -> _evt.getMultiBufferSource().getBuffer(RenderType.energySwirl(new ResourceLocation("kleiders_custom_renderer:textures/entities/empty.png"), 0, 0));
		if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(IlliasringaddonModMobEffects.HYPNOSIS.get())) {
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse("illiasringaddon:textures/entities/cobracamofelix.png") != null) {
					_texture = new ResourceLocation("illiasringaddon:textures/entities/cobracamofelix.png");
				}
				Modelbase newModel = new Modelbase(context.bakeLayer(Modelbase.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
	}
}
