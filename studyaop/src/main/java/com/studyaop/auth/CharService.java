package com.studyaop.auth;

import org.springframework.stereotype.Service;

/**
 * @author 邱润泽 bullock
 */
@Service
public class CharService {


    @AuthPermission
    public void privateChat(int userId){
        System.out.println("我要聊天 = " + userId);
    }

}
