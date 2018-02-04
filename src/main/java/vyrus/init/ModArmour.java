package vyrus.init;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vyrus.armour.ArmourPackage;

public class ModArmour {
	public static ArmorMaterial RED_POWER = EnumHelper.addArmorMaterial("red_power", Reference.MODID + ":red_power", 5,
			new int[] { 1, 2, 3, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

	public static ArmourPackage redPowerArmour;
	
	public static void init() {
		redPowerArmour = new ArmourPackage(RED_POWER);
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		redPowerArmour.initModels();
	}
}
