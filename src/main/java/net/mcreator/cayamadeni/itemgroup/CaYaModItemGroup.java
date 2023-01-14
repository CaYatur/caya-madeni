
package net.mcreator.cayamadeni.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.cayamadeni.item.OksitlenmisGucItem;
import net.mcreator.cayamadeni.CayaMadeniModElements;

@CayaMadeniModElements.ModElement.Tag
public class CaYaModItemGroup extends CayaMadeniModElements.ModElement {
	public CaYaModItemGroup(CayaMadeniModElements instance) {
		super(instance, 72);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabca_ya_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(OksitlenmisGucItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
