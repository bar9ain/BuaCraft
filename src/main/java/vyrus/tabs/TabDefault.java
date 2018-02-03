package vyrus.tabs;

import com.momnop.furniture.blocks.FurnitureBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabDefault extends CreativeTabs {

	public TabDefault() {
		super("furniture");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(FurnitureBlocks.desk);
	}
}
