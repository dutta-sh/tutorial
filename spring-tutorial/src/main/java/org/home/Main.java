package org.home;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Shouvik on 5/7/2017.
 */
public class Main {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }
}
