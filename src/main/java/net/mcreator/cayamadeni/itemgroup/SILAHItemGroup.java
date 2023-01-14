
package net.mcreator.cayamadeni.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.cayamadeni.item.SILAHwItem;
import net.mcreator.cayamadeni.CayaMadeniModElements;

@CayaMadeniModElements.ModElement.Tag
public class SILAHItemGroup extends CayaMadeniModElements.ModElement {
	public SILAHItemGroup(CayaMadeniModElements instance) {
		super(instance, 136);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsilah") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SILAHwItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
