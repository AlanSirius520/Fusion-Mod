package net.alan.fusion;

import net.alan.fusion.item.ModItemGroups;
import net.alan.fusion.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fusion implements ModInitializer {

    public static final String MOD_ID = "fusion";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerModItemGroup();
        ModItems.registerModItems();
        LOGGER.info("FUSION YES");
    }
}
