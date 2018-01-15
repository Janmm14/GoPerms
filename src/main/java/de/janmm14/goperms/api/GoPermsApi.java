package de.janmm14.goperms.api;

import io.gomint.permission.Group;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

public interface GoPermsApi {

	/**
	 * Reload groups and permissions
	 * @throws Exception
	 */
	void reload() throws Exception;

	/**
	 * Adds a new group
	 * @param groupName the name of the new group
	 * @param permissions the permission of the new group
	 * @return
	 * @throws Exception
	 */
	Group addGroup(String groupName, Map<String, Boolean> permissions) throws Exception;

	void removeGroup(String group);

	Map<String, Boolean> getPlayerPermissions(UUID playerUuid);

	/**
	 * @return All groups defined by GoPerms
	 */
	Set<Group> getGroups();

	/**
	 * Sets a new permission provider
	 *
	 * Invoking this method will invalidate all previous permissions, no call to {@link #reload()} is neccessary
	 * @param permissionProvider the new permission provider
	 */
	void setPermissionProvider(PermissionProvider permissionProvider);
}
