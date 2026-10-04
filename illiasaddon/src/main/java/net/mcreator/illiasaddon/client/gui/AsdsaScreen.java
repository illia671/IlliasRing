package net.mcreator.illiasaddon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.illiasaddon.world.inventory.AsdsaMenu;
import net.mcreator.illiasaddon.network.AsdsaButtonMessage;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AsdsaScreen extends AbstractContainerScreen<AsdsaMenu> {
	private final static HashMap<String, Object> guistate = AsdsaMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_khriestik;
	ImageButton imagebutton_11of;
	ImageButton imagebutton_111;
	ImageButton imagebutton_1111;
	ImageButton imagebutton_11of1;
	ImageButton imagebutton_1112;
	ImageButton imagebutton_1113;
	ImageButton imagebutton_1114;
	ImageButton imagebutton_1115;
	ImageButton imagebutton_1116;
	ImageButton imagebutton_11of2;
	ImageButton imagebutton_11of3;
	ImageButton imagebutton_11of4;
	ImageButton imagebutton_11of5;
	ImageButton imagebutton_11of6;

	public AsdsaScreen(AsdsaMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("illiasringaddon:textures/screens/asdsa.png");

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

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/10.png"), this.leftPos + -3, this.topPos + 17, 0, 0, 25, 25, 25, 25);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/10.png"), this.leftPos + -3, this.topPos + 47, 0, 0, 25, 25, 25, 25);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/10.png"), this.leftPos + -4, this.topPos + 78, 0, 0, 25, 25, 25, 25);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/10.png"), this.leftPos + -4, this.topPos + 111, 0, 0, 25, 25, 25, 25);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/10.png"), this.leftPos + 90, this.topPos + 17, 0, 0, 25, 25, 25, 25);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/10.png"), this.leftPos + 90, this.topPos + 47, 0, 0, 25, 25, 25, 25);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/10.png"), this.leftPos + 90, this.topPos + 78, 0, 0, 25, 25, 25, 25);

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
		imagebutton_khriestik = new ImageButton(this.leftPos + 169, this.topPos + 121, 25, 25, 0, 0, 25, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_khriestik.png"), 25, 50, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new AsdsaButtonMessage(0, x, y, z, textstate));
				AsdsaButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_khriestik", imagebutton_khriestik);
		this.addRenderableWidget(imagebutton_khriestik);
		imagebutton_11of = new ImageButton(this.leftPos + 51, this.topPos + 18, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_11of.png"), 25, 44, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new AsdsaButtonMessage(1, x, y, z, textstate));
				AsdsaButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_11of", imagebutton_11of);
		this.addRenderableWidget(imagebutton_11of);
		imagebutton_111 = new ImageButton(this.leftPos + 24, this.topPos + 18, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_111.png"), 25, 44, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new AsdsaButtonMessage(2, x, y, z, textstate));
				AsdsaButtonMessage.handleButtonAction(entity, 2, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_111", imagebutton_111);
		this.addRenderableWidget(imagebutton_111);
		imagebutton_1111 = new ImageButton(this.leftPos + 24, this.topPos + 48, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_1111.png"), 25, 44, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new AsdsaButtonMessage(3, x, y, z, textstate));
				AsdsaButtonMessage.handleButtonAction(entity, 3, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_1111", imagebutton_1111);
		this.addRenderableWidget(imagebutton_1111);
		imagebutton_11of1 = new ImageButton(this.leftPos + 51, this.topPos + 48, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_11of1.png"), 25, 44, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new AsdsaButtonMessage(4, x, y, z, textstate));
				AsdsaButtonMessage.handleButtonAction(entity, 4, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_11of1", imagebutton_11of1);
		this.addRenderableWidget(imagebutton_11of1);
		imagebutton_1112 = new ImageButton(this.leftPos + 24, this.topPos + 79, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_1112.png"), 25, 44, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new AsdsaButtonMessage(5, x, y, z, textstate));
				AsdsaButtonMessage.handleButtonAction(entity, 5, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_1112", imagebutton_1112);
		this.addRenderableWidget(imagebutton_1112);
		imagebutton_1113 = new ImageButton(this.leftPos + 25, this.topPos + 112, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_1113.png"), 25, 44, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new AsdsaButtonMessage(6, x, y, z, textstate));
				AsdsaButtonMessage.handleButtonAction(entity, 6, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_1113", imagebutton_1113);
		this.addRenderableWidget(imagebutton_1113);
		imagebutton_1114 = new ImageButton(this.leftPos + 118, this.topPos + 18, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_1114.png"), 25, 44, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new AsdsaButtonMessage(7, x, y, z, textstate));
				AsdsaButtonMessage.handleButtonAction(entity, 7, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_1114", imagebutton_1114);
		this.addRenderableWidget(imagebutton_1114);
		imagebutton_1115 = new ImageButton(this.leftPos + 118, this.topPos + 48, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_1115.png"), 25, 44, e -> {
		});
		guistate.put("button:imagebutton_1115", imagebutton_1115);
		this.addRenderableWidget(imagebutton_1115);
		imagebutton_1116 = new ImageButton(this.leftPos + 118, this.topPos + 79, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_1116.png"), 25, 44, e -> {
		});
		guistate.put("button:imagebutton_1116", imagebutton_1116);
		this.addRenderableWidget(imagebutton_1116);
		imagebutton_11of2 = new ImageButton(this.leftPos + 51, this.topPos + 79, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_11of2.png"), 25, 44, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new AsdsaButtonMessage(10, x, y, z, textstate));
				AsdsaButtonMessage.handleButtonAction(entity, 10, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_11of2", imagebutton_11of2);
		this.addRenderableWidget(imagebutton_11of2);
		imagebutton_11of3 = new ImageButton(this.leftPos + 52, this.topPos + 112, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_11of3.png"), 25, 44, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new AsdsaButtonMessage(11, x, y, z, textstate));
				AsdsaButtonMessage.handleButtonAction(entity, 11, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_11of3", imagebutton_11of3);
		this.addRenderableWidget(imagebutton_11of3);
		imagebutton_11of4 = new ImageButton(this.leftPos + 146, this.topPos + 18, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_11of4.png"), 25, 44, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new AsdsaButtonMessage(12, x, y, z, textstate));
				AsdsaButtonMessage.handleButtonAction(entity, 12, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_11of4", imagebutton_11of4);
		this.addRenderableWidget(imagebutton_11of4);
		imagebutton_11of5 = new ImageButton(this.leftPos + 146, this.topPos + 48, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_11of5.png"), 25, 44, e -> {
		});
		guistate.put("button:imagebutton_11of5", imagebutton_11of5);
		this.addRenderableWidget(imagebutton_11of5);
		imagebutton_11of6 = new ImageButton(this.leftPos + 146, this.topPos + 79, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_11of6.png"), 25, 44, e -> {
		});
		guistate.put("button:imagebutton_11of6", imagebutton_11of6);
		this.addRenderableWidget(imagebutton_11of6);
	}
}
