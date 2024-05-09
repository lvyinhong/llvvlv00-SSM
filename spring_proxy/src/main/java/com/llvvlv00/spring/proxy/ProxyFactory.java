package com.llvvlv00.spring.proxy;


import com.sun.deploy.net.proxy.ProxyHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Package com.llvvlv00.spring.proxy
 * @Description 1、JDK 动态代理，要求必须有接口，最终生成的代理类和目标类实现相同的接口
 *  在com.sun.proxy包中,类名为$proxy2
 * 2、cglib动态代理，最终生成的代理类会继承目标类，并且和目标类在相同的包下
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        /**
         * ClassLoader loader, 指定加载动态生成的代理类的类加载器
         * Class<?>[] interfaces, 获取目标对象实现的所有接口的class对象的数组
         * InvocationHandler h, 设置代理类中的抽象方法如何重写
         */
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // proxy 表示代理对象, method 表示要执行的方法, args 表示要执行的方法的参数列表
                Object result = null;
                try {
                    System.out.printf("日志: 方法: %s, 参数: %s\n", method.getName(), Arrays.toString(args));
                    result = method.invoke(target, args);
                    System.out.printf("日志: 方法: %s, 参数: %s, 执行结果:%s\n", method.getName(), Arrays.toString(args), result.toString());
                }catch (Exception e) {
                    e.printStackTrace();
                    System.out.printf("日志: 方法: %s, 参数: %s, 异常:%s\n", method.getName(), Arrays.toString(args), e.getMessage());
                }finally {
                    System.out.printf("日志: 方法: %s, 参数: %s, 方法执行完毕", method.getName(), Arrays.toString(args));
                }

                return result;
            }
        };
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
