package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelComet extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8;
public ModelComet() {
super();
helmet = new ModelRenderer(this, 56,33);
helmet.addBox(-8F, -9.0F, -3F, 2, 2, 2, 0F);
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 56,16);
helmet1.addBox(-6F, -13.0F, -3F, 2, 7, 2, 0F);
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 56,16);
helmet2.addBox(4F, -13.0F, -3F, 2, 7, 2, 0F);
helmet2.mirror = true;
this.bipedHead.addChild(helmet2);

helmet3 = new ModelRenderer(this, 56,33);
helmet3.addBox(6F, -9.0F, -3F, 2, 2, 2, 0F);
helmet3.mirror = true;
this.bipedHead.addChild(helmet3);

helmet4 = new ModelRenderer(this, 24,5);
helmet4.addBox(0F, -7.0F, -5F, 4, 2, 1, 0F);
this.bipedHead.addChild(helmet4);

helmet5 = new ModelRenderer(this, 24,2);
helmet5.addBox(-4F, -7.0F, -5F, 4, 2, 1, 0F);
this.bipedHead.addChild(helmet5);

helmet6 = new ModelRenderer(this, 34,5);
helmet6.addBox(-1F, -5.0F, -5F, 2, 2, 1, 0F);
this.bipedHead.addChild(helmet6);

helmet7 = new ModelRenderer(this, 56,25);
helmet7.addBox(-6F, -12.0F, -1F, 2, 2, 2, 0F);
this.bipedHead.addChild(helmet7);

helmet8 = new ModelRenderer(this, 56,29);
helmet8.addBox(4F, -12.0F, -1F, 2, 2, 2, 0F);
helmet8.mirror = true;
this.bipedHead.addChild(helmet8);

	}
}
