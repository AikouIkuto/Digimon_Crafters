package com.digimoncrafters.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class stoneBrick extends Block {

	protected stoneBrick(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel ("pickaxe", 1);
		this.setHardness(20F);
		this.setResistance(60F);
	}

}
