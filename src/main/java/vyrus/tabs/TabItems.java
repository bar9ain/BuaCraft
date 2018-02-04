package vyrus.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TabItems extends CreativeTabs {
	public TabItems() {
		super("items");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getByNameOrId("buacraft:buacrew");
	}

}