package com.digimoncrafters.block;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;

public class ruinStairs extends BlockStairs {
	protected ruinStairs(Material material) {
		super(DCBlock.ruinBlock, 0);
		this.setHardness(15F);
		this.setResistance(50F);
		this.setHarvestLevel("pickaxe", 1);
		}
		
}
