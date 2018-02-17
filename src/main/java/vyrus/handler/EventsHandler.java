package vyrus.handler;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import vyrus.init.Reference;

public class EventsHandler {
	@SubscribeEvent
	public void onPlayerLogsIn(PlayerLoggedInEvent event) {
		if (event.player != null && event.player instanceof EntityPlayer) {
			final EntityPlayer player = event.player;
			final NBTTagCompound entityData = player.getEntityData();
			final NBTTagCompound persistedData = entityData.getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG);
			entityData.setTag(EntityPlayer.PERSISTED_NBT_TAG, persistedData);

			ArrayList<String> randomList = new ArrayList<String>();
			for (ResourceLocation item : Item.REGISTRY.getKeys()) {
				if (item.getResourceDomain().equals(Reference.MODID) && item.getResourcePath().startsWith("skin.")) {
					randomList.add(item.toString());
				}
			}

			if (randomList.size() < 1)
				return;

			Random rand = new Random();
			int n = rand.nextInt(randomList.size());

			final String key = "buacraft_loggedIn";
			if (!persistedData.getBoolean(key)) {
				persistedData.setBoolean(key, true);
				player.inventory.addItemStackToInventory(new ItemStack(Item.getByNameOrId(randomList.get(n))));
			}
			Minecraft.getMinecraft().gameSettings.thirdPersonView = 3;
		}

	}

	@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent event) {
	}
}
