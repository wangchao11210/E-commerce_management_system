package edu.beihua.cn.service;

import edu.beihua.cn.pojo.User;

import java.util.List;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/19 20:56
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT Electronic_mall_V3
 */
public interface UserService {
    int updatePwd (User user);

    User findAdmin(String username,int password);

    int regUser(User user);

    User checkReg(String userName);
}
