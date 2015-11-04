package com.digimoncrafters.creativetabs;

import com.digimoncrafters.item.DCItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabDigimonFoods extends CreativeTabs {

	public CreativeTabDigimonFoods(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return DCItem.diginoir;
	}

}
