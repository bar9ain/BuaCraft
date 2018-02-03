package com.momnop.furniture.client.render;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vyrus.init.Reference;

public final class RenderRegistry {
	public static ArrayList<Block> registryBlocks = new ArrayList<Block>();
	
	@SideOnly(Side.CLIENT)
	public static void registerRenderers() {
		for (int i = 0; i < registryBlocks.size(); i++) {
			register(registryBlocks.get(i));
		}
	}

	public static void register(Block block) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						Item.getItemFromBlock(block),
						0,
						new ModelResourceLocation(Reference.MODID + ":"
								+ block.getUnlocalizedName().substring(5),
								"inventory"));
	}

	public static void register(Item item) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						item,
						0,
						new ModelResourceLocation(Reference.MODID + ":"
								+ item.getUnlocalizedName().substring(5),
								"inventory"));
	}
}