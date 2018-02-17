package vyrus.models;

import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDasher extends ModelPlayer {
	private ModelRenderer helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8, helmet9;

	public ModelDasher() {
		super(0.5F, false);
		helmet1 = new ModelRenderer(this, 56, 36);
		helmet1.addBox(-4.3F, -11.5F, 3.3F, 1, 3, 1, 0.5F / 4);
		this.bipedHead.addChild(helmet1);

		helmet2 = new ModelRenderer(this, 58, 44);
		helmet2.addBox(-4.3F, -11.5F, 3.3F, 1, 3, 1, 0.5F / 4);
		this.bipedHead.addChild(helmet2);

		helmet3 = new ModelRenderer(this, 54, 31);
		helmet3.addBox(-4.3F, -11.5F, 3.3F, 1, 3, 1, 0.5F / 4);
		this.bipedHead.addChild(helmet3);

		helmet4 = new ModelRenderer(this, 59, 29);
		helmet4.addBox(-4.3F, -11.5F, 3.3F, 1, 3, 1, 0.5F / 4);
		this.bipedHead.addChild(helmet4);

		helmet5 = new ModelRenderer(this, 56, 36);
		helmet5.addBox(5F, -11.5F, -2F, 1, 6, 1, 0.5F);
		this.bipedHead.addChild(helmet5);

		helmet6 = new ModelRenderer(this, 59, 29);
		helmet6.addBox(4F, -11.5F, -2F, 1, 1, 1, 0.5F);
		this.bipedHead.addChild(helmet6);

		helmet7 = new ModelRenderer(this, 58, 44);
		helmet7.addBox(6F, -11.5F, -2F, 1, 1, 2, 0.5F);
		this.bipedHead.addChild(helmet7);

		helmet8 = new ModelRenderer(this, 54, 31);
		helmet8.addBox(6F, -11.5F, -2F, 1, 1, 4, 0.5F);
		this.bipedHead.addChild(helmet8);

		helmet9 = new ModelRenderer(this, 56, 17);
		helmet9.addBox(-1.00011F, -11.5F, -5F, 2, 2, 1, 0.5F);
		this.bipedHead.addChild(helmet9);
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
