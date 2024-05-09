package com.llvvlv00.spring.proxy;

import com.llvvlv00.spring.proxy.service.impl.CalculatorImpl;
import org.junit.Test;

/**
 * @Package com.llvvlv00.spring.proxy
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class StaticProxyTest {
    @Test
    public void testStaticProxy() {
        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        proxy.add(1, 2);
        proxy.sub(1, 2);
        proxy.mul(1, 2);
        proxy.div(1, 2);
    }
}
