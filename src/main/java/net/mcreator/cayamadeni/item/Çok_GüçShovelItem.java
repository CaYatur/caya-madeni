
package net.mcreator.cayamadeni.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.cayamadeni.itemgroup.CaYaModItemGroup;
import net.mcreator.cayamadeni.CayaMadeniModElements;

@CayaMadeniModElements.ModElement.Tag
public class Çok_GüçShovelItem extends CayaMadeniModElements.ModElement {
	@ObjectHolder("caya_madeni:cok_guc_shovel")
	public static final Item block = null;
	public Çok_GüçShovelItem(CayaMadeniModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 29f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(GucItem.block));
			}
		}, 1, -1f, new Item.Properties().group(CaYaModItemGroup.tab)) {
		}.setRegistryName("cok_guc_shovel"));
	}
}
