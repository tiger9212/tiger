package com.outab.tiger.service;

import com.google.gson.Gson;
import com.outab.tiger.api.UserService;
import com.outab.tiger.api.modules.User;
import com.outab.tiger.jdbc.UserInfo;
import com.outab.tiger.jdbc.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/8/25 上午9:54
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserInfoDao userInfoDao;
    @Override
    public boolean login(User user){
        return false;
    }

    @Override
    public boolean addUser(User user) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(10003L);
        userInfo.setCode(100003L);
        userInfo.setName("jack");
        userInfo.setMobile("18221374069");
        userInfo.setAge(12);
        userInfo.setPassword("123");
//        userInfoDao.addUser(userInfo);
        List<UserInfo> userList = userInfoDao.selectUser(userInfo);
        System.out.println(new Gson().toJson(userList));
        return false;
    }
}
