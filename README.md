# 线上交易系统
北华大学软件工程培训周项目计划 

![图片](https://user-images.githubusercontent.com/91715813/170872222-ca7d9b85-fe29-4c38-9cd0-6a62ea24ae9a.png)

## 前言
今天使用传统MVC框架完成登录注册

## 目标
一个切实可行的复杂系统势必是从一个切实可行的简单系统发展而来的。从头开始设计的复杂系统根本不切实际可行，无法修修补补让他切实可行，你必须由一个切实可行的简单系统重新开始。从简单的功能逐渐完善成为切实可行的系统。

### 登录页面
启动Tomcat默认来到登录页面

![图片](https://user-images.githubusercontent.com/91715813/170872634-7d267979-063e-4333-8c7a-093780ed76b9.png)

### 数据库就朴实无华简简单单的一个user表，包含username和password两个属性并插入几条数据

![图片](https://user-images.githubusercontent.com/91715813/170872811-8da32daa-c43e-40d5-ab21-69dddd7130c7.png)

输入正确的用户名和密码就能进入主页，由于主页暂时没写任何东西，这里不展示。

输入不正确的用户名和密码跳转失败页面，提示重新登录。

![图片](https://user-images.githubusercontent.com/91715813/170873099-3e8dda4d-2a95-4963-b89a-b84be14ca0b5.png)

### 注册页面
从登录点击Register跳转到注册页面，输入新的用户名和密码就可以注册成功，如果有同样的用户名则注册失败，经过测试功能切实可行。

![图片](https://user-images.githubusercontent.com/91715813/170873149-12d1e50b-e488-45ac-8825-fa86e50be5a4.png)
