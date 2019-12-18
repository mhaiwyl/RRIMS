package xyz.cym2018.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;



public class SpringTest {
    static Logger logger= LogManager.getLogger(SpringTest.class);
    public static void main(String[] args) {
        logger.info("获取ApplicationContext");

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        logger.info("获取Bean abc");
        Bean1 b1 = (Bean1) ac.getBean("Bean1");
        System.out.println(b1.getName());
        b1.setName("123");
        logger.info("获取ApplicationContext");
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        logger.info("获取Bean abc");
        b1 = (Bean1) ac.getBean("Bean1");
        System.out.println(b1.getName());
    }
}