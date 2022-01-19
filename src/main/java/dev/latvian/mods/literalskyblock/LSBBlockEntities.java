package dev.latvian.mods.literalskyblock;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public interface LSBBlockEntities {
	DeferredRegister<BlockEntityType<?>> REGISTER = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, LiteralSkyBlock.MOD_ID);

	Supplier<BlockEntityType<SkyBlockEntity>> SKY_BLOCK = REGISTER.register("sky_block", () -> BlockEntityType.Builder.of(SkyBlockEntity::new, LSBBlocks.SKY_BLOCK.get()).build(null));
	Supplier<BlockEntityType<EndSkyBlockEntity>> END_SKY_BLOCK = REGISTER.register("end_sky_block", () -> BlockEntityType.Builder.of(EndSkyBlockEntity::new, LSBBlocks.END_SKY_BLOCK.get()).build(null));
}
