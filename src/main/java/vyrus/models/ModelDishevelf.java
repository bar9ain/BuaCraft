package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDishevelf extends ModelHuman {
	private ModelRenderer helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7;

	public ModelDishevelf() {
		super();
		helmet1 = new ModelRenderer(this, 36, 1);
		helmet1.addBox(-3F, -12.0F, -3F, 6, 1, 6, 0.1F);
		this.bipedHead.addChild(helmet1);

		helmet2 = new ModelRenderer(this, 32, 0);
		helmet2.addBox(-4F, -11.0F, -4F, 8, 2, 8, 0.1F);
		this.bipedHead.addChild(helmet2);

		helmet3 = new ModelRenderer(this, 30, 1);
		helmet3.addBox(4F, -5.0F, -1F, 2, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet3);

		helmet4 = new ModelRenderer(this, 32, 3);
		helmet4.addBox(4F, -4.0F, -1F, 3, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet4);

		helmet5 = new ModelRenderer(this, 24, 1);
		helmet5.addBox(-6F, -5.0F, -1F, 2, 1, 1, 0.1F);
		helmet5.mirror = true;
		this.bipedHead.addChild(helmet5);

		helmet6 = new ModelRenderer(this, 24, 3);
		helmet6.addBox(-7F, -4.0F, -1F, 3, 1, 1, 0.1F);
		helmet6.mirror = true;
		this.bipedHead.addChild(helmet6);

		helmet7 = new ModelRenderer(this, 24, 5);
		helmet7.addBox(-1F, -4.0F, -6F, 2, 1, 2, 0.1F);
		this.bipedHead.addChild(helmet7);

	}
}
