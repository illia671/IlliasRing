package net.mcreator.illiasaddon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.illiasaddon.world.inventory.CalkulatorMenu;
import net.mcreator.illiasaddon.network.CalkulatorButtonMessage;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CalkulatorScreen extends AbstractContainerScreen<CalkulatorMenu> {
	private final static HashMap<String, Object> guistate = CalkulatorMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	Button button_1;
	Button button_2;
	Button button_3;
	Button button_4;
	Button button_5;
	Button button_6;
	Button button_7;
	Button button_8;
	Button button_9;
	Button button_0;
	Button button_empty;
	Button button_empty1;
	Button button_empty2;
	Button button_empty3;
	Button button_empty4;
	Button button_empty5;
	ImageButton imagebutton_khriestik;

	public CalkulatorScreen(CalkulatorMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("illiasringaddon:textures/screens/calkulator.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/tablegui.png"), this.leftPos + -28, this.topPos + -1, 0, 0, 241, 165, 241, 165);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_1 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_1"), e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new CalkulatorButtonMessage(0, x, y, z, textstate));
				CalkulatorButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		}).bounds(this.leftPos + 13, this.topPos + 38, 30, 20).build();
		guistate.put("button:button_1", button_1);
		this.addRenderableWidget(button_1);
		button_2 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_2"), e -> {
		}).bounds(this.leftPos + 47, this.topPos + 38, 30, 20).build();
		guistate.put("button:button_2", button_2);
		this.addRenderableWidget(button_2);
		button_3 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_3"), e -> {
		}).bounds(this.leftPos + 81, this.topPos + 38, 30, 20).build();
		guistate.put("button:button_3", button_3);
		this.addRenderableWidget(button_3);
		button_4 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_4"), e -> {
		}).bounds(this.leftPos + 13, this.topPos + 63, 30, 20).build();
		guistate.put("button:button_4", button_4);
		this.addRenderableWidget(button_4);
		button_5 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_5"), e -> {
		}).bounds(this.leftPos + 48, this.topPos + 63, 30, 20).build();
		guistate.put("button:button_5", button_5);
		this.addRenderableWidget(button_5);
		button_6 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_6"), e -> {
		}).bounds(this.leftPos + 82, this.topPos + 62, 30, 20).build();
		guistate.put("button:button_6", button_6);
		this.addRenderableWidget(button_6);
		button_7 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_7"), e -> {
		}).bounds(this.leftPos + 13, this.topPos + 89, 30, 20).build();
		guistate.put("button:button_7", button_7);
		this.addRenderableWidget(button_7);
		button_8 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_8"), e -> {
		}).bounds(this.leftPos + 48, this.topPos + 89, 30, 20).build();
		guistate.put("button:button_8", button_8);
		this.addRenderableWidget(button_8);
		button_9 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_9"), e -> {
		}).bounds(this.leftPos + 82, this.topPos + 89, 30, 20).build();
		guistate.put("button:button_9", button_9);
		this.addRenderableWidget(button_9);
		button_0 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_0"), e -> {
		}).bounds(this.leftPos + 48, this.topPos + 116, 30, 20).build();
		guistate.put("button:button_0", button_0);
		this.addRenderableWidget(button_0);
		button_empty = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_empty"), e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new CalkulatorButtonMessage(10, x, y, z, textstate));
				CalkulatorButtonMessage.handleButtonAction(entity, 10, x, y, z, textstate);
			}
		}).bounds(this.leftPos + 125, this.topPos + 38, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_empty1"), e -> {
		}).bounds(this.leftPos + 125, this.topPos + 61, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_empty2 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_empty2"), e -> {
		}).bounds(this.leftPos + 162, this.topPos + 38, 30, 20).build();
		guistate.put("button:button_empty2", button_empty2);
		this.addRenderableWidget(button_empty2);
		button_empty3 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_empty3"), e -> {
		}).bounds(this.leftPos + 162, this.topPos + 60, 30, 20).build();
		guistate.put("button:button_empty3", button_empty3);
		this.addRenderableWidget(button_empty3);
		button_empty4 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_empty4"), e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new CalkulatorButtonMessage(14, x, y, z, textstate));
				CalkulatorButtonMessage.handleButtonAction(entity, 14, x, y, z, textstate);
			}
		}).bounds(this.leftPos + 142, this.topPos + 86, 30, 20).build();
		guistate.put("button:button_empty4", button_empty4);
		this.addRenderableWidget(button_empty4);
		button_empty5 = Button.builder(Component.translatable("gui.illiasringaddon.calkulator.button_empty5"), e -> {
		}).bounds(this.leftPos + 82, this.topPos + 116, 35, 20).build();
		guistate.put("button:button_empty5", button_empty5);
		this.addRenderableWidget(button_empty5);
		imagebutton_khriestik = new ImageButton(this.leftPos + 169, this.topPos + 121, 25, 25, 0, 0, 25, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_khriestik.png"), 25, 50, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new CalkulatorButtonMessage(16, x, y, z, textstate));
				CalkulatorButtonMessage.handleButtonAction(entity, 16, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_khriestik", imagebutton_khriestik);
		this.addRenderableWidget(imagebutton_khriestik);
	}
}
