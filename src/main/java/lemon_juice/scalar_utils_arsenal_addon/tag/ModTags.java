package lemon_juice.scalar_utils_arsenal_addon.tag;

import lemon_juice.scalar_utils_arsenal_addon.ScalarUtilsArsenalAddon;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static void init() {
        Items.init();
    }

    private ModTags() {}

    public static class Items {
        private static void init() {}
        private Items() {}

        public static final TagKey<Item> GEMS_BLUTSTEIN = forgeTag("gems/blutstein");
        public static final TagKey<Item> GEMS_UMBRALITE = forgeTag("gems/umbralite");
        public static final TagKey<Item> INGOTS_ZWEIITE = forgeTag("ingots/zweiite");

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> NEEDS_UMBRALITE_TOOL = tag("needs_umbralite_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ScalarUtilsArsenalAddon.MOD_ID, name));
        }
    }
}
