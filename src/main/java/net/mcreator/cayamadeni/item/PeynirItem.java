
package net.mcreator.cayamadeni.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.cayamadeni.itemgroup.YiyicekurunuItemGroup;
import net.mcreator.cayamadeni.CayaMadeniModElements;

@CayaMadeniModElements.ModElement.Tag
public class PeynirItem extends CayaMadeniModElements.ModElement {
	@ObjectHolder("caya_madeni:peynir")
	public static final Item block = null;
	public PeynirItem(CayaMadeniModElements instance) {
		super(instance, 56);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(YiyicekurunuItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(0.6f).build()));
			setRegistryName("peynir");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
