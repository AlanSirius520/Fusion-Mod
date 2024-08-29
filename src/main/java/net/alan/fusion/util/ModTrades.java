package net.alan.fusion.util;

import net.alan.fusion.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

public class ModTrades {
    public static void registerModTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1, factories ->{
            factories.add(new TradeOffers.SellItemFactory(ModItems.FUSION_BOOK,1,9,5,1));
        });
    }
}
