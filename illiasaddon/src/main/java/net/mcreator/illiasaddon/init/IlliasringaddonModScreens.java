
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.illiasaddon.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.illiasaddon.client.gui.TransmissionScreen;
import net.mcreator.illiasaddon.client.gui.TransferScreen;
import net.mcreator.illiasaddon.client.gui.TableGui1Screen;
import net.mcreator.illiasaddon.client.gui.PhoneMeiShiGUI1Screen;
import net.mcreator.illiasaddon.client.gui.MusickScreen;
import net.mcreator.illiasaddon.client.gui.Illusion1Screen;
import net.mcreator.illiasaddon.client.gui.FileScreen;
import net.mcreator.illiasaddon.client.gui.DestructionScreen;
import net.mcreator.illiasaddon.client.gui.CreationFileScreen;
import net.mcreator.illiasaddon.client.gui.CalkulatorScreen;
import net.mcreator.illiasaddon.client.gui.AsdsaScreen;
import net.mcreator.illiasaddon.client.gui.Alliance9Screen;
import net.mcreator.illiasaddon.client.gui.Alliance8Screen;
import net.mcreator.illiasaddon.client.gui.Alliance7Screen;
import net.mcreator.illiasaddon.client.gui.Alliance6Screen;
import net.mcreator.illiasaddon.client.gui.Alliance5Screen;
import net.mcreator.illiasaddon.client.gui.Alliance4Screen;
import net.mcreator.illiasaddon.client.gui.Alliance3Screen;
import net.mcreator.illiasaddon.client.gui.Alliance2Screen;
import net.mcreator.illiasaddon.client.gui.Alliance1Screen;
import net.mcreator.illiasaddon.client.gui.Alliance10Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class IlliasringaddonModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(IlliasringaddonModMenus.TRANSFER.get(), TransferScreen::new);
			MenuScreens.register(IlliasringaddonModMenus.TABLE_GUI_1.get(), TableGui1Screen::new);
			MenuScreens.register(IlliasringaddonModMenus.FILE.get(), FileScreen::new);
			MenuScreens.register(IlliasringaddonModMenus.CREATION_FILE.get(), CreationFileScreen::new);
			MenuScreens.register(IlliasringaddonModMenus.DESTRUCTION.get(), DestructionScreen::new);
			MenuScreens.register(IlliasringaddonModMenus.TRANSMISSION.get(), TransmissionScreen::new);
			MenuScreens.register(IlliasringaddonModMenus.ILLUSION_1.get(), Illusion1Screen::new);
			MenuScreens.register(IlliasringaddonModMenus.MUSICK.get(), MusickScreen::new);
			MenuScreens.register(IlliasringaddonModMenus.ASDSA.get(), AsdsaScreen::new);
			MenuScreens.register(IlliasringaddonModMenus.CALKULATOR.get(), CalkulatorScreen::new);
			MenuScreens.register(IlliasringaddonModMenus.PHONE_MEI_SHI_GUI_1.get(), PhoneMeiShiGUI1Screen::new);
			MenuScreens.register(IlliasringaddonModMenus.ALLIANCE_1.get(), Alliance1Screen::new);
			MenuScreens.register(IlliasringaddonModMenus.ALLIANCE_3.get(), Alliance3Screen::new);
			MenuScreens.register(IlliasringaddonModMenus.ALLIANCE_4.get(), Alliance4Screen::new);
			MenuScreens.register(IlliasringaddonModMenus.ALLIANCE_5.get(), Alliance5Screen::new);
			MenuScreens.register(IlliasringaddonModMenus.ALLIANCE_6.get(), Alliance6Screen::new);
			MenuScreens.register(IlliasringaddonModMenus.ALLIANCE_2.get(), Alliance2Screen::new);
			MenuScreens.register(IlliasringaddonModMenus.ALLIANCE_7.get(), Alliance7Screen::new);
			MenuScreens.register(IlliasringaddonModMenus.ALLIANCE_8.get(), Alliance8Screen::new);
			MenuScreens.register(IlliasringaddonModMenus.ALLIANCE_9.get(), Alliance9Screen::new);
			MenuScreens.register(IlliasringaddonModMenus.ALLIANCE_10.get(), Alliance10Screen::new);
		});
	}
}
