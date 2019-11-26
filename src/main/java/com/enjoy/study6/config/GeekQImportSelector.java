package com.enjoy.study6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author 邱润泽 bullock
 */
public class GeekQImportSelector implements ImportSelector {


    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.enjoy.study6.bean.Fish","com.enjoy.study6.bean.Tiger"};
    }
}
