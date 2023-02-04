
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mczombies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mczombies.block.NothingBlock;
import net.mcreator.mczombies.MczombiesMod;

public class MczombiesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MczombiesMod.MODID);
	public static final RegistryObject<Block> NOTHING = REGISTRY.register("nothing", () -> new NothingBlock());
}
