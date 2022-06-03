package edu.beihua.cn.test;

import edu.beihua.cn.pojo.User;
import edu.beihua.cn.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/29 14:59
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
public class TestGetName {
    @Autowired
    private UserService userService;

    @Test
    public void testGetUser(){
        User user = userService.getUser("admin");
        System.out.println(user);
    }
}
