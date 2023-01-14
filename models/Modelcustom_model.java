// Made with Blockbench 3.9.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer kafa;
	private final ModelRenderer sag_el;
	private final ModelRenderer cube_r1;
	private final ModelRenderer sol_el;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bb_main;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		kafa = new ModelRenderer(this);
		kafa.setRotationPoint(0.0F, 24.0F, 0.0F);
		kafa.cubeList.add(new ModelBox(kafa, 0, 19, -2.5F, -24.0F, -2.0F, 5, 5, 3, 0.0F, false));
		kafa.cubeList.add(new ModelBox(kafa, 15, 13, -1.5F, -25.0F, -1.0F, 1, 1, 1, 0.0F, false));
		kafa.cubeList.add(new ModelBox(kafa, 0, 3, 0.5F, -25.0F, -1.0F, 1, 1, 1, 0.0F, false));

		sag_el = new ModelRenderer(this);
		sag_el.setRotationPoint(0.0F, 24.0F, 0.0F);
		sag_el.cubeList.add(new ModelBox(sag_el, 25, 12, 4.0F, -19.5F, -1.0F, 4, 1, 1, 0.0F, false));
		sag_el.cubeList.add(new ModelBox(sag_el, 15, 14, 5.0F, -18.5F, -3.0F, 5, 1, 5, 0.0F, false));
		sag_el.cubeList.add(new ModelBox(sag_el, 16, 22, 5.0F, -17.5F, 1.0F, 5, 1, 1, 0.0F, false));
		sag_el.cubeList.add(new ModelBox(sag_el, 21, 2, 5.0F, -17.5F, -3.0F, 5, 1, 1, 0.0F, false));
		sag_el.cubeList.add(new ModelBox(sag_el, 0, 13, 7.0F, -18.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -8.0F, 0.0F);
		sag_el.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 4, -2.0F, -9.5F, -10.0F, 3, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 6, -2.0F, -9.5F, -6.0F, 3, 1, 1, 0.0F, false));

		sol_el = new ModelRenderer(this);
		sol_el.setRotationPoint(-15.0F, 24.0F, 0.0F);
		sol_el.cubeList.add(new ModelBox(sol_el, 16, 24, 7.0F, -19.5F, -1.0F, 4, 1, 1, 0.0F, false));
		sol_el.cubeList.add(new ModelBox(sol_el, 0, 13, 5.0F, -18.5F, -3.0F, 5, 1, 5, 0.0F, false));
		sol_el.cubeList.add(new ModelBox(sol_el, 21, 0, 5.0F, -17.5F, 1.0F, 5, 1, 1, 0.0F, false));
		sol_el.cubeList.add(new ModelBox(sol_el, 13, 20, 5.0F, -17.5F, -3.0F, 5, 1, 1, 0.0F, false));
		sol_el.cubeList.add(new ModelBox(sol_el, 0, 0, 7.0F, -18.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -8.0F, 0.0F);
		sol_el.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 20, -2.0F, -9.5F, -10.0F, 3, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 25, -2.0F, -9.5F, -6.0F, 3, 1, 1, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.0F, -21.0F, -3.0F, 8, 8, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		kafa.render(f5);
		sag_el.render(f5);
		sol_el.render(f5);
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.kafa.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.kafa.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}