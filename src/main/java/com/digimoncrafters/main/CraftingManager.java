package com.digimoncrafters.main;

import com.digimoncrafters.block.DCBlock;
import com.digimoncrafters.item.DCItem;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {
public static void mainRegistry(){
	addCraftingRec();
	addSmeltingRec();
	
	
	}
public static void addCraftingRec(){
	//Shaped Recipe
	GameRegistry.addRecipe(new ItemStack(DCItem.aquanMidData, 1), new Object[]{"xxx", "xxx", "xxx", 'x', DCItem.aquanData});
	GameRegistry.addRecipe(new ItemStack(DCItem.beastMidData, 1), new Object[]{"xxx", "xxx", "xxx", 'x', DCItem.beastData});
	GameRegistry.addRecipe(new ItemStack(DCItem.birdMidData, 1) , new Object[]{"xxx", "xxx", "xxx", 'x', DCItem.birdData});
	GameRegistry.addRecipe(new ItemStack(DCItem.devilMidData, 1),  new Object[]{"xxx", "xxx","xxx", 'x', DCItem.devilData});
	GameRegistry.addRecipe(new ItemStack(DCItem.dragonMidData, 1), new Object[]{"xxx", "xxx", "xxx", 'x', DCItem.dragonData});
	GameRegistry.addRecipe(new ItemStack(DCItem.holyMidData, 1), new Object[]{"xxx", "xxx", "xxx", 'x', DCItem.holyData});
	GameRegistry.addRecipe(new ItemStack(DCItem.insectMidData, 1), new Object[]{"xxx", "xxx", "xxx", 'x', DCItem.insectData});
	GameRegistry.addRecipe(new ItemStack(DCItem.machineMidData,1), new Object[]{"xxx", "xxx", "xxx", 'x', DCItem.machineData});
	GameRegistry.addRecipe(new ItemStack(DCItem.plantMidData, 1), new Object[]{"xxx", "xxx", "xxx", 'x', DCItem.plantData});
	
	GameRegistry.addRecipe(new ItemStack(DCItem.artGenome, 1), new Object[]{"xxx", "xyx", "xxx", 'x', DCItem.machineMidData, 'y', DCItem.digitalDNA});
	GameRegistry.addRecipe(new ItemStack(DCItem.avianGenome, 1), new Object[]{"xxx", "xyx", "xxx", 'x', DCItem.birdMidData, 'y', DCItem.digitalDNA});
	GameRegistry.addRecipe(new ItemStack(DCItem.botanicGenome, 1), new Object[]{"xxx", "xyx", "xxx", 'x', DCItem.plantMidData, 'y', DCItem.digitalDNA});
	GameRegistry.addRecipe(new ItemStack(DCItem.depthGenome, 1), new Object[]{"xxx", "xyx", "xxx", 'x', DCItem.aquanMidData, 'y', DCItem.digitalDNA});
	GameRegistry.addRecipe(new ItemStack(DCItem.devilGenome, 1), new Object[]{"xxx", "xyx", "xxx", 'x', DCItem.devilMidData, 'y', DCItem.digitalDNA});
	GameRegistry.addRecipe(new ItemStack(DCItem.feralGenome, 1), new Object[]{"xxx", "xyx", "xxx", 'x', DCItem.beastMidData,  'y', DCItem.digitalDNA});
	GameRegistry.addRecipe(new ItemStack(DCItem.insectGenome, 1), new Object[]{"xxx", "xyx", "xxx", 'x', DCItem.insectMidData, 'y', DCItem.digitalDNA});
	GameRegistry.addRecipe(new ItemStack(DCItem.justiceGenome, 1), new Object[]{"xxx", "xyx", "xxx", 'x', DCItem.holyMidData, 'y', DCItem.digitalDNA});
	GameRegistry.addRecipe(new ItemStack(DCItem.reptileGenome, 1), new Object[]{"xxx", "xyx", "xxx", 'x', DCItem.dragonMidData, 'y', DCItem.digitalDNA});
	
	GameRegistry.addRecipe(new ItemStack(DCBlock.linkaStairs, 4), new Object[]{"  x", " xx", "xxx", 'x', DCBlock.linkaBrick});
	GameRegistry.addRecipe(new ItemStack(DCBlock.ruinStairs, 4), new Object[]{"  x", " xx", "xxx", 'x', DCBlock.ruinBlock});
	GameRegistry.addRecipe(new ItemStack(DCBlock.stoneStairs, 4), new Object[]{"  x", " xx", "xxx", 'x', DCBlock.stoneBrick});
	GameRegistry.addRecipe(new ItemStack(DCBlock.cristalStairs, 4), new Object[]{"  x", " xx", "xxx", 'x', Blocks.glass});



	
	//Shapeless Recipe
	GameRegistry.addShapelessRecipe(new ItemStack(DCItem.mutantData,1), new Object[]{DCItem.aquanMidData, DCItem.beastMidData, DCItem.birdMidData, DCItem.devilMidData, DCItem.dragonMidData, DCItem.holyMidData, DCItem.insectMidData, DCItem.machineMidData, DCItem.plantMidData });
	
	
	}
public static void addSmeltingRec(){
	GameRegistry.addSmelting(DCItem.diginoir, new ItemStack(DCItem.diginoir2), 15.0F);
	
	}
}
