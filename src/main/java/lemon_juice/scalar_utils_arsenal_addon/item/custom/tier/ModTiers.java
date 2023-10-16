package lemon_juice.scalar_utils_arsenal_addon.item.custom.tier;

import lemon_juice.scalar_utils_arsenal_addon.ScalarUtilsArsenalAddon;
import lemon_juice.scalar_utils_arsenal_addon.tag.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModTiers {
    /**
     * Vanilla Armor Tiers:
     * WOOD(0, 59, 2.0F, 0.0F, 15, () -> {return Ingredient.of(ItemTags.PLANKS);}),
     * STONE(1, 131, 4.0F, 1.0F, 5, () -> {return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);}),
     * IRON(2, 250, 6.0F, 2.0F, 14, () -> {return Ingredient.of(Items.IRON_INGOT);}),
     * DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {return Ingredient.of(Items.DIAMOND);}),
     * GOLD(0, 32, 12.0F, 0.0F, 22, () -> {return Ingredient.of(Items.GOLD_INGOT);}),
     * NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {return Ingredient.of(Items.NETHERITE_INGOT);});
     *
     * Scalar Utils 5 Armor Tiers:
     * public static final Tier NECRONITE_TIER = TierSortingRegistry.registerTier(new ForgeTier(5, -1, 12.0F, 5.0F, 22, ModTags.Blocks.NEEDS_NECRONITE_TOOL, () -> Ingredient.of(ModTags.Items.INGOTS_NECRONITE)), new ResourceLocation(ScalarUtils.MOD_ID, "necronite"), List.of(Tiers.NETHERITE), List.of());
     */

    public static final Tier BLUTSTEIN_TIER = TierSortingRegistry.registerTier(new ForgeTier(3, 250, 6.0F, 1.0F, 10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModTags.Items.GEMS_BLUTSTEIN)), new ResourceLocation(ScalarUtilsArsenalAddon.MOD_ID, "blutstein"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    public static final Tier UMBRALITE_TIER = TierSortingRegistry.registerTier(new ForgeTier(5, -1, 14.0F, 6.0F, 24, ModTags.Blocks.NEEDS_UMBRALITE_TOOL, () -> Ingredient.of(ModTags.Items.GEMS_UMBRALITE)), new ResourceLocation(ScalarUtilsArsenalAddon.MOD_ID, "umbralite"), List.of(lemon_juice.scalar_utils.item.custom.tier.ModTiers.NECRONITE_TIER), List.of());
    public static final Tier ZWEIITE_TIER = TierSortingRegistry.registerTier(new ForgeTier(3, 250, 12.0F, 0.0F, 22, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModTags.Items.INGOTS_ZWEIITE)), new ResourceLocation(ScalarUtilsArsenalAddon.MOD_ID, "zweiite"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
}
