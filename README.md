# 线上交易系统
北华大学软件工程培训周项目计划 

# 采用传统SSM框架和JSP方式开发

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


# 考虑到传统SSM框架服务器的压力太大，后续采用了前后端开发的方式重新制作了登录注册主页面以及主页面功能的增删改查的实现。

### 前端采用Vue框架而不是传统的JSP方式，大大增加的开发速度。登录注册功能依然跟前面的一样，新用户注册到数据库然后再从数据库验证是否有此用户进行登录验证。

![图片](https://user-images.githubusercontent.com/91715813/171879194-76dbdd69-cac7-4b9f-b2f7-070fcd16be7b.png)

### 登录验证之后进入主页面，主页面的功能暂时只推进到了对数据的增删改查以及通过搜索框动态查询。

![图片](https://user-images.githubusercontent.com/91715813/171879946-cad47341-01cb-4288-a160-cb6bf7dd6539.png)

### 后端还是采用SSM框架和Tomcat容器做基础，在前端页面每调动一个功能，在后端都输出函数调用的消息队列。前后端连接通过Axios发送Ajax请求，并且只允许前端服务器请求。项目阶段性笔记到此结束。

![图片](https://user-images.githubusercontent.com/91715813/171880573-9a3917a8-1220-4a43-ba4f-6c0081656882.png)

### 后续如果有时间会继续更新笔记和项目，希望大家持续关注。
