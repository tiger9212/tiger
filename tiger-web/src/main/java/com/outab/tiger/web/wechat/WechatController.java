package com.outab.tiger.web.wechat;

import com.riversoft.weixin.common.menu.Menu;
import com.riversoft.weixin.common.menu.MenuItem;
import com.riversoft.weixin.common.menu.MenuType;
import com.riversoft.weixin.mp.menu.Menus;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/12/5 下午5:57
 * @Description:
 */
@RequestMapping("/wechat")
@Controller
public class WechatController {
    @ResponseBody
    @RequestMapping("/create")
    public String createMenu() throws IOException {
        Menu menu = new Menu();
        MenuItem menuAbout = new MenuItem().key("about").type(MenuType.click).name("测试");
        MenuItem menuItem = new MenuItem().key("item").type(MenuType.view).name("进入主页stg-晶晶").url("http://open.weixin.qq.com/connect/oauth2/authorize?appid=wx2cc109f2d6113abb&redirect_uri=http%3a%2f%2fparkingtest.mmall.com%2fapi%2fwechat%2findex%3fuid1%3dopkpxt6eWpYx_c8bDEiUnAwkdJ6o%26uid3%3dc1beecf7-55d4-41d2-9ca5-adff7145291f&response_type=code&scope=snsapi_base&state=&connect_redirect=1#wechat_redirect");
        MenuItem menuItem2 = new MenuItem().key("item").type(MenuType.view).name("进入主页stg-小俊").url("http://open.weixin.qq.com/connect/oauth2/authorize?appid=wx2cc109f2d6113abb&redirect_uri=http%3a%2f%2fparkingtest.mmall.com%2fapi%2fwechat%2findex%3fuid1%3dopkpxt7HebgWzU5dadNbaWi3BomI%26uid3%3da2965864-11e2-4cc0-bfb9-e2d18ddea8d8&response_type=code&scope=snsapi_base&state=&connect_redirect=1#wechat_redirect");
        MenuItem menuItem3 = new MenuItem().key("item").type(MenuType.view).name("进入主页stg-博文").url("http://open.weixin.qq.com/connect/oauth2/authorize?appid=wx2cc109f2d6113abb&redirect_uri=http%3a%2f%2fparkingtest.mmall.com%2fapi%2fwechat%2findex%3fuid1%3dopkpxt7HebgWzU5dadNbaWi3BomI%26uid3%3d53e9ce2a-ac3f-4633-b34e-e424f59011dc&response_type=code&scope=snsapi_base&state=&connect_redirect=1#wechat_redirect");
        MenuItem menuItem4 = new MenuItem().key("item").type(MenuType.view).name("进入主页prd-晶晶").url("http://open.weixin.qq.com/connect/oauth2/authorize?appid=wx2cc109f2d6113abb&redirect_uri=http%3a%2f%2fparking.mmall.com%2fapi%2fwechat%2findex%3fuid1%3dopkpxt6eWpYx_c8bDEiUnAwkdJ6o%26uid3%3d53e9ce2a-ac3f-4633-b34e-e424f59011dc&response_type=code&scope=snsapi_base&state=&connect_redirect=1#wechat_redirect");
        MenuItem menuItem5 = new MenuItem().key("item").type(MenuType.view).name("进入主页prd-小俊").url("http://open.weixin.qq.com/connect/oauth2/authorize?appid=wx2cc109f2d6113abb&redirect_uri=http%3a%2f%2fparking.mmall.com%2fapi%2fwechat%2findex%3fuid1%3dopkpxt7HebgWzU5dadNbaWi3BomI%26uid3%3da2965864-11e2-4cc0-bfb9-e2d18ddea8d8&response_type=code&scope=snsapi_base&state=&connect_redirect=1#wechat_redirect");

        MenuItem menuAbout2 = new MenuItem().key("about").type(MenuType.click).name("开发&产品");
        MenuItem menuItem21 = new MenuItem().key("item").type(MenuType.view).name("进入主页stg-校豪").url(this.getUrl(null,null,"caea0411-27c4-4bfa-aa1a-583229c2dd85"));
        MenuItem menuItem22 = new MenuItem().key("item").type(MenuType.view).name("进入主页stg-年蕾").url(this.getUrl(null,null,"f13aecba-0953-422b-9aef-7bf26944f46b"));
        MenuItem menuItem23 = new MenuItem().key("item").type(MenuType.view).name("进入主页stg-周易").url(this.getUrl(null,null,"2a07b7f0-4e59-4936-be77-b68cd2711557"));
        MenuItem menuItem24 = new MenuItem().key("item").type(MenuType.view).name("进入主页stg-一泓").url(this.getUrl(null,null,"18ea2645-bd3f-4ea6-b9f3-453a82f10d16"));
        MenuItem menuItem25 = new MenuItem().key("item").type(MenuType.view).name("进入主页stg-一泓2").url(this.getUrl(null,null,"73a53d67-2e21-4145-aca6-d1f25e7b1931"));

        MenuItem menuAbout3= new MenuItem().key("about").type(MenuType.click).name("未登录");
        MenuItem menuItem31 = new MenuItem().key("item").type(MenuType.view).name("STG-未登录").url(this.getUrl(null,null,""));


        menuAbout.add(menuItem);
        menuAbout.add(menuItem2);
        menuAbout.add(menuItem3);
        menuAbout.add(menuItem4);
        menuAbout.add(menuItem5);
        menuAbout2.add(menuItem21);
        menuAbout2.add(menuItem22);
        menuAbout2.add(menuItem23);
        menuAbout2.add(menuItem24);
        menuAbout2.add(menuItem25);
        menuAbout3.add(menuItem31);

//        menuAbout.add(menuItem6);
        menu.add(menuAbout);
        menu.add(menuAbout2);
        menu.add(menuAbout3);
        Menus.defaultMenus().create(menu);
        return "success";
    }
    public String getUrl(String uid1,String uid2,String uid3){
        if(StringUtils.isEmpty(uid1)){
            uid1="opkpxty6tpVol_rEOl9OmgHz5miQ";
        }
        String url = "http://open.weixin.qq.com/connect/oauth2/authorize?appid=wx2cc109f2d6113abb&redirect_uri=https%3a%2f%2fparkingtest.mmall.com%2fapi%2fwechat%2findex%3fuid1%3d"+uid1+"%26uid3%3d"+uid3+"&response_type=code&scope=snsapi_base&state=&connect_redirect=1#wechat_redirect";
        return url;
    }
    @ResponseBody
    @RequestMapping("/delete")
    public String deleteMenu(){
        Menus.defaultMenus().delete();
        return "success";
    }

    public static void main(String[] args) {
        System.out.println(16>>4);
        System.out.println(1024>>9);
        List list = new ArrayList<>();

    }

}
