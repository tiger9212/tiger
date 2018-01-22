package com.outab.tiger.web.test.annotation;

import java.lang.reflect.Field;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/7/17 下午12:33
 * @Description:
 */
public class AnnotationMain {
    public static void main(String[] args) {
        Field[] fields = UserServiceAnno.class.getFields();
        for(Field field : fields){
            if(field.isAnnotationPresent(UserName.class)){
                UserName userName = field.getAnnotation(UserName.class);
                System.out.println("userName:"+userName.value());
            }else if(field.isAnnotationPresent(UserAge.class)){
                UserAge userAge = field.getAnnotation(UserAge.class);
                System.out.println("userAge:"+userAge.value());
            }

        }
    }
}
