package com.digimoncrafters.entity;

import com.digimoncrafters.main.MainRegistry;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class DCEntity {
	public static void mainRegistry(){
		registerEntity();
	}
	public static void registerEntity(){
		createEntit(EntityCardmonC2.class, "CardmonC2", 0xFFFFFF, 0x00FFFF );
		createEntit(EntityGrenade.class, "grenade", 0x008521, 0x000F08);
	}
	
	public static void createEntit(Class entityClass, String entityName, int solidColour, int spotColour){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);													//
		
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, MainRegistry.modInstance, 32, 1, true);					// ditto
		EntityRegistry.addSpawn(entityClass, 10, 1, 5, EnumCreatureType.waterCreature, BiomeGenBase.swampland, BiomeGenBase.forest);//ditto
		createEgg(randomId, solidColour, spotColour); //if I don't put this the entity wont have a spawn egg in the creative tabs  /ditto if desired
		
		
	}
	private static void createEgg(int randomId, int solidColour, int spotColour) { //This goes with the above Egg creation
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColour, spotColour)); // this tsuu

		
		
	}
}
		
	