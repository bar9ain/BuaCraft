package vyrus.init;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import vyrus.gui.GuiHandler;
import vyrus.network.PacketHandler;
import vyrus.tabs.TabDecoration;
import vyrus.tabs.TabItems;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.10.2]")
public class BuaCraft {

	@Mod.Instance(Reference.MODID)
	public static BuaCraft INSTANCE;

	public static TabDecoration tabDecoration = new TabDecoration();
	public static TabItems tabItems = new TabItems();

	@SidedProxy
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		PacketHandler.init();
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}

	public static class CommonProxy {
		public void preInit(FMLPreInitializationEvent e) {
			ModBlocks.init();
			ModItems.init();
			ModArmour.init();
		}

		public void init(FMLInitializationEvent e) {
			NetworkRegistry.INSTANCE.registerGuiHandler(INSTANCE, new GuiHandler());
			MinecraftForge.EVENT_BUS.register(new CommonEventHandler());
		}

		public void postInit(FMLPostInitializationEvent e) {

		}
	}

	public static class ClientProxy extends CommonProxy {
		@Override
		public void preInit(FMLPreInitializationEvent e) {
			super.preInit(e);
			ModBlocks.initModels();
			ModItems.initModels();
			ModArmour.initModels();
		}

		@Override
		public void init(FMLInitializationEvent e) {
			super.init(e);
		}
	}

	public static class ServerProxy extends CommonProxy {

	}
}
