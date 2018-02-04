package vyrus.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import vyrus.init.ModBlocks;

public class TabDecoration extends CreativeTabs {
	public TabDecoration() {
		super("decoration");
	}

	@Override
	public Item getTabIconItem() {
		return new ItemStack(ModBlocks.FRIDGE).getItem();
	}

}