package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKrampus extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, bodyArmor;
public ModelKrampus() {
super();
this.bipedHeadwear.isHidden = true;

helmet = new ModelRenderer(this, 28,0);
helmet.addBox(4F, -7.0F, -1F, 1, 4, 2, 0F);
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 28,0);
helmet1.addBox(-5F, -7.0F, -1F, 1, 4, 2, 0F);
helmet1.mirror = true;
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 24,0);
helmet2.addBox(-3F, -9.0F, -5F, 1, 2, 1, 0F);
this.bipedHead.addChild(helmet2);

helmet3 = new ModelRenderer(this, 24,3);
helmet3.addBox(-3F, -12.0F, -4F, 1, 4, 1, 0F);
this.bipedHead.addChild(helmet3);

helmet4 = new ModelRenderer(this, 24,3);
helmet4.addBox(2F, -12.0F, -4F, 1, 4, 1, 0F);
this.bipedHead.addChild(helmet4);

helmet5 = new ModelRenderer(this, 24,0);
helmet5.addBox(2F, -9.0F, -5F, 1, 2, 1, 0F);
this.bipedHead.addChild(helmet5);

helmet6 = new ModelRenderer(this, 3,2);
helmet6.addBox(-3F, -9.0F, -3F, 6, 1, 6, 0F);
this.bipedHead.addChild(helmet6);

bodyArmor = new ModelRenderer(this, 32,3);
bodyArmor.addBox(-3F, 2.0F, 1F, 6, 8, 5, 0F);
this.bipedBody.addChild(bodyArmor);

	}
}
