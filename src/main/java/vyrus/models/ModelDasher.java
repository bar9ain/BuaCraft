package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDasher extends ModelHuman {
	private ModelRenderer helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8, helmet9;

	public ModelDasher() {
		super();
		helmet1 = new ModelRenderer(this, 56, 36);
		helmet1.addBox(-6.6F, -12.0F, -2F, 1, 6, 1, 0.1F);
		this.bipedHead.addChild(helmet1);

		helmet2 = new ModelRenderer(this, 58, 44);
		helmet2.addBox(-7.7F, -10.0F, -2F, 1, 1, 2, 0.1F);
		this.bipedHead.addChild(helmet2);

		helmet3 = new ModelRenderer(this, 54, 31);
		helmet3.addBox(-7.7F, -12.0F, -2F, 1, 1, 4, 0.1F);
		this.bipedHead.addChild(helmet3);

		helmet4 = new ModelRenderer(this, 59, 29);
		helmet4.addBox(-5.5F, -7.0F, -2F, 1, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet4);

		helmet5 = new ModelRenderer(this, 56, 36);
		helmet5.addBox(5.5F, -12.0F, -2F, 1, 6, 1, 0.1F);
		this.bipedHead.addChild(helmet5);

		helmet6 = new ModelRenderer(this, 59, 29);
		helmet6.addBox(4.4F, -7.0F, -2F, 1, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet6);

		helmet7 = new ModelRenderer(this, 58, 44);
		helmet7.addBox(6.6F, -10.0F, -2F, 1, 1, 2, 0.1F);
		this.bipedHead.addChild(helmet7);

		helmet8 = new ModelRenderer(this, 54, 31);
		helmet8.addBox(6.6F, -12.0F, -2F, 1, 1, 4, 0.1F);
		this.bipedHead.addChild(helmet8);

		helmet9 = new ModelRenderer(this, 56, 17);
		helmet9.addBox(-1.1F, -5.0F, -5F, 2, 2, 1, 0.1F);
		this.bipedHead.addChild(helmet9);

	}
}
