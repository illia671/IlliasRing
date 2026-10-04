
package net.mcreator.illiasaddon.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.illiasaddon.procedures.IllusiontransferPriNalozhieniiEffiektaProcedure;
import net.mcreator.illiasaddon.procedures.IllusiontransferKazhdyiTikVoVriemiaEffiektaProcedure;
import net.mcreator.illiasaddon.procedures.GhffhfghfghfgProcedure;

public class IllusiontransferMobEffect extends MobEffect {
	public IllusiontransferMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16777216);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		IllusiontransferPriNalozhieniiEffiektaProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		IllusiontransferKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		GhffhfghfghfgProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
