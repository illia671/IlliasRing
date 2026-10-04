
package net.mcreator.illiasaddon.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RingHolderMobEffect extends MobEffect {
	public RingHolderMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16777216);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
