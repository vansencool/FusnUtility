package net.vansen.fusnutility;

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

/**
 * FusnUtility is a utility class for managing the plugin instance.
 * It provides a method to get the plugin instance and a method to initialize it.
 */
@SuppressWarnings("unused")
public final class FusnUtility {

    private static JavaPlugin plugin;

    /**
     * Returns the plugin instance.
     *
     * @return the plugin instance
     */
    public static @NotNull JavaPlugin plugin() {
        if (plugin == null) throw new IllegalStateException("Plugin not initialized. Call init() method first.");
        return plugin;
    }

    /**
     * Initializes the plugin instance.
     *
     * @param plugin the plugin instance to set
     */
    public static void init(@NotNull JavaPlugin plugin) {
        FusnUtility.plugin = plugin;
    }
}
