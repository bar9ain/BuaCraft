package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBlitzen extends ModelHuman {
	private ModelRenderer helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, helmet8, helmet9;

	public ModelBlitzen() {
		super();
		helmet1 = new ModelRenderer(this, 56, 21);
		helmet1.addBox(-8F, -14.0F, -1F, 1, 3, 1, 0.1F);
		this.bipedHead.addChild(helmet1);

		helmet2 = new ModelRenderer(this, 56, 27);
		helmet2.addBox(-6.9F, -10.0F, -2F, 2, 1, 1, 0.1F);
		helmet2.mirror = true;
		this.bipedHead.addChild(helmet2);

		helmet3 = new ModelRenderer(this, 56, 21);
		helmet3.addBox(7F, -14.0F, -1F, 1, 3, 1, 0.1F);
		this.bipedHead.addChild(helmet3);

		helmet4 = new ModelRenderer(this, 56, 25);
		helmet4.addBox(5F, -12.0F, -2F, 3, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet4);

		helmet5 = new ModelRenderer(this, 24, 6);
		helmet5.addBox(-1F, -4.0F, -5F, 2, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet5);

		helmet6 = new ModelRenderer(this, 56, 29);
		helmet6.addBox(4F, -13.0F, -2F, 1, 6, 1, 0.1F);
		this.bipedHead.addChild(helmet6);

		helmet7 = new ModelRenderer(this, 56, 27);
		helmet7.addBox(5F, -10.0F, -2F, 2, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet7);

		helmet8 = new ModelRenderer(this, 56, 29);
		helmet8.addBox(-5F, -13.0F, -2F, 1, 6, 1, 0.1F);
		this.bipedHead.addChild(helmet8);

		helmet9 = new ModelRenderer(this, 56, 25);
		helmet9.addBox(-8F, -12.0F, -2F, 3, 1, 1, 0.1F);
		helmet9.mirror = true;
		this.bipedHead.addChild(helmet9);

	}
}
