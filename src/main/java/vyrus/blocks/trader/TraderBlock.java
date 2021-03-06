package vyrus.blocks.trader;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vyrus.init.BuaCraft;
import vyrus.init.Reference;

public class TraderBlock extends Block implements ITileEntityProvider {
	public TraderBlock(String name) {
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Reference.MODID, name));
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		GameRegistry.registerTileEntity(TraderEntity.class, Reference.MODID + ":EntityTrader");
	}

	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
				new ModelResourceLocation(getRegistryName(), "inventory"));
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TraderEntity();
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand,
			ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (world.isRemote) {
			return true;
		}
		TileEntity te = world.getTileEntity(pos);
		if (!(te instanceof TraderEntity)) {
			return false;
		}
		player.openGui(BuaCraft.INSTANCE, 0, world, pos.getX(), pos.getY(), pos.getZ());
		return true;
	}
}
