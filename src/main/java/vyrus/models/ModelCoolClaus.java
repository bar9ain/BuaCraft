package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCoolClaus extends ModelHuman {
	private ModelRenderer helmet1, helmet2, helmet3, helmet4;

	public ModelCoolClaus() {
		super();
		helmet1 = new ModelRenderer(this, 24, 0);
		helmet1.addBox(-4F, -11.0F, -4F, 8, 2, 6, 0.1F);
		this.bipedHead.addChild(helmet1);

		helmet2 = new ModelRenderer(this, 50, 0);
		helmet2.addBox(-5F, -11.0F, -4F, 1, 10, 6, 0.1F);
		this.bipedHead.addChild(helmet2);

		helmet3 = new ModelRenderer(this, 32, 8);
		helmet3.addBox(-1F, -1.0F, 3F, 2, 2, 1, 0.1F);
		this.bipedHead.addChild(helmet3);

		helmet4 = new ModelRenderer(this, 50, 0);
		helmet4.addBox(4F, -11.0F, -4F, 1, 10, 6, 0.1F);
		helmet4.mirror = true;
		this.bipedHead.addChild(helmet4);

	}
}
