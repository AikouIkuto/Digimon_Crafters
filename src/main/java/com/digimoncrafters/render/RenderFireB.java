package com.digimoncrafters.render;

import org.lwjgl.opengl.GL11;

import com.digimoncrafters.model.ModelFireB;
import com.digimoncrafters.tileentity.TileEntityFireB;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class RenderFireB extends TileEntitySpecialRenderer {

	ResourceLocation texture = new ResourceLocation("dc" + ":"+ "textures/models/FireB.png");

	private ModelFireB model;
	
	public RenderFireB(){
		this.model = new ModelFireB();
	}
	
	private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		GL11.glPushMatrix();
		GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
		GL11.glPopMatrix();
		}
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x,
			double y, double z, float f) {
			GL11.glPushMatrix();
			GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
			GL11.glRotatef(180, 0F, 0F, 1F);
			this.bindTexture(texture);
			TileEntityFireB tile = (TileEntityFireB) tileentity;
			int direction = tile.direction;
			GL11.glRotatef(direction * 90, 0.0F, 1.0F, 0.0F);
			
			GL11.glPushMatrix();
				this.model.renderModel(0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();

	}

}