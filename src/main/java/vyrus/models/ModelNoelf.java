package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNoelf extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2, helmet3, helmet4, helmet5, helmet6;
public ModelNoelf() {
super();
this.bipedHeadwear.isHidden = true;

this.bipedLeftArm = new ModelRenderer(this, 32, 48);
this.bipedLeftArm.setRotationPoint(0, 2.5F, 0);
this.bipedLeftArm.addBox(-1, -2.5F, -2, 3, 12, 4, 0F);

this.bipedRightArm = new ModelRenderer(this, 40, 16);
this.bipedRightArm.setRotationPoint(0, 2.5F, 0);
this.bipedRightArm.addBox(-2, -2.5F, -2, 3, 12, 4, 0F);

this.bipedLeftArmwear.isHidden = true;

this.bipedRightArmwear.isHidden = true;

this.bipedLeftLegwear.isHidden = true;

this.bipedRightLegwear.isHidden = true;

this.bipedBodyWear.isHidden = true;

helmet = new ModelRenderer(this, 32,3);
helmet.addBox(3F, -4.0F, -1F, 3, 1, 1, 0F);
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 30,1);
helmet1.addBox(4F, -3.0F, -1F, 2, 1, 1, 0F);
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 24,3);
helmet2.addBox(-7F, -4.0F, -1F, 3, 1, 1, 0F);
helmet2.mirror = true;
this.bipedHead.addChild(helmet2);

helmet3 = new ModelRenderer(this, 24,1);
helmet3.addBox(-6F, -3.0F, -1F, 2, 1, 1, 0F);
helmet3.mirror = true;
this.bipedHead.addChild(helmet3);

helmet4 = new ModelRenderer(this, 32,0);
helmet4.addBox(-4F, -10.0F, -4F, 8, 2, 8, 0F);
this.bipedHead.addChild(helmet4);

helmet5 = new ModelRenderer(this, 0,32);
helmet5.addBox(-3F, -11.0F, -2F, 6, 1, 6, 0F);
this.bipedHead.addChild(helmet5);

helmet6 = new ModelRenderer(this, 24,5);
helmet6.addBox(-1F, -3.0F, -6F, 2, 1, 2, 0F);
this.bipedHead.addChild(helmet6);

	}
}
