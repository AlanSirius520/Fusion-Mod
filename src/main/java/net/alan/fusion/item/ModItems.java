package net.alan.fusion.item;

import net.alan.fusion.Fusion;
import net.alan.fusion.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

public class ModItems {
    private static Item register(String id,Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Fusion.MOD_ID, id), item);
    }

    public static final Item FUSION_BOOK = register("fusion_book", new Item(new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(1)));
    public static final Item COMMAND_BOOK = register("command_book", new Item(new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(1)));
    public static final Item IT_MOD = register("it_mod", new Item(new Item.Settings().fireproof().rarity(Rarity.RARE)));
    public static final Item FIRE_MOD = register("fire_mod", new Item(new Item.Settings().fireproof().rarity(Rarity.UNCOMMON)));
    public static final Item AMULET = register("amulet", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));

    public static final Item LIFE_HELMET = register(
            "life_helmet", new ModArmorItems(ModArmorMaterial.LIFE, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(10)))
    );
    public static final Item LIFE_CHESTPLATE = register(
            "life_chestplate",
            new ModArmorItems(ModArmorMaterial.LIFE, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(10)))
    );
    public static final Item LIFE_LEGGINGS = register(
            "life_leggings", new ModArmorItems(ModArmorMaterial.LIFE, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(10)))
    );
    public static final Item LIFE_BOOTS = register(
            "life_boots", new ModArmorItems(ModArmorMaterial.LIFE, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(10)))
    );

    public static final Item BLACKSTONE_HELMET = register(
            "blackstone_helmet", new ModArmorItems(ModArmorMaterial.BLACKSTONE, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(10)))
    );
    public static final Item BLACKSTONE_CHESTPLATE = register(
            "blackstone_chestplate",
            new ModArmorItems(ModArmorMaterial.BLACKSTONE, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(10)))
    );
    public static final Item BLACKSTONE_LEGGINGS = register(
            "blackstone_leggings", new ModArmorItems(ModArmorMaterial.BLACKSTONE, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(10)))
    );
    public static final Item BLACKSTONE_BOOTS = register(
            "blackstone_boots", new ModArmorItems(ModArmorMaterial.BLACKSTONE, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(10)))
    );

    public static final Item SOUL_VALLEY_HELMET = register(
            "soul_valley_helmet", new ModArmorItems(ModArmorMaterial.SOUL_VALLEY, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(10)))
    );
    public static final Item SOUL_VALLEY_CHESTPLATE = register(
            "soul_valley_chestplate",
            new ModArmorItems(ModArmorMaterial.SOUL_VALLEY, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(10)))
    );
    public static final Item SOUL_VALLEY_LEGGINGS = register(
            "soul_valley_leggings", new ModArmorItems(ModArmorMaterial.SOUL_VALLEY, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(10)))
    );
    public static final Item SOUL_VALLEY_BOOTS = register(
            "soul_valley_boots", new ModArmorItems(ModArmorMaterial.SOUL_VALLEY, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(10)))
    );

    public static final Item GOLDEN_HELMET = register(
            "golden_helmet", new ModArmorItems(ModArmorMaterial.GOLDEN, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(10)))
    );
    public static final Item GOLDEN_CHESTPLATE = register(
            "golden_chestplate",
            new ModArmorItems(ModArmorMaterial.GOLDEN, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(10)))
    );
    public static final Item GOLDEN_LEGGINGS = register(
            "golden_leggings", new ModArmorItems(ModArmorMaterial.GOLDEN, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(10)))
    );
    public static final Item GOLDEN_BOOTS = register(
            "golden_boots", new ModArmorItems(ModArmorMaterial.GOLDEN, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(10)))
    );

    public static final Item CHORUS_FLOWER_HELMET = register(
            "chorus_flower_helmet", new ModArmorItems(ModArmorMaterial.CHORUS_FLOWER, ArmorItem.Type.HELMET, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(10)))
    );
    public static final Item CHORUS_FLOWER_CHESTPLATE = register(
            "chorus_flower_chestplate",
            new ModArmorItems(ModArmorMaterial.CHORUS_FLOWER, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(10)))
    );
    public static final Item CHORUS_FLOWER_LEGGINGS = register(
            "chorus_flower_leggings", new ModArmorItems(ModArmorMaterial.CHORUS_FLOWER, ArmorItem.Type.LEGGINGS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(10)))
    );
    public static final Item CHORUS_FLOWER_BOOTS = register(
            "chorus_flower_boots", new ModArmorItems(ModArmorMaterial.CHORUS_FLOWER, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.RARE).fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(10)))
    );

    public static final Item LANG_HELMET = register(
            "lang_helmet",
            new ModHelmetItems(ModHelmetItems.Type.HELMET, new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(1))
    );
    public static final Item LANG_CHESTPLATE = register(
            "lang_chestplate",
            new ModArmorItems(ModArmorMaterial.LANG, ArmorItem.Type.CHESTPLATE, new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(1))
    );
    public static final Item LANG_BOOTS = register(
            "lang_boots", new ModArmorItems(ModArmorMaterial.LANG, ArmorItem.Type.BOOTS, new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(1))
    );

    public static final Item WINGED_BOW = register(
            "winged_bow", new ModBowItems(new Item.Settings()
                    .maxDamage(1496)
                    .rarity(Rarity.UNCOMMON)
            )
    );
    public static final Item GRAND_BOW = register(
            "grand_bow", new ModGrondBowItems(new Item.Settings()
                    .maxDamage(2886)
                    .rarity(Rarity.RARE)
            )
    );
    public static final Item DIEHUN_BOW = register(
            "diehun_bow", new ModDieHunBowItems(new Item.Settings()
                    .maxDamage(4512)
                    .fireproof()
                    .rarity(Rarity.EPIC)
            )
    );
    public static final Item FIRE_HAMMER = register(
            "fire_hammer",
            new MaceItem(
                    new Item.Settings()
                            .fireproof()
                            .rarity(Rarity.EPIC)
                            .maxDamage(9000)
                            .component(DataComponentTypes.TOOL, MaceItem.createToolComponent())
                            .attributeModifiers(MaceItem.createAttributeModifiers())
            )
    );
    public static final Item LIGHT_HAMMER = register(
            "light_hammer",
            new ModMaceItems(
                    new Item.Settings()
                            .fireproof()
                            .rarity(Rarity.EPIC)
                            .maxDamage(17750)
                            .component(DataComponentTypes.TOOL, ModMaceItems.createToolComponent())
                            .attributeModifiers(ModMaceItems.createAttributeModifiers())
            )
    );
    public static final Item QIUZHEN_SWORD = register(
            "qiuzhen_sword",
            new SwordItem(
                    ModToolMaterials.D,
                    new Item.Settings()
                            .rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.D,5,3)
                            )
            )
    );
    public static final Item CLAYMORE = register(
            "claymore",
            new SwordItem(
                    ModToolMaterials.D,
                    new Item.Settings()
                            .rarity(Rarity.RARE)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.D,5,-2)
                            )
            )
    );
    public static final Item BLACK_CLARYMORE = register(
            "black_claymore",
            new SwordItem(
                    ModToolMaterials.D,
                    new Item.Settings()
                            .fireproof()
                            .rarity(Rarity.EPIC)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.D,18,-3.5F)
                            )
            )
    );
    public static final Item COMMAND_SWORD = register(
            "command_sword",
            new SwordItem(
                    ModToolMaterials.S,
                    new Item.Settings()
                            .rarity(Rarity.EPIC)
                            .fireproof()
                            .attributeModifiers(
                    SwordItem.createAttributeModifiers(ModToolMaterials.S,10,-2)
            )
            )
    );
    public static final Item COMMAND_PICKAXE = register(
            "command_pickaxe",
            new PickaxeItem(ModToolMaterials.S, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.S, 9, -2.2F))
                    .fireproof()
                    .rarity(Rarity.EPIC)
            )
    );
    public static final Item COMMAND_AXE = register(
            "command_axe",
            new AxeItem(ModToolMaterials.S, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.S, 15, -3.0F))
                    .fireproof()
                    .rarity(Rarity.EPIC)
            )
    );
    public static final Item COMMAND_HOE = register(
            "command_hoe",
            new HoeItem(ModToolMaterials.S, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.S, 4, 0.0F))
                    .fireproof()
                    .rarity(Rarity.EPIC)
            )
    );
    public static final Item COMMAND_SHOVEL = register(
            "command_shovel",
            new ShovelItem(ModToolMaterials.S, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.S, 1.8F, -2.5F))
                    .fireproof()
                    .rarity(Rarity.EPIC)
            )
    );



    public static final Item FIREBRAND_AXE = register(
            "firebrand_axe",
            new AxeItem(ModToolMaterials.G, new Item.Settings().attributeModifiers(
                    AxeItem.createAttributeModifiers(ModToolMaterials.G, 15, -3.0F))
                    .fireproof()
                    .rarity(Rarity.RARE)
            )
    );
    public static final Item ICE_SWORD = register(
            "ice_sword",
            new SwordItem(
                    ModToolMaterials.S,
                    new Item.Settings()
                            .rarity(Rarity.RARE)
                            .attributeModifiers(
                                    SwordItem.createAttributeModifiers(ModToolMaterials.S,9,-2)
                            )
            )
    );
    public static final Item IRON_BANE = register(
            "iron_bane",
            new SwordItem(
                    ModToolMaterials.S,
                    new Item.Settings()
                            .rarity(Rarity.UNCOMMON)
                            .attributeModifiers(
                                    SwordItem.createAttributeModifiers(ModToolMaterials.S,9,-1.5F)
                            )
            )
    );
    public static final Item FIRE_BANE = register(
            "fire_bane",
            new SwordItem(
                    ModToolMaterials.S,
                    new Item.Settings()
                            .rarity(Rarity.RARE)
                            .attributeModifiers(
                                    SwordItem.createAttributeModifiers(ModToolMaterials.S,10,-1.5F)
                            )
            )
    );

    public static final Item SHIELD_XIANFENG = register(
            "shield_xianfeng", new ShieldItem(new Item.Settings().rarity(Rarity.COMMON).maxDamage(256))
    );
    public static final Item SHIELD_ROYAL = register(
            "shield_royal", new ShieldItem(new Item.Settings().rarity(Rarity.RARE).maxDamage(1556))
    );
    public static final Item SHIELD_TOWER = register(
            "shield_tower", new ShieldItem(new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(1336))
    );

    public static final Item JINGUBANG_MU = register(
            "jingubang_mu",
            new ModBangItems(
                    ModToolMaterials.S,
                    new Item.Settings()
                            .maxDamage(886)
                            .rarity(Rarity.UNCOMMON)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.D,3,-1.5F)
                            )
            )
    );
    public static final Item JINGUBANG = register(
            "jingubang",
            new ModBangItems(
                    ModToolMaterials.S,
                    new Item.Settings()
                            .rarity(Rarity.EPIC)
                            .fireproof()
                            .maxDamage(5120)
                            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.D,5,1.5F)
                            )
            )
    );

    public static void registerModItems() {
        Fusion.LOGGER.info("Fusion Item Start!");
    }
}