package com.studyaop.auth;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author 邱润泽 bullock
 */
@Retention(value= RetentionPolicy.RUNTIME)
@Documented
public @interface AuthPermission {

    //默认为0 表示功能id 在第一个参数上
    int  idx() default 0;
}
