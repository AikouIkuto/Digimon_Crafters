package com.digimoncrafters.block;

import java.util.Random;

import com.digimoncrafters.item.DCItem;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class huanglongOre extends Block {

	protected huanglongOre(Material material) {
		super(material);
		this.setHardness(4.0F);
		this.setStepSound(soundTypePiston);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(8);
	}

	public Item getItemDropped(int metadata, Random random, int fortune){
		return DCItem.chrondigizoit;
		
	}
}
