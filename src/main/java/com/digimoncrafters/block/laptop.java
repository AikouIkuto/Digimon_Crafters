package com.digimoncrafters.block;

import com.digimoncrafters.tileentity.TileEntityLaptop;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class laptop extends BlockContainer 
	{
	

	//this.setBlockBounds(0.4F, 0.0F, 0.4F, 0.6F, 3.0F, 0.6F); //This creates a custom hit box, see the
		// sign for an example of this, more specifically the "stick" part of the model.
	
	public laptop(Material material) 
	{
		super(material);
		this.setHardness(10F);
		this.setResistance(5.0F);
		this.setLightLevel(14);
		this.setStepSound(soundTypeMetal);

	}
	
	
	@Override
	public int getRenderType()
	{
		return -1;
	}
	
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	
	public TileEntity createNewTileEntity(World world, int var2) 
	{
		return new TileEntityLaptop();
		}
	
	@Override // Started adding here
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
	{
	if (entity == null)
	{
	return;
	}
	
	TileEntityLaptop tile = (TileEntityLaptop) world.getTileEntity(x, y, z);
	tile.direction = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
	}

	}
	
	