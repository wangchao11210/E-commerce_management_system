package edu.beihua.cn.pojo;

import java.io.Serializable;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/19 20:47
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT Electronic_mall_V3
 */
public class User implements Serializable {
    private String userName;
    private int passWord;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public int getPassWord() {
        return passWord;
    }

    public void setPassWord(int passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(String userName, int passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
}
