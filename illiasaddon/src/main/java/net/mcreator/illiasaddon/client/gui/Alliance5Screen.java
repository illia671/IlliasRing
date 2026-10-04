package net.mcreator.illiasaddon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.illiasaddon.world.inventory.Alliance5Menu;
import net.mcreator.illiasaddon.network.Alliance5ButtonMessage;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Alliance5Screen extends AbstractContainerScreen<Alliance5Menu> {
	private final static HashMap<String, Object> guistate = Alliance5Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_buttonshopitem;
	ImageButton imagebutton_next3;
	ImageButton imagebutton_mansuitlogo;
	ImageButton imagebutton_pinkmansuitlogo;

	public Alliance5Screen(Alliance5Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("illiasringaddon:textures/screens/alliance_5.png");

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

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/alliance_ring.png"), this.leftPos + -59, this.topPos + -31, 0, 0, 232, 232, 232, 232);

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
		imagebutton_buttonshopitem = new ImageButton(this.leftPos + -33, this.topPos + 37, 64, 64, 0, 0, 64, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonshopitem.png"), 64, 128, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance5ButtonMessage(0, x, y, z, textstate));
				Alliance5ButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_buttonshopitem", imagebutton_buttonshopitem);
		this.addRenderableWidget(imagebutton_buttonshopitem);
		imagebutton_next3 = new ImageButton(this.leftPos + -27, this.topPos + 180, 16, 16, 0, 0, 16, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_next3.png"), 16, 32, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance5ButtonMessage(1, x, y, z, textstate));
				Alliance5ButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_next3", imagebutton_next3);
		this.addRenderableWidget(imagebutton_next3);
		imagebutton_mansuitlogo = new ImageButton(this.leftPos + -21, this.topPos + 51, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_mansuitlogo.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_mansuitlogo", imagebutton_mansuitlogo);
		this.addRenderableWidget(imagebutton_mansuitlogo);
		imagebutton_pinkmansuitlogo = new ImageButton(this.leftPos + -9, this.topPos + 59, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_pinkmansuitlogo.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_pinkmansuitlogo", imagebutton_pinkmansuitlogo);
		this.addRenderableWidget(imagebutton_pinkmansuitlogo);
	}
}
