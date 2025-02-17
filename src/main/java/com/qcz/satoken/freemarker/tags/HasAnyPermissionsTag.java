package com.qcz.satoken.freemarker.tags;

public class HasAnyPermissionsTag extends PermissionTag {
    private static final String PERMISSION_NAMES_DELIMETER = ",";

    protected boolean showTagBody(String ps) {
        boolean hasAnyPermissions = false;
        for(String p : ps.split(PERMISSION_NAMES_DELIMETER)){
            if(isPermitted(p)){
                hasAnyPermissions = true;
                break;
            }
        }
        return hasAnyPermissions;
    }
}
