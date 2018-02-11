package vyrus.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Enchantments;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vyrus.armour.ArmourPack;

public class ModArmour {
	private static String[] normalList = new String[] { "red_power", "yellow_power", "blue_power", "green_power",
			"pink_power", "headless_horseman", "witch", "freddy", "jason", "myers", "scream" };
	private static String[] noBootsWithOverlay = new String[] { "scarecrow" };
	private static String[] noBootsNoOverlay = new String[] {"skeleton", "banshee", "frankenstein", "werewolf", "ghost" };
	private static ArrayList<ArmourPack> packList = new ArrayList<ArmourPack>();

	public static void init() {

		for (String skin : normalList) {
			ArmourPack pack = new ArmourPack(EnumHelper.addArmorMaterial(skin, Reference.MODID + ":" + skin, 5,
					new int[] { 1, 2, 3, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F), true, false);
			packList.add(pack);
		}
		
		for (String skin : noBootsWithOverlay) {
			ArmourPack pack = new ArmourPack(EnumHelper.addArmorMaterial(skin, Reference.MODID + ":" + skin, 5,
					new int[] { 1, 2, 3, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F), false, true);
			packList.add(pack);
		}
		
		for (String skin : noBootsNoOverlay) {
			ArmourPack pack = new ArmourPack(EnumHelper.addArmorMaterial(skin, Reference.MODID + ":" + skin, 5,
					new int[] { 1, 2, 3, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F), false, false);
			packList.add(pack);
		}
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		for (ArmourPack pack : packList) {
			pack.initModels();
		}
	}
}
