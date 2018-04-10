package com.outab.tiger.web.controller.wechat;

import com.outab.common.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2018/3/31 下午10:22
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping(path = "/wechat/user")
public class LittleController {
    @RequestMapping(path = "/login")
    public Result login(String openId){
        Result result = new Result();
        System.out.println(openId);
        result.setData("获取到的微信openId:"+openId);
        return result;
    }

}
