package com.souche.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuqizhe on 15/9/23.
 */
public class TestSqlSessionFactoryBean {
    public static void main(String[] args) {
        String conf = "applicationContext.xml" ;
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf) ;
        Object factory = ac.getBean("sqlsessionfactorybean") ;
        System.out.println(factory);
    }
}
