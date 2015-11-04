package com.digimoncrafters.render;

import org.lwjgl.opengl.GL11;

import com.digimoncrafters.model.ModelLaptop;
import com.digimoncrafters.tileentity.TileEntityLaptop;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class RenderLaptop extends TileEntitySpecialRenderer{

	ResourceLocation texture = new ResourceLocation("dc" + ":"+ "textures/models/Laptop.png");
	
	private ModelLaptop model;
	
	public RenderLaptop(){
		this.model = new ModelLaptop();
	}
	
	private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		GL11.glPushMatrix();
		GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
		GL11.glPopMatrix();
		}

	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		
		GL11.glPushMatrix();
		
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		this.bindTexture(texture);
		GL11.glRotatef(180, 0F, 0F, 1F);
		
		GL11.glPushMatrix();
		TileEntityLaptop tile = (TileEntityLaptop) tileentity;
		int direction = tile.direction;
		GL11.glRotatef(direction * 90, 0.0F, 1.0F, 0.0F);
		
		this.model.RenderModel(0.0625F);
		
		GL11.glPopMatrix();
		GL11.glPopMatrix();

	}

	

}
