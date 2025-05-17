package net.KssK.vanillaplus.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class VanillaPlusTab {
    public static final CreativeModeTab VanillaPlus = new CreativeModeTab("vanillaplus") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Zircon.get());
        }
    };
}
