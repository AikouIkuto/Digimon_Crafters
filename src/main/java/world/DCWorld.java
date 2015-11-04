package world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class DCWorld {
	public static void mainRegistry()
	{
		initialiseWorldGen();
	}

	public static void initialiseWorldGen()
	{
		registerWorldGen(new WorldGenOre(), 1);
	}
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability)
	{
		GameRegistry.registerWorldGenerator(worldGenClass, 1);
	}
}
