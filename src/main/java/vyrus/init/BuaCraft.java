package vyrus.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import vyrus.gui.GuiHandler;
import vyrus.network.PacketHandler;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.10.2]")
public class BuaCraft {

	@Mod.Instance(Reference.MODID)
	public static BuaCraft INSTANCE;

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
		}

		public void init(FMLInitializationEvent e) {
			NetworkRegistry.INSTANCE.registerGuiHandler(INSTANCE, new GuiHandler());
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
		}

		@Override
		public void init(FMLInitializationEvent e) {
			super.init(e);
		}
	}

	public static class ServerProxy extends CommonProxy {

	}
}
