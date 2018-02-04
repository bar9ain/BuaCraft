package vyrus.blocks.fridge;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import vyrus.blocks.trader.TraderContainer;
import vyrus.blocks.trader.TraderEntity;
import vyrus.init.Reference;

public class FridgeGui extends GuiContainer
{
	private EntityPlayer player;
	private FridgeEntity entity;
	private static final ResourceLocation gui = new ResourceLocation(Reference.MODID,
			"textures/gui/container/fridge.png");

	public FridgeGui(FridgeEntity tileEntity, EntityPlayer player)
	{
		super(new FridgeContainer(player.inventory, tileEntity));
		this.xSize = 176;
		this.ySize = 167;
		this.player = player;
		this.entity = tileEntity;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		this.fontRendererObj.drawString(I18n.format("tile.fridge.name"), (this.xSize / 2) - 44, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("key.categories.inventory"), 8, this.ySize - 94, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(gui);
		int l = (width - xSize) / 2;
		int i1 = (height - ySize) / 2;
		this.drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);
	}
}
