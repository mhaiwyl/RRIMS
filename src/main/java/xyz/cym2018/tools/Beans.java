package xyz.cym2018.tools;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("Beans")
public class Beans implements ApplicationContextAware {
    Beans(){
        logger.info("Beans(0)");
    }
    private static ApplicationContext applicationContext;
    private static Logger logger = LogManager.getLogger(Beans.class);

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.info("setApplicationContext()");
        Beans.applicationContext = applicationContext;
    }

    public static Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }
}