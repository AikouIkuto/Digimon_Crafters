package com.digimoncrafters.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class linkaBrick extends Block {

	protected linkaBrick(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel ("pickaxe", 1);
		this.setHardness(10F);
		this.setResistance(40F);
		}

}
