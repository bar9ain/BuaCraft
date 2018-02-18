package vyrus.init;

import java.util.ArrayList;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vyrus.items.ItemSkin;

public class ModSkins {
	private static String[] normalList = new String[] {
			"Batman",
			"Blitzen",
			"ChrisCringle",
			"Comet",
			"CoolClaus",
			"CringleCreeperCardigan",
			"Cupid",
			"Dancer",
			"Dasher",
			"Dishevelf",
			"Donner",
			"Krampus",
			"MistletoesTheBigfoot",
			"MrsCoolClaus",
			"Noelf",
			"Prancer",
			"SnowhohomanSweater",
			"Spiderman",
			"Tinself",
			"Toastmaster",
			"Toastmistress",
			"Vixen",
			"YuletideYeti"
	};
	private static ArrayList<ItemSkin> skins = new ArrayList<ItemSkin>();

	public static void init() {
		for (String name : normalList) {
			ItemSkin skin = new ItemSkin(name);
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
