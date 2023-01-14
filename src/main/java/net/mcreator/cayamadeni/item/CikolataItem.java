
package net.mcreator.cayamadeni.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.cayamadeni.procedures.CikolataYiyecekYendigindeProcedure;
import net.mcreator.cayamadeni.itemgroup.YiyicekurunuItemGroup;
import net.mcreator.cayamadeni.CayaMadeniModElements;

import java.util.Map;
import java.util.HashMap;

@CayaMadeniModElements.ModElement.Tag
public class CikolataItem extends CayaMadeniModElements.ModElement {
	@ObjectHolder("caya_madeni:cikolata")
	public static final Item block = null;
	public CikolataItem(CayaMadeniModElements instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(YiyicekurunuItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(6).saturation(1f).build()));
			setRegistryName("cikolata");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				CikolataYiyecekYendigindeProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
