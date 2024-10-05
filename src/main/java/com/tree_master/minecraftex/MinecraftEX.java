package com.tree_master.minecraftex;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MinecraftEX.MODID, name = MinecraftEX.NAME, version = MinecraftEX.VERSION)
public class MinecraftEX
{
    public static final String MODID = "minecraftex";
    public static final String NAME = "MinecraftEX";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "tree_master.minecraftex.proxy.ClientProxy", serverSide = "tree_master.minecraftex.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static MinecraftEX instance;

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
