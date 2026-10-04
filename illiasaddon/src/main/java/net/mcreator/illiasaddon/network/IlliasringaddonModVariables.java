package net.mcreator.illiasaddon.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.illiasaddon.IlliasringaddonMod;

import java.util.function.Supplier;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IlliasringaddonModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		IlliasringaddonMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		IlliasringaddonMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.phoenix_ladyshady = original.phoenix_ladyshady;
			clone.weapon = original.weapon;
			clone.HeadAavatarPage = original.HeadAavatarPage;
			clone.ClothesAavatarPage = original.ClothesAavatarPage;
			clone.AllianceDeath = original.AllianceDeath;
			clone.AllianceKills = original.AllianceKills;
			clone.ManSuit = original.ManSuit;
			clone.GreenGirlSuit = original.GreenGirlSuit;
			clone.OrrangeGirlSuit = original.OrrangeGirlSuit;
			clone.PinkManSuit = original.PinkManSuit;
			clone.Chouse = original.Chouse;
			clone.Cap1 = original.Cap1;
			clone.Cap2 = original.Cap2;
			clone.CapAvatarPage = original.CapAvatarPage;
			if (!event.isWasDeath()) {
				clone.ring_power = original.ring_power;
				clone.powerpage = original.powerpage;
				clone.Camo = original.Camo;
				clone.StateBlack = original.StateBlack;
				clone.StatePink = original.StatePink;
				clone.StateOrange = original.StateOrange;
				clone.StateBlueDarck = original.StateBlueDarck;
				clone.StateBlueLight = original.StateBlueLight;
				clone.StateYellow = original.StateYellow;
				clone.StateChloe = original.StateChloe;
				clone.StateGreen = original.StateGreen;
				clone.StatePurple = original.StatePurple;
				clone.StateWhite = original.StateWhite;
				clone.armorphoenix = original.armorphoenix;
				clone.GUIarmorphoenix = original.GUIarmorphoenix;
				clone.savehelmet = original.savehelmet;
				clone.savebody = original.savebody;
				clone.savelegs = original.savelegs;
				clone.saveboots = original.saveboots;
				clone.miraculousphoenixequpit = original.miraculousphoenixequpit;
				clone.particlephoenix = original.particlephoenix;
				clone.phoenixweapon = original.phoenixweapon;
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					IlliasringaddonMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					IlliasringaddonMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					IlliasringaddonMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "illiasringaddon_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				IlliasringaddonMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "illiasringaddon_mapvars";
		public double creationweapon = 0;
		public double illusionweapon = 0;
		public double tikkihungre = 0;
		public double trixxhungre = 0;
		public double nooroohunge = 0;
		public double transmissionweapon = 0;
		public double plaghungre = 0;
		public double destructionweapon = 0;
		public double allianceweaponcreation = 0;
		public double allianceweapondestuction = 0;
		public double allianceweaponillusion = 0;
		public double cage = 0;
		public double alliance = 0;
		public double CgaeDestruction = 0;
		public double CageIllusion = 0;
		public double firstnumber = 0;
		public double lastnumber = 0;
		public double pllus = 0;
		public double dorivnuye = 0;
		public double first = 0;
		public double last = 0;
		public double nooroocage = 0;
		public double PollenCage = 0;
		public double PollenHungre = 0;
		public double ActionWeapon = 0;
		public double LunnaCage = 0;
		public double LunnaHungre = 0;
		public double LunnaWeapon = 0;
		public double SpiritCage = 0;
		public double SpiritHungre = 0;
		public double SpiritWeapon = 0;
		public double pheny_eat = 0;
		public double WayzzCage = 0;
		public double WayzzHungre = 0;
		public double WayzzWeapon = 0;
		public boolean Akuma = false;
		public boolean NewKwamySystem = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			if (nbt == null) {
				nbt = save(new CompoundTag());
			}
			creationweapon = nbt.getDouble("creationweapon");
			illusionweapon = nbt.getDouble("illusionweapon");
			tikkihungre = nbt.getDouble("tikkihungre");
			trixxhungre = nbt.getDouble("trixxhungre");
			nooroohunge = nbt.getDouble("nooroohunge");
			transmissionweapon = nbt.getDouble("transmissionweapon");
			plaghungre = nbt.getDouble("plaghungre");
			destructionweapon = nbt.getDouble("destructionweapon");
			allianceweaponcreation = nbt.getDouble("allianceweaponcreation");
			allianceweapondestuction = nbt.getDouble("allianceweapondestuction");
			allianceweaponillusion = nbt.getDouble("allianceweaponillusion");
			cage = nbt.getDouble("cage");
			alliance = nbt.getDouble("alliance");
			CgaeDestruction = nbt.getDouble("CgaeDestruction");
			CageIllusion = nbt.getDouble("CageIllusion");
			firstnumber = nbt.getDouble("firstnumber");
			lastnumber = nbt.getDouble("lastnumber");
			pllus = nbt.getDouble("pllus");
			dorivnuye = nbt.getDouble("dorivnuye");
			first = nbt.getDouble("first");
			last = nbt.getDouble("last");
			nooroocage = nbt.getDouble("nooroocage");
			PollenCage = nbt.getDouble("PollenCage");
			PollenHungre = nbt.getDouble("PollenHungre");
			ActionWeapon = nbt.getDouble("ActionWeapon");
			LunnaCage = nbt.getDouble("LunnaCage");
			LunnaHungre = nbt.getDouble("LunnaHungre");
			LunnaWeapon = nbt.getDouble("LunnaWeapon");
			SpiritCage = nbt.getDouble("SpiritCage");
			SpiritHungre = nbt.getDouble("SpiritHungre");
			SpiritWeapon = nbt.getDouble("SpiritWeapon");
			pheny_eat = nbt.getDouble("pheny_eat");
			WayzzCage = nbt.getDouble("WayzzCage");
			WayzzHungre = nbt.getDouble("WayzzHungre");
			WayzzWeapon = nbt.getDouble("WayzzWeapon");
			Akuma = nbt.getBoolean("Akuma");
			NewKwamySystem = nbt.getBoolean("NewKwamySystem");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("creationweapon", creationweapon);
			nbt.putDouble("illusionweapon", illusionweapon);
			nbt.putDouble("tikkihungre", tikkihungre);
			nbt.putDouble("trixxhungre", trixxhungre);
			nbt.putDouble("nooroohunge", nooroohunge);
			nbt.putDouble("transmissionweapon", transmissionweapon);
			nbt.putDouble("plaghungre", plaghungre);
			nbt.putDouble("destructionweapon", destructionweapon);
			nbt.putDouble("allianceweaponcreation", allianceweaponcreation);
			nbt.putDouble("allianceweapondestuction", allianceweapondestuction);
			nbt.putDouble("allianceweaponillusion", allianceweaponillusion);
			nbt.putDouble("cage", cage);
			nbt.putDouble("alliance", alliance);
			nbt.putDouble("CgaeDestruction", CgaeDestruction);
			nbt.putDouble("CageIllusion", CageIllusion);
			nbt.putDouble("firstnumber", firstnumber);
			nbt.putDouble("lastnumber", lastnumber);
			nbt.putDouble("pllus", pllus);
			nbt.putDouble("dorivnuye", dorivnuye);
			nbt.putDouble("first", first);
			nbt.putDouble("last", last);
			nbt.putDouble("nooroocage", nooroocage);
			nbt.putDouble("PollenCage", PollenCage);
			nbt.putDouble("PollenHungre", PollenHungre);
			nbt.putDouble("ActionWeapon", ActionWeapon);
			nbt.putDouble("LunnaCage", LunnaCage);
			nbt.putDouble("LunnaHungre", LunnaHungre);
			nbt.putDouble("LunnaWeapon", LunnaWeapon);
			nbt.putDouble("SpiritCage", SpiritCage);
			nbt.putDouble("SpiritHungre", SpiritHungre);
			nbt.putDouble("SpiritWeapon", SpiritWeapon);
			nbt.putDouble("pheny_eat", pheny_eat);
			nbt.putDouble("WayzzCage", WayzzCage);
			nbt.putDouble("WayzzHungre", WayzzHungre);
			nbt.putDouble("WayzzWeapon", WayzzWeapon);
			nbt.putBoolean("Akuma", Akuma);
			nbt.putBoolean("NewKwamySystem", NewKwamySystem);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				IlliasringaddonMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("illiasringaddon", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double ring_power = 0;
		public double powerpage = 0;
		public double Camo = 0;
		public double StateBlack = 0;
		public double StatePink = 0;
		public double StateOrange = 0;
		public double StateBlueDarck = 0;
		public double StateBlueLight = 0;
		public double StateYellow = 0;
		public double StateChloe = 0;
		public double StateGreen = 0;
		public double StatePurple = 0;
		public double StateWhite = 0;
		public double phoenix_ladyshady = 0;
		public double armorphoenix = 0;
		public double GUIarmorphoenix = 0;
		public ItemStack savehelmet = ItemStack.EMPTY;
		public ItemStack savebody = ItemStack.EMPTY;
		public ItemStack savelegs = ItemStack.EMPTY;
		public ItemStack saveboots = ItemStack.EMPTY;
		public double miraculousphoenixequpit = 0;
		public double particlephoenix = 0;
		public double phoenixweapon = 0;
		public boolean weapon = false;
		public double HeadAavatarPage = 0;
		public double ClothesAavatarPage = 0;
		public double AllianceDeath = 0;
		public double AllianceKills = 0;
		public boolean ManSuit = false;
		public boolean GreenGirlSuit = false;
		public boolean OrrangeGirlSuit = false;
		public boolean PinkManSuit = false;
		public String Chouse = "\"\"";
		public boolean Cap1 = false;
		public boolean Cap2 = false;
		public double CapAvatarPage = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				IlliasringaddonMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("ring_power", ring_power);
			nbt.putDouble("powerpage", powerpage);
			nbt.putDouble("Camo", Camo);
			nbt.putDouble("StateBlack", StateBlack);
			nbt.putDouble("StatePink", StatePink);
			nbt.putDouble("StateOrange", StateOrange);
			nbt.putDouble("StateBlueDarck", StateBlueDarck);
			nbt.putDouble("StateBlueLight", StateBlueLight);
			nbt.putDouble("StateYellow", StateYellow);
			nbt.putDouble("StateChloe", StateChloe);
			nbt.putDouble("StateGreen", StateGreen);
			nbt.putDouble("StatePurple", StatePurple);
			nbt.putDouble("StateWhite", StateWhite);
			nbt.putDouble("phoenix_ladyshady", phoenix_ladyshady);
			nbt.putDouble("armorphoenix", armorphoenix);
			nbt.putDouble("GUIarmorphoenix", GUIarmorphoenix);
			nbt.put("savehelmet", savehelmet.save(new CompoundTag()));
			nbt.put("savebody", savebody.save(new CompoundTag()));
			nbt.put("savelegs", savelegs.save(new CompoundTag()));
			nbt.put("saveboots", saveboots.save(new CompoundTag()));
			nbt.putDouble("miraculousphoenixequpit", miraculousphoenixequpit);
			nbt.putDouble("particlephoenix", particlephoenix);
			nbt.putDouble("phoenixweapon", phoenixweapon);
			nbt.putBoolean("weapon", weapon);
			nbt.putDouble("HeadAavatarPage", HeadAavatarPage);
			nbt.putDouble("ClothesAavatarPage", ClothesAavatarPage);
			nbt.putDouble("AllianceDeath", AllianceDeath);
			nbt.putDouble("AllianceKills", AllianceKills);
			nbt.putBoolean("ManSuit", ManSuit);
			nbt.putBoolean("GreenGirlSuit", GreenGirlSuit);
			nbt.putBoolean("OrrangeGirlSuit", OrrangeGirlSuit);
			nbt.putBoolean("PinkManSuit", PinkManSuit);
			nbt.putString("Chouse", Chouse);
			nbt.putBoolean("Cap1", Cap1);
			nbt.putBoolean("Cap2", Cap2);
			nbt.putDouble("CapAvatarPage", CapAvatarPage);
			return nbt;
		}

		public void readNBT(Tag tag) {
			if (tag == null) {
				tag = writeNBT();
			}
			CompoundTag nbt = (CompoundTag) tag;
			if (nbt == null) {
				nbt = (CompoundTag) writeNBT();
			}
			ring_power = nbt.getDouble("ring_power");
			powerpage = nbt.getDouble("powerpage");
			Camo = nbt.getDouble("Camo");
			StateBlack = nbt.getDouble("StateBlack");
			StatePink = nbt.getDouble("StatePink");
			StateOrange = nbt.getDouble("StateOrange");
			StateBlueDarck = nbt.getDouble("StateBlueDarck");
			StateBlueLight = nbt.getDouble("StateBlueLight");
			StateYellow = nbt.getDouble("StateYellow");
			StateChloe = nbt.getDouble("StateChloe");
			StateGreen = nbt.getDouble("StateGreen");
			StatePurple = nbt.getDouble("StatePurple");
			StateWhite = nbt.getDouble("StateWhite");
			phoenix_ladyshady = nbt.getDouble("phoenix_ladyshady");
			armorphoenix = nbt.getDouble("armorphoenix");
			GUIarmorphoenix = nbt.getDouble("GUIarmorphoenix");
			savehelmet = ItemStack.of(nbt.getCompound("savehelmet"));
			savebody = ItemStack.of(nbt.getCompound("savebody"));
			savelegs = ItemStack.of(nbt.getCompound("savelegs"));
			saveboots = ItemStack.of(nbt.getCompound("saveboots"));
			miraculousphoenixequpit = nbt.getDouble("miraculousphoenixequpit");
			particlephoenix = nbt.getDouble("particlephoenix");
			phoenixweapon = nbt.getDouble("phoenixweapon");
			weapon = nbt.getBoolean("weapon");
			HeadAavatarPage = nbt.getDouble("HeadAavatarPage");
			ClothesAavatarPage = nbt.getDouble("ClothesAavatarPage");
			AllianceDeath = nbt.getDouble("AllianceDeath");
			AllianceKills = nbt.getDouble("AllianceKills");
			ManSuit = nbt.getBoolean("ManSuit");
			GreenGirlSuit = nbt.getBoolean("GreenGirlSuit");
			OrrangeGirlSuit = nbt.getBoolean("OrrangeGirlSuit");
			PinkManSuit = nbt.getBoolean("PinkManSuit");
			Chouse = nbt.getString("Chouse");
			Cap1 = nbt.getBoolean("Cap1");
			Cap2 = nbt.getBoolean("Cap2");
			CapAvatarPage = nbt.getDouble("CapAvatarPage");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		IlliasringaddonMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.ring_power = message.data.ring_power;
					variables.powerpage = message.data.powerpage;
					variables.Camo = message.data.Camo;
					variables.StateBlack = message.data.StateBlack;
					variables.StatePink = message.data.StatePink;
					variables.StateOrange = message.data.StateOrange;
					variables.StateBlueDarck = message.data.StateBlueDarck;
					variables.StateBlueLight = message.data.StateBlueLight;
					variables.StateYellow = message.data.StateYellow;
					variables.StateChloe = message.data.StateChloe;
					variables.StateGreen = message.data.StateGreen;
					variables.StatePurple = message.data.StatePurple;
					variables.StateWhite = message.data.StateWhite;
					variables.phoenix_ladyshady = message.data.phoenix_ladyshady;
					variables.armorphoenix = message.data.armorphoenix;
					variables.GUIarmorphoenix = message.data.GUIarmorphoenix;
					variables.savehelmet = message.data.savehelmet;
					variables.savebody = message.data.savebody;
					variables.savelegs = message.data.savelegs;
					variables.saveboots = message.data.saveboots;
					variables.miraculousphoenixequpit = message.data.miraculousphoenixequpit;
					variables.particlephoenix = message.data.particlephoenix;
					variables.phoenixweapon = message.data.phoenixweapon;
					variables.weapon = message.data.weapon;
					variables.HeadAavatarPage = message.data.HeadAavatarPage;
					variables.ClothesAavatarPage = message.data.ClothesAavatarPage;
					variables.AllianceDeath = message.data.AllianceDeath;
					variables.AllianceKills = message.data.AllianceKills;
					variables.ManSuit = message.data.ManSuit;
					variables.GreenGirlSuit = message.data.GreenGirlSuit;
					variables.OrrangeGirlSuit = message.data.OrrangeGirlSuit;
					variables.PinkManSuit = message.data.PinkManSuit;
					variables.Chouse = message.data.Chouse;
					variables.Cap1 = message.data.Cap1;
					variables.Cap2 = message.data.Cap2;
					variables.CapAvatarPage = message.data.CapAvatarPage;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
