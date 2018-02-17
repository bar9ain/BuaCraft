package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelYuletideYeti extends ModelHuman {
	private ModelRenderer helmet1, helmet2, helmet3, helmet4, helmet5;

	public ModelYuletideYeti() {
		super();
		helmet1 = new ModelRenderer(this, 40, 3);
		helmet1.addBox(-3F, -10.0F, -3F, 6, 1, 6, 0.1F);
		this.bipedHead.addChild(helmet1);

		helmet2 = new ModelRenderer(this, 28, 3);
		helmet2.addBox(-5F, -11.0F, -1F, 1, 4, 1, 0.1F);
		this.bipedHead.addChild(helmet2);

		helmet3 = new ModelRenderer(this, 24, 3);
		helmet3.addBox(4F, -11.0F, -1F, 1, 4, 1, 0.1F);
		this.bipedHead.addChild(helmet3);

		helmet4 = new ModelRenderer(this, 32, 4);
		helmet4.addBox(4F, -7.0F, -3F, 1, 6, 6, 0.1F);
		helmet4.mirror = true;
		this.bipedHead.addChild(helmet4);

		helmet5 = new ModelRenderer(this, 32, 4);
		helmet5.addBox(-5F, -7.0F, -3F, 1, 6, 6, 0.1F);
		this.bipedHead.addChild(helmet5);

	}
}
