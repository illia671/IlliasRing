package net.mcreator.illiasaddon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.illiasaddon.world.inventory.MusickMenu;
import net.mcreator.illiasaddon.network.MusickButtonMessage;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MusickScreen extends AbstractContainerScreen<MusickMenu> {
	private final static HashMap<String, Object> guistate = MusickMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_khriestik;
	ImageButton imagebutton_10;
	ImageButton imagebutton_101;
	ImageButton imagebutton_102;

	public MusickScreen(MusickMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("illiasringaddon:textures/screens/musick.png");

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

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/tablegui.png"), this.leftPos + -27, this.topPos + -1, 0, 0, 241, 165, 241, 165);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.musick.label_ladybug"), -5, 51, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.musick.label_lifemusic"), 71, 52, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.musick.label_minecraft"), 150, 52, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_khriestik = new ImageButton(this.leftPos + 169, this.topPos + 121, 25, 25, 0, 0, 25, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_khriestik.png"), 25, 50, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new MusickButtonMessage(0, x, y, z, textstate));
				MusickButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_khriestik", imagebutton_khriestik);
		this.addRenderableWidget(imagebutton_khriestik);
		imagebutton_10 = new ImageButton(this.leftPos + 0, this.topPos + 24, 25, 25, 0, 0, 25, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_10.png"), 25, 50, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new MusickButtonMessage(1, x, y, z, textstate));
				MusickButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_10", imagebutton_10);
		this.addRenderableWidget(imagebutton_10);
		imagebutton_101 = new ImageButton(this.leftPos + 81, this.topPos + 24, 25, 25, 0, 0, 25, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_101.png"), 25, 50, e -> {
		});
		guistate.put("button:imagebutton_101", imagebutton_101);
		this.addRenderableWidget(imagebutton_101);
		imagebutton_102 = new ImageButton(this.leftPos + 160, this.topPos + 24, 25, 25, 0, 0, 25, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_102.png"), 25, 50, e -> {
		});
		guistate.put("button:imagebutton_102", imagebutton_102);
		this.addRenderableWidget(imagebutton_102);
	}
}
