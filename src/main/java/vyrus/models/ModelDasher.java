package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDasher extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8;
public ModelDasher() {
super();
helmet = new ModelRenderer(this, 56,36);
helmet.addBox(-6F, -11.0F, -2F, 1, 6, 1, 0F);
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 58,44);
helmet1.addBox(-7F, -9.0F, -2F, 1, 1, 2, 0F);
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 54,31);
helmet2.addBox(-7F, -11.0F, -2F, 1, 1, 4, 0F);
this.bipedHead.addChild(helmet2);

helmet3 = new ModelRenderer(this, 59,29);
helmet3.addBox(-5F, -6.0F, -2F, 1, 1, 1, 0F);
this.bipedHead.addChild(helmet3);

helmet4 = new ModelRenderer(this, 56,36);
helmet4.addBox(5F, -11.0F, -2F, 1, 6, 1, 0F);
this.bipedHead.addChild(helmet4);

helmet5 = new ModelRenderer(this, 59,29);
helmet5.addBox(4F, -6.0F, -2F, 1, 1, 1, 0F);
this.bipedHead.addChild(helmet5);

helmet6 = new ModelRenderer(this, 58,44);
helmet6.addBox(6F, -9.0F, -2F, 1, 1, 2, 0F);
this.bipedHead.addChild(helmet6);

helmet7 = new ModelRenderer(this, 54,31);
helmet7.addBox(6F, -11.0F, -2F, 1, 1, 4, 0F);
this.bipedHead.addChild(helmet7);

helmet8 = new ModelRenderer(this, 56,17);
helmet8.addBox(-1F, -4.0F, -5F, 2, 2, 1, 0F);
this.bipedHead.addChild(helmet8);

	}
}
