package vyrus.blocks.trader;

import org.fusesource.jansi.Ansi.Color;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import vyrus.init.Reference;
import vyrus.network.Message;
import vyrus.network.PacketHandler;

public class TraderGui extends GuiContainer {
	public static final int WIDTH = 176;
	public static final int HEIGHT = 166;
	private EntityPlayer player;
	private TraderEntity entity;

	private static final ResourceLocation background = new ResourceLocation(Reference.MODID,
			"textures/gui/container/trader.png");

	public TraderGui(TraderEntity tileEntity, EntityPlayer player) {
		super(new TraderContainer(player.inventory, tileEntity));
		xSize = WIDTH;
		ySize = HEIGHT;
		this.player = player;
		this.entity = tileEntity;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		mc.getTextureManager().bindTexture(background);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

	@Override
	public void initGui() {
		GuiButton button = new GuiButton(0, width / 2 + 50, height / 2 - 49, 24, 18, "OK");
		button.packedFGColour = Color.BLACK.value();
		buttonList.add(button);
		super.initGui();
	}

	@Override
	protected void actionPerformed(GuiButton button) {
		if (!button.enabled) {
			return;
		}
		if (button.id == 0) {
			IItemHandler itemHandler = this.entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
			ItemStack stack = itemHandler.getStackInSlot(0);
			PacketHandler.INSTANCE.sendToServer(new Message(this.entity.getPos().getX(), this.entity.getPos().getY(),
					this.entity.getPos().getZ(), stack));

		}
	}
}