package com.studyaop.auth;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.nio.file.AccessDeniedException;

/**
 * @author 邱润泽 bullock
 */
@Aspect
@Component
public class AuthAspect {

    @Before("execution(* com.studyaop.auth..*Service.*(..))")
    public void before(JoinPoint joinPoint) throws AccessDeniedException {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        AuthPermission authPermission = method.getAnnotation(AuthPermission.class);

        if(authPermission != null){

            int  idx = authPermission.idx();

            Object[] args = joinPoint.getArgs();
            int  userId = (int) args[idx];

            if(userId!=1){
                throw new AccessDeniedException("您无权操作！");
            }

        }


    }






}
