package net.alan.fusion.item;

import net.alan.fusion.Fusion;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(Fusion.MOD_ID,id));
    }
    public static final RegistryKey<ItemGroup> FUSION_TAB = register("fusion_tab");

    public static void registerModItemGroup() {
        Registry.register(Registries.ITEM_GROUP, FUSION_TAB,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.fusion_tab"))
                        .icon(()-> new ItemStack(ModItems.FUSION_BOOK))
                        .entries((displayContext, entries) -> {

                            entries.add(ModItems.CLAYMORE);
                            entries.add(ModItems.ICE_SWORD);
                            entries.add(ModItems.BLACK_CLARYMORE);
                            entries.add(ModItems.QIUZHEN_SWORD);

                            entries.add(ModItems.FIRE_HAMMER);
                            entries.add(ModItems.LIGHT_HAMMER);

                            entries.add(ModItems.COMMAND_SWORD);
                            entries.add(ModItems.COMMAND_AXE);
                            entries.add(ModItems.COMMAND_PICKAXE);
                            entries.add(ModItems.COMMAND_SHOVEL);
                            entries.add(ModItems.COMMAND_HOE);
                            entries.add(ModItems.FIREBRAND_AXE);

                            entries.add(ModItems.IRON_BANE);
                            entries.add(ModItems.FIRE_BANE);

                            entries.add(ModItems.JINGUBANG_MU);
                            entries.add(ModItems.JINGUBANG);

                            entries.add(ModItems.WINGED_BOW);
                            entries.add(ModItems.GRAND_BOW);
                            entries.add(ModItems.DIEHUN_BOW);


                            entries.add(ModItems.AMULET);
                            entries.add(ModItems.IT_MOD);
                            entries.add(ModItems.FIRE_MOD);
                            entries.add(ModItems.FUSION_BOOK);
                            entries.add(ModItems.COMMAND_BOOK);

                            entries.add(ModItems.SHIELD_ROYAL);
                            entries.add(ModItems.SHIELD_TOWER);
                            entries.add(ModItems.SHIELD_XIANFENG);

                            entries.add(ModItems.LIFE_HELMET);
                            entries.add(ModItems.LIFE_CHESTPLATE);
                            entries.add(ModItems.LIFE_LEGGINGS);
                            entries.add(ModItems.LIFE_BOOTS);
                            entries.add(ModItems.BLACKSTONE_HELMET);
                            entries.add(ModItems.BLACKSTONE_CHESTPLATE);
                            entries.add(ModItems.BLACKSTONE_LEGGINGS);
                            entries.add(ModItems.BLACKSTONE_BOOTS);
                            entries.add(ModItems.SOUL_VALLEY_HELMET);
                            entries.add(ModItems.SOUL_VALLEY_CHESTPLATE);
                            entries.add(ModItems.SOUL_VALLEY_LEGGINGS);
                            entries.add(ModItems.SOUL_VALLEY_BOOTS);
                            entries.add(ModItems.GOLDEN_HELMET);
                            entries.add(ModItems.GOLDEN_CHESTPLATE);
                            entries.add(ModItems.GOLDEN_LEGGINGS);
                            entries.add(ModItems.GOLDEN_BOOTS);
                            entries.add(ModItems.CHORUS_FLOWER_HELMET);
                            entries.add(ModItems.CHORUS_FLOWER_CHESTPLATE);
                            entries.add(ModItems.CHORUS_FLOWER_LEGGINGS);
                            entries.add(ModItems.CHORUS_FLOWER_BOOTS);
                            entries.add(ModItems.LANG_HELMET);
                            entries.add(ModItems.LANG_CHESTPLATE);
                            entries.add(ModItems.LANG_BOOTS);
                        }).build());
        Fusion.LOGGER.info("Registering Item Groups");
    }
}
