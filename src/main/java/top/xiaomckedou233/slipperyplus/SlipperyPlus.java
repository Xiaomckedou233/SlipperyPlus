package top.xiaomckedou233.slipperyplus;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlipperyPlus implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("slipperyplus");
    @Override
    public void onInitialize() {
        LOGGER.info("SlipperyPlus,Start!");
    }
}
