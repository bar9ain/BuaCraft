package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

public class ModelBatman extends ModelHuman {
	private ModelRenderer cape, cape1, cape2, cape3;
	private ModelRenderer rightspike;
	private ModelRenderer leftspike;
	private ModelRenderer belt;
	private ModelRenderer righEar1, righEar2, righEar3, leftEar1, leftEar2, leftEar3;

	public ModelBatman() {
		super(true);
		belt = new ModelRenderer(this, 12, 16);
		belt.addBox(-0.5F, 7.25F, -2.5F, 1, 2, 1, 0.5F);
		belt.addBox(-3.5F, 7.25F, -2.5F, 1, 2, 1, 0.5F);
		belt.addBox(2.5F, 7.25F, -2.5F, 1, 2, 1, 0.5F);
		belt.addBox(-4.5F, 7.25F, -0.5F, 1, 2, 1, 0.5F);
		belt.addBox(3.5F, 7.25F, -0.5F, 1, 2, 1, 0.5F);

		leftspike = new ModelRenderer(this, 48, 33);
		leftspike.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftspike.addBox(2.5F, 2.0F, 0.0F, 3, 7, 0, 0.0F);

		rightspike = new ModelRenderer(this, 42, 33);
		rightspike.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightspike.addBox(-5.5F, 2.0F, 0.0F, 3, 7, 0, 0.0F);

		cape = new ModelRenderer(this, 6, 32);
		cape.addBox(-4.0F, 0.0F, 2.6F, 8, 2, 1, 0.05F);

		cape1 = new ModelRenderer(this, 4, 35);
		cape1.addBox(-5.0F, 2.0F, 2.6F, 10, 4, 1, 0.05F);
		cape.addChild(cape1);

		cape2 = new ModelRenderer(this, 2, 40);
		cape2.addBox(-6.0F, 6.0F, 2.6F, 12, 6, 1, 0.05F);
		cape.addChild(cape2);

		cape3 = new ModelRenderer(this, 1, 47);
		cape3.addBox(-6.5F, 12.0F, 2.6F, 13, 11, 1, 0.05F);
		cape.addChild(cape3);

		righEar1 = new ModelRenderer(this, 16, 0);
		righEar1.addBox(-4.3F, -11.5F, 3.3F, 1, 2, 1, 0.5F / 4F);

		righEar2 = new ModelRenderer(this, 16, 0);
		righEar2.addBox(-4.3F, -10.5F, 1.3F, 1, 1, 2, 0.5F / 4F);

		leftEar1 = new ModelRenderer(this, 16, 0);
		leftEar1.addBox(3.3F, -11.5F, 3.3F, 1, 2, 1, 0.5F / 4F);

		leftEar2 = new ModelRenderer(this, 16, 0);
		leftEar2.addBox(3.3F, -10.5F, 1.3F, 1, 1, 2, 0.5F / 4F);

		bipedHead.addChild(righEar1);
		bipedHead.addChild(righEar2);
		bipedHead.addChild(leftEar1);
		bipedHead.addChild(leftEar2);

		bipedRightArm.addChild(rightspike);
		bipedLeftArm.addChild(leftspike);

		bipedBody.addChild(belt);
		bipedBody.addChild(cape);
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

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entityIn) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
		this.cape.rotationPointY = 2.0F;
	}

	@Override
	public void setLivingAnimations(EntityLivingBase entity, float p_78086_2_, float p_78086_3_,
			float partialTickTime) {
		if ((entity instanceof EntityPlayer)) {
			cape.rotateAngleX = (p_78086_3_ + 0.15F);
		}
	}

}
