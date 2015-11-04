package com.digimoncrafters.main;

import com.digimoncrafters.entity.EntityCardmonC2;
import com.digimoncrafters.entity.EntityGrenade;
import com.digimoncrafters.item.DCItem;
import com.digimoncrafters.model.ModelCardmonC2;
import com.digimoncrafters.render.RenderCardmonC2;
import com.digimoncrafters.render.RenderFireB;
import com.digimoncrafters.render.RenderLaptop;
import com.digimoncrafters.tileentity.TileEntityFireB;
import com.digimoncrafters.tileentity.TileEntityLaptop;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class ClientProxy extends ServerProxy {

	public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityCardmonC2.class, new RenderCardmonC2(new ModelCardmonC2(), 0.0F ));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderSnowball(DCItem.grenade));
		
		//SpecialRenderer
		TileEntitySpecialRenderer render1 = new RenderLaptop();
		TileEntitySpecialRenderer render2 = new RenderFireB();

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLaptop.class, render1);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFireB.class, render2);



			
	}
	public void registerTileEntitySpecialRenderer(){
		
	}
}
