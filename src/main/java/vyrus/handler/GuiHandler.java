package vyrus.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import vyrus.blocks.fridge.FridgeContainer;
import vyrus.blocks.fridge.FridgeGui;
import vyrus.blocks.fridge.FridgeEntity;
import vyrus.blocks.trader.TraderContainer;
import vyrus.blocks.trader.TraderGui;
import vyrus.blocks.trader.TraderEntity;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		System.out.println("getServerGuiElement");
		BlockPos pos = new BlockPos(x, y, z);
		TileEntity te = world.getTileEntity(pos);
		if (te instanceof TraderEntity) {
			return new TraderContainer(player.inventory, (TraderEntity) te);
		}
		if (te instanceof FridgeEntity) {
			return new FridgeContainer(player.inventory, (FridgeEntity) te);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		System.out.println("getClientGuiElement");
		BlockPos pos = new BlockPos(x, y, z);
		TileEntity te = world.getTileEntity(pos);
		if (te instanceof TraderEntity) {
			TraderEntity containerTileEntity = (TraderEntity) te;
			return new TraderGui(containerTileEntity, player);
		}
		if (te instanceof FridgeEntity) {
			FridgeEntity containerTileEntity = (FridgeEntity) te;
			return new FridgeGui(containerTileEntity, player);
		}
		return null;
	}
}