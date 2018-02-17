package vyrus.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBatman extends ModelPlayer {
	private ModelRenderer righEar1, righEar2, righEar3;
	private ModelRenderer leftEar1, leftEar2, leftEar3;
	private ModelRenderer cape;

	public ModelBatman() {
		super(0.5F, false);
		textureWidth = 96;
		textureHeight = 40;

		righEar1 = new ModelRenderer(this, 8, 0);
		righEar1.addBox(-4.3F, -11.5F, 3.3F, 1, 3, 1, 0.5F / 4);
		righEar1.setRotationPoint(0F, 0F, 0F);
		righEar1.mirror = true;
		setRotation(righEar1, 0F, 0F, 0F);

		righEar2 = new ModelRenderer(this, 8, 0);
		righEar2.addBox(-4.3F, -10.5F, 1.3F, 1, 2, 2, 0.5F / 4);
		righEar2.setRotationPoint(0F, 0F, 0F);
		righEar2.mirror = true;
		setRotation(righEar2, 0F, 0F, 0F);

		righEar3 = new ModelRenderer(this, 8, 0);
		righEar3.addBox(-4.3F, -9.5F, -0.3F, 1, 1, 2, 0.5F / 4);
		righEar3.setRotationPoint(0F, 0F, 0F);
		righEar3.mirror = true;
		setRotation(righEar3, 0F, 0F, 0F);

		leftEar1 = new ModelRenderer(this, 8, 0);
		leftEar1.addBox(3.3F, -11.5F, 3.3F, 1, 3, 1, 0.5F / 4);
		leftEar1.setRotationPoint(0F, 0F, 0F);
		leftEar1.mirror = true;
		setRotation(leftEar1, 0F, 0F, 0F);

		leftEar2 = new ModelRenderer(this, 8, 0);
		leftEar2.addBox(3.3F, -10.5F, 1.3F, 1, 2, 2, 0.5F / 4);
		leftEar2.setRotationPoint(0F, 0F, 0F);
		leftEar2.mirror = true;
		setRotation(leftEar2, 0F, 0F, 0F);

		leftEar3 = new ModelRenderer(this, 8, 0);
		leftEar3.addBox(3.3F, -9.5F, -0.3F, 1, 1, 2, 0.5F / 4);
		leftEar3.setRotationPoint(0F, 0F, 0F);
		leftEar3.mirror = true;
		setRotation(leftEar3, 0F, 0F, 0F);

		this.bipedHead.addChild(righEar1);
		this.bipedHead.addChild(righEar2);
		this.bipedHead.addChild(righEar3);
		this.bipedHead.addChild(leftEar1);
		this.bipedHead.addChild(leftEar2);
		this.bipedHead.addChild(leftEar3);
//
//		cape = new ModelRenderer(this, 55, 21);
//		cape.addBox(-5F, 3F, 2F, 10, 16, 0, 0.5F);
//		cape.setRotationPoint(0F, 0F, 0F);
//		cape.mirror = true;
//		setRotation(cape, 0.5F, 0F, 0F);
//
//		this.bipedBody.addChild(cape);
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
