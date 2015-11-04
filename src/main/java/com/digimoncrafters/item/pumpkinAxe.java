package com.digimoncrafters.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class pumpkinAxe extends ItemAxe {

	protected pumpkinAxe(ToolMaterial Digizoit) {
		super(Digizoit);
		this.setFull3D();
	}
	public boolean hasEffect(ItemStack par1ItemStack, int pass)
	{
	//This means it will look "special" in the inventory
	return true;
	}


	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
		{
			itemstack.damageItem(8, entityplayer);
				if (!world.isRemote)
				{
						
					Vec3 look = entityplayer.getLookVec();
					EntityLargeFireball fireball2 = new EntityLargeFireball(world, entityplayer, 1, 1, 1);
					fireball2.setPosition(
							entityplayer.posX + look.xCoord * 4, 
							entityplayer.posY + look.yCoord * 4, 
							entityplayer.posZ + look.zCoord * 4);
					fireball2.accelerationX = look.xCoord * 0.1;
					fireball2.accelerationY = look.yCoord * 0.1;
					fireball2.accelerationZ = look.zCoord * 0.1;
					world.spawnEntityInWorld(fireball2);
					}
				return itemstack;
				}

}
