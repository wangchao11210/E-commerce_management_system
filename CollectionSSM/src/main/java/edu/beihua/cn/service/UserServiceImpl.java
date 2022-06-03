package edu.beihua.cn.service;

import edu.beihua.cn.mapper.UserMapper;
import edu.beihua.cn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/29 14:46
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String userName) {
        return userMapper.getUser(userName);
    }

    @Override
    public int getUserByUserName(User user) {
        return userMapper.getUserByUserName(user);
    }

    @Override
    public User getUserByNamePass(User user) {
        return userMapper.getUserByNamePass(user);
    }

    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }
}
