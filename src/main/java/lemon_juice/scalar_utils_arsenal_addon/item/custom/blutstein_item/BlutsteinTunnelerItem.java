package lemon_juice.scalar_utils_arsenal_addon.item.custom.blutstein_item;

import lemon_juice.scalar_utils.item.custom.digger_item.TunnelerItem;
import lemon_juice.scalar_utils_arsenal_addon.item.ModItems;
import lemon_juice.scalar_utils_arsenal_addon.item.custom.tier.ModTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BlutsteinTunnelerItem extends TunnelerItem {
    public BlutsteinTunnelerItem(Properties properties, int radius) {
        super(ModTiers.BLUTSTEIN_TIER, properties, radius);
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return 250;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.scalar_utils_arsenal_addon.lifesteal").withStyle(ChatFormatting.GREEN));
        components.add(Component.translatable("tooltip.scalar_utils.tunneler_r3"));
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return Math.max(ModItems.BLUTSTEIN_PICKAXE.get().getDestroySpeed(stack, state), ModItems.BLUTSTEIN_SHOVEL.get().getDestroySpeed(stack, state));
    }
}
