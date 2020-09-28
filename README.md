# springboot-hirui

这是一个前后端分离项目

项目基于springboot开发，mysql数据库，使用mybatis做持久层框架。

项目中引入flyway做数据库版本控制

原本打算用RestTemplate来作Http请求client，但是spring推出了新的非阻塞基于响应式编程的Http请求客户端工具WebClient,且RestTemplate会在之后的版本取消 ，所以这里使用webclient

使用swagger2生成接口api文档、引入swagger-bootstrap-ui替换原有UI(文档路径：http://localhost:8088/doc.html)

编码风格参考了阿里规约，可在Eclipse工具中引入了规约插件自查