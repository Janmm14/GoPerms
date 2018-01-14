package de.janmm14.goperms;

import io.gomint.plugin.Plugin;
import io.gomint.plugin.PluginName;
import io.gomint.plugin.Startup;
import io.gomint.plugin.StartupPriority;
import io.gomint.plugin.Version;

@PluginName("GoPerms")
@Version(major = 0, minor = 1)
@Startup(StartupPriority.LOAD)
public class GoPerms extends Plugin {

    @Override
    public void onInstall() {
        
    }

    @Override
    public void onUninstall() {
        
    }
}
