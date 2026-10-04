
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.illiasaddon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.illiasaddon.client.model.Modelwolf_ring_equiped;
import net.mcreator.illiasaddon.client.model.Modelturtle_ring_equiped;
import net.mcreator.illiasaddon.client.model.Modelspirit_ring_equiped;
import net.mcreator.illiasaddon.client.model.Modelshadyphoex;
import net.mcreator.illiasaddon.client.model.Modelphoenixguard;
import net.mcreator.illiasaddon.client.model.Modelmrfire;
import net.mcreator.illiasaddon.client.model.Modelmonarch_ring_protaction_slim;
import net.mcreator.illiasaddon.client.model.Modelmonarch_ring_nooroo_slim;
import net.mcreator.illiasaddon.client.model.Modelmonarch_ring_illusion_slim;
import net.mcreator.illiasaddon.client.model.Modelmonarch_ring_e_wolf_slim;
import net.mcreator.illiasaddon.client.model.Modelmonarch_ring_e_spirit_slim;
import net.mcreator.illiasaddon.client.model.Modelmonarch_ring_destruction_slim;
import net.mcreator.illiasaddon.client.model.Modelmonarch_ring_creation_slim;
import net.mcreator.illiasaddon.client.model.Modelmonarch_ring_action_slim;
import net.mcreator.illiasaddon.client.model.Modelladybug_ring_equiped;
import net.mcreator.illiasaddon.client.model.Modelfox_ring_equiped;
import net.mcreator.illiasaddon.client.model.Modelcat_ring_equiped;
import net.mcreator.illiasaddon.client.model.Modelbuttefly_ring_equiped;
import net.mcreator.illiasaddon.client.model.Modelbee_ring_equiped;
import net.mcreator.illiasaddon.client.model.Modelbase;
import net.mcreator.illiasaddon.client.model.ModelLadyPhox;
import net.mcreator.illiasaddon.client.model.ModelDefolstAlliance_Converted;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class IlliasringaddonModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbase.LAYER_LOCATION, Modelbase::createBodyLayer);
		event.registerLayerDefinition(Modelmonarch_ring_e_wolf_slim.LAYER_LOCATION, Modelmonarch_ring_e_wolf_slim::createBodyLayer);
		event.registerLayerDefinition(Modelbee_ring_equiped.LAYER_LOCATION, Modelbee_ring_equiped::createBodyLayer);
		event.registerLayerDefinition(Modelphoenixguard.LAYER_LOCATION, Modelphoenixguard::createBodyLayer);
		event.registerLayerDefinition(Modelmonarch_ring_destruction_slim.LAYER_LOCATION, Modelmonarch_ring_destruction_slim::createBodyLayer);
		event.registerLayerDefinition(Modelmonarch_ring_action_slim.LAYER_LOCATION, Modelmonarch_ring_action_slim::createBodyLayer);
		event.registerLayerDefinition(Modelshadyphoex.LAYER_LOCATION, Modelshadyphoex::createBodyLayer);
		event.registerLayerDefinition(Modelbuttefly_ring_equiped.LAYER_LOCATION, Modelbuttefly_ring_equiped::createBodyLayer);
		event.registerLayerDefinition(Modelcat_ring_equiped.LAYER_LOCATION, Modelcat_ring_equiped::createBodyLayer);
		event.registerLayerDefinition(Modelmrfire.LAYER_LOCATION, Modelmrfire::createBodyLayer);
		event.registerLayerDefinition(Modelmonarch_ring_e_spirit_slim.LAYER_LOCATION, Modelmonarch_ring_e_spirit_slim::createBodyLayer);
		event.registerLayerDefinition(Modelfox_ring_equiped.LAYER_LOCATION, Modelfox_ring_equiped::createBodyLayer);
		event.registerLayerDefinition(Modelmonarch_ring_creation_slim.LAYER_LOCATION, Modelmonarch_ring_creation_slim::createBodyLayer);
		event.registerLayerDefinition(ModelLadyPhox.LAYER_LOCATION, ModelLadyPhox::createBodyLayer);
		event.registerLayerDefinition(Modelturtle_ring_equiped.LAYER_LOCATION, Modelturtle_ring_equiped::createBodyLayer);
		event.registerLayerDefinition(Modelmonarch_ring_protaction_slim.LAYER_LOCATION, Modelmonarch_ring_protaction_slim::createBodyLayer);
		event.registerLayerDefinition(Modelwolf_ring_equiped.LAYER_LOCATION, Modelwolf_ring_equiped::createBodyLayer);
		event.registerLayerDefinition(Modelmonarch_ring_nooroo_slim.LAYER_LOCATION, Modelmonarch_ring_nooroo_slim::createBodyLayer);
		event.registerLayerDefinition(Modelspirit_ring_equiped.LAYER_LOCATION, Modelspirit_ring_equiped::createBodyLayer);
		event.registerLayerDefinition(Modelmonarch_ring_illusion_slim.LAYER_LOCATION, Modelmonarch_ring_illusion_slim::createBodyLayer);
		event.registerLayerDefinition(ModelDefolstAlliance_Converted.LAYER_LOCATION, ModelDefolstAlliance_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelladybug_ring_equiped.LAYER_LOCATION, Modelladybug_ring_equiped::createBodyLayer);
	}
}
