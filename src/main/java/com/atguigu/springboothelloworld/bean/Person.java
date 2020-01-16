package com.atguigu.springboothelloworld.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author van
 * @date 2020/1/15
 */
public class Person {
    private String lastName;
    private Integer age;
    private Boolean boss;
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Person.class);
        logger.info("hello-logger");
    }
}
