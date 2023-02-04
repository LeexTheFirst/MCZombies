
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mczombies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.mczombies.world.features.plants.NothingFeature;
import net.mcreator.mczombies.MczombiesMod;

@Mod.EventBusSubscriber
public class MczombiesModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MczombiesMod.MODID);
	public static final RegistryObject<Feature<?>> NOTHING = REGISTRY.register("nothing", NothingFeature::feature);
}
