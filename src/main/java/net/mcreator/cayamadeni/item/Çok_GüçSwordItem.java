
package net.mcreator.cayamadeni.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.cayamadeni.itemgroup.CaYaModItemGroup;
import net.mcreator.cayamadeni.CayaMadeniModElements;

@CayaMadeniModElements.ModElement.Tag
public class Çok_GüçSwordItem extends CayaMadeniModElements.ModElement {
	@ObjectHolder("caya_madeni:cok_guc_sword")
	public static final Item block = null;
	public Çok_GüçSwordItem(CayaMadeniModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 28f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(GucItem.block));
			}
		}, 3, 1f, new Item.Properties().group(CaYaModItemGroup.tab)) {
		}.setRegistryName("cok_guc_sword"));
	}
}
