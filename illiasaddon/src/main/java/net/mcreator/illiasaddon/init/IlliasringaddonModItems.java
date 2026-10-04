
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.illiasaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.illiasaddon.procedures.AlliancZnachieniieSvoistvaProcedure;
import net.mcreator.illiasaddon.procedures.AlliancZnachieniieSvoistva1Procedure;
import net.mcreator.illiasaddon.item.WoolfSheildItem;
import net.mcreator.illiasaddon.item.WoolfAllianceNotActiveItem;
import net.mcreator.illiasaddon.item.WoolfAllianceItem;
import net.mcreator.illiasaddon.item.TransmissionDustItem;
import net.mcreator.illiasaddon.item.TransmissionAllianceNotActiveItem;
import net.mcreator.illiasaddon.item.TransmissionAllianceItem;
import net.mcreator.illiasaddon.item.TableOnItem;
import net.mcreator.illiasaddon.item.TableItem;
import net.mcreator.illiasaddon.item.SpiritAllianceNotActiveItem;
import net.mcreator.illiasaddon.item.SpiritAllianceItem;
import net.mcreator.illiasaddon.item.ProtactionAllianceNotActiveItem;
import net.mcreator.illiasaddon.item.ProtactionAllianceItem;
import net.mcreator.illiasaddon.item.PlateItem;
import net.mcreator.illiasaddon.item.IllusionDustItem;
import net.mcreator.illiasaddon.item.IllusionAllianceNotActiveItem;
import net.mcreator.illiasaddon.item.IllusionAllianceItem;
import net.mcreator.illiasaddon.item.DestructionDustItem;
import net.mcreator.illiasaddon.item.DestructionAllianceNotActiveItem;
import net.mcreator.illiasaddon.item.DestructionAllianceItem;
import net.mcreator.illiasaddon.item.DefaltAllianceItem;
import net.mcreator.illiasaddon.item.CreationDustItem;
import net.mcreator.illiasaddon.item.CreationAlliancenotactiveItem;
import net.mcreator.illiasaddon.item.CreationAllianceItem;
import net.mcreator.illiasaddon.item.AlliancItem;
import net.mcreator.illiasaddon.item.ActionAllianceItem;
import net.mcreator.illiasaddon.item.ActionAlliacneNotActiveItem;
import net.mcreator.illiasaddon.block.display.WayzzCageDisplayItem;
import net.mcreator.illiasaddon.block.display.TrixxcageDisplayItem;
import net.mcreator.illiasaddon.block.display.PollenCageDisplayItem;
import net.mcreator.illiasaddon.block.display.PlaggcageDisplayItem;
import net.mcreator.illiasaddon.block.display.NooroocageDisplayItem;
import net.mcreator.illiasaddon.block.display.MeyShiCageDisplayItem;
import net.mcreator.illiasaddon.block.display.LunnaCageDisplayItem;
import net.mcreator.illiasaddon.block.display.CreationcageDisplayItem;
import net.mcreator.illiasaddon.IlliasringaddonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class IlliasringaddonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IlliasringaddonMod.MODID);
	public static final RegistryObject<Item> CREATIONCAGE = REGISTRY.register(IlliasringaddonModBlocks.CREATIONCAGE.getId().getPath(), () -> new CreationcageDisplayItem(IlliasringaddonModBlocks.CREATIONCAGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CREATION_ALLIANCENOTACTIVE = REGISTRY.register("creation_alliancenotactive", () -> new CreationAlliancenotactiveItem());
	public static final RegistryObject<Item> TRIXX_CAGE = REGISTRY.register(IlliasringaddonModBlocks.TRIXX_CAGE.getId().getPath(), () -> new TrixxcageDisplayItem(IlliasringaddonModBlocks.TRIXX_CAGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ILLUSION_ALLIANCE_NOT_ACTIVE = REGISTRY.register("illusion_alliance_not_active", () -> new IllusionAllianceNotActiveItem());
	public static final RegistryObject<Item> DESTRUCTION_ALLIANCE_NOT_ACTIVE = REGISTRY.register("destruction_alliance_not_active", () -> new DestructionAllianceNotActiveItem());
	public static final RegistryObject<Item> PLAGG_CAGE = REGISTRY.register(IlliasringaddonModBlocks.PLAGG_CAGE.getId().getPath(), () -> new PlaggcageDisplayItem(IlliasringaddonModBlocks.PLAGG_CAGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> TRANSMISSION_ALLIANCE_NOT_ACTIVE = REGISTRY.register("transmission_alliance_not_active", () -> new TransmissionAllianceNotActiveItem());
	public static final RegistryObject<Item> NOOROO_CAGE = REGISTRY.register(IlliasringaddonModBlocks.NOOROO_CAGE.getId().getPath(), () -> new NooroocageDisplayItem(IlliasringaddonModBlocks.NOOROO_CAGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ALLIANC = REGISTRY.register("allianc", () -> new AlliancItem());
	public static final RegistryObject<Item> DEFALT_ALLIANCE = REGISTRY.register("defalt_alliance", () -> new DefaltAllianceItem());
	public static final RegistryObject<Item> CREATION_DUST = REGISTRY.register("creation_dust", () -> new CreationDustItem());
	public static final RegistryObject<Item> DESTRUCTION_DUST = REGISTRY.register("destruction_dust", () -> new DestructionDustItem());
	public static final RegistryObject<Item> ILLUSION_DUST = REGISTRY.register("illusion_dust", () -> new IllusionDustItem());
	public static final RegistryObject<Item> TRANSMISSION_DUST = REGISTRY.register("transmission_dust", () -> new TransmissionDustItem());
	public static final RegistryObject<Item> PLATE = REGISTRY.register("plate", () -> new PlateItem());
	public static final RegistryObject<Item> BLOCK_ALLIANCE_1 = block(IlliasringaddonModBlocks.BLOCK_ALLIANCE_1);
	public static final RegistryObject<Item> BLOCK_ALLIANCE_2 = block(IlliasringaddonModBlocks.BLOCK_ALLIANCE_2);
	public static final RegistryObject<Item> ALLIANCE_BLOCK_3 = block(IlliasringaddonModBlocks.ALLIANCE_BLOCK_3);
	public static final RegistryObject<Item> TABLE = REGISTRY.register("table", () -> new TableItem());
	public static final RegistryObject<Item> TABLE_ON = REGISTRY.register("table_on", () -> new TableOnItem());
	public static final RegistryObject<Item> ACTION_ALLIACNE_NOT_ACTIVE = REGISTRY.register("action_alliacne_not_active", () -> new ActionAlliacneNotActiveItem());
	public static final RegistryObject<Item> POLLEN_CAGE = REGISTRY.register(IlliasringaddonModBlocks.POLLEN_CAGE.getId().getPath(), () -> new PollenCageDisplayItem(IlliasringaddonModBlocks.POLLEN_CAGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOLF_ALLIANCE_NOT_ACTIVE = REGISTRY.register("wolf_alliance_not_active", () -> new WoolfAllianceNotActiveItem());
	public static final RegistryObject<Item> LUUNA_CAGE = REGISTRY.register(IlliasringaddonModBlocks.LUUNA_CAGE.getId().getPath(), () -> new LunnaCageDisplayItem(IlliasringaddonModBlocks.LUUNA_CAGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPIRIT_ALLIANCE_NOT_ACTIVE = REGISTRY.register("spirit_alliance_not_active", () -> new SpiritAllianceNotActiveItem());
	public static final RegistryObject<Item> MEI_SHI_CAGE = REGISTRY.register(IlliasringaddonModBlocks.MEI_SHI_CAGE.getId().getPath(), () -> new MeyShiCageDisplayItem(IlliasringaddonModBlocks.MEI_SHI_CAGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WOOLF_SHEILD = REGISTRY.register("woolf_sheild", () -> new WoolfSheildItem());
	public static final RegistryObject<Item> WAYZZ_CAGE = REGISTRY.register(IlliasringaddonModBlocks.WAYZZ_CAGE.getId().getPath(), () -> new WayzzCageDisplayItem(IlliasringaddonModBlocks.WAYZZ_CAGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> PROTECTION_ALLIANCE_NOT_ACTIVE = REGISTRY.register("protection_alliance_not_active", () -> new ProtactionAllianceNotActiveItem());
	public static final RegistryObject<Item> CREATION_ALLIANCE = REGISTRY.register("creation_alliance", () -> new CreationAllianceItem());
	public static final RegistryObject<Item> PROTECTION_ALLIANCE = REGISTRY.register("protection_alliance", () -> new ProtactionAllianceItem());
	public static final RegistryObject<Item> ACTION_ALLIANCE = REGISTRY.register("action_alliance", () -> new ActionAllianceItem());
	public static final RegistryObject<Item> ILLUSION_ALLIANCE = REGISTRY.register("illusion_alliance", () -> new IllusionAllianceItem());
	public static final RegistryObject<Item> WOLF_ALLIANCE = REGISTRY.register("wolf_alliance", () -> new WoolfAllianceItem());
	public static final RegistryObject<Item> SPIRIT_ALLIANCE = REGISTRY.register("spirit_alliance", () -> new SpiritAllianceItem());
	public static final RegistryObject<Item> DESTRUCTION_ALLIANCE = REGISTRY.register("destruction_alliance", () -> new DestructionAllianceItem());
	public static final RegistryObject<Item> TRANSMISSION_ALLIANCE = REGISTRY.register("transmission_alliance", () -> new TransmissionAllianceItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(ALLIANC.get(), new ResourceLocation("illiasringaddon:allianc_open"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) AlliancZnachieniieSvoistvaProcedure.execute(entity));
			ItemProperties.register(ALLIANC.get(), new ResourceLocation("illiasringaddon:allianc_akuma"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) AlliancZnachieniieSvoistva1Procedure.execute(entity != null ? entity.level() : clientWorld, entity));
			ItemProperties.register(WOOLF_SHEILD.get(), new ResourceLocation("blocking"), ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
		});
	}
}
