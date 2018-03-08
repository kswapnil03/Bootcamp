package com.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

//@Component
//@Controller
@Repository
public class Tea implements HotDrink {

    public void prepare(){
        System.out.println("Tea is called");
    }
}
