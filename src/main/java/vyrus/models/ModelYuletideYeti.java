package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelYuletideYeti extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2, helmet3, helmet4;
public ModelYuletideYeti() {
super();
this.bipedHeadwear.isHidden = true;

helmet = new ModelRenderer(this, 40,3);
helmet.addBox(-3F, -9.0F, -3F, 6, 1, 6, 0F);
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 28,3);
helmet1.addBox(-5F, -10.0F, -1F, 1, 4, 1, 0F);
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 24,3);
helmet2.addBox(4F, -10.0F, -1F, 1, 4, 1, 0F);
this.bipedHead.addChild(helmet2);

helmet3 = new ModelRenderer(this, 32,4);
helmet3.addBox(4F, -6.0F, -3F, 1, 6, 6, 0F);
helmet3.mirror = true;
this.bipedHead.addChild(helmet3);

helmet4 = new ModelRenderer(this, 32,4);
helmet4.addBox(-5F, -6.0F, -3F, 1, 6, 6, 0F);
this.bipedHead.addChild(helmet4);

	}
}
