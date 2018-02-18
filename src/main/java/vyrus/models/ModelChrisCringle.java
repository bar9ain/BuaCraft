package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelChrisCringle extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2, helmet3, helmet4, bodyArmor, bodyArmor1, bodyArmor2, bodyArmor3, bodyArmor4, bodyArmor5, bodyArmor6;
public ModelChrisCringle() {
super();
this.bipedHeadwear.isHidden = true;

this.bipedBodyWear.isHidden = true;

helmet = new ModelRenderer(this, 32,6);
helmet.addBox(-4F, -10.0F, -4F, 8, 2, 8, 0F);
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 37,7);
helmet1.addBox(-1F, -12.0F, -2F, 5, 1, 6, 0F);
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 32,7);
helmet2.addBox(4F, -12.0F, 1F, 1, 4, 2, 0F);
this.bipedHead.addChild(helmet2);

helmet3 = new ModelRenderer(this, 49,1);
helmet3.addBox(4F, -8.0F, 2F, 2, 2, 2, 0F);
this.bipedHead.addChild(helmet3);

helmet4 = new ModelRenderer(this, 37,7);
helmet4.addBox(-1F, -11.0F, -2F, 5, 1, 6, 0F);
this.bipedHead.addChild(helmet4);

bodyArmor = new ModelRenderer(this, 24,2);
bodyArmor.addBox(-4F, 0.0F, -4F, 8, 3, 1, 0F);
this.bipedBody.addChild(bodyArmor);

bodyArmor1 = new ModelRenderer(this, 16,40);
bodyArmor1.addBox(-3F, 4.0F, -4F, 6, 7, 1, 0F);
this.bipedBody.addChild(bodyArmor1);

bodyArmor2 = new ModelRenderer(this, 16,34);
bodyArmor2.addBox(-2F, 6.0F, -5F, 4, 5, 1, 0F);
this.bipedBody.addChild(bodyArmor2);

bodyArmor3 = new ModelRenderer(this, 24,0);
bodyArmor3.addBox(-3F, 3.0F, -4F, 6, 1, 1, 0F);
this.bipedBody.addChild(bodyArmor3);

bodyArmor4 = new ModelRenderer(this, 30,38);
bodyArmor4.addBox(-4F, 2.0F, -3F, 8, 9, 1, 0F);
this.bipedBody.addChild(bodyArmor4);

bodyArmor5 = new ModelRenderer(this, 24,6);
bodyArmor5.addBox(-1F, 11.0F, -3F, 2, 1, 1, 0F);
this.bipedBody.addChild(bodyArmor5);

bodyArmor6 = new ModelRenderer(this, 30,32);
bodyArmor6.addBox(-4F, 1.0F, 1F, 8, 5, 1, 0F);
this.bipedBody.addChild(bodyArmor6);

	}
}
