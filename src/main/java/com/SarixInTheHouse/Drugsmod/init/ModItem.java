package com.SarixInTheHouse.Drugsmod.init;

import java.util.ArrayList;
import java.util.List;

import com.SarixInTheHouse.Drugsmod.items.ItemBase;

import net.minecraft.item.Item;

public class ModItem {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item CANNABISLEAF = new ItemBase("CannabisLeaf");
	
	public static final Item CANNABISBUDS = new ItemBase("CannabisBuds");

	public static final Item CANNABISSEED = new ItemBase("CannabisSeeds");
	
	public static final Item COCALEAF = new ItemBase("CocaLeaf");
	
	public static final Item COCASEED = new ItemBase("CocaSeeds");
	
	public static final Item COCAINE = new ItemBase("Cocaine");
}
