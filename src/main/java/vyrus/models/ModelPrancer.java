package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPrancer extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8, helmet9, helmet10;
public ModelPrancer() {
super();
helmet = new ModelRenderer(this, 60,24);
helmet.addBox(-7F, -9.0F, -2F, 1, 2, 1, 0F);
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 56,27);
helmet1.addBox(-8F, -8.0F, -2F, 1, 2, 1, 0F);
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 60,22);
helmet2.addBox(-6F, -8.0F, -2F, 1, 1, 1, 0F);
this.bipedHead.addChild(helmet2);

helmet3 = new ModelRenderer(this, 60,16);
helmet3.addBox(-5F, -10.0F, -2F, 1, 5, 1, 0F);
this.bipedHead.addChild(helmet3);

helmet4 = new ModelRenderer(this, 56,24);
helmet4.addBox(6F, -9.0F, -2F, 1, 2, 1, 0F);
this.bipedHead.addChild(helmet4);

helmet5 = new ModelRenderer(this, 60,27);
helmet5.addBox(7F, -8.0F, -2F, 1, 2, 1, 0F);
this.bipedHead.addChild(helmet5);

helmet6 = new ModelRenderer(this, 56,22);
helmet6.addBox(5F, -8.0F, -2F, 1, 1, 1, 0F);
this.bipedHead.addChild(helmet6);

helmet7 = new ModelRenderer(this, 56,16);
helmet7.addBox(4F, -10.0F, -2F, 1, 5, 1, 0F);
this.bipedHead.addChild(helmet7);

helmet8 = new ModelRenderer(this, 4,0);
helmet8.addBox(-5F, -4.0F, -3F, 1, 1, 1, 0F);
this.bipedHead.addChild(helmet8);

helmet9 = new ModelRenderer(this, 4,0);
helmet9.addBox(4F, -4.0F, -3F, 1, 1, 1, 0F);
this.bipedHead.addChild(helmet9);

helmet10 = new ModelRenderer(this, 37,17);
helmet10.addBox(-1F, -4.0F, -5F, 2, 2, 1, 0F);
this.bipedHead.addChild(helmet10);

	}
}
