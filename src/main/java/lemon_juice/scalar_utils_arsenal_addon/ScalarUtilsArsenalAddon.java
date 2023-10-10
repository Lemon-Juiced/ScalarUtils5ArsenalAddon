package lemon_juice.scalar_utils_arsenal_addon;

import lemon_juice.scalar_utils_arsenal_addon.creativetab.ModCreativeTab;
import lemon_juice.scalar_utils_arsenal_addon.handler.MobDropHandler;
import lemon_juice.scalar_utils_arsenal_addon.item.ModItems;
import lemon_juice.scalar_utils_arsenal_addon.tag.ModTags;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ScalarUtilsArsenalAddon.MOD_ID)
public class ScalarUtilsArsenalAddon {
    public static final String MOD_ID = "scalar_utils_arsenal_addon";

    public ScalarUtilsArsenalAddon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Items & Blocks
        ModItems.register(modEventBus);
        //ModBlocks.register(modEventBus);

        // Register Creative Tab
        ModCreativeTab.register(modEventBus);
        modEventBus.addListener(ModCreativeTab::registerTabs);

        // Register Tags
        ModTags.init();

        // Register commonSetup (Mob Drops from Cleavers)
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Registers Mob Drops from Cleavers
        MinecraftForge.EVENT_BUS.register(new MobDropHandler());
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
