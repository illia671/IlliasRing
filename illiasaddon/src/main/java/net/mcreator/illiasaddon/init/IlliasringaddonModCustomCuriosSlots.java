package net.mcreator.illiasaddon.init;

import top.theillusivec4.curios.api.SlotTypeMessage;

import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IlliasringaddonModCustomCuriosSlots {
	@SubscribeEvent
	public static void enqueueIMC(final InterModEnqueueEvent event) {
		InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("alliance_creation_slot").icon(new ResourceLocation("curios:slot/cat_ring_slot")).size(1).build());
		InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("alliance_protection_slot").icon(new ResourceLocation("curios:slot/cat_ring_slot")).size(1).build());
		InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("alliance_action_slot").icon(new ResourceLocation("curios:slot/cat_ring_slot")).size(1).build());
		InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("alliance_destruction_slot").icon(new ResourceLocation("curios:slot/cat_ring_slot")).size(1).build());
		InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("alliance_transmission_slot").icon(new ResourceLocation("curios:slot/cat_ring_slot")).size(1).build());
		InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("alliance_illusion_slot").icon(new ResourceLocation("curios:slot/cat_ring_slot")).size(1).build());
	}
}
