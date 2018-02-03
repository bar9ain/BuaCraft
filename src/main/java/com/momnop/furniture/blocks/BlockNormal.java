package com.momnop.furniture.blocks;

import com.momnop.furniture.client.render.RenderRegistry;

import mcjty.lib.compat.CompatBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import vyrus.init.Reference;

public class BlockNormal extends CompatBlock {

	public BlockNormal(Material materialIn, float hardness, SoundType type, String unlocalizedName, CreativeTabs tab) {
		super(materialIn);
		setRegistryName(unlocalizedName);
        setUnlocalizedName(getRegistryName().toString().replace(Reference.MODID + ":", ""));
        RenderRegistry.registryBlocks.add(this);
        FurnitureBlocks.register(this);
        setCreativeTab(tab);
        setSoundType(type);
        setHardness(hardness);
	}
	
}
