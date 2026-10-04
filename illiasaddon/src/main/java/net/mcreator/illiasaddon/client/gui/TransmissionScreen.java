package net.mcreator.illiasaddon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.illiasaddon.world.inventory.TransmissionMenu;
import net.mcreator.illiasaddon.network.TransmissionButtonMessage;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TransmissionScreen extends AbstractContainerScreen<TransmissionMenu> {
	private final static HashMap<String, Object> guistate = TransmissionMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_vvpvap;

	public TransmissionScreen(TransmissionMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("illiasringaddon:textures/screens/transmission.png");

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

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/s.png"), this.leftPos + -13, this.topPos + -1, 0, 0, 241, 165, 241, 165);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/sdfdf.png"), this.leftPos + 3, this.topPos + -1, 0, 0, 241, 165, 241, 165);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transmission.label_creation"), 64, 18, -5433601, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transmission.label_kwami_tikki"), 0, 29, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transmission.label_transformation_tikki_spots_on"), -10, 42, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transmission.label_food_macaron"), 0, 56, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transmission.label_weapon_yoyo"), 0, 82, -13421773, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.transmission.label_power_luck_and_creation"), 0, 67, -13421773, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_vvpvap = new ImageButton(this.leftPos + 184, this.topPos + 4, 11, 11, 0, 0, 11, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_vvpvap.png"), 11, 22, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new TransmissionButtonMessage(0, x, y, z, textstate));
				TransmissionButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_vvpvap", imagebutton_vvpvap);
		this.addRenderableWidget(imagebutton_vvpvap);
	}
}
