package com.digimoncrafters.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class cristalStairs extends BlockStairs {
	protected cristalStairs(Material material) {
		super(Blocks.glass, 0);
		this.setHardness(5F);
		this.setResistance(10F);
		this.setHarvestLevel("pickaxe", 1);
		this.lightOpacity = 0;
		}
	
	@Override 
	public boolean isOpaqueCube()
	{
		return false;
	}
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
}
