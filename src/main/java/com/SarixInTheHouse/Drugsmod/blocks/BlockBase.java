package com.SarixInTheHouse.Drugsmod.blocks;

import java.util.ArrayList;
import java.util.List;

import com.SarixInTheHouse.Drugsmod.Main;
import com.SarixInTheHouse.Drugsmod.init.ModItem;
import com.SarixInTheHouse.Drugsmod.init.Modblocks;
import com.SarixInTheHouse.Drugsmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		Modblocks.BLOCKS.add(this);
		ModItem.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
}


