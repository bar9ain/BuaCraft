package vyrus.armour;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vyrus.init.BuaCraft;
import vyrus.init.Reference;

public class ArmourPack extends Item {

	private ArmourItem helmet, chestplate, leggings, boots;
	private String name;
	private boolean hasBoots;
	private boolean inUse;

	public ArmourPack(String name, boolean hasBoots, boolean hasOverlay) {
		this(name, hasBoots, hasOverlay, new ModelBiped());
	}

	public ArmourPack(String name, boolean hasBoots, boolean hasOverlay, ModelBiped render) {
		this.name = name;
		this.hasBoots = hasBoots;
		ArmorMaterial material = EnumHelper.addArmorMaterial(name, Reference.MODID + ":" + name, 5,
				new int[] { 1, 2, 3, 1 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
		helmet = new ArmourItem(material, 1, EntityEquipmentSlot.HEAD, name + "_head", hasOverlay, render);
		chestplate = new ArmourItem(material, 1, EntityEquipmentSlot.CHEST, name + "_chest", hasOverlay, render);
		leggings = new ArmourItem(material, 2, EntityEquipmentSlot.LEGS, name + "_legs", hasOverlay, render);
		if (hasBoots)
			boots = new ArmourItem(material, 1, EntityEquipmentSlot.FEET, name + "_boots", hasOverlay, render);
		this.setProperties();
	}
	//
	// public ArmourPack(ArmorMaterial material, Enchantment en, int level, boolean
	// hasBoots) {
	// this.name = material.name();
	// this.hasBoots = hasBoots;
	// helmet = new ArmourItem(material, 1, EntityEquipmentSlot.HEAD, name +
	// "_head", en, level);
	// chestplate = new ArmourItem(material, 1, EntityEquipmentSlot.CHEST, name +
	// "_chest", en, level);
	// leggings = new ArmourItem(material, 2, EntityEquipmentSlot.LEGS, name +
	// "_legs", en, level);
	// if (hasBoots)
	// boots = new ArmourItem(material, 1, EntityEquipmentSlot.FEET, name +
	// "_boots", en, level);
	// this.setProperties();
	// }

	public void setProperties() {
		this.setUnlocalizedName(name + "_pack");
		this.setRegistryName(new ResourceLocation(Reference.MODID, name + "_pack"));
		this.setCreativeTab(BuaCraft.tabItems);
		this.setMaxStackSize(1);
		GameRegistry.register(this);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {
		return inUse;
	}

	@SideOnly(Side.CLIENT)
	public void initModels() {
		helmet.initModel();
		chestplate.initModel();
		leggings.initModel();
		if (hasBoots)
			boots.initModel();
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(
				new ResourceLocation(Reference.MODID, this.getUnlocalizedName().substring(5)), "inventory"));
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {
		final NBTTagCompound entityData = player.getEntityData();
		final NBTTagCompound persistedData = entityData.getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG);
		entityData.setTag(EntityPlayer.PERSISTED_NBT_TAG, persistedData);
		persistedData.setString("buacraft_skin", stack.getItem().getUnlocalizedName());
//		if (!world.isRemote) {
//			ItemArmor[] list = hasBoots ? new ItemArmor[] { helmet, chestplate, leggings, boots }
//					: new ItemArmor[] { helmet, chestplate, leggings };
//			boolean canExtract = true;
//			for (ItemArmor item : list) {
//				EntityEquipmentSlot slot = EntityLiving.getSlotForItemStack(new ItemStack(item));
//				ItemStack itemstack = player.getItemStackFromSlot(slot);
//				if (itemstack != null) {
//					canExtract = false;
//				}
//			}
//			if (canExtract) {
//				for (ItemArmor item : list) {
//					EntityEquipmentSlot slot = EntityLiving.getSlotForItemStack(new ItemStack(item));
//					player.setItemStackToSlot(slot, new ItemStack(item, 1));
//				}
//				stack.stackSize = 0;
//				return new ActionResult(EnumActionResult.SUCCESS, stack);
//			} else {
//				player.addChatMessage(new TextComponentString(TextFormatting.RED.toString()
//						+ TextFormatting.BOLD.toString() + I18n.format("item.skin_pack.message")));
//
//				return new ActionResult(EnumActionResult.FAIL, stack);
//			}
//		}
		return new ActionResult(EnumActionResult.SUCCESS, stack);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entity, int itemSlot, boolean isSelected) {
		final NBTTagCompound entityData = ((EntityPlayer) entity).getEntityData();
		final NBTTagCompound persistedData = entityData.getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG);
		entityData.setTag(EntityPlayer.PERSISTED_NBT_TAG, persistedData);
		String skinname = persistedData.getString("buacraft_skin").substring(5).replaceAll("_pack", "");
		String packname = stack.getItem().getRegistryName().getResourcePath().replaceAll("_pack", "");
		inUse = packname.equals(skinname);
	}
}
