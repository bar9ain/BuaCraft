package vyrus.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKrampus extends ModelHuman {
	private ModelRenderer helmet1, helmet2, helmet3, helmet4, helmet5, helmet6, helmet7, bodyArmor1;

	public ModelKrampus() {
		super();
		// left ear
		helmet1 = new ModelRenderer(this, 28, 0);
		helmet1.addBox(4.5F, -8.1F, -0.85F, 1, 4, 2, 0.28F);
		this.bipedHead.addChild(helmet1);

		// right ear
		helmet2 = new ModelRenderer(this, 28, 0);
		helmet2.addBox(-5.5F, -8.1F, -0.85F, 1, 4, 2, 0.28F);
		helmet2.mirror = true;
		this.bipedHead.addChild(helmet2);

		// left horn
		helmet3 = new ModelRenderer(this, 24, 0);
		helmet3.addBox(-3.3F, -10.4F, -5.6F, 1, 2, 1, 0.1F);
		this.bipedHead.addChild(helmet3);

		helmet4 = new ModelRenderer(this, 24, 3);
		helmet4.addBox(-3.3F, -13.5F, -4.4F, 1, 4, 1, 0.1F);
		this.bipedHead.addChild(helmet4);

		// right horn
		helmet5 = new ModelRenderer(this, 24, 3);
		helmet5.addBox(2.3F, -13.5F, -4.4F, 1, 4, 1, 0.1F);
		this.bipedHead.addChild(helmet5);

		helmet6 = new ModelRenderer(this, 24, 0);
		helmet6.addBox(2.3F, -10.4F, -5.6F, 1, 2, 1, 0.1F);
		this.bipedHead.addChild(helmet6);

		// hat
		helmet7 = new ModelRenderer(this, 3, 2);
		helmet7.addBox(-3F, -10.4F, -2.9F, 6, 1, 6, 0.4F);
		this.bipedHead.addChild(helmet7);

		// backpack
		bodyArmor1 = new ModelRenderer(this, 32, 3);
		bodyArmor1.addBox(-3F, 2.0F, 3F, 6, 8, 5, 0.4F);
		this.bipedBody.addChild(bodyArmor1);
		this.bipedHeadwear.isHidden = true;

	}
}
