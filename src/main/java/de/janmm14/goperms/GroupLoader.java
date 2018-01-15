package de.janmm14.goperms;

import io.gomint.permission.Group;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RequiredArgsConstructor
public class GroupLoader {

	@Getter
	private final Set<String> loadedGroups = new HashSet<>();

	private final GoPerms plugin;

	public boolean loadGroup(String groupName, Map<String, Boolean> permissions) {
		groupName = sanitizeGroupName(groupName).intern();
		if (loadedGroups.contains(groupName)) {
			return true;
		}
		Group group = plugin.getServer().getGroupManager().getOrCreateGroup("goperms-" + groupName);
		permissions.forEach(group::setPermission);
		loadedGroups.add(groupName);
		return true;
	}

	public boolean isGroupLoaded(String groupName) {
		return loadedGroups.contains(sanitizeGroupName(groupName));
	}

	private static String sanitizeGroupName(String groupName) {
		return groupName.trim().toLowerCase();
	}
}
