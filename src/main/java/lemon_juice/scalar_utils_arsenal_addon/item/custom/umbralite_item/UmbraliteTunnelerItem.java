package lemon_juice.scalar_utils_arsenal_addon.item.custom.umbralite_item;

import lemon_juice.scalar_utils.item.custom.digger_item.TunnelerItem;
import lemon_juice.scalar_utils_arsenal_addon.item.ModItems;
import lemon_juice.scalar_utils_arsenal_addon.item.custom.tier.ModTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UmbraliteTunnelerItem extends TunnelerItem {
    public UmbraliteTunnelerItem(Item.Properties properties, int radius) {
        super(ModTiers.UMBRALITE_TIER, properties, radius);
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return -1;
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.scalar_utils_arsenal_addon.unbreakable_and_server_breaking").withStyle(ChatFormatting.RED));
        components.add(Component.translatable("tooltip.scalar_utils_arsenal_addon.tunneler_r5"));
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return Math.max(ModItems.UMBRALITE_PICKAXE.get().getDestroySpeed(stack, state), ModItems.UMBRALITE_SHOVEL.get().getDestroySpeed(stack, state));
    }
}
