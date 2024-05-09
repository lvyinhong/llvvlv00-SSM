package com.llvvlv00.spring.test;

import com.llvvlv00.spring.controller.UserController;
import com.llvvlv00.spring.dao.UserDao;
import com.llvvlv00.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Package com.llvvlv00.spring.test
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class IOCByAnnotationTest {
    @Test
    public void testIOCByAnnotation() {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = context.getBean(UserController.class);
        UserService userService = context.getBean(UserService.class);
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println("userController = " + userController);
        System.out.println("userService = " + userService);
        System.out.println("userDao = " + userDao);
    }

    @Test
    public void testSaveUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = context.getBean(UserController.class);
        userController.saveUser();
    }
}
