
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.illiasaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.illiasaddon.world.inventory.TransmissionMenu;
import net.mcreator.illiasaddon.world.inventory.TransferMenu;
import net.mcreator.illiasaddon.world.inventory.TableGui1Menu;
import net.mcreator.illiasaddon.world.inventory.PhoneMeiShiGUI1Menu;
import net.mcreator.illiasaddon.world.inventory.MusickMenu;
import net.mcreator.illiasaddon.world.inventory.Illusion1Menu;
import net.mcreator.illiasaddon.world.inventory.FileMenu;
import net.mcreator.illiasaddon.world.inventory.DestructionMenu;
import net.mcreator.illiasaddon.world.inventory.CreationFileMenu;
import net.mcreator.illiasaddon.world.inventory.CalkulatorMenu;
import net.mcreator.illiasaddon.world.inventory.AsdsaMenu;
import net.mcreator.illiasaddon.world.inventory.Alliance9Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance8Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance7Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance6Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance5Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance4Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance3Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance2Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance1Menu;
import net.mcreator.illiasaddon.world.inventory.Alliance10Menu;
import net.mcreator.illiasaddon.IlliasringaddonMod;

public class IlliasringaddonModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, IlliasringaddonMod.MODID);
	public static final RegistryObject<MenuType<TransferMenu>> TRANSFER = REGISTRY.register("transfer", () -> IForgeMenuType.create(TransferMenu::new));
	public static final RegistryObject<MenuType<TableGui1Menu>> TABLE_GUI_1 = REGISTRY.register("table_gui_1", () -> IForgeMenuType.create(TableGui1Menu::new));
	public static final RegistryObject<MenuType<FileMenu>> FILE = REGISTRY.register("file", () -> IForgeMenuType.create(FileMenu::new));
	public static final RegistryObject<MenuType<CreationFileMenu>> CREATION_FILE = REGISTRY.register("creation_file", () -> IForgeMenuType.create(CreationFileMenu::new));
	public static final RegistryObject<MenuType<DestructionMenu>> DESTRUCTION = REGISTRY.register("destruction", () -> IForgeMenuType.create(DestructionMenu::new));
	public static final RegistryObject<MenuType<TransmissionMenu>> TRANSMISSION = REGISTRY.register("transmission", () -> IForgeMenuType.create(TransmissionMenu::new));
	public static final RegistryObject<MenuType<Illusion1Menu>> ILLUSION_1 = REGISTRY.register("illusion_1", () -> IForgeMenuType.create(Illusion1Menu::new));
	public static final RegistryObject<MenuType<MusickMenu>> MUSICK = REGISTRY.register("musick", () -> IForgeMenuType.create(MusickMenu::new));
	public static final RegistryObject<MenuType<AsdsaMenu>> ASDSA = REGISTRY.register("asdsa", () -> IForgeMenuType.create(AsdsaMenu::new));
	public static final RegistryObject<MenuType<CalkulatorMenu>> CALKULATOR = REGISTRY.register("calkulator", () -> IForgeMenuType.create(CalkulatorMenu::new));
	public static final RegistryObject<MenuType<PhoneMeiShiGUI1Menu>> PHONE_MEI_SHI_GUI_1 = REGISTRY.register("phone_mei_shi_gui_1", () -> IForgeMenuType.create(PhoneMeiShiGUI1Menu::new));
	public static final RegistryObject<MenuType<Alliance1Menu>> ALLIANCE_1 = REGISTRY.register("alliance_1", () -> IForgeMenuType.create(Alliance1Menu::new));
	public static final RegistryObject<MenuType<Alliance3Menu>> ALLIANCE_3 = REGISTRY.register("alliance_3", () -> IForgeMenuType.create(Alliance3Menu::new));
	public static final RegistryObject<MenuType<Alliance4Menu>> ALLIANCE_4 = REGISTRY.register("alliance_4", () -> IForgeMenuType.create(Alliance4Menu::new));
	public static final RegistryObject<MenuType<Alliance5Menu>> ALLIANCE_5 = REGISTRY.register("alliance_5", () -> IForgeMenuType.create(Alliance5Menu::new));
	public static final RegistryObject<MenuType<Alliance6Menu>> ALLIANCE_6 = REGISTRY.register("alliance_6", () -> IForgeMenuType.create(Alliance6Menu::new));
	public static final RegistryObject<MenuType<Alliance2Menu>> ALLIANCE_2 = REGISTRY.register("alliance_2", () -> IForgeMenuType.create(Alliance2Menu::new));
	public static final RegistryObject<MenuType<Alliance7Menu>> ALLIANCE_7 = REGISTRY.register("alliance_7", () -> IForgeMenuType.create(Alliance7Menu::new));
	public static final RegistryObject<MenuType<Alliance8Menu>> ALLIANCE_8 = REGISTRY.register("alliance_8", () -> IForgeMenuType.create(Alliance8Menu::new));
	public static final RegistryObject<MenuType<Alliance9Menu>> ALLIANCE_9 = REGISTRY.register("alliance_9", () -> IForgeMenuType.create(Alliance9Menu::new));
	public static final RegistryObject<MenuType<Alliance10Menu>> ALLIANCE_10 = REGISTRY.register("alliance_10", () -> IForgeMenuType.create(Alliance10Menu::new));
}
