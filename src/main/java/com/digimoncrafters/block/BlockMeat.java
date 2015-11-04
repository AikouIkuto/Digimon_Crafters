package com.digimoncrafters.block;

import com.digimoncrafters.item.DCItem;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockMeat extends BlockCrops
{
    private IIcon[] field_149869_a;
    private static final String __OBFID = "CL_00000286";

    /**
     * Gets the block's texture. Args: side, meta
     */
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (p_149691_2_ < 7)
        {
            if (p_149691_2_ == 6)
            {
                p_149691_2_ = 5;
            }

            return this.field_149869_a[p_149691_2_ >> 1];
        }
        else
        {
            return this.field_149869_a[3];
        }
    }

    protected Item func_149866_i()
    {
        return DCItem.meat;
    }

    protected Item func_149865_P()
    {
        return DCItem.meat;
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
    {
        super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, p_149690_7_);

        if (!p_149690_1_.isRemote)
        {
            if (p_149690_5_ >= 7 && p_149690_1_.rand.nextInt(50) == 0)
            {
                this.dropBlockAsItem(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, new ItemStack(DCItem.meatGiant));
            }
        }
    }

    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_149869_a = new IIcon[4];

        for (int var2 = 0; var2 < this.field_149869_a.length; ++var2)
        {
            this.field_149869_a[var2] = p_149651_1_.registerIcon(this.getTextureName() + "_stage_" + var2);
        }
    }
}