
package net.mcreator.cayamadeni.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.cayamadeni.item.SuteawItem;
import net.mcreator.cayamadeni.CayaMadeniModElements;

@CayaMadeniModElements.ModElement.Tag
public class YiyicekurunuItemGroup extends CayaMadeniModElements.ModElement {
	public YiyicekurunuItemGroup(CayaMadeniModElements instance) {
		super(instance, 140);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabyiyicekurunu") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SuteawItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
