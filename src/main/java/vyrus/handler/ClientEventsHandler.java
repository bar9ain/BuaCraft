package vyrus.handler;

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
import vyrus.models.ModelDasher;

public class ClientEventsHandler {
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void onRenderPlayerPre(RenderPlayerEvent.Pre event) {
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

		Random rand = new Random();
		double motionX = rand.nextGaussian() * 0.02D;
		double motionY = rand.nextGaussian() * 0.02D;
		double motionZ = rand.nextGaussian() * 0.02D;
		
		double width = player.width;
		double height = player.height;
		player.worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, player.getPosition().getX() + rand.nextFloat() * width * 2.0F - width,
				player.getPosition().getY() + 0.5D + rand.nextFloat() * height, player.getPosition().getZ() + rand.nextFloat() * width * 2.0F - width, motionX,
				motionY, motionZ);
		
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
		// playerTextures.put(Type.CAPE, new ResourceLocation(Reference.MODID,
		// "textures/cape.png"));
	}

	private ModelPlayer getModel(String name) {
		switch (name) {
		default:
			return new ModelPlayer(1F, true);
		case "dasher":
			return new ModelDasher();
		case "batman":
			return new ModelBatman();
		}
	}
}
