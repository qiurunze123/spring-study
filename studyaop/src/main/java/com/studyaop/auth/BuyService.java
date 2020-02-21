package com.studyaop.auth;

import org.springframework.stereotype.Service;

/**
 * @author 邱润泽 bullock
 */
@Service
public class BuyService {

    @AuthPermission
    public void buyItem(int userId) {
        System.out.println("我要买东西：来自 "+userId);
    }



}
