package com.outab.tiger.jdbc.dao;

import com.outab.tiger.jdbc.UserInfo;

import java.util.List;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/12/14 下午3:16
 * @Description:
 */
public interface UserInfoDao {
    public int addUser(UserInfo userInfo);
    public List<UserInfo> selectUser(UserInfo userInfo);
}
