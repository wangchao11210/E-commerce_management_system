package edu.beihua.cn.service;

import edu.beihua.cn.dao.UserMapper;
import edu.beihua.cn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/19 20:59
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT Electronic_mall_V3
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int updatePwd(User user) {
        return userMapper.updatePwd(user);
    }

    @Override
    public User findAdmin(String username, int password) {
        System.out.println("这是业务层 - 查找用户方法！");
        return userMapper.findAdmin(username,password);
    }

    @Override
    public int regUser(User user) {
        System.out.println("这是业务层 - 用户注册方法！");
            return userMapper.regUser(user);
    }

    @Override
    public User checkReg(String userName) {
        return userMapper.checkReg(userName);
    }
}
