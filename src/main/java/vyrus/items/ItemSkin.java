package vyrus.items;

import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vyrus.init.BuaCraft;
import vyrus.init.Reference;

public class ItemSkin extends Item {
	private String name;
	private boolean inUse, cape;
	public ModelPlayer model;

	public ItemSkin(String name) {
		this(name, false);
	}

	public ItemSkin(String name, boolean cape) {
		this.name = name;
		this.cape = cape;
		this.setUnlocalizedName("skin." + name);
		this.setRegistryName(new ResourceLocation(Reference.MODID, "skin." + name));
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
		ModelLoader.setCustomModelResourceLocation(this, 0,
				new ModelResourceLocation(new ResourceLocation(Reference.MODID, "skins/" + name), "inventory"));
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {
		NBTTagCompound entityData = player.getEntityData();
		NBTTagCompound persistedData = entityData.getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG);
		entityData.setTag(EntityPlayer.PERSISTED_NBT_TAG, persistedData);
		persistedData.setString("buacraft_skin", stack.getItem().getRegistryName().getResourcePath());
		return new ActionResult(EnumActionResult.SUCCESS, stack);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entity, int itemSlot, boolean isSelected) {
		if (!(entity instanceof EntityPlayer)) {
			inUse = false;
			return;
		}
		String skinname = ((EntityPlayer) entity).getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG)
				.getString("buacraft_skin");
		String itemname = stack.getItem().getRegistryName().getResourcePath();
		inUse = itemname.equals(skinname);
	}

}
