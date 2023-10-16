package lemon_juice.scalar_utils_arsenal_addon.item.custom.blutstein_item;

import lemon_juice.scalar_utils_arsenal_addon.item.custom.tier.ModTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BlutsteinHoeItem extends HoeItem {
    public BlutsteinHoeItem(Properties properties) {
        super(ModTiers.BLUTSTEIN_TIER, -5, 0.0f, properties);
    }
    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity hurtEntity, LivingEntity attackerEntity) {
        itemStack.hurtAndBreak(2, attackerEntity, (p_41007_) -> {
            p_41007_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
        });

        float attackDamage = getAttackDamage();
        float attackerHealth = attackerEntity.getHealth();
        float damageToHeal = hurtEntity.getMaxHealth(); // Initially set hurtEntity's max health

        while(damageToHeal > attackDamage) damageToHeal /= 2; // Divided to 1/2 the attackDamage
        attackerEntity.setHealth(attackerHealth + damageToHeal);

        return true;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.scalar_utils_arsenal_addon.lifesteal").withStyle(ChatFormatting.GREEN));
    }
}
