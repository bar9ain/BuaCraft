package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDonner extends ModelHuman {
	private ModelRenderer helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8;

	public ModelDonner() {
		super();
		helmet1 = new ModelRenderer(this, 37, 17);
		helmet1.addBox(-1F, -6.0F, -5F, 2, 2, 1, 0.1F);
		this.bipedHead.addChild(helmet1);

		helmet2 = new ModelRenderer(this, 24, 0);
		helmet2.addBox(-3F, -10.0F, -4F, 6, 1, 2, 0.1F);
		this.bipedHead.addChild(helmet2);

		helmet3 = new ModelRenderer(this, 52, 32);
		helmet3.addBox(4F, -6.0F, -2F, 5, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet3);

		helmet4 = new ModelRenderer(this, 60, 25);
		helmet4.addBox(6F, -7.0F, -2F, 1, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet4);

		helmet5 = new ModelRenderer(this, 56, 20);
		helmet5.addBox(8F, -9.0F, -2F, 1, 3, 1, 0.1F);
		this.bipedHead.addChild(helmet5);

		helmet6 = new ModelRenderer(this, 60, 20);
		helmet6.addBox(-9F, -9.0F, -2F, 1, 3, 1, 0.1F);
		this.bipedHead.addChild(helmet6);

		helmet7 = new ModelRenderer(this, 52, 34);
		helmet7.addBox(-9F, -6.0F, -2F, 5, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet7);

		helmet8 = new ModelRenderer(this, 56, 25);
		helmet8.addBox(-7F, -7.0F, -2F, 1, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet8);

	}
}
