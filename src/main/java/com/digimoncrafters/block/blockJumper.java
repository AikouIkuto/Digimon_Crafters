package com.digimoncrafters.block;

import javax.swing.Icon;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class blockJumper extends Block
{

	public IIcon Side0; 
	public IIcon Side1;
	public IIcon Side2;
	public IIcon Side3;
	public IIcon Side4;
	public IIcon Side5; 
	
	protected blockJumper(Material p_i45394_1_)
	{
		super(p_i45394_1_);
		this.setHardness(10F);
		this.setResistance(30F);
		this.setStepSound(soundTypeCloth);
	}
	
	/*public void onEntityJump(World par1World, int par2, int par3, int par4, Entity par5Entity ){
		par5Entity.motionY += 1.0F;
		par5Entity.fallDistance = 0F;
	} */
	
	public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity ){
		par5Entity.motionY += 1.0F; 
		par5Entity.fallDistance = 0F; 
	}
	public void onFallenUpon(World par1World, int par2, int par3, int par4, Entity par5Entity, float par6){
		par5Entity.motionY += 1.0F;
		par5Entity.fallDistance = 0F;
	}
	
	
	
	public void registerBlockIcons(IIconRegister icon){
		Side0 = icon.registerIcon("dc:jumper");
		Side1 = icon.registerIcon("dc:jumper1");
		Side2 = icon.registerIcon("dc:jumper2");
		Side3 = icon.registerIcon("dc:jumper3");
		Side4 = icon.registerIcon("dc:jumper4");
		Side5 = icon.registerIcon("dc:jumper5");
	}
	 public IIcon getIcon(int side, int meta){
		if(side == 0){  //Change all of this for switch code
			return Side0;
		}else if(side == 1){
			return Side1;
		}else if(side == 2){
			return Side2;
		
	}else if(side == 3){
		return Side3;
		
}else if(side == 4){
	return Side4;
	
}else if(side == 5){
	return Side5;
	
}
		return null;
} //ends here
	 
	 
	 
}
