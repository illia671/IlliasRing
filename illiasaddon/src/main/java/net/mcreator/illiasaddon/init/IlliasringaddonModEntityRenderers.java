
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.illiasaddon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.illiasaddon.client.renderer.WayzzEffectRenderer;
import net.mcreator.illiasaddon.client.renderer.TrixxEffectRenderer;
import net.mcreator.illiasaddon.client.renderer.TikkiEffectRenderer;
import net.mcreator.illiasaddon.client.renderer.SassEffectRenderer;
import net.mcreator.illiasaddon.client.renderer.PollenEffectRenderer;
import net.mcreator.illiasaddon.client.renderer.PlaggEffectRenderer;
import net.mcreator.illiasaddon.client.renderer.NoorooEffectRenderer;
import net.mcreator.illiasaddon.client.renderer.DussuEffectRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class IlliasringaddonModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(IlliasringaddonModEntities.TIKKI_EFFECT.get(), TikkiEffectRenderer::new);
		event.registerEntityRenderer(IlliasringaddonModEntities.TRIXX_EFFECT.get(), TrixxEffectRenderer::new);
		event.registerEntityRenderer(IlliasringaddonModEntities.NOOROO_EFFECT.get(), NoorooEffectRenderer::new);
		event.registerEntityRenderer(IlliasringaddonModEntities.DUSSU_EFFECT.get(), DussuEffectRenderer::new);
		event.registerEntityRenderer(IlliasringaddonModEntities.PLAGG_EFFECT.get(), PlaggEffectRenderer::new);
		event.registerEntityRenderer(IlliasringaddonModEntities.POLLEN_EFFECT.get(), PollenEffectRenderer::new);
		event.registerEntityRenderer(IlliasringaddonModEntities.WAYZZ_EFFECT.get(), WayzzEffectRenderer::new);
		event.registerEntityRenderer(IlliasringaddonModEntities.SASS_EFFECT.get(), SassEffectRenderer::new);
	}
}
