package com.digimoncrafters.creativetabs;

import com.digimoncrafters.item.DCItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabDigimonItems extends CreativeTabs {

	public CreativeTabDigimonItems(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return DCItem.digitalDNA;
	}

}
