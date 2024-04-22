## Asb-admin

Spring Boot 3后台基础骨架, 配合amis使用, 用于快速开发后台管理系统
使用百度amis 低代码平台, 来快速创建后台

无须你编写任何前端代码, 就能创建一个好看的后台页面

低代码开发后台页面, 自带权限casbin, 雪花id, 鉴权jwt,

后端需要完成的接口 [https://owl-admin.apifox.cn](https://owl-admin.apifox.cnhttps://)

## 相关用技术栈

- jamis
- spring boot 3
- se-token
- mybatis-plus
- jcasbin
- hutool
- lombok

## 使用

~~打包静态资源~~ 已包含
```shell
cd a-admin
pnpm i
pnpm build
cp -r dist/* ../src/main/resources/static/admin
```

开启服务
访问 [http://localhost:8080/admin/](http://localhost:8080/admin/)



## Future

- amis 功能, 使用jamis包替换, 解耦
- 完善权限功能
- 完善文档
- 获取个人信息接口, 未返回用户角色信息

