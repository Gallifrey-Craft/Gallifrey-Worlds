
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gallifreyworlds.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import gallifreyworlds.GallifreyWorldsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GallifreyWorldsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GallifreyWorldsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(GallifreyWorldsModBlocks.IMPERIALITEBLOCK.get().asItem());
			tabData.accept(GallifreyWorldsModBlocks.VOIDBLOCK.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(GallifreyWorldsModItems.IMPERIALITE_HELMET.get());
			tabData.accept(GallifreyWorldsModItems.IMPERIALITE_CHESTPLATE.get());
			tabData.accept(GallifreyWorldsModItems.IMPERIALITE_LEGGINGS.get());
			tabData.accept(GallifreyWorldsModItems.IMPERIALITE_BOOTS.get());
			tabData.accept(GallifreyWorldsModItems.IMPERIALITETOOLS_SWORD.get());
			tabData.accept(GallifreyWorldsModItems.REFINED_IMPERIALITE_ARMOR_HELMET.get());
			tabData.accept(GallifreyWorldsModItems.REFINED_IMPERIALITE_ARMOR_CHESTPLATE.get());
			tabData.accept(GallifreyWorldsModItems.REFINED_IMPERIALITE_ARMOR_LEGGINGS.get());
			tabData.accept(GallifreyWorldsModItems.REFINED_IMPERIALITE_ARMOR_BOOTS.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(GallifreyWorldsModItems.REFINEDIMPERIALITEINGOT.get());
			tabData.accept(GallifreyWorldsModItems.VOID_BETWEEN_WORLDS.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(GallifreyWorldsModBlocks.IMPERIALORE.get().asItem());
			tabData.accept(GallifreyWorldsModItems.IMPERIALITE.get());
			tabData.accept(GallifreyWorldsModItems.IMPERIALITEINGOT.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(GallifreyWorldsModItems.IMPERIALITETOOLS_PICKAXE.get());
			tabData.accept(GallifreyWorldsModItems.IMPERIALITETOOLS_AXE.get());
			tabData.accept(GallifreyWorldsModItems.IMPERIALITETOOLS_SHOVEL.get());
			tabData.accept(GallifreyWorldsModItems.IMPERIALITETOOLS_HOE.get());
			tabData.accept(GallifreyWorldsModItems.CIVEDA.get());
			tabData.accept(GallifreyWorldsModItems.HELLRAISER.get());

		}
	}
}
