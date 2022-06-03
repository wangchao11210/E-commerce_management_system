package edu.beihua.cn.controller;

import edu.beihua.cn.pojo.User;
import edu.beihua.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.DocFlavor;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/29 14:47
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 从客户端获取用户名
     * @param userName
     */
    @RequestMapping("/test")
    public void testGetUser(String userName) throws Exception{
        User user = userService.getUser(userName);
        System.out.println(user);
    }

    /**
     * 注册检查方法
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping("/getUserByUserName")
    public int getUserByUserName(User user) throws Exception{
        System.out.println("注册检查方法");
        System.out.println(user);
        return userService.getUserByUserName(user);
    }

    /**
     * 登录方法
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping("/getUserByNamePass")
    public User getUserByNamePass(User user) throws Exception{
        System.out.println("登录方法");
        System.out.println(user);
        return userService.getUserByNamePass(user);
    }

    /**
     * 注册方法
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping("/saveUser")
    public int saveUser(User user) throws Exception{
        System.out.println("注册方法！");
        System.out.println(user);
        return userService.saveUser(user);
    }
}
