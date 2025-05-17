package net.KssK.vanillaplus.block;

import net.KssK.vanillaplus.Item.ModItems;
import net.KssK.vanillaplus.Item.VanillaPlusTab;
import net.KssK.vanillaplus.VanillaPlus;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, VanillaPlus.MOD_ID);


    public static final RegistryObject<Block> Zircon_Block = registerBlock("zircon_block", ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(.6f).requiresCorrectToolForDrops()),VanillaPlusTab.VanillaPlus);
    public static final RegistryObject<Block> Zircon_Ore = registerBlock("zircon_ore", ()-> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(.6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)),VanillaPlusTab.VanillaPlus);
    public static final RegistryObject<Block> Deeplsate_Zircon_Ore = registerBlock("deepslatezircon_ore", ()-> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(.6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)),VanillaPlusTab.VanillaPlus);


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = Blocks.register(name,block);
        registerBlockItem(name,toReturn,tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,RegistryObject<T> block,CreativeModeTab tab){
        return ModItems.ITEMS.register(name,()->new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        Blocks.register(eventBus);
    }
}
