package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVixen extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8;
public ModelVixen() {
super();
helmet = new ModelRenderer(this, 60,18);
helmet.addBox(-6F, -11.0F, -2F, 1, 6, 1, 0F);
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 58,32);
helmet1.addBox(-8F, -11.0F, -2F, 2, 1, 1, 0F);
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 60,34);
helmet2.addBox(-7F, -8.0F, -2F, 1, 1, 1, 0F);
this.bipedHead.addChild(helmet2);

helmet3 = new ModelRenderer(this, 56,18);
helmet3.addBox(5F, -11.0F, -2F, 1, 6, 1, 0F);
this.bipedHead.addChild(helmet3);

helmet4 = new ModelRenderer(this, 56,34);
helmet4.addBox(6F, -8.0F, -2F, 1, 1, 1, 0F);
this.bipedHead.addChild(helmet4);

helmet5 = new ModelRenderer(this, 56,30);
helmet5.addBox(6F, -11.0F, -2F, 2, 1, 1, 0F);
this.bipedHead.addChild(helmet5);

helmet6 = new ModelRenderer(this, 60,16);
helmet6.addBox(-5F, -6.0F, -2F, 1, 1, 1, 0F);
this.bipedHead.addChild(helmet6);

helmet7 = new ModelRenderer(this, 56,16);
helmet7.addBox(4F, -6.0F, -2F, 1, 1, 1, 0F);
this.bipedHead.addChild(helmet7);

helmet8 = new ModelRenderer(this, 37,17);
helmet8.addBox(-1F, -3.0F, -5F, 2, 1, 1, 0F);
this.bipedHead.addChild(helmet8);

	}
}
