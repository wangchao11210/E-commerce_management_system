package edu.beihua.cn.pojo;

/**
 * @Author wangchao（专业bug开发）
 * @Date 2022/5/29 14:12
 * @Version 1.0
 * @Software IntelliJ IDEA
 * @PROJECT CollectionSSM
 */
public class User {

    private Integer passWord;
    private String userName;

    public Integer getPassWord() {
        return passWord;
    }

    public void setPassWord(Integer passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "passWord=" + passWord +
                ", userName='" + userName + '\'' +
                '}';
    }
}
