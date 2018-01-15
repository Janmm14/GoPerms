package de.janmm14.goperms.impl;

import de.janmm14.goperms.GoPerms;
import de.janmm14.goperms.api.GoPermsApi;
import de.janmm14.goperms.api.PermissionProvider;
import io.gomint.permission.Group;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class GoPermsApiImpl implements GoPermsApi {

	private final GoPerms plugin;

	@Override
	public void reload() throws Exception {

	}

	@Override
	public Group addGroup(String groupName, Map<String, Boolean> permissions) throws Exception {
		return null;
	}

	@Override
	public void removeGroup(String group) {

	}

	@Override
	public Map<String, Boolean> getPlayerPermissions(UUID playerUuid) {
		return null;
	}

	@Override
	public Set<Group> getGroups() {
		return plugin.getGroupLoader().getLoadedGroups().stream()
			.map(groupName -> plugin.getServer().getGroupManager().getOrCreateGroup(groupName))
			.collect(Collectors.toSet());
	}

	@Override
	public void setPermissionProvider(PermissionProvider permissionProvider) {

	}
}
