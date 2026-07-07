
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package gallifreyworlds.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import gallifreyworlds.block.VoidblockBlock;
import gallifreyworlds.block.VoidBetweenWorldsPortalBlock;
import gallifreyworlds.block.ImperialoreBlock;
import gallifreyworlds.block.ImperialiteblockBlock;
import gallifreyworlds.block.CivedaPortalBlock;

import gallifreyworlds.GallifreyWorldsMod;

public class GallifreyWorldsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GallifreyWorldsMod.MODID);
	public static final RegistryObject<Block> IMPERIALORE = REGISTRY.register("imperialore", () -> new ImperialoreBlock());
	public static final RegistryObject<Block> CIVEDA_PORTAL = REGISTRY.register("civeda_portal", () -> new CivedaPortalBlock());
	public static final RegistryObject<Block> IMPERIALITEBLOCK = REGISTRY.register("imperialiteblock", () -> new ImperialiteblockBlock());
	public static final RegistryObject<Block> VOID_BETWEEN_WORLDS_PORTAL = REGISTRY.register("void_between_worlds_portal", () -> new VoidBetweenWorldsPortalBlock());
	public static final RegistryObject<Block> VOIDBLOCK = REGISTRY.register("voidblock", () -> new VoidblockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
