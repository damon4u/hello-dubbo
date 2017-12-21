package com.damon4u.demo.dubbo.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author damon4u
 * @version 2017-12-20 15:48
 */
public class Provider {

    private static final Logger logger = LoggerFactory.getLogger(Provider.class);

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"dubbo-provider.xml"});
        context.start();
        logger.info("Provider Running...");
        System.in.read(); // press any key to exit
    }

}
