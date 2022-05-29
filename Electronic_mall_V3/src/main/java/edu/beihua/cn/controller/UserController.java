package edu.beihua.cn.controller;

import edu.beihua.cn.pojo.User;
import edu.beihua.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.InputStream;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/19 21:01
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT Electronic_mall_V3
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(String username, int password){
        System.out.println("这是控制层 - 登录方法！");
        User user = userService.findAdmin(username,password);
        if(user != null){
            if(user.getPassWord() == password){
                return "successful";
            }else {
                return "defeated";
            }
        }
        return "defeated";
    }

    @RequestMapping("/register")
    public String register(){
        System.out.println("这是控制层 - 注册页面链接方法！");
        return "registered";
    }

    @RequestMapping("/updatePwd")
    public String update(User user){
        userService.updatePwd(user);
        System.out.println(user);
        return "successful";
    }

    @RequestMapping("/regUser")
    public String regUser(User user){
        System.out.println("这是控制层 - 用户注册方法！");
        System.out.println(user.getUserName() + "," + user.getPassWord());
        User u = userService.checkReg(user.getUserName());
        if (u == null){
            userService.regUser(user);
            return "successful";
        }
        return "defeated";
    }

}
