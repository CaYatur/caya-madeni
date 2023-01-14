// Made with Blockbench 3.9.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelw extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelw() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(4, 36).addBox(-3.0F, -23.0F, 2.0F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(42, 38).addBox(-2.0F, -24.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		bb_main.setTextureOffset(42, 38).addBox(1.0F, -24.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		bb_main.setTextureOffset(42, 38).addBox(-2.0F, -24.0F, -2.02F, 1.0F, 6.0F, 0.0F, 0.0F, false);
		bb_main.setTextureOffset(42, 38).addBox(1.0F, -24.0F, -2.02F, 1.0F, 6.0F, 0.0F, 0.0F, false);
		bb_main.setTextureOffset(48, 44).addBox(-2.0F, -24.0F, -4.0F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(48, 44).addBox(1.0F, -24.0F, -4.0F, 1.0F, 0.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}