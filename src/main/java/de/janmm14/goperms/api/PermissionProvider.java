package de.janmm14.goperms.api;

import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

@RequiredArgsConstructor
public abstract class PermissionProvider {

	private final String name;

	public abstract Map<String, Map<String, Boolean>> getGroups();

	public abstract Map<String, Boolean> getPlayerPermissions(UUID playerUuid);

	public abstract Set<String> getGroupsOfPlayer(UUID playerUuid);

	public abstract void addGroup(String groupName, Map<String, Boolean> permissions) throws Exception;

	public abstract void removeGroup(String group);

	public abstract void updatePermission(String groupName, String permission, Boolean value);
}
