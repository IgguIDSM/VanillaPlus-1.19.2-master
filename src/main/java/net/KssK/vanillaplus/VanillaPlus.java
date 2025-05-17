package net.KssK.vanillaplus;

import com.mojang.logging.LogUtils;
import net.KssK.vanillaplus.Item.ModItems;
import net.KssK.vanillaplus.block.ModBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(VanillaPlus.MOD_ID)
public class VanillaPlus
{
    public static final String MOD_ID = "vanillaplus";

    private static final Logger LOGGER = LogUtils.getLogger();

    public VanillaPlus()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        //Register the Items
        ModItems.register(modEventBus);
        //Register the Blocks
        ModBlocks.register(modEventBus);
        //
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
