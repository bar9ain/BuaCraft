package vyrus.init;

import java.util.ArrayList;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static String[] items = { "coin_gold", "coin_silver", "coin_bronze", "buacrew" };
	public static ArrayList<Item> list = new ArrayList<Item>();

	public static void init() {
		for (String name : items) {
			Item item = new Item().setUnlocalizedName(name).setRegistryName(name).setCreativeTab(BuaCraft.tabItems);
			GameRegistry.register(item);
			list.add(item);
		}
	}

	public static void initModels() {
		for (Item item : list)
			registerRender(item);
	}

	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(
				new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}

}
