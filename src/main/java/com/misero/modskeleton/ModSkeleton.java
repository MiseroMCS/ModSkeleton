package com.misero.modskeleton;

import com.misero.modskeleton.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModSkeleton.MODID, name = ModSkeleton.NAME, version = ModSkeleton.VERSION)
public class ModSkeleton {
    //Basic mod info. Change these!
    public static final String MODID = "modskeleton";
    public static final String NAME = "Mod Skeleton";
    public static final String VERSION = "1.0";

    @Mod.Instance
    public static ModSkeleton instance;

    //Sets up the proxy - a way of running different code on a server or client instance of the game.
    @SidedProxy(clientSide="com.misero.modskeleton.proxy.ClientProxy", serverSide="com.misero.modskeleton.proxy.ServerProxy")
    public static CommonProxy proxy;

    private static Logger logger;

    // Initializes log helper.
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    //Initialization - currently just for debug.
    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
