package com.SarixInTheHouse.Drugsmod.items;

import com.SarixInTheHouse.Drugsmod.Main;
import com.SarixInTheHouse.Drugsmod.init.ModItem;
import com.SarixInTheHouse.Drugsmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItem.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
	
}
