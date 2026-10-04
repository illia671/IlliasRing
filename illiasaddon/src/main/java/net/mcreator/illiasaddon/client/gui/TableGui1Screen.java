package net.mcreator.illiasaddon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.illiasaddon.world.inventory.TableGui1Menu;
import net.mcreator.illiasaddon.network.TableGui1ButtonMessage;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TableGui1Screen extends AbstractContainerScreen<TableGui1Menu> {
	private final static HashMap<String, Object> guistate = TableGui1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_filebutton1;
	ImageButton imagebutton_1;
	ImageButton imagebutton_2;
	ImageButton imagebutton_4;
	ImageButton imagebutton_df;
	ImageButton imagebutton_10;
	ImageButton imagebutton_9;
	ImageButton imagebutton_khriestik;
	ImageButton imagebutton_google;
	ImageButton imagebutton_200526275pixel8bitframeofg;
	ImageButton imagebutton_a;

	public TableGui1Screen(TableGui1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("illiasringaddon:textures/screens/table_gui_1.png");

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

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/tablegui.png"), this.leftPos + -28, this.topPos + 1, 0, 0, 241, 165, 241, 165);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/vapva.png"), this.leftPos + 19, this.topPos + 60, 0, 0, 145, 17, 145, 17);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.table_gui_1.label_1010"), 78, 38, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_filebutton1 = new ImageButton(this.leftPos + 165, this.topPos + 121, 25, 21, 0, 0, 21, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_filebutton1.png"), 25, 42, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new TableGui1ButtonMessage(0, x, y, z, textstate));
				TableGui1ButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_filebutton1", imagebutton_filebutton1);
		this.addRenderableWidget(imagebutton_filebutton1);
		imagebutton_1 = new ImageButton(this.leftPos + 139, this.topPos + 119, 20, 25, 0, 0, 25, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_1.png"), 20, 50, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new TableGui1ButtonMessage(1, x, y, z, textstate));
				TableGui1ButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_1", imagebutton_1);
		this.addRenderableWidget(imagebutton_1);
		imagebutton_2 = new ImageButton(this.leftPos + 113, this.topPos + 119, 25, 25, 0, 0, 25, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_2.png"), 25, 50, e -> {
		});
		guistate.put("button:imagebutton_2", imagebutton_2);
		this.addRenderableWidget(imagebutton_2);
		imagebutton_4 = new ImageButton(this.leftPos + 82, this.topPos + 122, 26, 20, 0, 0, 20, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_4.png"), 26, 40, e -> {
		});
		guistate.put("button:imagebutton_4", imagebutton_4);
		this.addRenderableWidget(imagebutton_4);
		imagebutton_df = new ImageButton(this.leftPos + 54, this.topPos + 118, 23, 25, 0, 0, 25, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_df.png"), 23, 50, e -> {
		});
		guistate.put("button:imagebutton_df", imagebutton_df);
		this.addRenderableWidget(imagebutton_df);
		imagebutton_10 = new ImageButton(this.leftPos + 23, this.topPos + 118, 25, 25, 0, 0, 25, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_10.png"), 25, 50, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new TableGui1ButtonMessage(5, x, y, z, textstate));
				TableGui1ButtonMessage.handleButtonAction(entity, 5, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_10", imagebutton_10);
		this.addRenderableWidget(imagebutton_10);
		imagebutton_9 = new ImageButton(this.leftPos + -6, this.topPos + 120, 25, 22, 0, 0, 22, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_9.png"), 25, 44, e -> {
		});
		guistate.put("button:imagebutton_9", imagebutton_9);
		this.addRenderableWidget(imagebutton_9);
		imagebutton_khriestik = new ImageButton(this.leftPos + 199, this.topPos + -9, 25, 25, 0, 0, 25, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_khriestik.png"), 25, 50, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new TableGui1ButtonMessage(7, x, y, z, textstate));
				TableGui1ButtonMessage.handleButtonAction(entity, 7, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_khriestik", imagebutton_khriestik);
		this.addRenderableWidget(imagebutton_khriestik);
		imagebutton_google = new ImageButton(this.leftPos + -3, this.topPos + 92, 20, 20, 0, 0, 20, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_google.png"), 20, 40, e -> {
		});
		guistate.put("button:imagebutton_google", imagebutton_google);
		this.addRenderableWidget(imagebutton_google);
		imagebutton_200526275pixel8bitframeofg = new ImageButton(this.leftPos + 21, this.topPos + 85, 30, 30, 0, 0, 30, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_200526275pixel8bitframeofg.png"), 30, 60, e -> {
		});
		guistate.put("button:imagebutton_200526275pixel8bitframeofg", imagebutton_200526275pixel8bitframeofg);
		this.addRenderableWidget(imagebutton_200526275pixel8bitframeofg);
		imagebutton_a = new ImageButton(this.leftPos + 19, this.topPos + 60, 145, 17, 0, 0, 17, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_a.png"), 145, 34, e -> {
		});
		guistate.put("button:imagebutton_a", imagebutton_a);
		this.addRenderableWidget(imagebutton_a);
	}
}
