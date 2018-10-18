package com.SarixInTheHouse.Drugsmod.init;

import java.util.ArrayList;
import java.util.List;

import com.SarixInTheHouse.Drugsmod.items.ItemBase;

import net.minecraft.item.Item;

public class ModItem {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item CANNABISLEAF = new ItemBase("cannabis_leaf");
	
	public static final Item CANNABISBUDS = new ItemBase("cannabis_buds");

	public static final Item CANNABISSEED = new ItemBase("cannabis_seeds");
	
	public static final Item COCALEAF = new ItemBase("coca_leaf");
	
	public static final Item COCASEED = new ItemBase("coca_seeds");
	
	public static final Item COCAINE = new ItemBase("cocaine_powder");
}
