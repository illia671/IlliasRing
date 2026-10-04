
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

import net.mcreator.illiasaddon.world.inventory.Alliance8Menu;
import net.mcreator.illiasaddon.procedures.SetHeadAlliance9Procedure;
import net.mcreator.illiasaddon.procedures.SetHeadAlliance8Procedure;
import net.mcreator.illiasaddon.procedures.SetHeadAlliance7Procedure;
import net.mcreator.illiasaddon.procedures.SetHeadAlliance6Procedure;
import net.mcreator.illiasaddon.procedures.SetHeadAlliance5Procedure;
import net.mcreator.illiasaddon.procedures.SetHeadAlliance4Procedure;
import net.mcreator.illiasaddon.procedures.SetHeadAlliance3Procedure;
import net.mcreator.illiasaddon.procedures.SetHeadAlliance2Procedure;
import net.mcreator.illiasaddon.procedures.SetHeadAlliance1Procedure;
import net.mcreator.illiasaddon.procedures.SetHeadAlliance10Procedure;
import net.mcreator.illiasaddon.procedures.SetHeadAlliance0Procedure;
import net.mcreator.illiasaddon.procedures.OpenAlliance9Procedure;
import net.mcreator.illiasaddon.procedures.OpenAlliance2Procedure;
import net.mcreator.illiasaddon.procedures.OpenAlliance1Procedure;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Alliance8ButtonMessage {
	private final int buttonID, x, y, z;
	private HashMap<String, String> textstate;

	public Alliance8ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.textstate = readTextState(buffer);
	}

	public Alliance8ButtonMessage(int buttonID, int x, int y, int z, HashMap<String, String> textstate) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.textstate = textstate;

	}

	public static void buffer(Alliance8ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		writeTextState(message.textstate, buffer);
	}

	public static void handler(Alliance8ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = Alliance8Menu.guistate;
		for (Map.Entry<String, String> entry : textstate.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			guistate.put(key, value);
		}
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenAlliance9Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenAlliance2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenAlliance1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			SetHeadAlliance1Procedure.execute(entity);
		}
		if (buttonID == 4) {

			SetHeadAlliance1Procedure.execute(entity);
		}
		if (buttonID == 5) {

			SetHeadAlliance4Procedure.execute(entity);
		}
		if (buttonID == 6) {

			SetHeadAlliance5Procedure.execute(entity);
		}
		if (buttonID == 7) {

			SetHeadAlliance6Procedure.execute(entity);
		}
		if (buttonID == 8) {

			SetHeadAlliance7Procedure.execute(entity);
		}
		if (buttonID == 9) {

			SetHeadAlliance9Procedure.execute(entity);
		}
		if (buttonID == 10) {

			SetHeadAlliance10Procedure.execute(entity);
		}
		if (buttonID == 11) {

			SetHeadAlliance0Procedure.execute(entity);
		}
		if (buttonID == 12) {

			SetHeadAlliance0Procedure.execute(entity);
		}
		if (buttonID == 13) {

			SetHeadAlliance2Procedure.execute(entity);
		}
		if (buttonID == 14) {

			SetHeadAlliance8Procedure.execute(entity);
		}
		if (buttonID == 15) {

			SetHeadAlliance3Procedure.execute(entity);
		}
		if (buttonID == 16) {

			SetHeadAlliance2Procedure.execute(entity);
		}
		if (buttonID == 18) {

			SetHeadAlliance3Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		IlliasringaddonMod.addNetworkMessage(Alliance8ButtonMessage.class, Alliance8ButtonMessage::buffer, Alliance8ButtonMessage::new, Alliance8ButtonMessage::handler);
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
