
package net.mcreator.cayamadeni.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Item;
import net.minecraft.item.FishingRodItem;

import net.mcreator.cayamadeni.itemgroup.CaYaModItemGroup;
import net.mcreator.cayamadeni.CayaMadeniModElements;

@CayaMadeniModElements.ModElement.Tag
public class DemiroltaItem extends CayaMadeniModElements.ModElement {
	@ObjectHolder("caya_madeni:demirolta")
	public static final Item block = null;
	public DemiroltaItem(CayaMadeniModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
		}.setRegistryName("demirolta"));
	}
	private static class ItemToolCustom extends FishingRodItem {
		protected ItemToolCustom() {
			super(new Item.Properties().group(CaYaModItemGroup.tab).maxDamage(362));
		}

		@Override
		public int getItemEnchantability() {
			return 6;
		}
	}
}
