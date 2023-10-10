package lemon_juice.scalar_utils_arsenal_addon.item.tier;

import lemon_juice.scalar_utils_arsenal_addon.ScalarUtilsArsenalAddon;
import lemon_juice.scalar_utils_arsenal_addon.tag.ModTags;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    /** Vanilla Armor Tiers:
     * LEATHER("leather", 5, Util.make(new EnumMap<>(ArmorItem.Type.class), (protectionFunctionForType) -> {
     *         protectionFunctionForType.put(ArmorItem.Type.BOOTS, 1);
     *         protectionFunctionForType.put(ArmorItem.Type.LEGGINGS, 2);
     *         protectionFunctionForType.put(ArmorItem.Type.CHESTPLATE, 3);
     *         protectionFunctionForType.put(ArmorItem.Type.HELMET, 1);
     *     }), 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
     *         return Ingredient.of(Items.LEATHER);
     *     }),
     *     CHAIN("chainmail", 15, Util.make(new EnumMap<>(ArmorItem.Type.class), (protectionFunctionForType) -> {
     *         protectionFunctionForType.put(ArmorItem.Type.BOOTS, 1);
     *         protectionFunctionForType.put(ArmorItem.Type.LEGGINGS, 4);
     *         protectionFunctionForType.put(ArmorItem.Type.CHESTPLATE, 5);
     *         protectionFunctionForType.put(ArmorItem.Type.HELMET, 2);
     *     }), 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
     *         return Ingredient.of(Items.IRON_INGOT);
     *     }),
     *     IRON("iron", 15, Util.make(new EnumMap<>(ArmorItem.Type.class), (protectionFunctionForType) -> {
     *         protectionFunctionForType.put(ArmorItem.Type.BOOTS, 2);
     *         protectionFunctionForType.put(ArmorItem.Type.LEGGINGS, 5);
     *         protectionFunctionForType.put(ArmorItem.Type.CHESTPLATE, 6);
     *         protectionFunctionForType.put(ArmorItem.Type.HELMET, 2);
     *     }), 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
     *         return Ingredient.of(Items.IRON_INGOT);
     *     }),
     *     GOLD("gold", 7, Util.make(new EnumMap<>(ArmorItem.Type.class), (protectionFunctionForType) -> {
     *         protectionFunctionForType.put(ArmorItem.Type.BOOTS, 1);
     *         protectionFunctionForType.put(ArmorItem.Type.LEGGINGS, 3);
     *         protectionFunctionForType.put(ArmorItem.Type.CHESTPLATE, 5);
     *         protectionFunctionForType.put(ArmorItem.Type.HELMET, 2);
     *     }), 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
     *         return Ingredient.of(Items.GOLD_INGOT);
     *     }),
     *     DIAMOND("diamond", 33, Util.make(new EnumMap<>(ArmorItem.Type.class), (protectionFunctionForType) -> {
     *         protectionFunctionForType.put(ArmorItem.Type.BOOTS, 3);
     *         protectionFunctionForType.put(ArmorItem.Type.LEGGINGS, 6);
     *         protectionFunctionForType.put(ArmorItem.Type.CHESTPLATE, 8);
     *         protectionFunctionForType.put(ArmorItem.Type.HELMET, 3);
     *     }), 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
     *         return Ingredient.of(Items.DIAMOND);
     *     }),
     *     TURTLE("turtle", 25, Util.make(new EnumMap<>(ArmorItem.Type.class), (protectionFunctionForType) -> {
     *         protectionFunctionForType.put(ArmorItem.Type.BOOTS, 2);
     *         protectionFunctionForType.put(ArmorItem.Type.LEGGINGS, 5);
     *         protectionFunctionForType.put(ArmorItem.Type.CHESTPLATE, 6);
     *         protectionFunctionForType.put(ArmorItem.Type.HELMET, 2);
     *     }), 9, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
     *         return Ingredient.of(Items.SCUTE);
     *     }),
     *     NETHERITE("netherite", 37, Util.make(new EnumMap<>(ArmorItem.Type.class), (protectionFunctionForType) -> {
     *         protectionFunctionForType.put(ArmorItem.Type.BOOTS, 3);
     *         protectionFunctionForType.put(ArmorItem.Type.LEGGINGS, 6);
     *         protectionFunctionForType.put(ArmorItem.Type.CHESTPLATE, 8);
     *         protectionFunctionForType.put(ArmorItem.Type.HELMET, 3);
     *     }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
     *         return Ingredient.of(Items.NETHERITE_INGOT);
     *     });
     *
     * Scalar Utils 5 Armor Tiers:
     *     NECRONITE("necronite", 42, Util.make(new EnumMap<>(ArmorItem.Type.class), (protectionFunctionForType) -> {
     *         protectionFunctionForType.put(ArmorItem.Type.BOOTS, 4);
     *         protectionFunctionForType.put(ArmorItem.Type.LEGGINGS, 7);
     *         protectionFunctionForType.put(ArmorItem.Type.CHESTPLATE, 9);
     *         protectionFunctionForType.put(ArmorItem.Type.HELMET, 4);
     *     }), 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.2F, () -> {
     *         return Ingredient.of(ModTags.Items.GEMS_UMBRALITE);
     *     });
     */

    UMBRALITE("umbralite", 50, Util.make(new EnumMap<>(ArmorItem.Type.class), (protectionFunctionForType) -> {
        protectionFunctionForType.put(ArmorItem.Type.BOOTS, 5);
        protectionFunctionForType.put(ArmorItem.Type.LEGGINGS, 8);
        protectionFunctionForType.put(ArmorItem.Type.CHESTPLATE, 10);
        protectionFunctionForType.put(ArmorItem.Type.HELMET, 5);
    }), 28, SoundEvents.ARMOR_EQUIP_NETHERITE, 5.0F, 0.3F, () -> {
        return Ingredient.of(ModTags.Items.GEMS_UMBRALITE);
    });

    public static final StringRepresentable.EnumCodec<net.minecraft.world.item.ArmorMaterials> CODEC = StringRepresentable.fromEnum(net.minecraft.world.item.ArmorMaterials::values);
    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (protectionFunctionForType) -> {
        protectionFunctionForType.put(ArmorItem.Type.BOOTS, 13);
        protectionFunctionForType.put(ArmorItem.Type.LEGGINGS, 15);
        protectionFunctionForType.put(ArmorItem.Type.CHESTPLATE, 16);
        protectionFunctionForType.put(ArmorItem.Type.HELMET, 11);
    });

    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionFunctionForType, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionFunctionForType = protectionFunctionForType;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type protectionFunctionForType) {
        return HEALTH_FUNCTION_FOR_TYPE.get(protectionFunctionForType) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.Type protectionFunctionForType) {
        return this.protectionFunctionForType.get(protectionFunctionForType);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return ScalarUtilsArsenalAddon.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String getSerializedName() {
        return this.name;
    }
}
