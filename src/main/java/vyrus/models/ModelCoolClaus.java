package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCoolClaus extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2, helmet3;
public ModelCoolClaus() {
super();
this.bipedHeadwear.isHidden = true;

helmet = new ModelRenderer(this, 24,0);
helmet.addBox(-4F, -10.0F, -4F, 8, 2, 6, 0F);
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 50,0);
helmet1.addBox(-5F, -10.0F, -4F, 1, 10, 6, 0F);
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 32,8);
helmet2.addBox(-1F, 0.0F, 3F, 2, 2, 1, 0F);
this.bipedHead.addChild(helmet2);

helmet3 = new ModelRenderer(this, 50,0);
helmet3.addBox(4F, -10.0F, -4F, 1, 10, 6, 0F);
helmet3.mirror = true;
this.bipedHead.addChild(helmet3);

	}
}
