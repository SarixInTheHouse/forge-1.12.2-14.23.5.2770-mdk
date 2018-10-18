package com.SarixInTheHouse.Drugsmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class woodBlock extends BlockBase {

	public woodBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.WOOD);
		setHardness(2.0F);
		setResistance(10.0F);
		setHarvestLevel("axe", 0);
		setLightLevel(0.0F);
		//setLightOpacity();
		//setBlockUnbreakable();
	}
	
}
