
package net.mcreator.illiasaddon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CreationDustItem extends Item {
	public CreationDustItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
