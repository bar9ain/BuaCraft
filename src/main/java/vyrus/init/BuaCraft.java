package vyrus.init;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import vyrus.handler.ClientEventsHandler;
import vyrus.handler.EventsHandler;
import vyrus.handler.GuiHandler;
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
	public void postInit(FMLPostInitializationEvent e) throws IOException {
		proxy.postInit(e);
	}

	public static class CommonProxy {
		public void preInit(FMLPreInitializationEvent e) {
			ModBlocks.init();
			ModItems.init();
			ModSkins.init();
		}

		public void init(FMLInitializationEvent e) {
			NetworkRegistry.INSTANCE.registerGuiHandler(INSTANCE, new GuiHandler());
			MinecraftForge.EVENT_BUS.register(new EventsHandler());
		}

		public void postInit(FMLPostInitializationEvent e) throws IOException {
			String output = "";
			for (ResourceLocation r : Item.REGISTRY.getKeys())
				output += r.toString() + ":" + Item.getByNameOrId(r.toString()).getItemStackLimit() + "\r\n";
			Files.write(Paths.get("./bargain.txt"), output.getBytes(), StandardOpenOption.CREATE);
		}
	}

	public static class ClientProxy extends CommonProxy {
		@Override
		public void preInit(FMLPreInitializationEvent e) {
			super.preInit(e);
			ModBlocks.initModels();
			ModItems.initModels();
			ModSkins.initModels();
		}

		@Override
		public void init(FMLInitializationEvent e) {
			super.init(e);
			MinecraftForge.EVENT_BUS.register(new ClientEventsHandler());
		}
	}

	public static class ServerProxy extends CommonProxy {

	}
}
