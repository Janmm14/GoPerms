package de.janmm14.goperms;

import io.gomint.event.EventHandler;
import io.gomint.event.EventListener;
import io.gomint.event.player.PlayerLoginEvent;
import io.gomint.permission.PermissionManager;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.Set;

@RequiredArgsConstructor
public class Listener implements EventListener {

	private final GoPerms plugin;

	@EventHandler
	public void onJoin(PlayerLoginEvent event) {
		Set<String> groupNames = plugin.getPermissionProvider().getGroupsOfPlayer(event.getPlayer().getUUID());
		for (String groupName : groupNames) {
			if (!plugin.getGroupLoader().isGroupLoaded(groupName)) {
				plugin.getLogger().warn("Player %1$s joined with unknown group %2$s assigned, removing group", event.getPlayer().getName(), groupName); //TODO rethink
				continue;
			}
			PermissionManager permissionManager = event.getPlayer().getPermissionManager();
			permissionManager.addGroup(plugin.getServer().getGroupManager().getOrCreateGroup(groupName));
		}
		Map<String, Boolean> playerPermissions = plugin.getPermissionProvider().getPlayerPermissions(event.getPlayer().getUUID());
		if (playerPermissions != null) {

		}
	}
}
