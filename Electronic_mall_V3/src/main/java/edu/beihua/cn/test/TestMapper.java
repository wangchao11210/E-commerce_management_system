package edu.beihua.cn.test;

import edu.beihua.cn.dao.UserMapper;
import edu.beihua.cn.pojo.User;
import edu.beihua.cn.service.UserService;
import org.junit.Test;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/22 23:42
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT Electronic_mall_V3
 */
public class TestMapper {
    UserService userService;

    String username = "风情月意";
    int password = 123123;

    @Test
    public void TestMapper(){
        User user = userService.findAdmin(username,password);
        System.out.println(user.getUserName() + "," + user.getPassWord());
    }
}
