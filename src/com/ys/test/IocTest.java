package com.ys.test;

import com.ys.ioc.entity.*;
import com.ys.ioc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

    @Test
    public void testAddUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-bean.xml");

        User user = context.getBean("user", User.class);

        user.addUser();
    }

    @Test
    public void testUserServiceAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-bean.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void testInnerBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-bean.xml");

        Employee employee = context.getBean("employee", Employee.class);

        System.out.println(employee.toString());
    }

    @Test
    public void testCollectionBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-bean.xml");

        CollectionBean collectionBean = context.getBean("collectionBean", CollectionBean.class);

       collectionBean.test();
    }

    @Test
    public void testCollectionBean2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-bean.xml");

        Camps camps = context.getBean("camps", Camps.class);

        System.out.println(camps.toString());
    }

    @Test
    public void testCollectionBean3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-bean2.xml");

        Camps camps = context.getBean("camps", Camps.class);

        System.out.println(camps.toString());
    }

    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc-bean2.xml");

        User user = context.getBean("factoryBean", User.class);

        System.out.println(user.getName());
    }

    @Test
    public void testBeanLifeCycle(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-bean2.xml");

        HeroAttribute heroAttribute = context.getBean("heroAttribute", HeroAttribute.class);

        System.out.println(heroAttribute);
        System.out.println("第四步：创建bean实例对象");

        //手动销毁实例
        context.close();
        System.out.println("实例已经销毁");
    }
}
