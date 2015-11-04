package com.digimoncrafters.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class steelBlock extends Block {

	protected steelBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHarvestLevel ("pickaxe", 2);
		this.setHardness(23F);
		this.setResistance(6000F);
		this.setStepSound(soundTypeAnvil);
	}
 
}
