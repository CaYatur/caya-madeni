package net.mcreator.cayamadeni.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.cayamadeni.entity.BossEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BossRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BossEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelboss(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("caya_madeni:textures/texture_1.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelboss extends EntityModel<Entity> {
		private final ModelRenderer kafa;
		private final ModelRenderer sol_el;
		private final ModelRenderer sael;
		private final ModelRenderer sabacak;
		private final ModelRenderer sol_bacak;
		private final ModelRenderer bb_main;
		public Modelboss() {
			textureWidth = 64;
			textureHeight = 64;
			kafa = new ModelRenderer(this);
			kafa.setRotationPoint(8.0F, 24.0F, -7.0F);
			kafa.setTextureOffset(0, 14).addBox(-11.0F, -26.0F, 7.0F, 7.0F, 4.0F, 2.0F, 0.0F, false);
			sol_el = new ModelRenderer(this);
			sol_el.setRotationPoint(8.0F, 24.0F, -7.0F);
			sol_el.setTextureOffset(18, 14).addBox(-15.0F, -20.0F, 7.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
			sael = new ModelRenderer(this);
			sael.setRotationPoint(8.0F, 24.0F, -7.0F);
			sael.setTextureOffset(0, 20).addBox(-2.0F, -20.0F, 7.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
			sabacak = new ModelRenderer(this);
			sabacak.setRotationPoint(0.0F, 24.0F, 0.0F);
			sabacak.setTextureOffset(8, 20).addBox(3.0F, -12.0F, 0.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			sabacak.setTextureOffset(23, 28).addBox(3.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			sol_bacak = new ModelRenderer(this);
			sol_bacak.setRotationPoint(0.0F, 24.0F, 0.0F);
			sol_bacak.setTextureOffset(26, 14).addBox(-4.0F, -12.0F, 0.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			sol_bacak.setTextureOffset(26, 0).addBox(-4.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 0).addBox(-5.0F, -22.0F, -1.25F, 11.0F, 10.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			kafa.render(matrixStack, buffer, packedLight, packedOverlay);
			sol_el.render(matrixStack, buffer, packedLight, packedOverlay);
			sael.render(matrixStack, buffer, packedLight, packedOverlay);
			sabacak.render(matrixStack, buffer, packedLight, packedOverlay);
			sol_bacak.render(matrixStack, buffer, packedLight, packedOverlay);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}
}
