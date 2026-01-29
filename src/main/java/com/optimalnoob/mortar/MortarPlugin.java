package com.optimalnoob.mortar;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

import javax.annotation.Nonnull;
import java.util.logging.Level;

public class MortarPlugin extends JavaPlugin {

    private static MortarPlugin instance;

    public MortarPlugin(@Nonnull JavaPluginInit init) {
        super(init);
        instance = this;
        getLogger().at(Level.INFO).log("[MortarPlugin] Plugin loaded!");
    }

    public static MortarPlugin getInstance() {
        return instance;
    }

    @Override
    protected void setup() {
        getLogger().at(Level.INFO).log("[MortarPlugin] Plugin setup!");
        registerEvents();
        registerCommands();
    }

    @Override
    protected void start() {
        getLogger().at(Level.INFO).log("[MortarPlugin] Plugin enabled!");
    }

    @Override
    public void shutdown() {
        getLogger().at(Level.INFO).log("[MortarPlugin] Plugin disabled!");

        // TODO: Cleanup your plugin here
        // - Save data
        // - Stop services
        // - Close connections
    }

    private void registerEvents() {

    }

    private void registerCommands() {

    }
}
