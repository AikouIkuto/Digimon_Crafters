package com.digimoncrafters.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;

public class linkaStairs extends BlockStairs {

protected linkaStairs(Material material) {
super(DCBlock.linkaBrick, 0);
this.setHardness(10F);
this.setResistance(40F);
this.setHarvestLevel("pickaxe", 1);
}
}
