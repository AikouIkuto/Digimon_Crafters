package com.digimoncrafters.creativetabs;

import com.digimoncrafters.item.DCItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabDigimonTools extends CreativeTabs {

	public CreativeTabDigimonTools(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return DCItem.chainsaw;
	}

}
