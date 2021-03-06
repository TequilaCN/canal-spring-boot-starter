package io.github.tequilacn.starter.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Nacht
 * Created on 2021/4/11
 */
public class ApplicationContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    /**
     * 根据class获取bean
     */
    public static <T> List<T> getBeansOfType(Class clazz){
        Map<String, T> map = applicationContext.getBeansOfType(clazz);
        return new ArrayList<>(map.values());
    }
}
