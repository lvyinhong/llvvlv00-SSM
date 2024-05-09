package com.llvvlv00.spring.proxy;

import com.llvvlv00.spring.proxy.service.Calculator;
import com.llvvlv00.spring.proxy.service.impl.CalculatorImpl;
import org.junit.Test;

/**
 * @Package com.llvvlv00.spring.proxy
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class ProxyTest {
    @Test
    public void testProxy() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator)proxyFactory.getProxy();
        proxy.add(1,2);
        proxy.div(2,0);
    }
}
