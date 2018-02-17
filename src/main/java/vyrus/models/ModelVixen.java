package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVixen extends ModelHuman {
	private ModelRenderer helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8, helmet9;

	public ModelVixen() {
		super();
		helmet1 = new ModelRenderer(this, 60, 18);
		helmet1.addBox(-6F, -12.0F, -2F, 1, 6, 1, 0.1F);
		this.bipedHead.addChild(helmet1);

		helmet2 = new ModelRenderer(this, 58, 32);
		helmet2.addBox(-8F, -12.0F, -2F, 2, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet2);

		helmet3 = new ModelRenderer(this, 60, 34);
		helmet3.addBox(-7F, -9.0F, -2F, 1, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet3);

		helmet4 = new ModelRenderer(this, 56, 18);
		helmet4.addBox(5F, -12.0F, -2F, 1, 6, 1, 0.1F);
		this.bipedHead.addChild(helmet4);

		helmet5 = new ModelRenderer(this, 56, 34);
		helmet5.addBox(6F, -9.0F, -2F, 1, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet5);

		helmet6 = new ModelRenderer(this, 56, 30);
		helmet6.addBox(6F, -12.0F, -2F, 2, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet6);

		helmet7 = new ModelRenderer(this, 60, 16);
		helmet7.addBox(-5F, -7.0F, -2F, 1, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet7);

		helmet8 = new ModelRenderer(this, 56, 16);
		helmet8.addBox(4F, -7.0F, -2F, 1, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet8);

		helmet9 = new ModelRenderer(this, 37, 17);
		helmet9.addBox(-1F, -4.0F, -5F, 2, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet9);

	}
}
