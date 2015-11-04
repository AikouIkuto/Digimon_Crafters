package com.digimoncrafters.block;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;

public class stoneStairs extends BlockStairs {
	protected stoneStairs(Material material) {
		super(DCBlock.stoneBrick, 0);
		this.setHardness(20F);
		this.setResistance(60F);
		this.setHarvestLevel("pickaxe", 1);
	}
}
