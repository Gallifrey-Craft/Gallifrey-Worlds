
package gallifreyworlds.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import gallifreyworlds.procedures.HellraiserLivingEntityIsHitWithToolProcedure;

import gallifreyworlds.init.GallifreyWorldsModItems;

public class HellraiserItem extends SwordItem {
	public HellraiserItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 11.5f;
			}

			public float getAttackDamageBonus() {
				return 7.9f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(GallifreyWorldsModItems.REFINEDIMPERIALITEINGOT.get()));
			}
		}, 3, 0.9f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		HellraiserLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
