
package net.mcreator.cayamadeni.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.cayamadeni.procedures.OksitlenmisGucIksirBuyuBasladigindaProcedure;
import net.mcreator.cayamadeni.itemgroup.CaYaModItemGroup;
import net.mcreator.cayamadeni.CayaMadeniModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@CayaMadeniModElements.ModElement.Tag
public class OksitlenmisGucYiyecekItem extends CayaMadeniModElements.ModElement {
	@ObjectHolder("caya_madeni:oksitlenmis_guc_yiyecek")
	public static final Item block = null;
	public OksitlenmisGucYiyecekItem(CayaMadeniModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(CaYaModItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(5f).build()));
			setRegistryName("oksitlenmis_guc_yiyecek");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.DRINK;
		}

		@Override
		public net.minecraft.util.SoundEvent getEatSound() {
			return net.minecraft.util.SoundEvents.ENTITY_GENERIC_DRINK;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Uyar\u0131 sadece a\u00E7 olunca yenir!"));
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
				OksitlenmisGucIksirBuyuBasladigindaProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
