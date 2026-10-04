package net.mcreator.illiasaddon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.illiasaddon.world.inventory.Alliance7Menu;
import net.mcreator.illiasaddon.procedures.IfCap2Procedure;
import net.mcreator.illiasaddon.procedures.IfCap1Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceHeadAvatar11Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceAvatarHead9Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceAvatarHead8Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceAvatarHead7Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceAvatarHead6Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceAvatarHead5Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceAvatarHead4Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceAvatarHead3Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceAvatarHead2Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceAvatarHead1Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceAvatarHead10Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceAvatarCloth13Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceAvatarCloth12Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceAvatarCloth11Procedure;
import net.mcreator.illiasaddon.procedures.IfAllianceAvatarCloth10Procedure;
import net.mcreator.illiasaddon.procedures.ClothesAvatar10Procedure;
import net.mcreator.illiasaddon.procedures.ClothesAavatarPage9Procedure;
import net.mcreator.illiasaddon.procedures.ClothesAavatarPage8Procedure;
import net.mcreator.illiasaddon.procedures.ClothesAavatarPage7Procedure;
import net.mcreator.illiasaddon.procedures.ClothesAavatarPage6Procedure;
import net.mcreator.illiasaddon.procedures.ClothesAavatarPage5Procedure;
import net.mcreator.illiasaddon.procedures.ClothesAavatarPage4Procedure;
import net.mcreator.illiasaddon.procedures.ClothesAavatarPage3Procedure;
import net.mcreator.illiasaddon.procedures.ClothesAavatarPage2Procedure;
import net.mcreator.illiasaddon.procedures.ClothesAavatarPage1Procedure;
import net.mcreator.illiasaddon.network.Alliance7ButtonMessage;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Alliance7Screen extends AbstractContainerScreen<Alliance7Menu> {
	private final static HashMap<String, Object> guistate = Alliance7Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	Button button_empty;
	Button button_empty1;
	Button button_empty2;
	ImageButton imagebutton_next3;

	public Alliance7Screen(Alliance7Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

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

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/alliance_ring1.png"), this.leftPos + -143, this.topPos + 58, 0, 0, 116, 116, 116, 116);

		if (ClothesAavatarPage5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/adriancloses.png"), this.leftPos + -139, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (ClothesAavatarPage3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/allianceblackboyclothes.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (ClothesAavatarPage4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/allianceblackgirlclothes.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (ClothesAavatarPage1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/alliancewhiteboyclothes.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (ClothesAavatarPage2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/alliancewhitegirlclothes.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (ClothesAavatarPage7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/alukardclothes.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (ClothesAavatarPage9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/felixclothes.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (ClothesAavatarPage6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/kagamiclothes.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (ClothesAavatarPage8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/thehunterclothes.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfAllianceAvatarHead1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/adrian.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfAllianceAvatarHead8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/alukard.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfAllianceHeadAvatar11Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/dragoss.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfAllianceAvatarHead10Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/felix.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfAllianceAvatarHead5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/felixm.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfAllianceAvatarHead3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/kagami.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfAllianceAvatarHead7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/marinett.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfAllianceAvatarHead9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/thehunter.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfAllianceAvatarHead4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/gabriel.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (ClothesAvatar10Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/dragossclothes.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfAllianceAvatarHead2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/lila.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfAllianceAvatarHead6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/emilie.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/speach_booble2.png"), this.leftPos + -212, this.topPos + 20, 0, 0, 93, 68, 93, 68);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/phoenix_button1.png"), this.leftPos + -77, this.topPos + -25, 0, 0, 60, 20, 60, 20);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/phoenix_button1.png"), this.leftPos + -77, this.topPos + -5, 0, 0, 60, 20, 60, 20);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/phoenix_button1.png"), this.leftPos + -77, this.topPos + 15, 0, 0, 60, 20, 60, 20);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/alliance_ring.png"), this.leftPos + -60, this.topPos + -29, 0, 0, 232, 232, 232, 232);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/clothes5.png"), this.leftPos + -76, this.topPos + 16, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/alukardlogohead.png"), this.leftPos + -76, this.topPos + -4, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/cap3.png"), this.leftPos + -76, this.topPos + -24, 0, 0, 16, 16, 16, 16);

		if (IfAllianceAvatarCloth10Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/mansuit.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfAllianceAvatarCloth11Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/pinkmansuit.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfAllianceAvatarCloth12Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/greengirlsuit.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfAllianceAvatarCloth13Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/orrangegirlsuit.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
		if (IfCap1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/cap1.png"), this.leftPos + -138, this.topPos + 44, 0, 0, 64, 128, 64, 128);
		}
		if (IfCap2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/cap2.png"), this.leftPos + -138, this.topPos + 40, 0, 0, 64, 128, 64, 128);
		}
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
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_7.label_who_do_you_want_to_send_a_messag"), -209, 21, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_7.label_to_send_a_message_to"), -209, 29, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = new PlainTextButton(this.leftPos + -85, this.topPos + -25, 25, 20, Component.translatable("gui.illiasringaddon.alliance_7.button_empty"), e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance7ButtonMessage(0, x, y, z, textstate));
				Alliance7ButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		}, this.font);
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = new PlainTextButton(this.leftPos + -85, this.topPos + -4, 25, 20, Component.translatable("gui.illiasringaddon.alliance_7.button_empty1"), e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance7ButtonMessage(1, x, y, z, textstate));
				Alliance7ButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		}, this.font);
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_empty2 = new PlainTextButton(this.leftPos + -85, this.topPos + 15, 25, 20, Component.translatable("gui.illiasringaddon.alliance_7.button_empty2"), e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance7ButtonMessage(2, x, y, z, textstate));
				Alliance7ButtonMessage.handleButtonAction(entity, 2, x, y, z, textstate);
			}
		}, this.font);
		guistate.put("button:button_empty2", button_empty2);
		this.addRenderableWidget(button_empty2);
		imagebutton_next3 = new ImageButton(this.leftPos + -28, this.topPos + 183, 16, 16, 0, 0, 16, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_next3.png"), 16, 32, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance7ButtonMessage(3, x, y, z, textstate));
				Alliance7ButtonMessage.handleButtonAction(entity, 3, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_next3", imagebutton_next3);
		this.addRenderableWidget(imagebutton_next3);
	}
}
