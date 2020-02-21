package com.enjoy.study8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 邱润泽 bullock
 */
@Component
public class X {

    @Autowired
    private Y y;

    public X(){
        System.out.println("X create");
    }
}
