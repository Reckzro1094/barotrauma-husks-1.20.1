package bryce.barotraumahusks.entity.client;

import bryce.barotraumahusks.entity.custom.HuskEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Husk<T extends HuskEntity> extends SinglePartEntityModel<T> {
	private final ModelPart husk;
	private final ModelPart head;
	private final ModelPart t;
	private final ModelPart b;
	private final ModelPart body;
	private final ModelPart oxygen;
	private final ModelPart arms;
	private final ModelPart legs;
	private final ModelPart ll;
	private final ModelPart rl;
	public Husk(ModelPart root) {
		this.husk = root.getChild("husk");
		this.head = root.getChild("head");
		this.t = root.getChild("t");
		this.b = root.getChild("b");
		this.body = root.getChild("body");
		this.oxygen = root.getChild("oxygen");
		this.arms = root.getChild("arms");
		this.legs = root.getChild("legs");
		this.ll = root.getChild("ll");
		this.rl = root.getChild("rl");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData husk = modelPartData.addChild("husk", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -1.0F));

		ModelPartData head = husk.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -3.0F, 1.0F));

		ModelPartData t = head.addChild("t", ModelPartBuilder.create().uv(-9, -6).cuboid(-4.0F, -5.0F, -5.0F, 8.0F, 5.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData b = head.addChild("b", ModelPartBuilder.create().uv(-10, -6).cuboid(-4.0F, -21.0F, -5.0F, 8.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 21.0F, 0.0F));

		ModelPartData body = husk.addChild("body", ModelPartBuilder.create().uv(-9, -2).cuboid(-4.0F, -18.0F, -3.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 18.0F, 1.0F));

		ModelPartData oxygen = body.addChild("oxygen", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -17.0F, -5.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(1.0F, -17.0F, -5.0F, 2.0F, 8.0F, 2.0F, new Dilation(0.0F))
		.uv(1, 1).cuboid(-3.0F, -18.0F, -4.0F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData arms = husk.addChild("arms", ModelPartBuilder.create().uv(-3, -2).cuboid(-7.0F, 0.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(-3, -2).cuboid(4.0F, 0.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData legs = husk.addChild("legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData ll = legs.addChild("ll", ModelPartBuilder.create().uv(-2, -2).cuboid(-4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

		ModelPartData rl = legs.addChild("rl", ModelPartBuilder.create().uv(-2, -2).cuboid(0.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 12.0F, 0.0F));
		return TexturedModelData.of(modelData, 16, 16);
	}
	@Override
	public void setAngles(HuskEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		husk.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return husk;
	}
}