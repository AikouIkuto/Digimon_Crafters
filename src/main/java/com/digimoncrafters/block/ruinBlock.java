package com.digimoncrafters.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ruinBlock extends Block {

	protected ruinBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel ("pickaxe", 1);
		this.setHardness(15F);
		this.setResistance(50F);
	}

}
