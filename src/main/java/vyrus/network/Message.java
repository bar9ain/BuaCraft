package vyrus.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import vyrus.blocks.trader.TraderEntity;

public class Message implements IMessage, IMessageHandler<Message, IMessage> {
	private int x, y, z;
	private ItemStack itemstack;

	public Message() {
	}

	public Message(int x, int y, int z, ItemStack itemstack) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.itemstack = itemstack;
	}

	@Override
	public IMessage onMessage(Message message, MessageContext ctx) {
		BlockPos pos = new BlockPos(message.x, message.y, message.z);
		EntityPlayer player = ctx.getServerHandler().playerEntity;
		World world = player.worldObj;
		TileEntity tile_entity = world.getTileEntity(pos);
		if (tile_entity instanceof TraderEntity) {
			TraderEntity entity = (TraderEntity) tile_entity;
			if (player.inventory.getFirstEmptyStack() == -1)
				player.dropItem(message.itemstack, false);
			else
				player.inventory.addItemStackToInventory(message.itemstack);
			entity.clear();
		}
		world.notifyBlockUpdate(pos, world.getBlockState(pos), world.getBlockState(pos), 3);
		return null;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		this.x = buf.readInt();
		this.y = buf.readInt();
		this.z = buf.readInt();
		this.itemstack = ByteBufUtils.readItemStack(buf);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(x);
		buf.writeInt(y);
		buf.writeInt(z);
		ByteBufUtils.writeItemStack(buf, itemstack);
	}

}
