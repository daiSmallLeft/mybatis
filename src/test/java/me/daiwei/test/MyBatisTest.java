package me.daiwei.test;

import me.daiwei.Model.CoAccountDto;
import me.daiwei.service.CoAccountService;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisTest {

    private CoAccountService coAccountService;

    @Before
    public void before(){
        //使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
        //从Spring容器中根据bean的id取出我们要使用的userService对象
        coAccountService = (CoAccountService) ac.getBean("coAccountService");
    }


    @Test
    public void testGetCoAccount(){
        //ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
        //UserServiceI userService = (UserServiceI) ac.getBean("userService");
        short coAccountId = 8;
        CoAccountDto coAccount = coAccountService.getCoAccountById(coAccountId);
        System.out.println(coAccount.getCoAccountName());
    }
}
