package com.czw.spring.context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ZeviChen , 2017/2/16 0016 下午 12:44
 */
public class DefBeanFactory implements BeanFactory {


    //并发bean解析后的值
    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Map<String, BeanDefinition> getBeanDefinitionMap() {
        return beanDefinitionMap;
    }

    public Object getBean(String name){
        return this.beanDefinitionMap.get(name);
    }

    public void registerBeanDefinition(String beanName,BeanDefinition beanDefinition){
        this.beanDefinitionMap.put(beanName,beanDefinition);
    }

}
