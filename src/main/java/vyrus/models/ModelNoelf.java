package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNoelf extends ModelHuman {
	private ModelRenderer helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7;

	public ModelNoelf() {
		super();
		helmet1 = new ModelRenderer(this, 32, 3);
		helmet1.addBox(4F, -5.0F, -1F, 3, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet1);

		helmet2 = new ModelRenderer(this, 30, 1);
		helmet2.addBox(4F, -4.0F, -1F, 2, 1, 1, 0.1F);
		this.bipedHead.addChild(helmet2);

		helmet3 = new ModelRenderer(this, 24, 3);
		helmet3.addBox(-7F, -5.0F, -1F, 3, 1, 1, 0.1F);
		helmet3.mirror = true;
		this.bipedHead.addChild(helmet3);

		helmet4 = new ModelRenderer(this, 24, 1);
		helmet4.addBox(-6F, -4.0F, -1F, 2, 1, 1, 0.1F);
		helmet4.mirror = true;
		this.bipedHead.addChild(helmet4);

		helmet5 = new ModelRenderer(this, 32, 0);
		helmet5.addBox(-4F, -11.0F, -4F, 8, 2, 8, 0.1F);
		this.bipedHead.addChild(helmet5);

		helmet6 = new ModelRenderer(this, 0, 32);
		helmet6.addBox(-3F, -12.0F, -2F, 6, 1, 6, 0.1F);
		this.bipedHead.addChild(helmet6);

		helmet7 = new ModelRenderer(this, 24, 5);
		helmet7.addBox(-1F, -4.0F, -6F, 2, 1, 2, 0.1F);
		this.bipedHead.addChild(helmet7);

	}
}
