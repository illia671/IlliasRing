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

import net.mcreator.illiasaddon.world.inventory.Alliance2Menu;
import net.mcreator.illiasaddon.procedures.IfPinkBoughtProcedure;
import net.mcreator.illiasaddon.procedures.IfOrrangeBoughtProcedure;
import net.mcreator.illiasaddon.procedures.IfGreeBoughtProcedure;
import net.mcreator.illiasaddon.procedures.IfCap2Procedure;
import net.mcreator.illiasaddon.procedures.IfCap1Procedure;
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
import net.mcreator.illiasaddon.network.Alliance2ButtonMessage;
import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Alliance2Screen extends AbstractContainerScreen<Alliance2Menu> {
	private final static HashMap<String, Object> guistate = Alliance2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	Button button_empty;
	Button button_empty1;
	ImageButton imagebutton_next3;
	ImageButton imagebutton_buttonclothes;
	ImageButton imagebutton_buttonclothes2;
	ImageButton imagebutton_buttonclothes3;
	ImageButton imagebutton_buttonclothes4;
	ImageButton imagebutton_buttonclothes5;
	ImageButton imagebutton_buttonclothes6;
	ImageButton imagebutton_buttonclothes7;
	ImageButton imagebutton_buttonclothes8;
	ImageButton imagebutton_buttonclothes11;
	ImageButton imagebutton_buttonclothes12;
	ImageButton imagebutton_clothes1;
	ImageButton imagebutton_buttonclothes1;
	ImageButton imagebutton_clothes2;
	ImageButton imagebutton_clothes3;
	ImageButton imagebutton_clothes4;
	ImageButton imagebutton_clothes5;
	ImageButton imagebutton_clothes6;
	ImageButton imagebutton_clothes7;
	ImageButton imagebutton_clothes8;
	ImageButton imagebutton_buttonrare1;
	ImageButton imagebutton_clothes9;
	ImageButton imagebutton_pinkmansuitlogo;
	ImageButton imagebutton_buttonrare;
	ImageButton imagebutton_greengirlsuitlogo;
	ImageButton imagebutton_mansuitlogo;
	ImageButton imagebutton_orrangegirlsuitlogo;
	ImageButton imagebutton_rare1;
	ImageButton imagebutton_epic1;
	ImageButton imagebutton_epic11;
	ImageButton imagebutton_legend1;
	ImageButton imagebutton_widgets2;
	ImageButton imagebutton_widgets;
	ImageButton imagebutton_widgets1;
	ImageButton imagebutton_widgets3;

	public Alliance2Screen(Alliance2Menu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/phoenix_button1.png"), this.leftPos + -88, this.topPos + 15, 0, 0, 60, 20, 60, 20);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/alliance_ring.png"), this.leftPos + -60, this.topPos + -29, 0, 0, 232, 232, 232, 232);

		guiGraphics.blit(new ResourceLocation("illiasringaddon:textures/screens/clothes5.png"), this.leftPos + -87, this.topPos + 16, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_2.label_who_do_you_want_to_send_a_messag"), -209, 21, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_2.label_to_send_a_message_to"), -209, 29, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.illiasringaddon.alliance_2.label_age_to"), -207, 38, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = new PlainTextButton(this.leftPos + -85, this.topPos + -25, 25, 20, Component.translatable("gui.illiasringaddon.alliance_2.button_empty"), e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(0, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		}, this.font);
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = new PlainTextButton(this.leftPos + -85, this.topPos + -5, 25, 20, Component.translatable("gui.illiasringaddon.alliance_2.button_empty1"), e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(1, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		}, this.font);
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		imagebutton_next3 = new ImageButton(this.leftPos + -28, this.topPos + 183, 16, 16, 0, 0, 16, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_next3.png"), 16, 32, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(2, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 2, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_next3", imagebutton_next3);
		this.addRenderableWidget(imagebutton_next3);
		imagebutton_buttonclothes = new ImageButton(this.leftPos + -52, this.topPos + -19, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclothes.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(3, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 3, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_buttonclothes", imagebutton_buttonclothes);
		this.addRenderableWidget(imagebutton_buttonclothes);
		imagebutton_buttonclothes2 = new ImageButton(this.leftPos + 20, this.topPos + -19, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclothes2.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(4, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 4, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_buttonclothes2", imagebutton_buttonclothes2);
		this.addRenderableWidget(imagebutton_buttonclothes2);
		imagebutton_buttonclothes3 = new ImageButton(this.leftPos + -52, this.topPos + 16, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclothes3.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(5, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 5, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_buttonclothes3", imagebutton_buttonclothes3);
		this.addRenderableWidget(imagebutton_buttonclothes3);
		imagebutton_buttonclothes4 = new ImageButton(this.leftPos + -16, this.topPos + 16, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclothes4.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(6, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 6, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_buttonclothes4", imagebutton_buttonclothes4);
		this.addRenderableWidget(imagebutton_buttonclothes4);
		imagebutton_buttonclothes5 = new ImageButton(this.leftPos + 20, this.topPos + 16, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclothes5.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(7, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 7, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_buttonclothes5", imagebutton_buttonclothes5);
		this.addRenderableWidget(imagebutton_buttonclothes5);
		imagebutton_buttonclothes6 = new ImageButton(this.leftPos + -52, this.topPos + 51, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclothes6.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(8, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 8, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_buttonclothes6", imagebutton_buttonclothes6);
		this.addRenderableWidget(imagebutton_buttonclothes6);
		imagebutton_buttonclothes7 = new ImageButton(this.leftPos + -16, this.topPos + 51, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclothes7.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(9, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 9, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_buttonclothes7", imagebutton_buttonclothes7);
		this.addRenderableWidget(imagebutton_buttonclothes7);
		imagebutton_buttonclothes8 = new ImageButton(this.leftPos + 20, this.topPos + 51, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclothes8.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(10, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 10, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_buttonclothes8", imagebutton_buttonclothes8);
		this.addRenderableWidget(imagebutton_buttonclothes8);
		imagebutton_buttonclothes11 = new ImageButton(this.leftPos + 20, this.topPos + 86, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclothes11.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(11, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 11, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_buttonclothes11", imagebutton_buttonclothes11);
		this.addRenderableWidget(imagebutton_buttonclothes11);
		imagebutton_buttonclothes12 = new ImageButton(this.leftPos + -52, this.topPos + 122, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclothes12.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(12, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 12, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_buttonclothes12", imagebutton_buttonclothes12);
		this.addRenderableWidget(imagebutton_buttonclothes12);
		imagebutton_clothes1 = new ImageButton(this.leftPos + -52, this.topPos + -19, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_clothes1.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_clothes1", imagebutton_clothes1);
		this.addRenderableWidget(imagebutton_clothes1);
		imagebutton_buttonclothes1 = new ImageButton(this.leftPos + -16, this.topPos + -19, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonclothes1.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(14, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 14, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_buttonclothes1", imagebutton_buttonclothes1);
		this.addRenderableWidget(imagebutton_buttonclothes1);
		imagebutton_clothes2 = new ImageButton(this.leftPos + -16, this.topPos + -19, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_clothes2.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_clothes2", imagebutton_clothes2);
		this.addRenderableWidget(imagebutton_clothes2);
		imagebutton_clothes3 = new ImageButton(this.leftPos + 20, this.topPos + -19, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_clothes3.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_clothes3", imagebutton_clothes3);
		this.addRenderableWidget(imagebutton_clothes3);
		imagebutton_clothes4 = new ImageButton(this.leftPos + -52, this.topPos + 16, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_clothes4.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_clothes4", imagebutton_clothes4);
		this.addRenderableWidget(imagebutton_clothes4);
		imagebutton_clothes5 = new ImageButton(this.leftPos + -16, this.topPos + 16, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_clothes5.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_clothes5", imagebutton_clothes5);
		this.addRenderableWidget(imagebutton_clothes5);
		imagebutton_clothes6 = new ImageButton(this.leftPos + 20, this.topPos + 16, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_clothes6.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_clothes6", imagebutton_clothes6);
		this.addRenderableWidget(imagebutton_clothes6);
		imagebutton_clothes7 = new ImageButton(this.leftPos + -52, this.topPos + 51, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_clothes7.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_clothes7", imagebutton_clothes7);
		this.addRenderableWidget(imagebutton_clothes7);
		imagebutton_clothes8 = new ImageButton(this.leftPos + -16, this.topPos + 51, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_clothes8.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_clothes8", imagebutton_clothes8);
		this.addRenderableWidget(imagebutton_clothes8);
		imagebutton_buttonrare1 = new ImageButton(this.leftPos + -16, this.topPos + 86, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonrare1.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(22, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 22, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_buttonrare1", imagebutton_buttonrare1);
		this.addRenderableWidget(imagebutton_buttonrare1);
		imagebutton_clothes9 = new ImageButton(this.leftPos + 20, this.topPos + 51, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_clothes9.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_clothes9", imagebutton_clothes9);
		this.addRenderableWidget(imagebutton_clothes9);
		imagebutton_pinkmansuitlogo = new ImageButton(this.leftPos + -16, this.topPos + 86, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_pinkmansuitlogo.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(24, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 24, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_pinkmansuitlogo", imagebutton_pinkmansuitlogo);
		this.addRenderableWidget(imagebutton_pinkmansuitlogo);
		imagebutton_buttonrare = new ImageButton(this.leftPos + -52, this.topPos + 86, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_buttonrare.png"), 32, 64, e -> {
			if (true) {
				IlliasringaddonMod.PACKET_HANDLER.sendToServer(new Alliance2ButtonMessage(25, x, y, z, textstate));
				Alliance2ButtonMessage.handleButtonAction(entity, 25, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_buttonrare", imagebutton_buttonrare);
		this.addRenderableWidget(imagebutton_buttonrare);
		imagebutton_greengirlsuitlogo = new ImageButton(this.leftPos + 20, this.topPos + 86, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_greengirlsuitlogo.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_greengirlsuitlogo", imagebutton_greengirlsuitlogo);
		this.addRenderableWidget(imagebutton_greengirlsuitlogo);
		imagebutton_mansuitlogo = new ImageButton(this.leftPos + -52, this.topPos + 86, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_mansuitlogo.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_mansuitlogo", imagebutton_mansuitlogo);
		this.addRenderableWidget(imagebutton_mansuitlogo);
		imagebutton_orrangegirlsuitlogo = new ImageButton(this.leftPos + -52, this.topPos + 122, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_orrangegirlsuitlogo.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_orrangegirlsuitlogo", imagebutton_orrangegirlsuitlogo);
		this.addRenderableWidget(imagebutton_orrangegirlsuitlogo);
		imagebutton_rare1 = new ImageButton(this.leftPos + -54, this.topPos + 84, 16, 16, 0, 0, 16, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_rare1.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_rare1", imagebutton_rare1);
		this.addRenderableWidget(imagebutton_rare1);
		imagebutton_epic1 = new ImageButton(this.leftPos + -18, this.topPos + 84, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_epic1.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_epic1", imagebutton_epic1);
		this.addRenderableWidget(imagebutton_epic1);
		imagebutton_epic11 = new ImageButton(this.leftPos + 18, this.topPos + 84, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_epic11.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_epic11", imagebutton_epic11);
		this.addRenderableWidget(imagebutton_epic11);
		imagebutton_legend1 = new ImageButton(this.leftPos + -54, this.topPos + 120, 32, 32, 0, 0, 32, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_legend1.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_legend1", imagebutton_legend1);
		this.addRenderableWidget(imagebutton_legend1);
		imagebutton_widgets2 = new ImageButton(this.leftPos + 28, this.topPos + 93, 16, 16, 0, 0, 16, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_widgets2.png"), 16, 32, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (IfGreeBoughtProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_widgets2", imagebutton_widgets2);
		this.addRenderableWidget(imagebutton_widgets2);
		imagebutton_widgets = new ImageButton(this.leftPos + -44, this.topPos + 93, 16, 16, 0, 0, 16, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_widgets.png"), 16, 32, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (IfBlackBoughtProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_widgets", imagebutton_widgets);
		this.addRenderableWidget(imagebutton_widgets);
		imagebutton_widgets1 = new ImageButton(this.leftPos + -8, this.topPos + 93, 16, 16, 0, 0, 16, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_widgets1.png"), 16, 32, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (IfPinkBoughtProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_widgets1", imagebutton_widgets1);
		this.addRenderableWidget(imagebutton_widgets1);
		imagebutton_widgets3 = new ImageButton(this.leftPos + -44, this.topPos + 129, 16, 16, 0, 0, 16, new ResourceLocation("illiasringaddon:textures/screens/atlas/imagebutton_widgets3.png"), 16, 32, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (IfOrrangeBoughtProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_widgets3", imagebutton_widgets3);
		this.addRenderableWidget(imagebutton_widgets3);
	}
}
