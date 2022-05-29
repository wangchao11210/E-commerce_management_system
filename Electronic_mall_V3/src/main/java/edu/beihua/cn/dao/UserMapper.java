package edu.beihua.cn.dao;

import edu.beihua.cn.pojo.User;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/19 20:54
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT Electronic_mall_V3
 */
public interface UserMapper {
    /**
     * 查询方法
     * 查询数据库的用户名和密码 返回值为一个对象，如果对象不存在则返回空
     * 此处可能会引发空指针异常，可以直接抛出
     * @param
     * @return
     */
    User findAdmin(String username,int password);

    /**
     * 更新方法：更新用户
     * @param user
     * @return
     */
    int updatePwd(User user);

    /**
     * 注册方法：添加新用户
     * @param user
     * @return
     */
     int regUser(User user);

    /**
     * 注册时的重名检测
     * @param userName
     * @return
     */
     User checkReg(String userName);
}
