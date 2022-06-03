package edu.beihua.cn.service;

import edu.beihua.cn.pojo.User;
import org.apache.ibatis.annotations.Select;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/29 14:45
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
public interface UserService {
    /**
     * 获取客户端传来的用户名
     * @param userName
     * @return
     */
    User getUser(String userName);

    /**
     * 验证是否存在输入的用户名
     * @param user
     * @return
     */
    int getUserByUserName(User user);

    /**
     * 通过用户名登录
     * @param user
     * @return
     */
    User getUserByNamePass(User user);

    /**
     * 注册用户
     * @param user
     * @return
     */
    int saveUser(User user);
}
