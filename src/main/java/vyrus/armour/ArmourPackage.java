package vyrus.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmourPackage {

	private ArmourItem helmet, chestplate, leggings, boots;

	public ArmourPackage(ArmorMaterial material) {
		helmet = new ArmourItem(material, 1, EntityEquipmentSlot.HEAD, material.name() + "_head");
		chestplate = new ArmourItem(material, 1, EntityEquipmentSlot.CHEST, material.name() + "_chest");
		leggings = new ArmourItem(material, 2, EntityEquipmentSlot.LEGS, material.name() + "_legs");
		boots = new ArmourItem(material, 1, EntityEquipmentSlot.FEET, material.name() + "_boots");
	}

	@SideOnly(Side.CLIENT)
	public void initModels() {
		helmet.initModel();
		chestplate.initModel();
		leggings.initModel();
		boots.initModel();
	}
}
