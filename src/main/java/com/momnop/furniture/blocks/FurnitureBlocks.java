package com.momnop.furniture.blocks;

import com.momnop.furniture.Furniture;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnitureBlocks {
	public static Block sofa;
	public static Block tableOak, tableSpruce, tableBirch, tableJungle, tableAcacia, tableDarkOak;
	public static Block coffeeTableOak, coffeeTableSpruce, coffeeTableBirch, coffeeTableJungle, coffeeTableAcacia,
			coffeeTableDarkOak;
	public static Block blinds;
	public static Block chairOak, chairSpruce, chairBirch, chairJungle, chairAcacia, chairDarkOak;;
	public static Block stoolOak, stoolSpruce, stoolBirch, stoolJungle, stoolAcacia, stoolDarkOak;
	public static Block doorbell;
	public static Block lightSwitch;
	public static Block fancyFence;
	public static Block rockPath;
	public static Block desk, deskInvisible1, deskInvisible2;
	public static Block fan;
	public static Block counterStone, counterGranite, counterDiorite, counterAndesite;
	public static Block counterStoneQuartz, counterGraniteQuartz, counterDioriteQuartz, counterAndesiteQuartz;
	public static Block counterSinkStone, counterSinkGranite, counterSinkDiorite, counterSinkAndesite;
	public static Block counterSinkStoneQuartz, counterSinkGraniteQuartz, counterSinkDioriteQuartz,
			counterSinkAndesiteQuartz;
	public static Block sink;
	public static Block refrigerator, fridgeInvis;
	public static Block darkOakOakPlankLog;
	public static Block lightBulbOff, lightBulbOn;
	public static Block fanLightOff, fanLightOn;
	public static Block cabinetOak, cabinetSpruce, cabinetBirch, cabinetJungle, cabinetAcacia, cabinetDarkOak;

	public static final CreativeTabs general = Furniture.tabDefault;

	public static void load() {
		loadBlocks();
	}

	public static void loadBlocks() {
		sofa = new BlockSofa(Material.CLOTH, 0.8F, SoundType.CLOTH, "sofa", general);

		chairOak = new BlockChair(Material.WOOD, 2.0F, SoundType.WOOD, "chair_oak", general);
		chairSpruce = new BlockChair(Material.WOOD, 2.0F, SoundType.WOOD, "chair_spruce", general);
		chairBirch = new BlockChair(Material.WOOD, 2.0F, SoundType.WOOD, "chair_birch", general);
		chairJungle = new BlockChair(Material.WOOD, 2.0F, SoundType.WOOD, "chair_jungle", general);
		chairAcacia = new BlockChair(Material.WOOD, 2.0F, SoundType.WOOD, "chair_acacia", general);
		chairDarkOak = new BlockChair(Material.WOOD, 2.0F, SoundType.WOOD, "chair_dark_oak", general);

		stoolOak = new BlockStool(Material.WOOD, 2.0F, SoundType.WOOD, "stool_oak", general);
		stoolSpruce = new BlockStool(Material.WOOD, 2.0F, SoundType.WOOD, "stool_spruce", general);
		stoolBirch = new BlockStool(Material.WOOD, 2.0F, SoundType.WOOD, "stool_birch", general);
		stoolJungle = new BlockStool(Material.WOOD, 2.0F, SoundType.WOOD, "stool_jungle", general);
		stoolAcacia = new BlockStool(Material.WOOD, 2.0F, SoundType.WOOD, "stool_acacia", general);
		stoolDarkOak = new BlockStool(Material.WOOD, 2.0F, SoundType.WOOD, "stool_dark_oak", general);

		tableOak = new BlockTable(Material.WOOD, 2.0F, SoundType.WOOD, "table_oak", general);
		tableSpruce = new BlockTable(Material.WOOD, 2.0F, SoundType.WOOD, "table_spruce", general);
		tableBirch = new BlockTable(Material.WOOD, 2.0F, SoundType.WOOD, "table_birch", general);
		tableJungle = new BlockTable(Material.WOOD, 2.0F, SoundType.WOOD, "table_jungle", general);
		tableAcacia = new BlockTable(Material.WOOD, 2.0F, SoundType.WOOD, "table_acacia", general);
		tableDarkOak = new BlockTable(Material.WOOD, 2.0F, SoundType.WOOD, "table_dark_oak", general);

		coffeeTableOak = new BlockCoffeeTable(Material.WOOD, 2.0F, SoundType.WOOD, "coffee_table_oak", general);
		coffeeTableSpruce = new BlockCoffeeTable(Material.WOOD, 2.0F, SoundType.WOOD, "coffee_table_spruce", general);
		coffeeTableBirch = new BlockCoffeeTable(Material.WOOD, 2.0F, SoundType.WOOD, "coffee_table_birch", general);
		coffeeTableJungle = new BlockCoffeeTable(Material.WOOD, 2.0F, SoundType.WOOD, "coffee_table_jungle", general);
		coffeeTableAcacia = new BlockCoffeeTable(Material.WOOD, 2.0F, SoundType.WOOD, "coffee_table_acacia", general);
		coffeeTableDarkOak = new BlockCoffeeTable(Material.WOOD, 2.0F, SoundType.WOOD, "coffee_table_dark_oak",
				general);

		blinds = new BlockBlinds(Material.WOOD, 2.0F, SoundType.WOOD, "blinds", general);

		doorbell = new BlockDoorbell(Material.WOOD, 2.0F, SoundType.WOOD, "doorbell", general);
		lightSwitch = new BlockLightSwitch(Material.WOOD, 2.0F, SoundType.WOOD, "light_switch", general);

		fancyFence = new BlockFurnitureFence(Material.WOOD, 2.0F, SoundType.WOOD, "fancy_fence", general);

		rockPath = new BlockRockPath(Material.ROCK, 1.5F, SoundType.STONE, "rock_path", general);

		counterStone = new BlockFurnitureConnecting(Material.WOOD, 2.0F, SoundType.WOOD, "counter_stone", general);
		counterGranite = new BlockFurnitureConnecting(Material.WOOD, 2.0F, SoundType.WOOD, "counter_granite", general);
		counterDiorite = new BlockFurnitureConnecting(Material.WOOD, 2.0F, SoundType.WOOD, "counter_diorite", general);
		counterAndesite = new BlockFurnitureConnecting(Material.WOOD, 2.0F, SoundType.WOOD, "counter_andesite",
				general);

		counterStoneQuartz = new BlockFurnitureConnecting(Material.ROCK, 1.5F, SoundType.STONE, "counter_stone_quartz",
				general);
		counterGraniteQuartz = new BlockFurnitureConnecting(Material.ROCK, 1.5F, SoundType.STONE,
				"counter_granite_quartz", general);
		counterDioriteQuartz = new BlockFurnitureConnecting(Material.ROCK, 1.5F, SoundType.STONE,
				"counter_diorite_quartz", general);
		counterAndesiteQuartz = new BlockFurnitureConnecting(Material.ROCK, 1.5F, SoundType.STONE,
				"counter_andesite_quartz", general);

		counterSinkStone = new BlockCounterSink(Material.WOOD, 2.0F, SoundType.WOOD, "counter_sink_stone", general);
		counterSinkGranite = new BlockCounterSink(Material.WOOD, 2.0F, SoundType.WOOD, "counter_sink_granite", general);
		counterSinkDiorite = new BlockCounterSink(Material.WOOD, 2.0F, SoundType.WOOD, "counter_sink_diorite", general);
		counterSinkAndesite = new BlockCounterSink(Material.WOOD, 2.0F, SoundType.WOOD, "counter_sink_andesite",
				general);

		counterSinkStoneQuartz = new BlockCounterSink(Material.ROCK, 1.5F, SoundType.STONE, "counter_sink_stone_quartz",
				general);
		counterSinkGraniteQuartz = new BlockCounterSink(Material.ROCK, 1.5F, SoundType.STONE,
				"counter_sink_granite_quartz", general);
		counterSinkDioriteQuartz = new BlockCounterSink(Material.ROCK, 1.5F, SoundType.STONE,
				"counter_sink_diorite_quartz", general);
		counterSinkAndesiteQuartz = new BlockCounterSink(Material.ROCK, 1.5F, SoundType.STONE,
				"counter_sink_andesite_quartz", general);

		fan = new BlockFan(Material.WOOD, 2.0F, SoundType.WOOD, "fan", general);

		refrigerator = new BlockRefrigerator(Material.ROCK, 1.5F, SoundType.STONE, "refrigerator", general);
		fridgeInvis = new BlockRefrigeratorInvisible(Material.ROCK, 1.5F, SoundType.STONE, "refrigerator_invisible",
				new ItemStack(refrigerator), null);

		darkOakOakPlankLog = new BlockNormal(Material.WOOD, 2.0F, SoundType.WOOD, "dark_oak_oak_plank_log", general);

		sink = new BlockSink(Material.ROCK, 1.5F, SoundType.STONE, "sink", general);

		lightBulbOff = new BlockLight(Material.WOOD, 2.0F, SoundType.WOOD, "lightbulb_off", false, general);
		lightBulbOn = new BlockLight(Material.WOOD, 2.0F, SoundType.WOOD, "lightbulb_on", true, null);

		fanLightOff = new BlockFanLight(Material.WOOD, 2.0F, SoundType.WOOD, "fan_light_off", false, general);
		fanLightOn = new BlockFanLight(Material.WOOD, 2.0F, SoundType.WOOD, "fan_light_on", true, null);

		cabinetOak = new BlockCabinet(Material.WOOD, 2.0F, SoundType.WOOD, "cabinet_oak", general);
		cabinetSpruce = new BlockCabinet(Material.WOOD, 2.0F, SoundType.WOOD, "cabinet_spruce", general);
		cabinetBirch = new BlockCabinet(Material.WOOD, 2.0F, SoundType.WOOD, "cabinet_birch", general);
		cabinetJungle = new BlockCabinet(Material.WOOD, 2.0F, SoundType.WOOD, "cabinet_jungle", general);
		cabinetAcacia = new BlockCabinet(Material.WOOD, 2.0F, SoundType.WOOD, "cabinet_acacia", general);
		cabinetDarkOak = new BlockCabinet(Material.WOOD, 2.0F, SoundType.WOOD, "cabinet_dark_oak", general);
	}

	public static void register(Block b) {
		ItemBlock ib = new ItemBlock(b);
		GameRegistry.register(b);
		ib.setRegistryName(b.getRegistryName());
		GameRegistry.register(ib);
	}
}