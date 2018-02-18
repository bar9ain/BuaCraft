package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDancer extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8, helmet9;
public ModelDancer() {
super();
helmet = new ModelRenderer(this, 56,32);
helmet.addBox(-7F, -11.0F, -3F, 1, 5, 1, 0F);
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 60,32);
helmet1.addBox(-6F, -10.0F, -3F, 1, 1, 1, 0F);
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 56,38);
helmet2.addBox(-6F, -7.0F, -3F, 2, 1, 1, 0F);
this.bipedHead.addChild(helmet2);

helmet3 = new ModelRenderer(this, 56,30);
helmet3.addBox(-6F, -12.0F, -3F, 2, 1, 1, 0F);
this.bipedHead.addChild(helmet3);

helmet4 = new ModelRenderer(this, 56,20);
helmet4.addBox(4F, -12.0F, -3F, 2, 1, 1, 0F);
this.bipedHead.addChild(helmet4);

helmet5 = new ModelRenderer(this, 60,22);
helmet5.addBox(5F, -10.0F, -3F, 1, 1, 1, 0F);
this.bipedHead.addChild(helmet5);

helmet6 = new ModelRenderer(this, 56,22);
helmet6.addBox(6F, -11.0F, -3F, 1, 5, 1, 0F);
this.bipedHead.addChild(helmet6);

helmet7 = new ModelRenderer(this, 56,28);
helmet7.addBox(4F, -7.0F, -3F, 2, 1, 1, 0F);
this.bipedHead.addChild(helmet7);

helmet8 = new ModelRenderer(this, 57,17);
helmet8.addBox(-1F, -3.0F, -5F, 2, 1, 1, 0F);
this.bipedHead.addChild(helmet8);

helmet9 = new ModelRenderer(this, 24,3);
helmet9.addBox(-2F, -9.0F, 4F, 4, 3, 2, 0F);
this.bipedHead.addChild(helmet9);

	}
}
