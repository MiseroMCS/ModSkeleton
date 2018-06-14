package com.misero.modskeleton.blocks;

import com.misero.modskeleton.ModSkeleton;
import com.misero.modskeleton.items.ModItems;
import com.misero.modskeleton.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String id, Material blockMaterial) {
        super(blockMaterial);
        setUnlocalizedName(id);
        setRegistryName(ModSkeleton.MODID, id);
        setCreativeTab(CreativeTabs.MISC); //TODO: REMOVE THIS DEBUG
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        ModSkeleton.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
