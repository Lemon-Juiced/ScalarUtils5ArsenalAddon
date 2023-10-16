package lemon_juice.scalar_utils_arsenal_addon.item.custom.umbralite_item;

import lemon_juice.scalar_utils_arsenal_addon.item.custom.tier.ModTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UmbraliteSwordItem extends SwordItem {
    public UmbraliteSwordItem(Properties properties) {
        super(ModTiers.UMBRALITE_TIER, 4, -2.4f,  properties);
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.scalar_utils.unbreakable").withStyle(ChatFormatting.RED));
    }
}
