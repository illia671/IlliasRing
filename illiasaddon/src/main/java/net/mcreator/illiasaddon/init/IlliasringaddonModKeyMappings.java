
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.illiasaddon.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.illiasaddon.network.OpenGuiMessage;
import net.mcreator.illiasaddon.network.NextPageRingMessage;
import net.mcreator.illiasaddon.network.ClearListMessage;
import net.mcreator.illiasaddon.IlliasringaddonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class IlliasringaddonModKeyMappings {
	public static final KeyMapping OPEN_GUI = new KeyMapping("key.illiasringaddon.open_gui", GLFW.GLFW_KEY_N, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new OpenGuiMessage(0, 0));
				OpenGuiMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping NEXT_PAGE_RING = new KeyMapping("key.illiasringaddon.next_page_ring", GLFW.GLFW_KEY_B, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new NextPageRingMessage(0, 0));
				NextPageRingMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping CLEAR_LIST = new KeyMapping("key.illiasringaddon.clear_list", GLFW.GLFW_KEY_C, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new ClearListMessage(0, 0));
				ClearListMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(OPEN_GUI);
		event.register(NEXT_PAGE_RING);
		event.register(CLEAR_LIST);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				OPEN_GUI.consumeClick();
				NEXT_PAGE_RING.consumeClick();
				CLEAR_LIST.consumeClick();
			}
		}
	}
}
