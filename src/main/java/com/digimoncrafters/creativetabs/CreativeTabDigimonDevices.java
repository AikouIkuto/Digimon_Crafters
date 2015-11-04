package com.digimoncrafters.creativetabs;

import com.digimoncrafters.item.DCItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabDigimonDevices extends CreativeTabs {

	public CreativeTabDigimonDevices(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return DCItem.incubator;
	}

}
