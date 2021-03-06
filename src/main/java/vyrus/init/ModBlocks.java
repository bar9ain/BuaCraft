package vyrus.init;

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vyrus.blocks.fridge.FridgeBlock;
import vyrus.blocks.fridge.FridgeHelper;
import vyrus.blocks.trader.TraderBlock;
import vyrus.tabs.TabDecoration;

public class ModBlocks {
	public static TraderBlock TRADER;
	public static FridgeBlock FRIDGE;
	public static FridgeHelper FRIDGEHELPER;

	public static void init() {
		TRADER = new TraderBlock("trader");
		FRIDGE = new FridgeBlock("fridge");
		FRIDGEHELPER = new FridgeHelper();
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		TRADER.initModel();
		FRIDGE.initModel();
	}
}
