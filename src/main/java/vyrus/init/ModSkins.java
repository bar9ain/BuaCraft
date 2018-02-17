package vyrus.init;

import java.util.ArrayList;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vyrus.items.ItemSkin;

public class ModSkins {
	private static String[] normalList = new String[] { "dasher", "spiderman" };
	private static String[] capeList = new String[] { "batman" };
	private static ArrayList<ItemSkin> skins = new ArrayList<ItemSkin>();

	public static void init() {
		for (String name : normalList) {
			ItemSkin skin = new ItemSkin(name);
			skins.add(skin);
		}
		for (String name : capeList) {
			ItemSkin skin = new ItemSkin(name, true);
			skins.add(skin);
		}
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		for (ItemSkin skin : skins) {
			skin.initModels();
		}
	}
}
