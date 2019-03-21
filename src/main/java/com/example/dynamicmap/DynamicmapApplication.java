package com.example.dynamicmap;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

@SpringBootApplication
public class DynamicmapApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = SpringApplication.run(DynamicmapApplication.class, args);


//        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) applicationContext.getAutowireCapableBeanFactory();
//        URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL(com.example.dynamicmap.one.MappingService.class.getResource("/") + "1.jar")});
//        Class<?> myController = classLoader.loadClass("com.example.dynamicmap.MyController");
//        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(myController);
//        defaultListableBeanFactory.registerBeanDefinition("myc", beanDefinitionBuilder.getBeanDefinition());
//        final RequestMappingHandlerMapping requestMappingHandlerMapping =(RequestMappingHandlerMapping)applicationContext.getBean("requestMappingHandlerMapping");
//        Method method=requestMappingHandlerMapping.getClass().getSuperclass().getSuperclass().getDeclaredMethod("detectHandlerMethods",Object.class);
//        method.setAccessible(true);
//        method.invoke(requestMappingHandlerMapping,"myc");
    }

}
