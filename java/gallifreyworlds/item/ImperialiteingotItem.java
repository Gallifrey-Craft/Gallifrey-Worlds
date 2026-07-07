
package gallifreyworlds.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ImperialiteingotItem extends Item {
	public ImperialiteingotItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}
}
