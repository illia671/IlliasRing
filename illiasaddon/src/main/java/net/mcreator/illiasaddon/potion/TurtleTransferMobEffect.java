
package net.mcreator.illiasaddon.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.illiasaddon.procedures.TurtleTransferPriNalozhieniiEffiektaProcedure;
import net.mcreator.illiasaddon.procedures.TurtleTransferPriIstiechieniiEffiektaProcedure;
import net.mcreator.illiasaddon.procedures.TurtleTransferKazhdyiTikVoVriemiaEffiektaProcedure;

public class TurtleTransferMobEffect extends MobEffect {
	public TurtleTransferMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16777216);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		TurtleTransferPriNalozhieniiEffiektaProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TurtleTransferKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		TurtleTransferPriIstiechieniiEffiektaProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
