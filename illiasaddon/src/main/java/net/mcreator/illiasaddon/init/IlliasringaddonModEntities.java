
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.illiasaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.illiasaddon.entity.WayzzEffectEntity;
import net.mcreator.illiasaddon.entity.TrixxEffectEntity;
import net.mcreator.illiasaddon.entity.TikkiEffectEntity;
import net.mcreator.illiasaddon.entity.SassEffectEntity;
import net.mcreator.illiasaddon.entity.PollenEffectEntity;
import net.mcreator.illiasaddon.entity.PlaggEffectEntity;
import net.mcreator.illiasaddon.entity.NoorooEffectEntity;
import net.mcreator.illiasaddon.entity.DussuEffectEntity;
import net.mcreator.illiasaddon.IlliasringaddonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IlliasringaddonModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, IlliasringaddonMod.MODID);
	public static final RegistryObject<EntityType<TikkiEffectEntity>> TIKKI_EFFECT = register("tikki_effect", EntityType.Builder.<TikkiEffectEntity>of(TikkiEffectEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TikkiEffectEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TrixxEffectEntity>> TRIXX_EFFECT = register("trixx_effect", EntityType.Builder.<TrixxEffectEntity>of(TrixxEffectEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrixxEffectEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NoorooEffectEntity>> NOOROO_EFFECT = register("nooroo_effect", EntityType.Builder.<NoorooEffectEntity>of(NoorooEffectEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NoorooEffectEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DussuEffectEntity>> DUSSU_EFFECT = register("dussu_effect", EntityType.Builder.<DussuEffectEntity>of(DussuEffectEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DussuEffectEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PlaggEffectEntity>> PLAGG_EFFECT = register("plagg_effect", EntityType.Builder.<PlaggEffectEntity>of(PlaggEffectEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PlaggEffectEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PollenEffectEntity>> POLLEN_EFFECT = register("pollen_effect", EntityType.Builder.<PollenEffectEntity>of(PollenEffectEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PollenEffectEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WayzzEffectEntity>> WAYZZ_EFFECT = register("wayzz_effect", EntityType.Builder.<WayzzEffectEntity>of(WayzzEffectEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WayzzEffectEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SassEffectEntity>> SASS_EFFECT = register("sass_effect", EntityType.Builder.<SassEffectEntity>of(SassEffectEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(SassEffectEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TikkiEffectEntity.init();
			TrixxEffectEntity.init();
			NoorooEffectEntity.init();
			DussuEffectEntity.init();
			PlaggEffectEntity.init();
			PollenEffectEntity.init();
			WayzzEffectEntity.init();
			SassEffectEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TIKKI_EFFECT.get(), TikkiEffectEntity.createAttributes().build());
		event.put(TRIXX_EFFECT.get(), TrixxEffectEntity.createAttributes().build());
		event.put(NOOROO_EFFECT.get(), NoorooEffectEntity.createAttributes().build());
		event.put(DUSSU_EFFECT.get(), DussuEffectEntity.createAttributes().build());
		event.put(PLAGG_EFFECT.get(), PlaggEffectEntity.createAttributes().build());
		event.put(POLLEN_EFFECT.get(), PollenEffectEntity.createAttributes().build());
		event.put(WAYZZ_EFFECT.get(), WayzzEffectEntity.createAttributes().build());
		event.put(SASS_EFFECT.get(), SassEffectEntity.createAttributes().build());
	}
}
