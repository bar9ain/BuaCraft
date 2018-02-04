package vyrus.blocks.fridge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import vyrus.blocks.container.ContainerBlock;
import vyrus.init.BuaCraft;
import vyrus.init.ModBlocks;
import vyrus.init.Reference;

public class FridgeBlock extends ContainerBlock implements ITileEntityProvider {

	public FridgeBlock(String name) {
		super(Material.IRON);
		this.setHardness(2.0F);
		this.setSoundType(SoundType.METAL);
		this.setUnlocalizedName(name);
		this.setRegistryName(new ResourceLocation(Reference.MODID, name));
		this.setCreativeTab(BuaCraft.tabDecoration);
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this).setMaxStackSize(1), getRegistryName());
		GameRegistry.registerTileEntity(FridgeEntity.class, Reference.MODID + ":EntityFridge");
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new FridgeEntity();
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand,
			ItemStack heldItem, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (world.isRemote)
			return true;
		TileEntity te = world.getTileEntity(pos);
		if (!(te instanceof FridgeEntity))
			return false;
		player.openGui(BuaCraft.INSTANCE, 0, world, pos.getX(), pos.getY(), pos.getZ());
		return true;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		if (worldIn.getBlockState(pos.up()).getBlock() == ModBlocks.FRIDGEHELPER) {
			worldIn.destroyBlock(pos.up(), true);
		}
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState blockstate) {
		FridgeEntity te = (FridgeEntity) world.getTileEntity(pos);
		InventoryHelper.dropInventoryItems(world, pos, te);
		super.breakBlock(world, pos, blockstate);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 2.0D, 1.0D);
	}

	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		return super.canPlaceBlockAt(worldIn, pos) && worldIn.isAirBlock(pos.up());
	}

	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		worldIn.setBlockState(pos.up(), ModBlocks.FRIDGEHELPER.getDefaultState());
	}
}
