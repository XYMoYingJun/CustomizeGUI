package com.xym_y_l.customizegui;

import com.xym_y_l.customizegui.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = CustomizeGUI.MODID, name = CustomizeGUI.NAME, version = CustomizeGUI.VERSION, acceptedMinecraftVersions = CustomizeGUI.acceptedMinecraftVersions)
public class CustomizeGUI {

    public static final String MODID = "customizegui";
    public static final String NAME = "Customize GUI";
    public static final String VERSION = "1.0.0";
    public static final String acceptedMinecraftVersions = "1.12.2";
    public static final String CLIENT_PROXY = "com.xym_y_l.customizegui.proxy.ClientProxy";
    public static final String COMMON_PROXY = "com.xym_y_l.customizegui.proxy.CommonProxy";
    public static final Logger logger = LogManager.getLogger(MODID);

    @Mod.Instance(CustomizeGUI.MODID)
    public static CustomizeGUI instance;

    @SidedProxy(
            clientSide = CLIENT_PROXY,
            serverSide = COMMON_PROXY)
    public static CommonProxy proxy;

}
