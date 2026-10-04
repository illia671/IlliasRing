
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

import net.mcreator.illiasaddon.world.inventory.Alliance9Menu;
import net.mcreator.illiasaddon.procedures.SetCapAlliance2Procedure;
import net.mcreator.illiasaddon.procedures.SetCapAlliance1Procedure;
import net.mcreator.illiasaddon.procedures.SetCapAlliance0Procedure;
import net.mcreator.illiasaddon.procedures.OpenAlliance8Procedure;
import net.mcreator.illiasaddon.procedures.OpenAlliance2Procedure;
import net.mcreator.illiasaddon.procedures.OpenAlliance1Procedure;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Alliance9ButtonMessage {
	private final int buttonID, x, y, z;
	private HashMap<String, String> textstate;

	public Alliance9ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.textstate = readTextState(buffer);
	}

	public Alliance9ButtonMessage(int buttonID, int x, int y, int z, HashMap<String, String> textstate) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.textstate = textstate;

	}

	public static void buffer(Alliance9ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		writeTextState(message.textstate, buffer);
	}

	public static void handler(Alliance9ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = Alliance9Menu.guistate;
		for (Map.Entry<String, String> entry : textstate.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			guistate.put(key, value);
		}
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenAlliance8Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenAlliance2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenAlliance1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			SetCapAlliance0Procedure.execute(entity);
		}
		if (buttonID == 4) {

			SetCapAlliance2Procedure.execute(entity);
		}
		if (buttonID == 5) {

			SetCapAlliance1Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		IlliasringaddonMod.addNetworkMessage(Alliance9ButtonMessage.class, Alliance9ButtonMessage::buffer, Alliance9ButtonMessage::new, Alliance9ButtonMessage::handler);
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
