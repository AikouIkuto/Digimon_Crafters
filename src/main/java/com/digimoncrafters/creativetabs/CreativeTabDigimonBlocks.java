package com.digimoncrafters.creativetabs;

import com.digimoncrafters.block.DCBlock;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabDigimonBlocks extends CreativeTabs {

	public CreativeTabDigimonBlocks(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(DCBlock.steelBlock);
	}

}
