package com.qcz.satoken.freemarker.tags;

public class HasPermissionTag extends PermissionTag {

    protected boolean showTagBody(String p) {
        return isPermitted(p);
    }
}
