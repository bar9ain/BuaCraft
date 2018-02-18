package vyrus.models;

import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHuman extends ModelPlayer {

	public ModelHuman() {
		this(false);
	}

	public ModelHuman(boolean smallTexture) {
		super(0, true);

		if (smallTexture) {
			this.bipedLeftArm = new ModelRenderer(this, 40, 16);
			this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
			this.bipedLeftArm.mirror = true;
			this.bipedLeftLeg.mirror = true;
			this.bipedHeadwear.isHidden = true;
			this.bipedBodyWear.isHidden = true;
			this.bipedLeftArmwear.isHidden = true;
			this.bipedRightArmwear.isHidden = true;
			this.bipedLeftLegwear.isHidden = true;
			this.bipedRightLegwear.isHidden = true;
		} else {
			this.bipedLeftArm = new ModelRenderer(this, 32, 48);
			this.bipedLeftLeg = new ModelRenderer(this, 0, 16);

			this.bipedHeadwear = new ModelRenderer(this, 32, 0);
			this.bipedHeadwear.addBox(-4.0F, -9.0F, -4.0F, 8, 8, 8, 0.25F);
			this.bipedHeadwear.setRotationPoint(0.0F, 0.0F, 0.0F);

			this.bipedBodyWear = new ModelRenderer(this, 16, 32);
			this.bipedBodyWear.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
			this.bipedBodyWear.setRotationPoint(0.0F, 0.0F, 0.0F);

			this.bipedLeftArmwear = new ModelRenderer(this, 48, 48);
			this.bipedLeftArmwear.addBox(-1F, -2.5F, -2.0F, 4, 12, 4, 0.25F);
			this.bipedLeftArmwear.setRotationPoint(5.0F, 2.5F, 0.0F);

			this.bipedRightArmwear = new ModelRenderer(this, 40, 32);
			this.bipedRightArmwear.addBox(-3F, -2.5F, -2.0F, 4, 12, 4, 0.25F);
			this.bipedRightArmwear.setRotationPoint(-5.0F, 2.5F, 0.0F);

			this.bipedLeftLegwear = new ModelRenderer(this, 0, 48);
			this.bipedLeftLegwear.addBox(0.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F);
			this.bipedLeftLegwear.setRotationPoint(0, 12, 0);

			this.bipedRightLegwear = new ModelRenderer(this, 0, 32);
			this.bipedRightLegwear.addBox(-4.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F);
			this.bipedRightLegwear.setRotationPoint(0, 12, 0);
		}

		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedRightArm = new ModelRenderer(this, 40, 16);
		this.bipedRightLeg = new ModelRenderer(this, 0, 16);
		
		this.bipedHead.addBox(-4F, -8.0F, -4.0F, 8, 8, 8);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);

		this.bipedLeftArm.addBox(-1F, -2.5F, -2.0F, 4, 12, 4);
		this.bipedLeftArm.setRotationPoint(0, 2.5F, 0);

		this.bipedRightArm.addBox(-3F, -2.5F, -2.0F, 4, 12, 4);
		this.bipedRightArm.setRotationPoint(0, 2.5F, 0);

		this.bipedLeftLeg.addBox(0.0F, 0.0F, -2.0F, 4, 12, 4, true);
		this.bipedLeftLeg.setRotationPoint(0, 12, 0);

		this.bipedRightLeg.addBox(-4.0F, 0.0F, -2.0F, 4, 12, 4);
		this.bipedRightLeg.setRotationPoint(0, 12, 0);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
