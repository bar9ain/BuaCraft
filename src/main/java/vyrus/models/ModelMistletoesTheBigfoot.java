package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMistletoesTheBigfoot extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2, helmet3, helmet4, helmet5, helmet6;
public ModelMistletoesTheBigfoot() {
super();
this.bipedHeadwear.isHidden = true;

helmet = new ModelRenderer(this, 46,3);
helmet.addBox(-6F, -8.0F, 0F, 1, 3, 1, 0F);
helmet.mirror = true;
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 42,3);
helmet1.addBox(-5F, -7.0F, 0F, 1, 3, 1, 0F);
helmet1.mirror = true;
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 42,3);
helmet2.addBox(4F, -7.0F, 0F, 1, 3, 1, 0F);
this.bipedHead.addChild(helmet2);

helmet3 = new ModelRenderer(this, 46,3);
helmet3.addBox(5F, -8.0F, 0F, 1, 3, 1, 0F);
this.bipedHead.addChild(helmet3);

helmet4 = new ModelRenderer(this, 32,8);
helmet4.addBox(-3F, -7.0F, -5F, 6, 1, 1, 0F);
this.bipedHead.addChild(helmet4);

helmet5 = new ModelRenderer(this, 32,11);
helmet5.addBox(-3F, -3.0F, -5F, 6, 4, 1, 0F);
this.bipedHead.addChild(helmet5);

helmet6 = new ModelRenderer(this, 24,1);
helmet6.addBox(-3F, -9.0F, -3F, 6, 1, 6, 0F);
this.bipedHead.addChild(helmet6);

	}
}
