
package net.mcreator.illiasaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IllusionDustItem extends Item {
	public IllusionDustItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
