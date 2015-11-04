package com.digimoncrafters.main;

import com.digimoncrafters.block.DCBlock;
import com.digimoncrafters.creativetabs.DCCreativeTabs;
import com.digimoncrafters.entity.DCEntity;
import com.digimoncrafters.item.DCItem;
import com.digimoncrafters.lib.Strings;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.world.WorldType;
import world.DCWorld;

@Mod(modid = Strings.MODID , name = Strings.NAME , version = Strings.VERSION )

public class MainRegistry {
	
	@SidedProxy(clientSide = "com.digimoncrafters.main.ClientProxy", serverSide = "com.digimoncrafters.main.ServerProxy")
	public static ServerProxy proxy;
	
	@Instance(Strings.MODID)
	public static MainRegistry modInstance;
	
	/**
	 * Loads Before
	 * @param PreEvent
	 */
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		DCCreativeTabs.InitialiseTabs();
		DCBlock.mainRegistry();
		DCItem.mainRegistry(); //once something is added this is written here to call the methods required for it to be executed
		CraftingManager.mainRegistry();
		DCEntity.mainRegistry();
		DCWorld.mainRegistry();
		
		proxy.registerRenderThings();
		
	}
	
	/**
	 * Loads During
	 * @param event
	 */
	@EventHandler
	public static void Load(FMLInitializationEvent event){
		
	}
	
	/**
	 * Loads After
	 * @param PostEvent
	 */
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
		
	}

}
