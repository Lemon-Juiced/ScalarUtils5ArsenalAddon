package lemon_juice.scalar_utils_arsenal_addon.item.umbralite_item;

import lemon_juice.scalar_utils_arsenal_addon.item.digger_item.TunnelerItem;
import lemon_juice.scalar_utils_arsenal_addon.item.tier.ModTiers;
import net.minecraft.world.item.Item;

public class UmbraliteTunnelerItem extends TunnelerItem {
    public UmbraliteTunnelerItem(Item.Properties properties, int radius) {
        super(ModTiers.UMBRALITE_TIER, properties, radius);
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }
}
