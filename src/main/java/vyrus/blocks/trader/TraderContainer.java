package vyrus.blocks.trader;

import javax.annotation.Nullable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class TraderContainer extends Container {

	private TraderEntity te;
	// public IInventory inputSlot;
	public IInventory[] outputSlot = new IInventory[3];

	public TraderContainer(IInventory playerInventory, TraderEntity te) {
		this.te = te;
		// this.inputSlot = new InventoryBasic("Trade", true, 1) {
		// @Override
		// public void markDirty() {
		// super.markDirty();
		// TraderContainer.this.onCraftMatrixChanged(this);
		// }
		// };
		for (int i = 0; i < 3; i++)
			this.outputSlot[i] = new InventoryCraftResult();
		addOwnSlots();
		addPlayerSlots(playerInventory);
	}

	private void addPlayerSlots(IInventory playerInventory) {
		// Slots for the main inventory
		int xPos = 8; // The x position of the top left player inventory slot on our texture
		int yPos = 84; // The y position of the top left player inventory slot on our texture

		// Player slots
		for (int y = 0; y < 3; ++y) {
			for (int x = 0; x < 9; ++x) {
				this.addSlotToContainer(new Slot(playerInventory, x + y * 9 + 9, xPos + x * 18, yPos + y * 18));
			}
		}

		for (int x = 0; x < 9; ++x) {
			this.addSlotToContainer(new Slot(playerInventory, x, xPos + x * 18, yPos + 58));
		}
	}

	private void addOwnSlots() {
		IItemHandler itemHandler = this.te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		addSlotToContainer(new SlotItemHandler(itemHandler, 0, 26, 35) {
			@Override
			public void onSlotChanged() {
				ItemStack itemstack = inventorySlots.get(0).getStack();
				if (itemstack == null) {
					outputSlot[0].setInventorySlotContents(0, (ItemStack) null);
					outputSlot[1].setInventorySlotContents(0, (ItemStack) null);
					outputSlot[2].setInventorySlotContents(0, (ItemStack) null);
				} else {
					outputSlot[0].setInventorySlotContents(0,
							new ItemStack(Item.getByNameOrId("buacraft:coin_gold"), 1));
					outputSlot[1].setInventorySlotContents(0,
							new ItemStack(Item.getByNameOrId("buacraft:coin_silver"), 2));
					outputSlot[2].setInventorySlotContents(0,
							new ItemStack(Item.getByNameOrId("buacraft:coin_bronze"), 3));
				}
				super.onSlotChanged();
			}
		});
		for (int i = 0; i < 3; i++) {
			addSlotToContainer(new Slot(outputSlot[i], 1, 80 + i * 18, 35) {
				// Check if the stack is allowed to be placed in this slot
				public boolean isItemValid(@Nullable ItemStack stack) {
					return false;
				}

				// Return whether this slot's stack can be taken from this slot.
				public boolean canTakeStack(EntityPlayer playerIn) {
					return false;
				}
			});
		}
	}

	@Nullable
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
		ItemStack itemstack = null;
		Slot slot = (Slot) this.inventorySlots.get(index);

		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (index > 3) {
				if (!this.mergeItemStack(itemstack1, 0, 1, false)) {
					return null;
				}
			} else if (!this.mergeItemStack(itemstack1, 4, this.inventorySlots.size(), true)) {
				return null;
			}

			if (itemstack1.stackSize == 0) {
				slot.putStack((ItemStack) null);
			} else {
				slot.onSlotChanged();
			}

			if (itemstack1.stackSize == itemstack.stackSize) {
				return null;
			}

			slot.onPickupFromSlot(playerIn, itemstack1);
		}

		return itemstack;
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return te.canInteractWith(playerIn);
	}

	// @Override
	// public void onContainerClosed(EntityPlayer playerIn) {
	// super.onContainerClosed(playerIn);
	// // ItemStack itemstack = this.inputSlot.getStackInSlot(0);
	// ItemStack itemstack = this.inventorySlots.get(0).getStack();
	// if (itemstack != null) {
	// playerIn.dropItem(itemstack, false);
	// } else {
	// for (int i = 0; i < 3; i++) {
	// ItemStack itemstack1 = outputSlot[i].getStackInSlot(0);
	// if (itemstack1 != null)
	// playerIn.dropItem(itemstack1, false);
	// }
	// }
	// }
}