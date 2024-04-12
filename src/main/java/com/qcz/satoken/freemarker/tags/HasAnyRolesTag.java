package com.qcz.satoken.freemarker.tags;

import cn.dev33.satoken.stp.StpUtil;

public class HasAnyRolesTag extends RoleTag {
    // Delimeter that separates role names in tag attribute
    private static final String ROLE_NAMES_DELIMETER = ",";

    protected boolean showTagBody(String roleNames) {
        boolean hasAnyRole = false;

        if (StpUtil.isLogin()) {
            // Iterate through roles and check to see if the user has one of the roles
            for (String role : roleNames.split(ROLE_NAMES_DELIMETER)) {
                if (StpUtil.hasRole(role.trim())) {
                    hasAnyRole = true;
                    break;
                }
            }
        }

        return hasAnyRole;
    }
}
