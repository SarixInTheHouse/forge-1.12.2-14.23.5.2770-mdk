package com.SarixInTheHouse.Drugsmod.init;

import java.util.ArrayList;
import java.util.List;

import com.SarixInTheHouse.Drugsmod.blocks.BlockBase;
import com.SarixInTheHouse.Drugsmod.blocks.woodBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Modblocks {

	public static final List <Block> BLOCKS = new ArrayList<Block>();
	 
	public static final Block JUNIPER_LOG_BLOCK = new woodBlock("juniper_log_block", Material.WOOD);
}
