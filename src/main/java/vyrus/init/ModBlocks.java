package vyrus.init;

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vyrus.blocks.fridge.FridgeBlock;
import vyrus.blocks.trader.TraderBlock;

public class ModBlocks {
	public static TraderBlock TRADER;
	public static FridgeBlock FRIDGE;

	public static void init() {
		TRADER = new TraderBlock("trader");
		FRIDGE = new FridgeBlock("fridge");
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		TRADER.initModel();
		FRIDGE.initModel();
	}
}
