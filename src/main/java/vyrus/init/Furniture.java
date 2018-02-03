package vyrus.init;

import com.momnop.furniture.blocks.FurnitureBlocks;
import com.momnop.furniture.client.render.RenderRegistry;
import com.momnop.furniture.entity.EntitySittableBlock;
import com.momnop.furniture.handlers.FurnitureEventHandler;
import com.momnop.furniture.handlers.RecipeHandler;
import com.momnop.furniture.handlers.SoundHandler;
import com.momnop.furniture.network.PacketDispatcher;
import com.momnop.furniture.tiles.TileEntityCabinet;
import com.momnop.furniture.tiles.TileEntityCeilingFan;
import com.momnop.furniture.tiles.TileEntityChair;
import com.momnop.furniture.tiles.TileEntityRefrigerator;
import com.momnop.furniture.tiles.TileEntityRefrigeratorTop;
import com.momnop.furniture.tiles.TileEntitySofa;

import mcjty.lib.tools.EntityTools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLMissingMappingsEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import vyrus.tabs.TabDefault;

@Mod(name = Reference.NAME, modid = Reference.MODID, version = Reference.VERSION, acceptedMinecraftVersions = "[1.10.2]", dependencies = "required-after:compatlayer")
public class Furniture {
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static CommonProxy proxy;

	@Instance(value = Reference.MODID)
	public static Furniture INSTANCE;

	public static CreativeTabs tabDefault = new TabDefault();

	@EventHandler
	public void onMissingMapping(FMLMissingMappingsEvent event) {

	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		FurnitureBlocks.load();
		RecipeHandler.doRecipes();

		GameRegistry.registerTileEntity(TileEntitySofa.class, "tileEntitySofa");
		GameRegistry.registerTileEntity(TileEntityChair.class, "tileEntityChair");
		GameRegistry.registerTileEntity(TileEntityCeilingFan.class, "tileEntityCeilingFan");
		GameRegistry.registerTileEntity(TileEntityRefrigerator.class, "tileEntityRefrigerator");
		GameRegistry.registerTileEntity(TileEntityRefrigeratorTop.class, "tileEntityRefrigeratorTop");
		GameRegistry.registerTileEntity(TileEntityCabinet.class, "tileEntityCabinet");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new FurnitureEventHandler());
		if (event.getSide() == Side.CLIENT) {
			RenderRegistry.registerRenderers();
		}

		proxy.initRenders();

		EntityTools.registerModEntity(new ResourceLocation(Reference.MODID, "mountable_block"),
				EntitySittableBlock.class, "mountable_block", 0, this, 80, 1, false);

		SoundHandler.registerSounds();

		PacketDispatcher.registerPackets();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	@EventHandler
	public static void serverLoad(FMLServerStartingEvent event) {

	}
}
