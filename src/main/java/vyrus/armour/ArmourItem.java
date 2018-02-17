package vyrus.armour;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vyrus.init.BuaCraft;
import vyrus.init.Reference;
import vyrus.models.ModelBatman;

public class ArmourItem extends ItemArmor {
	//
	// private Enchantment enchantment = null;
	// private int enchantmentLevel = 0;
	private boolean hasOverlay;
	private ModelBiped model;

	public ArmourItem(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String name,
			boolean hasOverlay, ModelBiped model) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.hasOverlay = hasOverlay;
		this.model = model;
		this.setUnlocalizedName(name);
		this.setRegistryName(new ResourceLocation(Reference.MODID, name));
		GameRegistry.register(this);
		// this.setCreativeTab(BuaCraft.tabItems);
	}

	// public ArmourItem(ArmorMaterial materialIn, int renderIndexIn,
	// EntityEquipmentSlot equipmentSlotIn, String name,
	// Enchantment enchantment, int level) {
	// super(materialIn, renderIndexIn, equipmentSlotIn);
	// this.enchantment = enchantment;
	// this.enchantmentLevel = level;
	// this.setUnlocalizedName(name);
	// this.setRegistryName(new ResourceLocation(Reference.MODID, name));
	// this.setCreativeTab(BuaCraft.tabItems);
	// GameRegistry.register(this);
	// }

	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
		NBTTagCompound nbttagcompound = stack.getTagCompound();

		if (nbttagcompound == null) {
			nbttagcompound = new NBTTagCompound();
			stack.setTagCompound(nbttagcompound);
			nbttagcompound.setInteger("Unbreakable", 1);
		}
		
		super.onUpdate(stack, world, entity, itemSlot, isSelected);
		// if (enchantment != null)
		// if (stack.isItemEnchanted() == false) {
		// stack.addEnchantment(enchantment, enchantmentLevel);
		// super.onUpdate(stack, world, entity, itemSlot, isSelected);
		// }
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return false;
	}

	@Override
	public boolean hasOverlay(ItemStack stack) {
		return this.hasOverlay;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack stack, EntityEquipmentSlot armorSlot,
			ModelBiped defaultModel) {

		if (stack != null) {
			if (stack.getItem() instanceof ItemArmor) {
				ModelBiped armorModel = new ModelBiped(0.5f);
				if (model instanceof ModelBatman)
					armorModel = new ModelBatman();
				// EntityEquipmentSlot type = ((ItemArmor) stack.getItem()).armorType;
				// switch (type) {
				// case HEAD:
				// case LEGS:
				// case FEET:
				// case CHEST:
				// default:
				// break;
				// }
				/*
				 * armorModel.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				 * armorModel.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				 * armorModel.bipedBody.showModel = (armorSlot == EntityEquipmentSlot.CHEST) ||
				 * (armorSlot == EntityEquipmentSlot.CHEST); armorModel.bipedRightArm.showModel
				 * = armorSlot == EntityEquipmentSlot.CHEST; armorModel.bipedLeftArm.showModel =
				 * armorSlot == EntityEquipmentSlot.CHEST; armorModel.bipedRightLeg.showModel =
				 * (armorSlot == EntityEquipmentSlot.LEGS) || (armorSlot ==
				 * EntityEquipmentSlot.FEET); armorModel.bipedLeftLeg.showModel = (armorSlot ==
				 * EntityEquipmentSlot.LEGS) || (armorSlot == EntityEquipmentSlot.FEET);
				 * 
				 * armorModel.isSneak = defaultModel.isSneak; armorModel.isRiding =
				 * defaultModel.isRiding; armorModel.isChild = defaultModel.isChild;
				 * armorModel.rightArmPose = defaultModel.rightArmPose; armorModel.leftArmPose =
				 * defaultModel.leftArmPose;
				 */

				return armorModel;
			}
		}
		return null;
	}

}
