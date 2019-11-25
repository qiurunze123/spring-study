package com.enjoy.study2.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author 邱润泽 bullock
 *
 * 自定义注解
 */
public class BullockTypeFilter implements TypeFilter {

    private ClassMetadata classMetadata;

    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        //获取当前注解类的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        classMetadata = metadataReader.getClassMetadata();

        //获取当前类的路径
        Resource resource = metadataReader.getResource();

        String  className = classMetadata.getClassName();

        System.out.println("正在扫描的------->"+ className);

        //当我们的类 包含er 则匹配成功返回true
        if(className.contains("er")){
            return true;
        }
        return false;
    }
}
