package com.outab.tiger.service;

import io.shardingjdbc.core.api.HintManager;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/12/15 上午10:18
 * @Description:
 */
public class HintManagerStrategy {
    public void getManager(){
        HintManager manager = HintManager.getInstance();
    }
}
