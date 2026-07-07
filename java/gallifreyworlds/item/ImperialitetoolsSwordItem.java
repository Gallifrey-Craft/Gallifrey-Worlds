
package gallifreyworlds.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import gallifreyworlds.init.GallifreyWorldsModItems;

public class ImperialitetoolsSwordItem extends SwordItem {
	public ImperialitetoolsSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 5419;
			}

			public float getSpeed() {
				return 22f;
			}

			public float getAttackDamageBonus() {
				return 50f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 126;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(GallifreyWorldsModItems.IMPERIALITE.get()));
			}
		}, 3, -3f, new Item.Properties());
	}
}
