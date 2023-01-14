package net.mcreator.cayamadeni.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.cayamadeni.item.NoktakayitediciItem;
import net.mcreator.cayamadeni.CayaMadeniMod;

import java.util.Map;

public class NoktakayitediciHavayaSagTiklandigindaProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CayaMadeniMod.LOGGER.warn("Failed to load dependency entity for procedure NoktakayitediciHavayaSagTiklandiginda!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == NoktakayitediciItem.block)) {
			((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag().putDouble("xpo",
					(entity.getPosX()));
			((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag().putDouble("ypo",
					(entity.getPosY()));
			((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag().putDouble("zpo",
					(entity.getPosZ()));
			((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag().putDouble("yawpo",
					(entity.rotationYaw));
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Nokta Kay\u0131t Edildi"), (true));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("X: ") + "" + ((entity.getPosX())) + "" + (" Y: ") + ""
						+ ((entity.getPosY())) + "" + (" Z: ") + "" + ((entity.getPosZ())))), (false));
			}
		} else if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == NoktakayitediciItem.block)) {
			((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getOrCreateTag().putDouble("xpo",
					(entity.getPosX()));
			((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getOrCreateTag().putDouble("ypo",
					(entity.getPosY()));
			((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getOrCreateTag().putDouble("zpo",
					(entity.getPosZ()));
			((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getOrCreateTag().putDouble("yawpo",
					(entity.rotationYaw));
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Nokta Kay\u0131t Edildi"), (true));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("X: ") + "" + ((entity.getPosX())) + "" + (" Y: ") + ""
						+ ((entity.getPosY())) + "" + (" Z: ") + "" + ((entity.getPosZ())))), (false));
			}
		}
	}
}
