package net.KssK.vanillaplus.Item;

import net.KssK.vanillaplus.VanillaPlus;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VanillaPlus.MOD_ID);

    //Items Itself
    //Zircon
    public static final RegistryObject<Item> Zircon = ITEMS.register("zircon",()-> new Item(
            new Item.Properties().tab(VanillaPlusTab.VanillaPlus)
    ));
    public static final RegistryObject<Item> RAW_Zircon = ITEMS.register("raw_zircon",()-> new Item(
            new Item.Properties().tab(VanillaPlusTab.VanillaPlus)
    ));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
