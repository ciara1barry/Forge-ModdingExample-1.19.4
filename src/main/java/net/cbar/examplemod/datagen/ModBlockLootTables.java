package net.cbar.examplemod.datagen;

import net.cbar.examplemod.block.ModBlocks;
import net.cbar.examplemod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.ONYX_BLOCK.get());

        add(ModBlocks.ONYX_ORE.get(),
                (block) -> createOreDrop(ModBlocks.ONYX_ORE.get(), ModItems.RAW_ONYX.get()));
        add(ModBlocks.DEEPSLATE_ONYX_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_ONYX_ORE.get(), ModItems.RAW_ONYX.get()));
        add(ModBlocks.NETHERRACK_ONYX_ORE.get(),
                (block) -> createOreDrop(ModBlocks.NETHERRACK_ONYX_ORE.get(), ModItems.RAW_ONYX.get()));
        add(ModBlocks.ENDSTONE_ONYX_ORE.get(),
                (block) -> createOreDrop(ModBlocks.ENDSTONE_ONYX_ORE.get(), ModItems.RAW_ONYX.get()));

        this.dropSelf(ModBlocks.EBONY_LOG.get());
        this.dropSelf(ModBlocks.EBONY_WOOD.get());
        this.dropSelf(ModBlocks.EBONY_PLANKS.get());
        this.dropSelf(ModBlocks.STRIPPED_EBONY_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_EBONY_WOOD.get());
        this.dropSelf(ModBlocks.EBONY_SAPLING.get());

        this.add(ModBlocks.EBONY_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.EBONY_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
