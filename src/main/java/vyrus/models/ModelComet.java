package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelComet extends ModelHuman {
	private ModelRenderer helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8, helmet9;

	public ModelComet() {
		super();
		helmet1 = new ModelRenderer(this, 56, 33);
		helmet1.addBox(-8F, -10.0F, -3F, 2, 2, 2, 0.1F);
		this.bipedHead.addChild(helmet1);

		helmet2 = new ModelRenderer(this, 56, 16);
		helmet2.addBox(-6F, -14.0F, -3F, 2, 7, 2, 0.1F);
		this.bipedHead.addChild(helmet2);

		helmet3 = new ModelRenderer(this, 56, 16);
		helmet3.addBox(4F, -14.0F, -3F, 2, 7, 2, 0.1F);
		helmet3.mirror = true;
		this.bipedHead.addChild(helmet3);

		helmet4 = new ModelRenderer(this, 56, 33);
		helmet4.addBox(6F, -10.0F, -3F, 2, 2, 2, 0.1F);
		helmet4.mirror = true;
		this.bipedHead.addChild(helmet4);

		helmet5 = new ModelRenderer(this, 24, 5);
		helmet5.addBox(0F, -8.0F, -5F, 4, 2, 1, 0.1F);
		this.bipedHead.addChild(helmet5);

		helmet6 = new ModelRenderer(this, 24, 2);
		helmet6.addBox(-4F, -8.0F, -5F, 4, 2, 1, 0.1F);
		this.bipedHead.addChild(helmet6);

		helmet7 = new ModelRenderer(this, 34, 5);
		helmet7.addBox(-1F, -6.0F, -5F, 2, 2, 1, 0.1F);
		this.bipedHead.addChild(helmet7);

		helmet8 = new ModelRenderer(this, 56, 25);
		helmet8.addBox(-6F, -13.0F, -1F, 2, 2, 2, 0.1F);
		this.bipedHead.addChild(helmet8);

		helmet9 = new ModelRenderer(this, 56, 29);
		helmet9.addBox(4F, -13.0F, -1F, 2, 2, 2, 0.1F);
		helmet9.mirror = true;
		this.bipedHead.addChild(helmet9);

	}
}
