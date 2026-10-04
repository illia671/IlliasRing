
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

import net.mcreator.illiasaddon.world.inventory.Alliance2Menu;
import net.mcreator.illiasaddon.procedures.SetClothesAvatar9Procedure;
import net.mcreator.illiasaddon.procedures.SetClothesAvatar8Procedure;
import net.mcreator.illiasaddon.procedures.SetClothesAvatar7Procedure;
import net.mcreator.illiasaddon.procedures.SetClothesAvatar6Procedure;
import net.mcreator.illiasaddon.procedures.SetClothesAvatar5Procedure;
import net.mcreator.illiasaddon.procedures.SetClothesAvatar4Procedure;
import net.mcreator.illiasaddon.procedures.SetClothesAvatar3Procedure;
import net.mcreator.illiasaddon.procedures.SetClothesAvatar2Procedure;
import net.mcreator.illiasaddon.procedures.SetClothesAvatar1Procedure;
import net.mcreator.illiasaddon.procedures.SetClothesAvatar12Procedure;
import net.mcreator.illiasaddon.procedures.SetClothesAvatar11Procedure;
import net.mcreator.illiasaddon.procedures.SetClothesAvatar10Procedure;
import net.mcreator.illiasaddon.procedures.SetClothesAvatar0Procedure;
import net.mcreator.illiasaddon.procedures.OpenAlliance9Procedure;
import net.mcreator.illiasaddon.procedures.OpenAlliance8Procedure;
import net.mcreator.illiasaddon.procedures.OpenAlliance1Procedure;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Alliance2ButtonMessage {
	private final int buttonID, x, y, z;
	private HashMap<String, String> textstate;

	public Alliance2ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.textstate = readTextState(buffer);
	}

	public Alliance2ButtonMessage(int buttonID, int x, int y, int z, HashMap<String, String> textstate) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.textstate = textstate;

	}

	public static void buffer(Alliance2ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		writeTextState(message.textstate, buffer);
	}

	public static void handler(Alliance2ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = Alliance2Menu.guistate;
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

			OpenAlliance8Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenAlliance1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			SetClothesAvatar0Procedure.execute(entity);
		}
		if (buttonID == 4) {

			SetClothesAvatar2Procedure.execute(entity);
		}
		if (buttonID == 5) {

			SetClothesAvatar3Procedure.execute(entity);
		}
		if (buttonID == 6) {

			SetClothesAvatar6Procedure.execute(entity);
		}
		if (buttonID == 7) {

			SetClothesAvatar8Procedure.execute(entity);
		}
		if (buttonID == 8) {

			SetClothesAvatar7Procedure.execute(entity);
		}
		if (buttonID == 9) {

			SetClothesAvatar5Procedure.execute(entity);
		}
		if (buttonID == 10) {

			SetClothesAvatar4Procedure.execute(entity);
		}
		if (buttonID == 11) {

			SetClothesAvatar11Procedure.execute(entity);
		}
		if (buttonID == 12) {

			SetClothesAvatar12Procedure.execute(entity);
		}
		if (buttonID == 14) {

			SetClothesAvatar1Procedure.execute(entity);
		}
		if (buttonID == 22) {

			SetClothesAvatar10Procedure.execute(entity);
		}
		if (buttonID == 24) {

			SetClothesAvatar10Procedure.execute(entity);
		}
		if (buttonID == 25) {

			SetClothesAvatar9Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		IlliasringaddonMod.addNetworkMessage(Alliance2ButtonMessage.class, Alliance2ButtonMessage::buffer, Alliance2ButtonMessage::new, Alliance2ButtonMessage::handler);
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
