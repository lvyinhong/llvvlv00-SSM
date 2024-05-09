package com.llvvlv00.spring.proxy;

import com.llvvlv00.spring.proxy.service.Calculator;
import com.llvvlv00.spring.proxy.service.impl.CalculatorImpl;

/**
 * @Package com.llvvlv00.spring
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class CalculatorStaticProxy implements Calculator {

    private Calculator target;

    public CalculatorStaticProxy(Calculator calculator) {
        this.target = calculator;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("日志，方法: add，参数：" + i + "," + j);
        int result = target.add(i, j);
        System.out.println("日志，方法: add，结果：" + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("日志，方法: sub，参数：" + i + "," + j);
        int result = target.sub(i, j);
        System.out.println("日志，方法: sub，结果：" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("日志，方法: mul，参数：" + i + "," + j);
        int result = target.mul(i, j);
        System.out.println("日志，方法: mul，结果：" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("日志，方法: div，参数：" + i + "," + j);
        int result = target.div(i, j);
        System.out.println("日志，方法: div，结果：" + result);
        return result;
    }
}
