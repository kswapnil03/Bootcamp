package com.demo;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Restaurant restaurant = applicationContext.getBean(Restaurant.class);
        restaurant.getHotDrink().prepare();
//        System.out.println(applicationContext.isPrototype("1"));
//        Collection collection=applicationContext.getBean(Collection.class);
//        System.out.println(collection.getList());
//        System.out.println(collection.getMap());
    }

}
