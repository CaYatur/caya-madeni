
package net.mcreator.cayamadeni.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.cayamadeni.itemgroup.CaYaModItemGroup;
import net.mcreator.cayamadeni.CayaMadeniModElements;

@CayaMadeniModElements.ModElement.Tag
public class MotorItem extends CayaMadeniModElements.ModElement {
	@ObjectHolder("caya_madeni:motor")
	public static final Item block = null;
	public MotorItem(CayaMadeniModElements instance) {
		super(instance, 46);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CaYaModItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("motor");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
