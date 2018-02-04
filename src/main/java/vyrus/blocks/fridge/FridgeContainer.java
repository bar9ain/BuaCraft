package vyrus.blocks.fridge;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class FridgeContainer extends Container {
	private FridgeEntity te;

	public FridgeContainer(IInventory playerInventory, FridgeEntity te) {
		this.te = te;
		IItemHandler itemHandler = this.te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);

		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				this.addSlotToContainer(new Slot(te, count, j * 18 + 44, i * 18 + 18));
				count++;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; ++j) {
				this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, j * 18 + 8, i * 18 + 85));
			}
		}

		for (int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(playerInventory, i, i * 18 + 8, 143));
		}
	}

	public boolean canInteractWith(EntityPlayer player) {
		return this.te.isUseableByPlayer(player);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
		ItemStack previous = null;
		Slot slot = (Slot) this.inventorySlots.get(fromSlot);

		if (slot != null && slot.getHasStack()) {
			ItemStack current = slot.getStack();
			previous = current.copy();
			
			if (!(current.getItem() instanceof ItemFood))
				return null;
			
			if (fromSlot < 9) {
				if (!this.mergeItemStack(current, 9, 45, true))
					return null;
			} else {
				if (!this.mergeItemStack(current, 0, 9, false))
					return null;
			}
			if (current.stackSize == 0)
				slot.putStack((ItemStack) null);
			else
				slot.onSlotChanged();

			if (current.stackSize == previous.stackSize)
				return null;
			slot.onPickupFromSlot(playerIn, current);
		}
		return previous;
	}

	public void onContainerClosed(EntityPlayer player) {
		super.onContainerClosed(player);
	}
}
