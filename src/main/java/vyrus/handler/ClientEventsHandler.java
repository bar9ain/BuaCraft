package vyrus.handler;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.Random;

import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import vyrus.init.Reference;
import vyrus.models.ModelBatman;
import vyrus.models.ModelChrisCringle;
import vyrus.models.ModelDasher;
import vyrus.models.ModelHuman;
import vyrus.models.ModelKrampus;

public class ClientEventsHandler {
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void onRenderPlayerPre(RenderPlayerEvent.Pre event) {
		if (!event.getEntityPlayer().worldObj.isRemote)
			return;
		final EntityPlayer player = event.getEntityPlayer();
		if (!(player instanceof EntityPlayer))
			return;
		final String skinname = player.getCustomNameTag();
		NBTTagCompound entityData = player.getEntityData();
		String oldSkin = entityData.getString("buacraft_oldskin");

		if (skinname.isEmpty() || skinname.equals("random") || oldSkin.equals(skinname))
			return;
		entityData.setString("buacraft_oldskin", skinname);

		renderModel(event.getRenderer(), skinname);
		renderTexture(player, skinname);
		spawnParticle(player);
	}

	private void renderModel(RenderPlayer render, String skinname) {
		skinname = skinname.substring(skinname.indexOf(".") + 1);
		ModelPlayer model = getModel(skinname);
		ObfuscationReflectionHelper.setPrivateValue(RenderLivingBase.class, render, model, "field_77045_g");
	}

	private void renderTexture(EntityPlayer player, String skinname) {
		skinname = skinname.substring(skinname.indexOf(".") + 1);
		NetworkPlayerInfo playerInfo = ObfuscationReflectionHelper.getPrivateValue(AbstractClientPlayer.class,
				(AbstractClientPlayer) player, 0);
		if (playerInfo == null)
			return;
		Map<Type, ResourceLocation> playerTextures = ObfuscationReflectionHelper
				.getPrivateValue(NetworkPlayerInfo.class, playerInfo, 1);
		playerTextures.put(Type.SKIN, new ResourceLocation(Reference.MODID, "textures/skins/" + skinname + ".png"));
		playerTextures.remove(Type.CAPE);
	}

	private ModelPlayer getModel(String name) {
		try {
			Class<?> c = Class.forName("vyrus.models.Model" + name);
			Constructor<?> cons = c.getConstructor();
			Object object = cons.newInstance();
			return (ModelHuman) object;
		} catch (Exception e) {
			return new ModelHuman();
		}
	}

	private void spawnParticle(EntityPlayer player) {
		for (int i = 0; i < 5; i++) {
			Random rand = new Random();
			double motionX = rand.nextGaussian() * 0.02D;
			double motionY = rand.nextGaussian() * 0.02D;
			double motionZ = rand.nextGaussian() * 0.02D;

			double width = player.width;
			double height = player.height;
			player.worldObj.spawnParticle(EnumParticleTypes.VILLAGER_ANGRY,
					player.getPosition().getX() + rand.nextFloat() * width * 2.0F - width,
					player.getPosition().getY() + 0.5D + rand.nextFloat() * height,
					player.getPosition().getZ() + rand.nextFloat() * width * 2.0F - width, motionX, motionY, motionZ);

		}
	}
}
