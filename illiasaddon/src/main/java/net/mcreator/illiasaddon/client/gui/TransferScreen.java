package net.mcreator.illiasaddon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.illiasaddon.world.inventory.TransferMenu;
import net.mcreator.illiasaddon.network.TransferButtonMessage;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TransferScreen extends AbstractContainerScreen<TransferMenu> {
	private final static HashMap<String, Object> guistate = TransferMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	public static EditBox player_name;
	public static EditBox power;
	Button button_transfer;

	public TransferScreen(TransferMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("illiasringaddon:textures/screens/transfer.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		player_name.render(guiGraphics, mouseX, mouseY, partialTicks);
		power.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/zobrazhiennia_viber_2025-05-13_14-02-13-336.png"), this.leftPos + -81, this.topPos + -91, 0, 0, 160, 175, 160, 175);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (player_name.isFocused())
			return player_name.keyPressed(key, b, c);
		if (power.isFocused())
			return power.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		player_name.tick();
		power.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String player_nameValue = player_name.getValue();
		String powerValue = power.getValue();
		super.resize(minecraft, width, height);
		player_name.setValue(player_nameValue);
		power.setValue(powerValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_set_player_nickname"), -52, -82, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_wright_all_for_send_power_all_pl"), -66, 3, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_all_player"), -66, 14, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_wright_akumatized_for_sending"), -65, 25, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_for_sending_power_to_akumatized"), -66, 36, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_matized_player"), -66, 46, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_list_of_power_work_if_you"), 78, -82, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_work_if_you_have_this_ring"), 77, -71, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_creation"), 82, -49, -52429, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_destruction"), 83, -37, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_illusion"), 82, -24, -39424, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_action"), 82, -11, -13261, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_protaction"), 82, 1, -13395712, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_woolf"), 82, 15, -6684673, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_spirit"), 81, 28, -16724839, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transfer.label_or_have_in_main_hand"), 78, -61, -1, false);
	}

	@Override
	public void init() {
		super.init();
		player_name = new EditBox(this.font, this.leftPos + -59, this.topPos + -66, 118, 18, Component.translatable("gui.illiasringaddon.transfer.player_name")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.illiasringaddon.transfer.player_name").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.illiasringaddon.transfer.player_name").getString());
				else
					setSuggestion(null);
			}
		};
		player_name.setSuggestion(Component.translatable("gui.illiasringaddon.transfer.player_name").getString());
		player_name.setMaxLength(32767);
		guistate.put("text:player_name", player_name);
		this.addWidget(this.player_name);
		power = new EditBox(this.font, this.leftPos + -60, this.topPos + -35, 118, 18, Component.translatable("gui.illiasringaddon.transfer.power")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.illiasringaddon.transfer.power").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.illiasringaddon.transfer.power").getString());
				else
					setSuggestion(null);
			}
		};
		power.setSuggestion(Component.translatable("gui.illiasringaddon.transfer.power").getString());
		power.setMaxLength(32767);
		guistate.put("text:power", power);
		this.addWidget(this.power);
		button_transfer = Button.builder(Component.translatable("gui.illiasringaddon.transfer.button_transfer"), e -> {
			if (true) {
				textstate.put("textin:player_name", player_name.getValue());
				textstate.put("textin:power", power.getValue());
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new TransferButtonMessage(0, x, y, z, textstate));
				TransferButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		}).bounds(this.leftPos + -41, this.topPos + 73, 72, 20).build();
		guistate.put("button:button_transfer", button_transfer);
		this.addRenderableWidget(button_transfer);
	}
}
