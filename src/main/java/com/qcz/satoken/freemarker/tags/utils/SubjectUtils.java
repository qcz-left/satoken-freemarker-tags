package com.qcz.satoken.freemarker.tags.utils;

import cn.dev33.satoken.dao.SaTokenDao;
import cn.dev33.satoken.stp.StpUtil;

public class SubjectUtils {

    /**
     * 判断账号是否过期
     */
    public static boolean isExpire() {
        return StpUtil.getStpLogic().getTokenActiveTimeout() == SaTokenDao.NOT_VALUE_EXPIRE;
    }
}
