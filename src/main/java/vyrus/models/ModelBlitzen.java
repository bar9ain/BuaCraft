package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBlitzen extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8;
public ModelBlitzen() {
super();
helmet = new ModelRenderer(this, 56,21);
helmet.addBox(-8F, -13.0F, -1F, 1, 3, 1, 0F);
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 56,27);
helmet1.addBox(-6F, -9.0F, -2F, 2, 1, 1, 0F);
helmet1.mirror = true;
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 56,21);
helmet2.addBox(7F, -13.0F, -1F, 1, 3, 1, 0F);
this.bipedHead.addChild(helmet2);

helmet3 = new ModelRenderer(this, 56,25);
helmet3.addBox(5F, -11.0F, -2F, 3, 1, 1, 0F);
this.bipedHead.addChild(helmet3);

helmet4 = new ModelRenderer(this, 24,6);
helmet4.addBox(-1F, -3.0F, -5F, 2, 1, 1, 0F);
this.bipedHead.addChild(helmet4);

helmet5 = new ModelRenderer(this, 56,29);
helmet5.addBox(4F, -12.0F, -2F, 1, 6, 1, 0F);
this.bipedHead.addChild(helmet5);

helmet6 = new ModelRenderer(this, 56,27);
helmet6.addBox(5F, -9.0F, -2F, 2, 1, 1, 0F);
this.bipedHead.addChild(helmet6);

helmet7 = new ModelRenderer(this, 56,29);
helmet7.addBox(-5F, -12.0F, -2F, 1, 6, 1, 0F);
this.bipedHead.addChild(helmet7);

helmet8 = new ModelRenderer(this, 56,25);
helmet8.addBox(-8F, -11.0F, -2F, 3, 1, 1, 0F);
helmet8.mirror = true;
this.bipedHead.addChild(helmet8);

	}
}
