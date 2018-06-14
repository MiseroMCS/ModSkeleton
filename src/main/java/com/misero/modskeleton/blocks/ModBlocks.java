package com.misero.modskeleton.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block SKELETON_BLOCK = new BlockBase("blockskeleton", Material.IRON);
}
