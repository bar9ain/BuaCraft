package vyrus.blocks.fridge;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import vyrus.init.BuaCraft;
import vyrus.init.ModBlocks;
import vyrus.init.Reference;

public class FridgeHelper extends Block {

	public FridgeHelper() {
		super(Material.IRON);
		this.setUnlocalizedName("fridge_helper");
		this.setHardness(2.0F);
		this.setSoundType(SoundType.METAL);
		this.setRegistryName(new ResourceLocation(Reference.MODID, "fridge_helper"));
		GameRegistry.register(this);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand,
			ItemStack heldItem, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (world.isRemote)
			return true;
		TileEntity te = world.getTileEntity(pos.down());
		if (!(te instanceof FridgeEntity))
			return false;
		player.openGui(BuaCraft.INSTANCE, 0, world, pos.getX(), pos.down().getY(), pos.getZ());
		return true;
	}
	
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		TileEntity tileentity = world.getTileEntity(pos.down());
		if (tileentity instanceof FridgeEntity) {
			FridgeEntity te = (FridgeEntity) world.getTileEntity(pos.down());
			InventoryHelper.dropInventoryItems(world, pos.down(), te);
			super.breakBlock(world, pos, state);
		}
		world.setBlockToAir(pos.down());
		super.breakBlock(world, pos, state);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0.0D, -1.0D, 0.0D, 1.0D, 1.0D, 1.0D);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return new ItemStack(ModBlocks.FRIDGE).getItem();
	}

	@Override
	public boolean isOpaqueCube(IBlockState blockState) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		return false;
	}

}
