package net.mcreator.illiasaddon.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.illiasaddon.world.inventory.Alliance6Menu;
import net.mcreator.illiasaddon.procedures.IfPinkBoughtProcedure;
import net.mcreator.illiasaddon.procedures.IfOrrangeBoughtProcedure;
import net.mcreator.illiasaddon.procedures.IfGreeBoughtProcedure;
import net.mcreator.illiasaddon.procedures.IfChousePinkProcedure;
import net.mcreator.illiasaddon.procedures.IfChouseOrrangeProcedure;
import net.mcreator.illiasaddon.procedures.IfChouseGreenProcedure;
import net.mcreator.illiasaddon.procedures.IfChouseCap2Procedure;
import net.mcreator.illiasaddon.procedures.IfChouseCap1Procedure;
import net.mcreator.illiasaddon.procedures.IfChouseBlackProcedure;
import net.mcreator.illiasaddon.procedures.IfCap2Procedure;
import net.mcreator.illiasaddon.procedures.IfCap2BoughtProcedure;
import net.mcreator.illiasaddon.procedures.IfCap1Procedure;
import net.mcreator.illiasaddon.procedures.IfCap1BoughtProcedure;
import net.mcreator.illiasaddon.procedures.IfBlackBoughtProcedure;
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
import net.mcreator.illiasaddon.procedures.CoastProcedure;
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
import net.mcreator.illiasaddon.network.Alliance6ButtonMessage;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Alliance6Screen extends AbstractContainerScreen<Alliance6Menu> {
	private final static HashMap<String, Object> guistate = Alliance6Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_next3;
	ImageButton imagebutton_phoenix_button1;
	ImageButton imagebutton_buttonclothes4;
	ImageButton imagebutton_buttonclotheslegend2;
	ImageButton imagebutton_pinkmansuitlogo;
	ImageButton imagebutton_buttonclothes5;
	ImageButton imagebutton_buttonclotheslegend3;
	ImageButton imagebutton_buttonclotheslegend1;
	ImageButton imagebutton_buttonclotheslegend;
	ImageButton imagebutton_greengirlsuitlogo;
	ImageButton imagebutton_mansuitlogo;
	ImageButton imagebutton_orrangegirlsuitlogo;
	ImageButton imagebutton_cap3;
	ImageButton imagebutton_cap4;
	ImageButton imagebutton_rare1;
	ImageButton imagebutton_epic1;
	ImageButton imagebutton_epic11;
	ImageButton imagebutton_legend1;

	public Alliance6Screen(Alliance6Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("illiasringaddon:textures/screens/alliance_6.png");

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

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/alliance_ring.png"), this.leftPos + -59, this.topPos + -33, 0, 0, 232, 232, 232, 232);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/speach_booble2.png"), this.leftPos + -212, this.topPos + 20, 0, 0, 93, 68, 93, 68);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/alliance_ring1.png"), this.leftPos + 71, this.topPos + 19, 0, 0, 116, 116, 116, 116);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/maneken.png"), this.leftPos + 77, this.topPos + 2, 0, 0, 64, 128, 64, 128);

		if (IfChouseGreenProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/greengirlsuit.png"), this.leftPos + 77, this.topPos + 2, 0, 0, 64, 128, 64, 128);
		}
		if (IfChouseBlackProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/mansuit.png"), this.leftPos + 77, this.topPos + 2, 0, 0, 64, 128, 64, 128);
		}
		if (IfChousePinkProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/pinkmansuit.png"), this.leftPos + 77, this.topPos + 2, 0, 0, 64, 128, 64, 128);
		}
		if (IfChouseOrrangeProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/orrangegirlsuit.png"), this.leftPos + 77, this.topPos + 2, 0, 0, 64, 128, 64, 128);
		}
		if (IfChouseCap1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/cap1.png"), this.leftPos + 77, this.topPos + 6, 0, 0, 64, 128, 64, 128);
		}
		if (IfChouseCap2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/cap2.png"), this.leftPos + 77, this.topPos + 1, 0, 0, 64, 128, 64, 128);
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

	public static HashMap<String, String> getTextboxValues() {
		return textstate;
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
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_6.label_who_do_you_want_to_send_a_messag"), -208, 21, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_6.label_to_send_a_message_to"), -209, 29, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_6.label_age_to"), -209, 38, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_6.label_buy"), 100, 143, -12829636, false);
		guiGraphics.drawString(this.font,

				CoastProcedure.execute(entity), 75, 2, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_next3 = new ImageButton(this.leftPos + -27, this.topPos + 180, 16, 16, 0, 0, 16, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_next3.png"), 16, 32, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance6ButtonMessage(0, x, y, z, textstate));
				Alliance6ButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_next3", imagebutton_next3);
		this.addRenderableWidget(imagebutton_next3);
		imagebutton_phoenix_button1 = new ImageButton(this.leftPos + 77, this.topPos + 139, 60, 20, 0, 0, 20, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_phoenix_button1.png"), 60, 40, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance6ButtonMessage(1, x, y, z, textstate));
				Alliance6ButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_phoenix_button1", imagebutton_phoenix_button1);
		this.addRenderableWidget(imagebutton_phoenix_button1);
		imagebutton_buttonclothes4 = new ImageButton(this.leftPos + -17, this.topPos + 18, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclothes4.png"), 32, 64, e -> {
			if (IfCap1BoughtProcedure.execute(entity)) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance6ButtonMessage(2, x, y, z, textstate));
				Alliance6ButtonMessage.handleButtonAction(entity, 2, x, y, z, textstate);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (IfCap1BoughtProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_buttonclothes4", imagebutton_buttonclothes4);
		this.addRenderableWidget(imagebutton_buttonclothes4);
		imagebutton_buttonclotheslegend2 = new ImageButton(this.leftPos + -17, this.topPos + -17, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclotheslegend2.png"), 32, 64, e -> {
			if (IfPinkBoughtProcedure.execute(entity)) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance6ButtonMessage(3, x, y, z, textstate));
				Alliance6ButtonMessage.handleButtonAction(entity, 3, x, y, z, textstate);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (IfPinkBoughtProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_buttonclotheslegend2", imagebutton_buttonclotheslegend2);
		this.addRenderableWidget(imagebutton_buttonclotheslegend2);
		imagebutton_pinkmansuitlogo = new ImageButton(this.leftPos + -17, this.topPos + -17, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_pinkmansuitlogo.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance6ButtonMessage(4, x, y, z, textstate));
				Alliance6ButtonMessage.handleButtonAction(entity, 4, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_pinkmansuitlogo", imagebutton_pinkmansuitlogo);
		this.addRenderableWidget(imagebutton_pinkmansuitlogo);
		imagebutton_buttonclothes5 = new ImageButton(this.leftPos + 19, this.topPos + 18, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclothes5.png"), 32, 64, e -> {
			if (IfCap2BoughtProcedure.execute(entity)) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance6ButtonMessage(5, x, y, z, textstate));
				Alliance6ButtonMessage.handleButtonAction(entity, 5, x, y, z, textstate);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (IfCap2BoughtProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_buttonclothes5", imagebutton_buttonclothes5);
		this.addRenderableWidget(imagebutton_buttonclothes5);
		imagebutton_buttonclotheslegend3 = new ImageButton(this.leftPos + -52, this.topPos + -17, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclotheslegend3.png"), 32, 64, e -> {
			if (IfBlackBoughtProcedure.execute(entity)) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance6ButtonMessage(6, x, y, z, textstate));
				Alliance6ButtonMessage.handleButtonAction(entity, 6, x, y, z, textstate);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (IfBlackBoughtProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_buttonclotheslegend3", imagebutton_buttonclotheslegend3);
		this.addRenderableWidget(imagebutton_buttonclotheslegend3);
		imagebutton_buttonclotheslegend1 = new ImageButton(this.leftPos + 19, this.topPos + -17, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclotheslegend1.png"), 32, 64, e -> {
			if (IfGreeBoughtProcedure.execute(entity)) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance6ButtonMessage(7, x, y, z, textstate));
				Alliance6ButtonMessage.handleButtonAction(entity, 7, x, y, z, textstate);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (IfGreeBoughtProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_buttonclotheslegend1", imagebutton_buttonclotheslegend1);
		this.addRenderableWidget(imagebutton_buttonclotheslegend1);
		imagebutton_buttonclotheslegend = new ImageButton(this.leftPos + -52, this.topPos + 18, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclotheslegend.png"), 32, 64, e -> {
			if (IfOrrangeBoughtProcedure.execute(entity)) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance6ButtonMessage(8, x, y, z, textstate));
				Alliance6ButtonMessage.handleButtonAction(entity, 8, x, y, z, textstate);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (IfOrrangeBoughtProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_buttonclotheslegend", imagebutton_buttonclotheslegend);
		this.addRenderableWidget(imagebutton_buttonclotheslegend);
		imagebutton_greengirlsuitlogo = new ImageButton(this.leftPos + 19, this.topPos + -18, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_greengirlsuitlogo.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_greengirlsuitlogo", imagebutton_greengirlsuitlogo);
		this.addRenderableWidget(imagebutton_greengirlsuitlogo);
		imagebutton_mansuitlogo = new ImageButton(this.leftPos + -52, this.topPos + -17, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_mansuitlogo.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_mansuitlogo", imagebutton_mansuitlogo);
		this.addRenderableWidget(imagebutton_mansuitlogo);
		imagebutton_orrangegirlsuitlogo = new ImageButton(this.leftPos + -52, this.topPos + 18, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_orrangegirlsuitlogo.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance6ButtonMessage(11, x, y, z, textstate));
				Alliance6ButtonMessage.handleButtonAction(entity, 11, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_orrangegirlsuitlogo", imagebutton_orrangegirlsuitlogo);
		this.addRenderableWidget(imagebutton_orrangegirlsuitlogo);
		imagebutton_cap3 = new ImageButton(this.leftPos + -17, this.topPos + 18, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_cap3.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_cap3", imagebutton_cap3);
		this.addRenderableWidget(imagebutton_cap3);
		imagebutton_cap4 = new ImageButton(this.leftPos + 19, this.topPos + 18, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_cap4.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_cap4", imagebutton_cap4);
		this.addRenderableWidget(imagebutton_cap4);
		imagebutton_rare1 = new ImageButton(this.leftPos + -54, this.topPos + -19, 16, 16, 0, 0, 16, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_rare1.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_rare1", imagebutton_rare1);
		this.addRenderableWidget(imagebutton_rare1);
		imagebutton_epic1 = new ImageButton(this.leftPos + -19, this.topPos + -19, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_epic1.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_epic1", imagebutton_epic1);
		this.addRenderableWidget(imagebutton_epic1);
		imagebutton_epic11 = new ImageButton(this.leftPos + 17, this.topPos + -19, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_epic11.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_epic11", imagebutton_epic11);
		this.addRenderableWidget(imagebutton_epic11);
		imagebutton_legend1 = new ImageButton(this.leftPos + -54, this.topPos + 16, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_legend1.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_legend1", imagebutton_legend1);
		this.addRenderableWidget(imagebutton_legend1);
	}
}
