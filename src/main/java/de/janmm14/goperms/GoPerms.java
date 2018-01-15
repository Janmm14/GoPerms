package de.janmm14.goperms;

import de.janmm14.goperms.api.GoPermsApi;
import de.janmm14.goperms.api.PermissionProvider;
import io.gomint.plugin.Plugin;
import io.gomint.plugin.PluginName;
import io.gomint.plugin.Startup;
import io.gomint.plugin.StartupPriority;
import io.gomint.plugin.Version;
import lombok.Getter;

@PluginName("GoPerms")
@Version(major = 0, minor = 1)
@Startup(StartupPriority.LOAD)
public class GoPerms extends Plugin {

	@Getter
	private GoPermsApi api;
	@Getter
	private PermissionProvider permissionProvider;
	@Getter
	private GroupLoader groupLoader;

	@Override
	public void onInstall() {

	}

	@Override
	public void onUninstall() {

	}
}
