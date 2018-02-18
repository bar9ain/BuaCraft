package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDonner extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7;
public ModelDonner() {
super();
helmet = new ModelRenderer(this, 37,17);
helmet.addBox(-1F, -5.0F, -5F, 2, 2, 1, 0F);
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 24,0);
helmet1.addBox(-3F, -9.0F, -4F, 6, 1, 2, 0F);
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 52,32);
helmet2.addBox(3F, -5.0F, -2F, 5, 1, 1, 0F);
this.bipedHead.addChild(helmet2);

helmet3 = new ModelRenderer(this, 60,25);
helmet3.addBox(6F, -6.0F, -2F, 1, 1, 1, 0F);
this.bipedHead.addChild(helmet3);

helmet4 = new ModelRenderer(this, 56,20);
helmet4.addBox(8F, -8.0F, -2F, 1, 3, 1, 0F);
this.bipedHead.addChild(helmet4);

helmet5 = new ModelRenderer(this, 60,20);
helmet5.addBox(-9F, -8.0F, -2F, 1, 3, 1, 0F);
this.bipedHead.addChild(helmet5);

helmet6 = new ModelRenderer(this, 52,34);
helmet6.addBox(-9F, -5.0F, -2F, 5, 1, 1, 0F);
this.bipedHead.addChild(helmet6);

helmet7 = new ModelRenderer(this, 56,25);
helmet7.addBox(-7F, -6.0F, -2F, 1, 1, 1, 0F);
this.bipedHead.addChild(helmet7);

	}
}
