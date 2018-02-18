package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDishevelf extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2, helmet3, helmet4, helmet5, helmet6;
public ModelDishevelf() {
super();
this.bipedHeadwear.isHidden = true;

this.bipedLeftArm = new ModelRenderer(this, 32, 48);
this.bipedLeftArm.setRotationPoint(0, 2.5F, 0);
this.bipedLeftArm.addBox(-1, -2.5F, -2, 3, 12, 4, 0F);

this.bipedRightArm = new ModelRenderer(this, 40, 16);
this.bipedRightArm.setRotationPoint(0, 2.5F, 0);
this.bipedRightArm.addBox(-2, -2.5F, -2, 3, 12, 4, 0F);

this.bipedLeftArmwear = new ModelRenderer(this, 48, 48);
this.bipedLeftArmwear.setRotationPoint(0, 2.5F, 0);
this.bipedLeftArmwear.addBox(-1, -2.5F, -2, 3, 12, 4, 0.25F);

this.bipedRightArmwear = new ModelRenderer(this, 40, 32);
this.bipedRightArmwear.setRotationPoint(0, 2.5F, 0);
this.bipedRightArmwear.addBox(-2, -2.5F, -2, 3, 12, 4, 0.25F);

helmet = new ModelRenderer(this, 36,1);
helmet.addBox(-3F, -11.0F, -3F, 6, 1, 6, 0F);
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 32,0);
helmet1.addBox(-4F, -10.0F, -4F, 8, 2, 8, 0F);
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 30,1);
helmet2.addBox(4F, -4.0F, -1F, 2, 1, 1, 0F);
this.bipedHead.addChild(helmet2);

helmet3 = new ModelRenderer(this, 32,3);
helmet3.addBox(3F, -3.0F, -1F, 3, 1, 1, 0F);
this.bipedHead.addChild(helmet3);

helmet4 = new ModelRenderer(this, 24,1);
helmet4.addBox(-6F, -4.0F, -1F, 2, 1, 1, 0F);
helmet4.mirror = true;
this.bipedHead.addChild(helmet4);

helmet5 = new ModelRenderer(this, 24,3);
helmet5.addBox(-7F, -3.0F, -1F, 3, 1, 1, 0F);
helmet5.mirror = true;
this.bipedHead.addChild(helmet5);

helmet6 = new ModelRenderer(this, 24,5);
helmet6.addBox(-1F, -3.0F, -6F, 2, 1, 2, 0F);
this.bipedHead.addChild(helmet6);

	}
}
