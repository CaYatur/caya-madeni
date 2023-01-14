package net.mcreator.cayamadeni.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.cayamadeni.CayaMadeniMod;

import java.util.Map;
import java.util.HashMap;

public class OksitlenmiskircraftgUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CayaMadeniMod.LOGGER.warn("Failed to load dependency x for procedure OksitlenmiskircraftgUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CayaMadeniMod.LOGGER.warn("Failed to load dependency y for procedure OksitlenmiskircraftgUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CayaMadeniMod.LOGGER.warn("Failed to load dependency z for procedure OksitlenmiskircraftgUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CayaMadeniMod.LOGGER.warn("Failed to load dependency world for procedure OksitlenmiskircraftgUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			KirmasProcedure.executeProcedure($_dependencies);
		}
	}
}
