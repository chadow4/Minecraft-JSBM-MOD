package fr.chadow4.jsmb;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(Jsmb.MODID)
public class Jsmb {


    public static final String MODID = "jsmb"; // id of the mod
    private static final Logger LOGGER = LogUtils.getLogger(); // logger in the console

    public Jsmb() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        LOGGER.info("Mod stated successfully!"); // information of the started mod

        MinecraftForge.EVENT_BUS.register(this);

    }

}
