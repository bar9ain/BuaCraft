package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPrancer extends ModelHuman {
	private ModelRenderer helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8, helmet9, helmet10,
			helmet11;

	public ModelPrancer() {
		super();
		helmet1 = new ModelRenderer(this, 60, 24);
		helmet1.addBox(-7F, -10.0F, -2F, 1, 2, 1, 0.1F);
		this.bipedHead.addChild(helmet1);

		helmet2 = new ModelRenderer(this, 56, 27);
		helmet2.addBox(-8F, -9.0F, -2F, 1, 2, 1, 0.1F);
		this.bipedHead.addChild(helmet2);

		helmet3 = new ModelRenderer(this, 60, 22);
		helmet3.addBox(-6F, -9.0F, -2F, 1, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet3);

		helmet4 = new ModelRenderer(this, 60, 16);
		helmet4.addBox(-5F, -11.0F, -2F, 1, 5, 1, 0.1F);
		this.bipedHead.addChild(helmet4);

		helmet5 = new ModelRenderer(this, 56, 24);
		helmet5.addBox(6F, -10.0F, -2F, 1, 2, 1, 0.1F);
		this.bipedHead.addChild(helmet5);

		helmet6 = new ModelRenderer(this, 60, 27);
		helmet6.addBox(7F, -9.0F, -2F, 1, 2, 1, 0.1F);
		this.bipedHead.addChild(helmet6);

		helmet7 = new ModelRenderer(this, 56, 22);
		helmet7.addBox(5F, -9.0F, -2F, 1, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet7);

		helmet8 = new ModelRenderer(this, 56, 16);
		helmet8.addBox(4F, -11.0F, -2F, 1, 5, 1, 0.1F);
		this.bipedHead.addChild(helmet8);

		helmet9 = new ModelRenderer(this, 4, 0);
		helmet9.addBox(-5F, -5.0F, -3F, 1, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet9);

		helmet10 = new ModelRenderer(this, 4, 0);
		helmet10.addBox(4F, -5.0F, -3F, 1, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet10);

		helmet11 = new ModelRenderer(this, 37, 17);
		helmet11.addBox(-1F, -5.0F, -5F, 2, 2, 1, 0.1F);
		this.bipedHead.addChild(helmet11);

	}
}
