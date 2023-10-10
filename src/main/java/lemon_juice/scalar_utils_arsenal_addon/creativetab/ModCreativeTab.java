package lemon_juice.scalar_utils_arsenal_addon.creativetab;

import lemon_juice.scalar_utils_arsenal_addon.ScalarUtilsArsenalAddon;
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
            event.accept(ModItems.UMBRALITE_UPGRADE_SMITHING_TEMPLATE.get());

        }
    }

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
