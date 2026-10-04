package net.mcreator.illiasaddon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.illiasaddon.world.inventory.Alliance4Menu;
import net.mcreator.illiasaddon.procedures.SpeedProcedure;
import net.mcreator.illiasaddon.procedures.KillsProcedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp9Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp8Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp7Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp6Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp5Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp4Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp3Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp2Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp20Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp19Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp18Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp17Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp16Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp15Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp14Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp13Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp12Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp11Procedure;
import net.mcreator.illiasaddon.procedures.IfmoreHp10Procedure;
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
import net.mcreator.illiasaddon.procedures.If1moreHpProcedure;
import net.mcreator.illiasaddon.procedures.DeathProcedure;
import net.mcreator.illiasaddon.procedures.CordsProcedure;
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
import net.mcreator.illiasaddon.network.Alliance4ButtonMessage;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Alliance4Screen extends AbstractContainerScreen<Alliance4Menu> {
	private final static HashMap<String, Object> guistate = Alliance4Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_phoenix_button1;
	ImageButton imagebutton_phoenix_button11;
	ImageButton imagebutton_next3;

	public Alliance4Screen(Alliance4Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("illiasringaddon:textures/screens/alliance_4.png");

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

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/alliance_ring1.png"), this.leftPos + -144, this.topPos + 59, 0, 0, 116, 116, 116, 116);

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

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/alliance_ring.png"), this.leftPos + -58, this.topPos + -31, 0, 0, 232, 232, 232, 232);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/speach_booble2.png"), this.leftPos + -212, this.topPos + 20, 0, 0, 93, 68, 93, 68);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_space.png"), this.leftPos + -42, this.topPos + -10, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_space.png"), this.leftPos + -32, this.topPos + -10, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_space.png"), this.leftPos + -22, this.topPos + -10, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_space.png"), this.leftPos + -12, this.topPos + -10, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_space.png"), this.leftPos + -2, this.topPos + -10, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_space.png"), this.leftPos + 8, this.topPos + -10, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_space.png"), this.leftPos + 18, this.topPos + -10, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_space.png"), this.leftPos + 28, this.topPos + -10, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_space.png"), this.leftPos + 38, this.topPos + -10, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_space.png"), this.leftPos + 48, this.topPos + -10, 0, 0, 16, 16, 16, 16);

		if (If1moreHpProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_notall.png"), this.leftPos + -42, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart.png"), this.leftPos + -42, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_notall.png"), this.leftPos + -32, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart.png"), this.leftPos + -32, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_notall.png"), this.leftPos + -22, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart.png"), this.leftPos + -22, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_notall.png"), this.leftPos + -12, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart.png"), this.leftPos + -12, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_notall.png"), this.leftPos + -2, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp10Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart.png"), this.leftPos + -2, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp11Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_notall.png"), this.leftPos + 8, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp12Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart.png"), this.leftPos + 8, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp13Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_notall.png"), this.leftPos + 18, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp14Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart.png"), this.leftPos + 18, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp15Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_notall.png"), this.leftPos + 28, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp16Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart.png"), this.leftPos + 28, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp17Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_notall.png"), this.leftPos + 38, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp18Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart.png"), this.leftPos + 38, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp19Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart_notall.png"), this.leftPos + 48, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
		if (IfmoreHp20Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/heart.png"), this.leftPos + 48, this.topPos + -10, 0, 0, 16, 16, 16, 16);
		}
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
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_4.label_who_do_you_want_to_send_a_messag"), -209, 21, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_4.label_to_send_a_message_to"), -209, 29, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_4.label_age_to"), -207, 38, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_4.label_hp"), -53, -8, -12829636, false);
		guiGraphics.drawString(this.font,

				CordsProcedure.execute(entity), -53, 8, -12829636, false);
		guiGraphics.drawString(this.font,

				SpeedProcedure.execute(entity), -52, 22, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_4.label_sos"), -36, 82, -12829636, false);
		guiGraphics.drawString(this.font,

				DeathProcedure.execute(entity), -52, 36, -12829636, false);
		guiGraphics.drawString(this.font,

				KillsProcedure.execute(world), -52, 48, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_4.label_sos_megaakuma"), -53, 110, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_phoenix_button1 = new ImageButton(this.leftPos + -55, this.topPos + 78, 60, 20, 0, 0, 20, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_phoenix_button1.png"), 60, 40, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance4ButtonMessage(0, x, y, z, textstate));
				Alliance4ButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_phoenix_button1", imagebutton_phoenix_button1);
		this.addRenderableWidget(imagebutton_phoenix_button1);
		imagebutton_phoenix_button11 = new ImageButton(this.leftPos + -56, this.topPos + 106, 60, 20, 0, 0, 20, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_phoenix_button11.png"), 60, 40, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance4ButtonMessage(1, x, y, z, textstate));
				Alliance4ButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_phoenix_button11", imagebutton_phoenix_button11);
		this.addRenderableWidget(imagebutton_phoenix_button11);
		imagebutton_next3 = new ImageButton(this.leftPos + -27, this.topPos + 180, 16, 16, 0, 0, 16, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_next3.png"), 16, 32, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance4ButtonMessage(2, x, y, z, textstate));
				Alliance4ButtonMessage.handleButtonAction(entity, 2, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_next3", imagebutton_next3);
		this.addRenderableWidget(imagebutton_next3);
	}
}
