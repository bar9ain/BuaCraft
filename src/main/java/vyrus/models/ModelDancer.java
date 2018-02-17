package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDancer extends ModelHuman {
	private ModelRenderer helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8, helmet9, helmet10;

	public ModelDancer() {
		super();
		helmet1 = new ModelRenderer(this, 56, 32);
		helmet1.addBox(-7F, -12.0F, -3F, 1, 5, 1, 0.1F);
		this.bipedHead.addChild(helmet1);

		helmet2 = new ModelRenderer(this, 60, 32);
		helmet2.addBox(-6F, -11.0F, -3F, 1, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet2);

		helmet3 = new ModelRenderer(this, 56, 38);
		helmet3.addBox(-6F, -8.0F, -3F, 2, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet3);

		helmet4 = new ModelRenderer(this, 56, 30);
		helmet4.addBox(-6F, -13.0F, -3F, 2, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet4);

		helmet5 = new ModelRenderer(this, 56, 20);
		helmet5.addBox(4F, -13.0F, -3F, 2, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet5);

		helmet6 = new ModelRenderer(this, 60, 22);
		helmet6.addBox(5F, -11.0F, -3F, 1, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet6);

		helmet7 = new ModelRenderer(this, 56, 22);
		helmet7.addBox(6F, -12.0F, -3F, 1, 5, 1, 0.1F);
		this.bipedHead.addChild(helmet7);

		helmet8 = new ModelRenderer(this, 56, 28);
		helmet8.addBox(4F, -8.0F, -3F, 2, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet8);

		helmet9 = new ModelRenderer(this, 57, 17);
		helmet9.addBox(-1F, -4.0F, -5F, 2, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet9);

		helmet10 = new ModelRenderer(this, 24, 3);
		helmet10.addBox(-2F, -10.0F, 4F, 4, 3, 2, 0.1F);
		this.bipedHead.addChild(helmet10);

	}
}
