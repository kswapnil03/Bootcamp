package com.demo;

import org.springframework.stereotype.Component;


public class ExpressTea implements HotDrink {
    public void prepare() {
        System.out.println("Express tea is called");
    }
}
