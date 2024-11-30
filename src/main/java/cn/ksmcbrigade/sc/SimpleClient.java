package cn.ksmcbrigade.sc;

import cn.ksmcbrigade.scb.SimpleClientBase;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(SimpleClient.MODID)
public class SimpleClient
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "sc";

    public SimpleClient(IEventBus modEventBus, ModContainer modContainer)
    {
        SimpleClientBase.LOGGER.info("SimpleClient loaded.");
    }
}
