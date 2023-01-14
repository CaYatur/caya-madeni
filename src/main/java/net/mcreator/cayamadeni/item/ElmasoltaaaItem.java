
package net.mcreator.cayamadeni.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.FishingRodItem;

import net.mcreator.cayamadeni.itemgroup.CaYaModItemGroup;
import net.mcreator.cayamadeni.CayaMadeniModElements;

@CayaMadeniModElements.ModElement.Tag
public class ElmasoltaaaItem extends CayaMadeniModElements.ModElement {
	@ObjectHolder("caya_madeni:elmasoltaaa")
	public static final Item block = null;
	public ElmasoltaaaItem(CayaMadeniModElements instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
		}.setRegistryName("elmasoltaaa"));
	}
	private static class ItemToolCustom extends FishingRodItem {
		protected ItemToolCustom() {
			super(new Item.Properties().group(CaYaModItemGroup.tab).maxDamage(1361));
		}

		@Override
		public int getItemEnchantability() {
			return 50;
		}

		@Override
		public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
			Item repairItem = repair.getItem();
			return repairItem == Items.DIAMOND;
		}
	}
}
