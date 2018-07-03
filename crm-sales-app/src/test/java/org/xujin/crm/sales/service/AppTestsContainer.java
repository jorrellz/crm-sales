package org.xujin.crm.sales.service;

import org.xujin.halo.logger.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTestsContainer {

    public static void main(String[] args) {
        LoggerFactory.activateSysLogger();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-test.xml");          
        ((AbstractApplicationContext) context).start();
    }
}
