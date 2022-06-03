package edu.beihua.cn.mapper;

import edu.beihua.cn.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/29 14:10
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
public interface UserMapper {
    @Select(" select * from user where username=#{userName} ")
    User getUser(String userName);

    @Select(" select count(*) from user where username=#{userName} ")
    int getUserByUserName(User user);

    @Select(" select * from user where username=#{userName} ")
    User getUserByNamePass(User user);

    @Insert(" insert into user(username,password) values (#{userName}, #{passWord}) ")
    int saveUser(User user);
}
