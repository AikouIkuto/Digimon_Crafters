package com.digimoncrafters.creativetabs;

import com.digimoncrafters.item.DCItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabDigimonWeapons extends CreativeTabs {

	public CreativeTabDigimonWeapons(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return DCItem.shinai;
	}

}
