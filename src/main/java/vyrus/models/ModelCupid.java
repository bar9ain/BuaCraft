package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCupid extends ModelHuman {
	private ModelRenderer helmet1, helmet2, helmet3;

	public ModelCupid() {
		super();
		helmet1 = new ModelRenderer(this, 56, 20);
		helmet1.addBox(-5F, -10.0F, -3F, 1, 3, 2, 0.1F);
		this.bipedHead.addChild(helmet1);

		helmet2 = new ModelRenderer(this, 56, 25);
		helmet2.addBox(4F, -10.0F, -3F, 1, 3, 2, 0.1F);
		this.bipedHead.addChild(helmet2);

		helmet3 = new ModelRenderer(this, 57, 17);
		helmet3.addBox(-1F, -4.0F, -5F, 2, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet3);

	}
}
