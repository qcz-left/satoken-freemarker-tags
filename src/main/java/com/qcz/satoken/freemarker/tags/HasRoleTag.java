package com.qcz.satoken.freemarker.tags;

import cn.dev33.satoken.stp.StpUtil;

public class HasRoleTag extends RoleTag {
    protected boolean showTagBody(String roleName) {
        return StpUtil.hasRole(roleName);
    }
}
