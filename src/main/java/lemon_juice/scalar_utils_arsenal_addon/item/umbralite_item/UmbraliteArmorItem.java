package lemon_juice.scalar_utils_arsenal_addon.item.umbralite_item;

import lemon_juice.scalar_utils_arsenal_addon.item.tier.ModArmorMaterials;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UmbraliteArmorItem extends ArmorItem {
    public UmbraliteArmorItem(Type type, Properties properties) {
        super(ModArmorMaterials.UMBRALITE, type, properties);
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return -1;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.scalar_utils.unbreakable").withStyle(ChatFormatting.RED));
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }
}
