package com.simibubi.create.content.contraptions.base;

import com.jozufozu.flywheel.api.MaterialManager;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class HorizontalHalfShaftInstance extends HalfShaftInstance {

    public HorizontalHalfShaftInstance(MaterialManager materialManager, KineticBlockEntity blockEntity) {
        super(materialManager, blockEntity);
    }

    @Override
    protected Direction getShaftDirection() {
        return blockState.getValue(BlockStateProperties.HORIZONTAL_FACING).getOpposite();
    }
}
