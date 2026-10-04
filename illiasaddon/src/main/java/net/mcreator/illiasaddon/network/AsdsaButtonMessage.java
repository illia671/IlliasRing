
package net.mcreator.illiasaddon.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.illiasaddon.world.inventory.AsdsaMenu;
import net.mcreator.illiasaddon.procedures.SdfdsProcedure;
import net.mcreator.illiasaddon.procedures.Musicladybug3PlayProcedure;
import net.mcreator.illiasaddon.procedures.MusickLdybug1StopProcedure;
import net.mcreator.illiasaddon.procedures.MusickLadybug1playProcedure;
import net.mcreator.illiasaddon.procedures.MusicLadyBug5PlayProcedure;
import net.mcreator.illiasaddon.procedures.MusicLadyBug4PlayProcedure;
import net.mcreator.illiasaddon.procedures.DfgfgProcedure;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AsdsaButtonMessage {
	private final int buttonID, x, y, z;
	private HashMap<String, String> textstate;

	public AsdsaButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.textstate = readTextState(buffer);
	}

	public AsdsaButtonMessage(int buttonID, int x, int y, int z, HashMap<String, String> textstate) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.textstate = textstate;

	}

	public static void buffer(AsdsaButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		writeTextState(message.textstate, buffer);
	}

	public static void handler(AsdsaButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			HashMap<String, String> textstate = message.textstate;
			handleButtonAction(entity, buttonID, x, y, z, textstate);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z, HashMap<String, String> textstate) {
		Level world = entity.level();
		HashMap guistate = AsdsaMenu.guistate;
		for (Map.Entry<String, String> entry : textstate.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			guistate.put(key, value);
		}
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			DfgfgProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			MusickLdybug1StopProcedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			MusickLadybug1playProcedure.execute(world, x, y, z);
		}
		if (buttonID == 3) {

			SdfdsProcedure.execute(world, x, y, z);
		}
		if (buttonID == 4) {

			MusickLdybug1StopProcedure.execute(world, x, y, z);
		}
		if (buttonID == 5) {

			Musicladybug3PlayProcedure.execute(world, x, y, z);
		}
		if (buttonID == 6) {

			MusicLadyBug4PlayProcedure.execute(world, x, y, z);
		}
		if (buttonID == 7) {

			MusicLadyBug5PlayProcedure.execute(world, x, y, z);
		}
		if (buttonID == 10) {

			MusickLdybug1StopProcedure.execute(world, x, y, z);
		}
		if (buttonID == 11) {

			MusickLdybug1StopProcedure.execute(world, x, y, z);
		}
		if (buttonID == 12) {

			MusickLdybug1StopProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		IlliasringaddonMod.addNetworkMessage(AsdsaButtonMessage.class, AsdsaButtonMessage::buffer, AsdsaButtonMessage::new, AsdsaButtonMessage::handler);
	}

	public static void writeTextState(HashMap<String, String> map, FriendlyByteBuf buffer) {
		buffer.writeInt(map.size());
		for (Map.Entry<String, String> entry : map.entrySet()) {
			buffer.writeComponent(Component.literal(entry.getKey()));
			buffer.writeComponent(Component.literal(entry.getValue()));
		}
	}

	public static HashMap<String, String> readTextState(FriendlyByteBuf buffer) {
		int size = buffer.readInt();
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < size; i++) {
			String key = buffer.readComponent().getString();
			String value = buffer.readComponent().getString();
			map.put(key, value);
		}
		return map;
	}
}
