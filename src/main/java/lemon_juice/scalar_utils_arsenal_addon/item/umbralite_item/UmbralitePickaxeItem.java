package lemon_juice.scalar_utils_arsenal_addon.item.umbralite_item;

import lemon_juice.scalar_utils_arsenal_addon.item.tier.ModTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UmbralitePickaxeItem extends PickaxeItem {
    public UmbralitePickaxeItem(Properties properties) {
        super(ModTiers.UMBRALITE_TIER, 1, -2.8f, properties);
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
