package com.ruoyi.system.util;

import com.ruoyi.common.utils.security.Md5Utils;
import com.ruoyi.system.domain.SysUser;

public class PasswordUtil
{
    public static boolean matches(SysUser user, String newPassword)
    {
        //29c67a30398638269fe600f73a054934
        System.out.println(encryptPassword("admin","123456","111111"));
        return user.getPassword().equals(encryptPassword(user.getLoginName(), newPassword, user.getSalt()));
    }

    public static String encryptPassword(String username, String password, String salt)
    {
        return Md5Utils.hash(username + password + salt);
    }
}
