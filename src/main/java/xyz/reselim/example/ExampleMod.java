package xyz.reselim.example;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
    modid = ExampleMod.MODID,
    name = ExampleMod.MOD_NAME,
    version = ExampleMod.VERSION,
    acceptedMinecraftVersions = "[1.8.9]",
    clientSideOnly = true
)
public class ExampleMod {
    public static final String MODID = "example";
    public static final String MOD_NAME = "Example";
    public static final String VERSION = "0.0.1";

    @Mod.EventHandler
	public static void init(FMLInitializationEvent event) {
		System.out.println("Hello world!");
	}
}