package com.digimoncrafters.block;

import com.digimoncrafters.creativetabs.DCCreativeTabs;
import com.digimoncrafters.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class DCBlock {

	public static void mainRegistry(){
		initialiseBlock();
		registerBlock();
	}
	
	//Regular (Cubic) Blocks
	public static Block huanglongOre;
	public static Block steelBlock;
	public static Block linkaBrick;
	public static Block linkaStairs;
	public static Block ruinBlock;
	public static Block ruinStairs;
	public static Block stoneBrick;
	public static Block stoneStairs;
	public static Block cristalStairs;
	public static Block BlockMeat;
	public static Block BlockBigMeat;
	public static Block blockJumper;
	
	//TileEntities
	public static Block laptop;
	public static Block FireB;
	
	
	
	public static void initialiseBlock(){
		
		huanglongOre = new huanglongOre(Material.rock).setBlockName("Huanlong").setCreativeTab(DCCreativeTabs.tabDigimonBlocks).setBlockTextureName("dc:huanlong");
		steelBlock = new steelBlock(Material.iron).setBlockName("SteelBlock").setCreativeTab(DCCreativeTabs.tabDigimonBlocks).setBlockTextureName("dc:steelblock");
		linkaBrick = new linkaBrick(Material.rock).setBlockName("LinkaBrick").setCreativeTab(DCCreativeTabs.tabDigimonBlocks).setBlockTextureName("dc:Linkabrick");
		linkaStairs = new linkaStairs(Material.rock).setBlockName("LinkaStairs").setCreativeTab(DCCreativeTabs.tabDigimonBlocks);
		ruinBlock = new ruinBlock(Material.rock).setBlockName("RuinBlock").setCreativeTab(DCCreativeTabs.tabDigimonBlocks).setBlockTextureName("dc:RuinBlock");
		ruinStairs = new ruinStairs(Material.rock).setBlockName("RuinStairs").setCreativeTab(DCCreativeTabs.tabDigimonBlocks);
		stoneBrick = new stoneBrick(Material.rock).setBlockName("StoneBrick").setCreativeTab(DCCreativeTabs.tabDigimonBlocks).setBlockTextureName("dc:StoneBrick");
		stoneStairs = new stoneStairs(Material.rock).setBlockName("StoneStairs").setCreativeTab(DCCreativeTabs.tabDigimonBlocks);
		cristalStairs = new cristalStairs(Material.glass).setBlockName("CristalStairs").setCreativeTab(DCCreativeTabs.tabDigimonBlocks);
		blockJumper = new blockJumper(Material.cloth).setBlockName("Jumper").setCreativeTab(DCCreativeTabs.tabDigimonBlocks).setBlockTextureName("dc:jumper");
		BlockMeat = new BlockMeat().setBlockName("BlockMeat").setBlockTextureName("dc:digimeat");
		BlockBigMeat = new BlockBigMeat().setBlockName("BlockBigMeat").setBlockTextureName("dc:bigmeat");
		
		laptop = new laptop(Material.circuits).setBlockName("Laptop").setCreativeTab(DCCreativeTabs.tabDigimonDevices).setBlockTextureName("dc:Laptop");
		FireB = new FireB(Material.iron).setBlockName("FireB").setCreativeTab(DCCreativeTabs.tabDigimonSpirits).setBlockTextureName("dc:FireB");
        

	}
	
	public static void registerBlock(){
		
		GameRegistry.registerBlock(huanglongOre, huanglongOre.getUnlocalizedName());
		GameRegistry.registerBlock(steelBlock, steelBlock.getUnlocalizedName());
		GameRegistry.registerBlock(linkaBrick, linkaBrick.getUnlocalizedName());
		GameRegistry.registerBlock(linkaStairs, linkaStairs.getUnlocalizedName());
		GameRegistry.registerBlock(ruinBlock, ruinBlock.getUnlocalizedName());
		GameRegistry.registerBlock(ruinStairs, ruinStairs.getUnlocalizedName());
		GameRegistry.registerBlock(stoneBrick, stoneBrick.getUnlocalizedName());
		GameRegistry.registerBlock(stoneStairs, stoneStairs.getUnlocalizedName());
		GameRegistry.registerBlock(cristalStairs, cristalStairs.getUnlocalizedName());
		GameRegistry.registerBlock(BlockMeat, BlockMeat.getUnlocalizedName());
		GameRegistry.registerBlock(BlockBigMeat, BlockBigMeat.getUnlocalizedName());
		GameRegistry.registerBlock(blockJumper, blockJumper.getUnlocalizedName());
		
		GameRegistry.registerBlock(laptop, laptop.getUnlocalizedName());
		GameRegistry.registerBlock(FireB, FireB.getUnlocalizedName());
	}
	
}
