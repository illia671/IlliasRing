package net.mcreator.illiasaddon.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.illiasaddon.init.IlliasringaddonModBlockEntities;
import net.mcreator.illiasaddon.block.renderer.WayzzCageTileRenderer;
import net.mcreator.illiasaddon.block.renderer.TrixxcageTileRenderer;
import net.mcreator.illiasaddon.block.renderer.PollenCageTileRenderer;
import net.mcreator.illiasaddon.block.renderer.PlaggcageTileRenderer;
import net.mcreator.illiasaddon.block.renderer.NooroocageTileRenderer;
import net.mcreator.illiasaddon.block.renderer.MeyShiCageTileRenderer;
import net.mcreator.illiasaddon.block.renderer.LunnaCageTileRenderer;
import net.mcreator.illiasaddon.block.renderer.CreationcageTileRenderer;
import net.mcreator.illiasaddon.IlliasringaddonMod;

@Mod.EventBusSubscriber(modid = IlliasringaddonMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(IlliasringaddonModBlockEntities.CREATIONCAGE.get(), context -> new CreationcageTileRenderer());
		event.registerBlockEntityRenderer(IlliasringaddonModBlockEntities.TRIXX_CAGE.get(), context -> new TrixxcageTileRenderer());
		event.registerBlockEntityRenderer(IlliasringaddonModBlockEntities.PLAGG_CAGE.get(), context -> new PlaggcageTileRenderer());
		event.registerBlockEntityRenderer(IlliasringaddonModBlockEntities.NOOROO_CAGE.get(), context -> new NooroocageTileRenderer());
		event.registerBlockEntityRenderer(IlliasringaddonModBlockEntities.POLLEN_CAGE.get(), context -> new PollenCageTileRenderer());
		event.registerBlockEntityRenderer(IlliasringaddonModBlockEntities.LUUNA_CAGE.get(), context -> new LunnaCageTileRenderer());
		event.registerBlockEntityRenderer(IlliasringaddonModBlockEntities.MEI_SHI_CAGE.get(), context -> new MeyShiCageTileRenderer());
		event.registerBlockEntityRenderer(IlliasringaddonModBlockEntities.WAYZZ_CAGE.get(), context -> new WayzzCageTileRenderer());
	}
}
