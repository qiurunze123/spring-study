package com.enjoy.study8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 邱润泽 bullock
 */
@Component
public class Y {

    @Autowired
    private X x;


    public Y(){
        System.out.println("Y create");
    }

}
