package com.misero.modskeleton.items;

import com.misero.modskeleton.ModSkeleton;
import com.misero.modskeleton.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String id){
        setUnlocalizedName(id);
        setRegistryName(ModSkeleton.MODID, id);
        setCreativeTab(CreativeTabs.MISC); //TODO: REMOVE THIS DEBUG LINE
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ModSkeleton.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
