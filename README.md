# OnlineExamSystem

一个基于ssm后台框架和完整网页前端的demo

## 项目进度把控

### 第一周（10.14-10.20）

1.测试json数据交换
2.项目文件写完（readme，outline，接口文档）
3.wangditor富文本编辑器
4.数据库结构完成

### 第二周（10.21-10.27）

1.后端完成各层构建
2.前台样式基本敲定
3.完成接口文件要求的数据交换
4.debug

### 第三周（10.28-11.03）

1.放到服务器上跑并且debug
2.完成最后接洽

## 前后台应用技术

>后端：idea maven tomcat8 mysql5.7 spring spring—mvc mybatis
>前端：html css jquery

## 项目结构图

>*文件为配置文件，尽量不要改动

```
|-- /.idea/           #*idea配置
|-- /src/
|  |-- /java/         #存放java源码
|  |-- /resources/    #存放项目配置文件
|  |-- /webapp/
|     |-- /WEB-INF/
|        |-- /assets/  #静态资源，如图片，公共css，js等
|        |-- /pages/   #存放网页文件，将各网页html，css，js打包存放
|        |-- web.xml   #webapp配置文件
|-- /target/           #存放编译生成文件
|-- pom.xml            #maven配置信息
|-- outline.md         #项目综述
|-- README.md          #项目简介
|-- 接口配置.md         #接口配置
|-- 数据库配置.md       #数据库配置
```

## 注意事项

1.本项目中数据库user为样例，实际使用需进行更改
2.项目中所用到的富文本图片上传功能，实际路径需要根据服务器路径（linux，window）不同进行相应配置


