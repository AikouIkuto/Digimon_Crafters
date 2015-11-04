package com.digimoncrafters.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityCardmonC2 extends EntityAnimal {

	public EntityCardmonC2(World par1World) {
		super(par1World);
		this.setSize(0.9F, 0.4F);
		this.tasks.addTask(0, new EntityAIWander(this, 1.7D));
		this.tasks.addTask(0, new EntityAIPanic(this, 1.9D));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.tasks.addTask(3, new EntityAISwimming(this));
		this.tasks.addTask(4, new EntityAITempt(this, 0.3D, Items.paper, false));
		

	}
	
	public boolean IsAIEnabled(){
		return true;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(45.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.7D);
		
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityCardmonC2(worldObj);
	}

	
	
	
	
		
	

	

}
