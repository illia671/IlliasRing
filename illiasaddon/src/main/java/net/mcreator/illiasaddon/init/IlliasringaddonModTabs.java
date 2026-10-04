
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.illiasaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.illiasaddon.IlliasringaddonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IlliasringaddonModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IlliasringaddonMod.MODID);
	public static final RegistryObject<CreativeModeTab> ALLIANCE = REGISTRY.register("alliance",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.illiasringaddon.alliance")).icon(() -> new ItemStack(IlliasringaddonModItems.CREATION_ALLIANCE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(IlliasringaddonModItems.CREATION_ALLIANCE.get());
				tabData.accept(IlliasringaddonModItems.DESTRUCTION_ALLIANCE.get());
				tabData.accept(IlliasringaddonModItems.TRANSMISSION_ALLIANCE.get());
				tabData.accept(IlliasringaddonModItems.ILLUSION_ALLIANCE.get());
				tabData.accept(IlliasringaddonModItems.ACTION_ALLIANCE.get());
				tabData.accept(IlliasringaddonModItems.PROTECTION_ALLIANCE.get());
				tabData.accept(IlliasringaddonModItems.WOLF_ALLIANCE.get());
				tabData.accept(IlliasringaddonModItems.SPIRIT_ALLIANCE.get());
				tabData.accept(IlliasringaddonModItems.DEFALT_ALLIANCE.get());
				tabData.accept(IlliasringaddonModBlocks.CREATIONCAGE.get().asItem());
				tabData.accept(IlliasringaddonModBlocks.PLAGG_CAGE.get().asItem());
				tabData.accept(IlliasringaddonModBlocks.NOOROO_CAGE.get().asItem());
				tabData.accept(IlliasringaddonModBlocks.TRIXX_CAGE.get().asItem());
				tabData.accept(IlliasringaddonModBlocks.POLLEN_CAGE.get().asItem());
				tabData.accept(IlliasringaddonModBlocks.WAYZZ_CAGE.get().asItem());
				tabData.accept(IlliasringaddonModBlocks.LUUNA_CAGE.get().asItem());
				tabData.accept(IlliasringaddonModBlocks.MEI_SHI_CAGE.get().asItem());
				tabData.accept(IlliasringaddonModBlocks.BLOCK_ALLIANCE_1.get().asItem());
				tabData.accept(IlliasringaddonModBlocks.BLOCK_ALLIANCE_2.get().asItem());
				tabData.accept(IlliasringaddonModBlocks.ALLIANCE_BLOCK_3.get().asItem());
				tabData.accept(IlliasringaddonModItems.ALLIANC.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(IlliasringaddonModItems.WOOLF_SHEILD.get());
		}
	}
}
