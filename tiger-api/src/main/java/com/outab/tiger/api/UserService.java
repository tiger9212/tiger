package com.outab.tiger.api;

import com.outab.tiger.api.modules.User;

import java.sql.SQLException;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/7/16 下午3:58
 * @Description:
 */
public interface UserService {
   public boolean login(User user);
   public boolean addUser(User user);
}
