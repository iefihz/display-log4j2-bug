1. 模块说明
```
hacker-server       模拟黑客的rmi服务器
my-server             模拟我的个人服务器
```

2. 测试内容
```
测试rmi服务与我的服务在同一个工程和不在同一个工程两种情况，如果不在同一个工程，需要如下配置nginx，与 com.iefihz.hacker.HackerRmiServer 中配置的地址对应

server {
    listen 9090;
    server_name localhost;
    
    location / {
        root	hacker-script;
    }
}

同时，把编译后的 HackerScript.class 放到 hacker-script 目录下，注意需要把这个类的包路径也带上，也就是放到 hacker-script\com\iefihz\hacker\ 目录下

最后，先启动 HackerRmiServer，再启动 MyServer 看测试效果
```

3. 解决办法
```
i.临时解决
-Dlog4j2.formatMsgNoLookups=true        关闭lookup功能，即不会对 LOGGER.info("用户名：{}", username) 中username中的${jndi:xxx}进行格式化解析

ii.彻底解决
升级到新版本，如：2.17.0，log2j-2.X ~ log2j-2.14.1 均存在此漏洞
```