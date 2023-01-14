package net.mcreator.cayamadeni.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.CriticalHitEvent;

import net.minecraft.world.World;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.cayamadeni.CayaMadeniMod;

import java.util.Map;
import java.util.HashMap;

public class CokgucEsyaUretildigindeeritildigindeProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerCriticalHit(CriticalHitEvent event) {
			Entity entity = event.getTarget();
			PlayerEntity sourceentity = event.getPlayer();
			double i = sourceentity.getPosX();
			double j = sourceentity.getPosY();
			double k = sourceentity.getPosZ();
			World world = sourceentity.world;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("sourceentity", sourceentity);
			dependencies.put("damagemodifier", event.getDamageModifier());
			dependencies.put("isvanillacritical", event.isVanillaCritical());
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CayaMadeniMod.LOGGER.warn("Failed to load dependency entity for procedure CokgucEsyaUretildigindeeritildiginde!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60, (int) 3));
	}
}
