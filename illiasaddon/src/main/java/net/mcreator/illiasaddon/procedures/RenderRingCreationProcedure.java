package net.mcreator.illiasaddon.procedures;

import top.theillusivec4.curios.api.CuriosApi;

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
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.illiasaddon.init.IlliasringaddonModItems;
import net.mcreator.illiasaddon.client.model.Modelturtle_ring_equiped;
import net.mcreator.illiasaddon.client.model.Modelmonarch_ring_protaction_slim;
import net.mcreator.illiasaddon.client.model.Modelmonarch_ring_nooroo_slim;
import net.mcreator.illiasaddon.client.model.Modelmonarch_ring_illusion_slim;
import net.mcreator.illiasaddon.client.model.Modelmonarch_ring_destruction_slim;
import net.mcreator.illiasaddon.client.model.Modelmonarch_ring_creation_slim;
import net.mcreator.illiasaddon.client.model.Modelmonarch_ring_action_slim;
import net.mcreator.illiasaddon.client.model.Modelladybug_ring_equiped;
import net.mcreator.illiasaddon.client.model.Modelfox_ring_equiped;
import net.mcreator.illiasaddon.client.model.Modelcat_ring_equiped;
import net.mcreator.illiasaddon.client.model.Modelbuttefly_ring_equiped;
import net.mcreator.illiasaddon.client.model.Modelbee_ring_equiped;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class RenderRingCreationProcedure {
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
		if (_evtEntity instanceof AbstractClientPlayer ? ((AbstractClientPlayer) _evtEntity).getModelName().equals("slim") : false) {
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.CREATION_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/ladybug_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/ladybug_ring_equiped.png");
					}
					Modelmonarch_ring_creation_slim newModel = new Modelmonarch_ring_creation_slim(context.bakeLayer(Modelmonarch_ring_creation_slim.LAYER_LOCATION));
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
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.DESTRUCTION_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/cat_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/cat_ring_equiped.png");
					}
					Modelmonarch_ring_destruction_slim newModel = new Modelmonarch_ring_destruction_slim(context.bakeLayer(Modelmonarch_ring_destruction_slim.LAYER_LOCATION));
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
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.PROTECTION_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/turtle_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/turtle_ring_equiped.png");
					}
					Modelmonarch_ring_protaction_slim newModel = new Modelmonarch_ring_protaction_slim(context.bakeLayer(Modelmonarch_ring_protaction_slim.LAYER_LOCATION));
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
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.ACTION_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/bee_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/bee_ring_equiped.png");
					}
					Modelmonarch_ring_action_slim newModel = new Modelmonarch_ring_action_slim(context.bakeLayer(Modelmonarch_ring_action_slim.LAYER_LOCATION));
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
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.SPIRIT_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/spirit_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/spirit_ring_equiped.png");
					}
					Modelmonarch_ring_destruction_slim newModel = new Modelmonarch_ring_destruction_slim(context.bakeLayer(Modelmonarch_ring_destruction_slim.LAYER_LOCATION));
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
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.WOLF_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/wolf_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/wolf_ring_equiped.png");
					}
					Modelmonarch_ring_creation_slim newModel = new Modelmonarch_ring_creation_slim(context.bakeLayer(Modelmonarch_ring_creation_slim.LAYER_LOCATION));
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
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.TRANSMISSION_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/butterfly_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/butterfly_ring_equiped.png");
					}
					Modelmonarch_ring_nooroo_slim newModel = new Modelmonarch_ring_nooroo_slim(context.bakeLayer(Modelmonarch_ring_nooroo_slim.LAYER_LOCATION));
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
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.ILLUSION_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/fox_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/fox_ring_equiped.png");
					}
					Modelmonarch_ring_illusion_slim newModel = new Modelmonarch_ring_illusion_slim(context.bakeLayer(Modelmonarch_ring_illusion_slim.LAYER_LOCATION));
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
		} else {
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.CREATION_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/ladybug_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/ladybug_ring_equiped.png");
					}
					Modelladybug_ring_equiped newModel = new Modelladybug_ring_equiped(context.bakeLayer(Modelladybug_ring_equiped.LAYER_LOCATION));
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
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.DESTRUCTION_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/cat_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/cat_ring_equiped.png");
					}
					Modelcat_ring_equiped newModel = new Modelcat_ring_equiped(context.bakeLayer(Modelcat_ring_equiped.LAYER_LOCATION));
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
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.PROTECTION_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/turtle_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/turtle_ring_equiped.png");
					}
					Modelturtle_ring_equiped newModel = new Modelturtle_ring_equiped(context.bakeLayer(Modelturtle_ring_equiped.LAYER_LOCATION));
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
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.ACTION_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/bee_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/bee_ring_equiped.png");
					}
					Modelbee_ring_equiped newModel = new Modelbee_ring_equiped(context.bakeLayer(Modelbee_ring_equiped.LAYER_LOCATION));
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
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.SPIRIT_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/spirit_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/spirit_ring_equiped.png");
					}
					Modelcat_ring_equiped newModel = new Modelcat_ring_equiped(context.bakeLayer(Modelcat_ring_equiped.LAYER_LOCATION));
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
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.WOLF_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/wolf_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/wolf_ring_equiped.png");
					}
					Modelladybug_ring_equiped newModel = new Modelladybug_ring_equiped(context.bakeLayer(Modelladybug_ring_equiped.LAYER_LOCATION));
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
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.TRANSMISSION_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/butterfly_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/butterfly_ring_equiped.png");
					}
					Modelbuttefly_ring_equiped newModel = new Modelbuttefly_ring_equiped(context.bakeLayer(Modelbuttefly_ring_equiped.LAYER_LOCATION));
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
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(IlliasringaddonModItems.ILLUSION_ALLIANCE.get(), lv).isPresent() : false) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("illiasringaddon:textures/entities/fox_ring_equiped.png") != null) {
						_texture = new ResourceLocation("illiasringaddon:textures/entities/fox_ring_equiped.png");
					}
					Modelfox_ring_equiped newModel = new Modelfox_ring_equiped(context.bakeLayer(Modelfox_ring_equiped.LAYER_LOCATION));
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
}
