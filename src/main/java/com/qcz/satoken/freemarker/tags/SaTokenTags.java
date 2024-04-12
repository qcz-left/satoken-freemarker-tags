package com.qcz.satoken.freemarker.tags;

import freemarker.template.SimpleHash;

public class SaTokenTags extends SimpleHash {
    public SaTokenTags() {
        put("authenticated", new AuthenticatedTag());
        put("hasAnyRoles", new HasAnyRolesTag());
        put("hasPermission", new HasPermissionTag());
        put("hasRole", new HasRoleTag());
        put("notAuthenticated", new NotAuthenticatedTag());
        put("hasAnyPermissions", new HasAnyPermissionsTag());
    }
}