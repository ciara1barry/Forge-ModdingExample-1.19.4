package net.cbar.examplemod.item;

import net.cbar.examplemod.ExampleMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static  final RegistryObject<Item> ONYX = ITEMS.register("onyx",
            () -> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> RAW_ONYX = ITEMS.register("raw_onyx",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
