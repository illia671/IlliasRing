package net.mcreator.illiasaddon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.illiasaddon.world.inventory.FileMenu;
import net.mcreator.illiasaddon.network.FileButtonMessage;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FileScreen extends AbstractContainerScreen<FileMenu> {
	private final static HashMap<String, Object> guistate = FileMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_filebutton1;
	ImageButton imagebutton_filebutton11;
	ImageButton imagebutton_filebutton12;
	ImageButton imagebutton_filebutton13;
	ImageButton imagebutton_filebutton14;
	ImageButton imagebutton_filebutton15;
	ImageButton imagebutton_filebutton16;
	ImageButton imagebutton_vvpvap;

	public FileScreen(FileMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("illiasringaddon:textures/screens/file.png");

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

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/s.png"), this.leftPos + -24, this.topPos + -1, 0, 0, 241, 165, 241, 165);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/zobrazhiennia_viber_2025-05-16_11-17-46-935.png"), this.leftPos + -23, this.topPos + 152, 0, 0, 11, 7, 11, 7);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/wifi.png"), this.leftPos + -8, this.topPos + 151, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/sdfdf.png"), this.leftPos + -7, this.topPos + -1, 0, 0, 241, 165, 241, 165);

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
		imagebutton_filebutton1 = new ImageButton(this.leftPos + -10, this.topPos + 28, 25, 21, 0, 0, 21, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_filebutton1.png"), 25, 42, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new FileButtonMessage(0, x, y, z, textstate));
				FileButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_filebutton1", imagebutton_filebutton1);
		this.addRenderableWidget(imagebutton_filebutton1);
		imagebutton_filebutton11 = new ImageButton(this.leftPos + 20, this.topPos + 28, 25, 21, 0, 0, 21, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_filebutton11.png"), 25, 42, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new FileButtonMessage(1, x, y, z, textstate));
				FileButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_filebutton11", imagebutton_filebutton11);
		this.addRenderableWidget(imagebutton_filebutton11);
		imagebutton_filebutton12 = new ImageButton(this.leftPos + 55, this.topPos + 28, 25, 21, 0, 0, 21, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_filebutton12.png"), 25, 42, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new FileButtonMessage(2, x, y, z, textstate));
				FileButtonMessage.handleButtonAction(entity, 2, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_filebutton12", imagebutton_filebutton12);
		this.addRenderableWidget(imagebutton_filebutton12);
		imagebutton_filebutton13 = new ImageButton(this.leftPos + 88, this.topPos + 29, 25, 21, 0, 0, 21, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_filebutton13.png"), 25, 42, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new FileButtonMessage(3, x, y, z, textstate));
				FileButtonMessage.handleButtonAction(entity, 3, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_filebutton13", imagebutton_filebutton13);
		this.addRenderableWidget(imagebutton_filebutton13);
		imagebutton_filebutton14 = new ImageButton(this.leftPos + 121, this.topPos + 29, 25, 21, 0, 0, 21, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_filebutton14.png"), 25, 42, e -> {
		});
		guistate.put("button:imagebutton_filebutton14", imagebutton_filebutton14);
		this.addRenderableWidget(imagebutton_filebutton14);
		imagebutton_filebutton15 = new ImageButton(this.leftPos + -10, this.topPos + 59, 25, 21, 0, 0, 21, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_filebutton15.png"), 25, 42, e -> {
		});
		guistate.put("button:imagebutton_filebutton15", imagebutton_filebutton15);
		this.addRenderableWidget(imagebutton_filebutton15);
		imagebutton_filebutton16 = new ImageButton(this.leftPos + 19, this.topPos + 60, 25, 21, 0, 0, 21, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_filebutton16.png"), 25, 42, e -> {
		});
		guistate.put("button:imagebutton_filebutton16", imagebutton_filebutton16);
		this.addRenderableWidget(imagebutton_filebutton16);
		imagebutton_vvpvap = new ImageButton(this.leftPos + 174, this.topPos + 4, 11, 11, 0, 0, 11, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_vvpvap.png"), 11, 22, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new FileButtonMessage(7, x, y, z, textstate));
				FileButtonMessage.handleButtonAction(entity, 7, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_vvpvap", imagebutton_vvpvap);
		this.addRenderableWidget(imagebutton_vvpvap);
	}
}
