package net.mcreator.cayamadeni.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;

import net.mcreator.cayamadeni.CayaMadeniMod;

import java.util.Map;

public class SahteelmasBlokOyuncuTarafindanKirildigindaProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CayaMadeniMod.LOGGER.warn("Failed to load dependency x for procedure SahteelmasBlokOyuncuTarafindanKirildiginda!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CayaMadeniMod.LOGGER.warn("Failed to load dependency y for procedure SahteelmasBlokOyuncuTarafindanKirildiginda!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CayaMadeniMod.LOGGER.warn("Failed to load dependency z for procedure SahteelmasBlokOyuncuTarafindanKirildiginda!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CayaMadeniMod.LOGGER.warn("Failed to load dependency world for procedure SahteelmasBlokOyuncuTarafindanKirildiginda!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 3, Explosion.Mode.DESTROY);
		}
	}
}
