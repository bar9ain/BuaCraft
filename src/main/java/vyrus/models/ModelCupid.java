package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCupid extends ModelHuman {
private ModelRenderer helmet, helmet1, helmet2;
public ModelCupid() {
super();
helmet = new ModelRenderer(this, 56,20);
helmet.addBox(-5F, -9.0F, -3F, 1, 3, 2, 0F);
this.bipedHead.addChild(helmet);

helmet1 = new ModelRenderer(this, 56,25);
helmet1.addBox(4F, -9.0F, -3F, 1, 3, 2, 0F);
this.bipedHead.addChild(helmet1);

helmet2 = new ModelRenderer(this, 57,17);
helmet2.addBox(-1F, -3.0F, -5F, 2, 1, 1, 0F);
this.bipedHead.addChild(helmet2);

	}
}
