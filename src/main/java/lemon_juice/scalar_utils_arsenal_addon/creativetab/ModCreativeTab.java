package lemon_juice.scalar_utils_arsenal_addon.creativetab;

import lemon_juice.scalar_utils_arsenal_addon.ScalarUtilsArsenalAddon;
import lemon_juice.scalar_utils_arsenal_addon.block.ModBlocks;
import lemon_juice.scalar_utils_arsenal_addon.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ScalarUtilsArsenalAddon.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SCALAR_UTILS_ARSENAL_ADDON_TAB = CREATIVE_MODE_TABS.register("scalar_utils_arsenal_addon", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.scalar_utils_arsenal_addon.arsenal_addon"))
            .icon(() -> new ItemStack(ModItems.UMBRALITE_UPGRADE_SMITHING_TEMPLATE.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == SCALAR_UTILS_ARSENAL_ADDON_TAB.get()) {
            event.accept(ModItems.BLUTSTEIN_UPGRADE_SMITHING_TEMPLATE.get());
            event.accept(ModItems.BLUTSTEIN_SWORD.get());
            event.accept(ModItems.BLUTSTEIN_PICKAXE.get());
            event.accept(ModItems.BLUTSTEIN_AXE.get());
            event.accept(ModItems.BLUTSTEIN_SHOVEL.get());
            event.accept(ModItems.BLUTSTEIN_HOE.get());
            event.accept(ModItems.BLUTSTEIN_CLAYMORE.get());
            event.accept(ModItems.BLUTSTEIN_TUNNELER.get());

            event.accept(ModItems.UMBRALITE_UPGRADE_SMITHING_TEMPLATE.get());
            event.accept(ModItems.UMBRALITE_SWORD.get());
            event.accept(ModItems.UMBRALITE_PICKAXE.get());
            event.accept(ModItems.UMBRALITE_AXE.get());
            event.accept(ModItems.UMBRALITE_SHOVEL.get());
            event.accept(ModItems.UMBRALITE_HOE.get());
            event.accept(ModItems.UMBRALITE_CLAYMORE.get());
            event.accept(ModItems.UMBRALITE_TUNNELER.get());
            event.accept(ModItems.UMBRALITE_HELMET.get());
            event.accept(ModItems.UMBRALITE_CHESTPLATE.get());
            event.accept(ModItems.UMBRALITE_LEGGINGS.get());
            event.accept(ModItems.UMBRALITE_BOOTS.get());

            event.accept(ModBlocks.UMBRALITE_ORE.get());
        }
    }

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
