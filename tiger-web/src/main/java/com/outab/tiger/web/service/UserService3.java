package com.outab.tiger.web.service;

import com.outab.tiger.api.UserService;
import com.outab.tiger.api.modules.User;
import org.springframework.stereotype.Service;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/12/19 下午4:01
 * @Description:
 */
@Service
public class UserService3 implements UserService{
    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }
}
