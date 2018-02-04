package vyrus.init;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class CommonEventHandler {
	@SubscribeEvent
	public void onPlayerStart(PlayerLoggedInEvent event) {
		final EntityPlayer player = event.player;

		final NBTTagCompound entityData = player.getEntityData();
		final NBTTagCompound persistedData = entityData.getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG);
		entityData.setTag(EntityPlayer.PERSISTED_NBT_TAG, persistedData);

		final String key = "buacraft_loggedIn";
		
		ArrayList<String> randomList = new ArrayList<String>();
		for (ResourceLocation item : Item.REGISTRY.getKeys()) {
			if (item.getResourceDomain().equals(Reference.MODID) && item.getResourcePath().contains("_pack")) {
				randomList.add(item.toString());
			}
		}
		
		Random rand = new Random();
		int n = rand.nextInt(randomList.size());

		if (!persistedData.getBoolean(key)) {
			persistedData.setBoolean(key, true);
			event.player.inventory.addItemStackToInventory(
					new ItemStack(Item.getByNameOrId(randomList.get(n))));
		}

	}
}
