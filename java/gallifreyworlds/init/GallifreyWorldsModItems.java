
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gallifreyworlds.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import gallifreyworlds.item.VoidBetweenWorldsItem;
import gallifreyworlds.item.RefinedimperialiteingotItem;
import gallifreyworlds.item.ImperialitetoolsSwordItem;
import gallifreyworlds.item.ImperialitetoolsShovelItem;
import gallifreyworlds.item.ImperialitetoolsPickaxeItem;
import gallifreyworlds.item.ImperialitetoolsHoeItem;
import gallifreyworlds.item.ImperialitetoolsAxeItem;
import gallifreyworlds.item.ImperialiteingotItem;
import gallifreyworlds.item.ImperialiteaItem;
import gallifreyworlds.item.ImperialiteItem;
import gallifreyworlds.item.HellraiserItem;
import gallifreyworlds.item.CivedaItem;

import gallifreyworlds.GallifreyWorldsMod;

public class GallifreyWorldsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GallifreyWorldsMod.MODID);
	public static final RegistryObject<Item> IMPERIALORE = block(GallifreyWorldsModBlocks.IMPERIALORE);
	public static final RegistryObject<Item> IMPERIALITE = REGISTRY.register("imperialite", () -> new ImperialiteItem());
	public static final RegistryObject<Item> IMPERIALITE_HELMET = REGISTRY.register("imperialite_helmet", () -> new ImperialiteaItem.Helmet());
	public static final RegistryObject<Item> IMPERIALITE_CHESTPLATE = REGISTRY.register("imperialite_chestplate", () -> new ImperialiteaItem.Chestplate());
	public static final RegistryObject<Item> IMPERIALITE_LEGGINGS = REGISTRY.register("imperialite_leggings", () -> new ImperialiteaItem.Leggings());
	public static final RegistryObject<Item> IMPERIALITE_BOOTS = REGISTRY.register("imperialite_boots", () -> new ImperialiteaItem.Boots());
	public static final RegistryObject<Item> IMPERIALITETOOLS_PICKAXE = REGISTRY.register("imperialitetools_pickaxe", () -> new ImperialitetoolsPickaxeItem());
	public static final RegistryObject<Item> IMPERIALITETOOLS_AXE = REGISTRY.register("imperialitetools_axe", () -> new ImperialitetoolsAxeItem());
	public static final RegistryObject<Item> IMPERIALITETOOLS_SWORD = REGISTRY.register("imperialitetools_sword", () -> new ImperialitetoolsSwordItem());
	public static final RegistryObject<Item> IMPERIALITETOOLS_SHOVEL = REGISTRY.register("imperialitetools_shovel", () -> new ImperialitetoolsShovelItem());
	public static final RegistryObject<Item> IMPERIALITETOOLS_HOE = REGISTRY.register("imperialitetools_hoe", () -> new ImperialitetoolsHoeItem());
	public static final RegistryObject<Item> CIVEDA = REGISTRY.register("civeda", () -> new CivedaItem());
	public static final RegistryObject<Item> IMPERIALITEINGOT = REGISTRY.register("imperialiteingot", () -> new ImperialiteingotItem());
	public static final RegistryObject<Item> IMPERIALITEBLOCK = block(GallifreyWorldsModBlocks.IMPERIALITEBLOCK);
	public static final RegistryObject<Item> REFINEDIMPERIALITEINGOT = REGISTRY.register("refinedimperialiteingot", () -> new RefinedimperialiteingotItem());
	public static final RegistryObject<Item> HELLRAISER = REGISTRY.register("hellraiser", () -> new HellraiserItem());
	public static final RegistryObject<Item> VOID_BETWEEN_WORLDS = REGISTRY.register("void_between_worlds", () -> new VoidBetweenWorldsItem());
	public static final RegistryObject<Item> VOIDBLOCK = block(GallifreyWorldsModBlocks.VOIDBLOCK);
	public static final RegistryObject<Item> REFINED_IMPERIALITE_ARMOR_HELMET = REGISTRY.register("refined_imperialite_armor_helmet", () -> new RefinedImperialiteArmorItem.Helmet());
	public static final RegistryObject<Item> REFINED_IMPERIALITE_ARMOR_CHESTPLATE = REGISTRY.register("refined_imperialite_armor_chestplate", () -> new RefinedImperialiteArmorItem.Chestplate());
	public static final RegistryObject<Item> REFINED_IMPERIALITE_ARMOR_LEGGINGS = REGISTRY.register("refined_imperialite_armor_leggings", () -> new RefinedImperialiteArmorItem.Leggings());
	public static final RegistryObject<Item> REFINED_IMPERIALITE_ARMOR_BOOTS = REGISTRY.register("refined_imperialite_armor_boots", () -> new RefinedImperialiteArmorItem.Boots());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
